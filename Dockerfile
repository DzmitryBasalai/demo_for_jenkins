FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/demo-0.jar

WORKDIR /opt/app

COPY ${JAR_FILE} my_demo.jar

EXPOSE 8080

CMD java -jar my_demo.jar

