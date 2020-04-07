FROM openjdk:8-jdk-alpine
RUN echo $JAR_FILE
COPY ${JAR_FILE} app.jar
RUN java -jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]