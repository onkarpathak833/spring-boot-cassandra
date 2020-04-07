FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/workspace/build/libs/spring-cassandra-1.0-SNAPSHOT-application.jar
RUN mkdir /tmp/spring-java
RUN chmod a+x /tmp/spring-java
RUN cp ${JAR_FILE} /tmp/spring-java
COPY ${JAR_FILE} /tmp/spring-java
RUN java -jar /tmp/spring-java/spring-cassandra-1.0-SNAPSHOT-application.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]