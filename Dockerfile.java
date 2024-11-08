FROM eclipse-temurin:21
WORKDIR /Exercise_App
COPY ./src/main ./pom.xml ./mvnw ./
CMD ["./mvnw", "spring-boot:run"]

# FROM eclipse-temurin:21
# WORKDIR /Exercise_App
# COPY src/main pom.xml mvnw ./Exercise_App
# RUN chmod +x mvnw
# RUN ./mvnw clean package
# CMD ["./target/*.jar", "spring-boot:run"]



