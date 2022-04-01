FROM openjdk:17.0.2-oracle
COPY target/kuber-*.jar /app/app.jar
WORKDIR /app
CMD ["sh", "-c", "java -XX:+UseContainerSupport -XX:InitialRAMPercentage=20 -XX:MaxRAMPercentage=50 -jar /app/app.jar"]