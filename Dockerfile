FROM ubuntu:latest AS Build

RUN apt-get update
RUN apt-get install openjdk-21-jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvc clean install

FROM openjdk:21-jdk-slim

EXPOSE 8080

COPY --from=build /target/dslist-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
