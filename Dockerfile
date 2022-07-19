FROM gcr.io/google-appengine/openjdk

# Copy the jar to the production image from the builder stage.
COPY --from=builder /reactspr-example/target/spring-and-react-0.0.1-SNAPSHOT.jar /icecreamshop.jar

# Run the web service on container startup.
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/icecreamshop.jar"]

EXPOSE 8080
