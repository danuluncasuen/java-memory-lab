FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY Main.java .

RUN javac Main.java

CMD ["java", "-XX:MaxRAMPercentage=75.0", "Main"]
