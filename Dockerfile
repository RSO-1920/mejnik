FROM openjdk:11.0.4-jre-slim

RUN mkdir /app

WORKDIR /app

ADD /target/rso-mejnik-1.0.0-SNAPSHOT.jar /app

EXPOSE 8000

CMD ["java", "-jar", "rso-mejnik-1.0.0-SNAPSHOT.jar"]