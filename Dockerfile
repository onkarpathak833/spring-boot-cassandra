FROM openjdk:8-jdk-alpine
ARG JAR_FILE=gs://tw-onkar-data/jars/spring-cassandra-1.0-SNAPSHOT-application.jar
RUN mkdir /opt/spring
RUN chmod +x /opt/spring
COPY ${FILE_PATH} /opt/spring
RUN java -jar /opt/spring/spring-cassandra-1.0-SNAPSHOT-application.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]