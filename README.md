This is an emulated scenario of a stress test for a java application's RAM consumption
Build the app:
docker build -t jvm-memory-test .

Run the app in a container with the following params
docker run --rm -it --memory=512m --memory-swap=512m jvm-jfr-test

Check the memory stats with:
docker stats