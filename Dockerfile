# Java Base Image (JDK 17 ist kompatibel mit Spring Boot 3.x)
FROM eclipse-temurin:17-jdk

# Arbeitsverzeichnis im Container
WORKDIR /app

# Kopiere JAR (Name muss mit deinem Build übereinstimmen!)
COPY build/libs/karteikarten-app-0.0.1-SNAPSHOT.jar app.jar

# Startbefehl
ENTRYPOINT ["java", "-jar", "app.jar"]