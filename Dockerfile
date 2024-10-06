FROM openjdk:21-ea-33-jdk-slim
LABEL authors="Dmitriy Larin"
ADD build/libs/websocket-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
