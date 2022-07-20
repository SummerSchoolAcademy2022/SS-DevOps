FROM maven:3.6.3-jdk-8 as builder

COPY . reactspr-example

WORKDIR reactspr-example

# Build a release artifact.
RUN mvn clean install

FROM gcr.io/google-appengine/openjdk

# Copy the jar to the production image from the builder stage.
COPY --from=builder /reactspr-example/target/spring-and-react-0.0.1-SNAPSHOT.jar /icecreamshop.jar

# Run the web service on container startup.
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/icecreamshop.jar"]

EXPOSE 8080