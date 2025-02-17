# Use an official OpenJDK runtime as a parent image
FROM openjdk:17 AS runtime

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot executable JAR to the container
COPY build/libs/configServer-0.0.1-SNAPSHOT.jar app.jar

# Expose the application's port
EXPOSE 8071

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
