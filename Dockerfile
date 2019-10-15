FROM openjdk:8
VOLUME /tmp
ADD target/hello-world-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["sh","-c","java $PARAMS -jar /app.jar "]
EXPOSE 8080