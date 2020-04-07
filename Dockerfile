FROM openjdk:8-jdk-alpine
RUN java -jar /image/spring-cassandra-1.0-SNAPSHOT-application.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]