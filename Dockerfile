# Use Amazon Corretto JDK 17 as the base image
FROM amazoncorretto:21-alpine as build

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file into the container (update path if needed)
COPY target/*.jar app.jar

# Expose port 3030
EXPOSE 3030

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
