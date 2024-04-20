FROM eclipse-temurin:17-jre-alpine

WORKDIR /home/app

COPY target/*.jar itplus-docker.jar

ENV TEST_VAR=123

CMD java -jar itplus-docker.jar
