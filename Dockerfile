# Stage 1 - Build
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /app

# Copy Maven descriptor and source
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Stage 2 - Run
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# Copy the jar from builder stage (replace with actual jar name)
COPY --from=builder /app/target/hello-java-1.0-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
