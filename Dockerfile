FROM openjdk:17-jdk-slim

EXPOSE 8080

ADD target/rest-0.0.1-SNAPSHOT.jar restAppImage.jar

CMD ["java", "-jar", "restAppImage.jar"]