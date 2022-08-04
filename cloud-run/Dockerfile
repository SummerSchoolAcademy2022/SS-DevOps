FROM maven:3.8.3-openjdk-17 as builder

COPY . reactspr-example

WORKDIR reactspr-example

# Build a release artifact.
RUN mvn clean install

FROM openjdk:17-alpine

# Copy the jar to the production image from the builder stage.
COPY --from=builder /reactspr-example/target/icecreamshop-0.0.1-SNAPSHOT.jar /icecreamshop.jar

# Run the web service on container startup.
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/icecreamshop.jar"]

EXPOSE 8080