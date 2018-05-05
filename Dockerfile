FROM openjdk:8-jre-alpine

ADD target/*.jar /app.jar

ENV TZ=America/Maceio

CMD java -Djava.security.egd=file:/dev/./urandom -jar /app.jar
