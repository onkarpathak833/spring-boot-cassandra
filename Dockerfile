FROM openjdk:8-jdk-alpine
ARG JAR_FILE=gs://tw-onkar-data/jars/spring-cassandra-1.0-SNAPSHOT.jar
COPY ${FILE_PATHA} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]