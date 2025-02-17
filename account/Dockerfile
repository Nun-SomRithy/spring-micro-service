# Use an official OpenJDK runtime as a parent image
FROM openjdk:17 AS runtime

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot executable JAR to the container
COPY build/libs/account-0.0.1-SNAPSHOT.jar app.jar

# Expose the application's port (default is 8080)
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
