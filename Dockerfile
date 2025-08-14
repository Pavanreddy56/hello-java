# Use a small JDK runtime
FROM eclipse-temurin:17-jre-jammy

# create app dir
WORKDIR /app

# copy the fat jar produced by 'mvn package'
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
