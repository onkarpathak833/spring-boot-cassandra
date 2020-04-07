FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/image/spring-cassandra-1.0-SNAPSHOT-application.jar
COPY {JAR_FILE} app.jar
RUN java -jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]