FROM openjdk:19-jdk-slim

# Install Maven
RUN apt-get update && \
    apt-get install -y maven && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Setup project directory
WORKDIR /app

# Copy project files (pom.xml and src folder)
COPY pom.xml /app
COPY src /app/src

# Download dependencies and package app
RUN mvn clean package -DskipTests

# Expose Spring Boot default port
EXPOSE 8080
EXPOSE 9090

# Run Spring Boot app automatically
#CMD ["java", "-jar", "target/cloudmersive-interview-1.0-SNAPSHOT.jar"]