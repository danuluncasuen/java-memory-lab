import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting test...");

        List<byte[]> allocations = new ArrayList<>();
        for (int i = 0; i < 38; i++) { // ~380 MB
            allocations.add(new byte[10 * 1024 * 1024]);
            Thread.sleep(100);
            System.out.println("Heap allocated: " + ((i + 1) * 10) + "MB");
        }

        System.out.println("Spawning threads to eat native memory...");
        for (int i = 0; i < 200; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(Long.MAX_VALUE);
                } catch (InterruptedException ignored) {}
            }).start();
        }

        Thread.sleep(Long.MAX_VALUE);
    }
}
