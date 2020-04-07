FROM openjdk:8-jdk-alpine
RUN chmod a+x /jar/spring-cassandra-1.0-SNAPSHOT-application.jar
RUN java -jar /jar/spring-cassandra-1.0-SNAPSHOT-application.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]