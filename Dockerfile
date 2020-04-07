FROM openjdk:8-jdk-alpine
ARG JAR_FILE=gs://tw-onkar-data/jars/spring-cassandra-1.0-SNAPSHOT-application.jar
COPY ${FILE_PATH} /tmp
RUN java -jar /tmp/spring-cassandra-1.0-SNAPSHOT-application.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]