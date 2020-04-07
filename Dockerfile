FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/jar/spring-cassandra-1.0-SNAPSHOT-application.jar
RUN chmod a+x {JAR_FILE}
RUN java -jar ${JAR_FILE}
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]