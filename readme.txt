# Use an official OpenJDK image as the base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the Demo.java file into the container
COPY Demo.java /app

# Compile the Java program
RUN javac Demo.java

# Run the compiled Java program
CMD ["java", "Demo"]
