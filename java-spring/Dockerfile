FROM eclipse-temurin:21
# WORKDIR /Exercise_App
# COPY ./src/main ./pom.xml ./mvnw ./
# CMD ["./mvnw", "spring-boot:run"]

# FROM openjdk:17-jdk-alpine
WORKDIR /Exercise_app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY src ./src
RUN ./mvnw package -DskipTests
EXPOSE 8080
CMD ["java", "-jar", "target/your-app-name.jar"]