FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/jar/spring-cassandra-1.0-SNAPSHOT-application.ja
COPY ${JAR_FILE} app.jar
RUN java -jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]