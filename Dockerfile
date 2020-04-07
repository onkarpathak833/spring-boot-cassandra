FROM openjdk:8-jdk-alpine
ARG JAR=build/spring-cassandra-1.0-SNAPSHOT-application.jar
COPY ${JAR_FILE} target/app.jar
ADD ${JAR_FILE} target/app.jar
ENV PORT 8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=local","target/app.jar"]