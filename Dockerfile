FROM openjdk:8-jdk-alpine
RUN echo $JAR_FILE
COPY ${JAR_FILE} app.jar
RUN java -jar ${JAR_FILE}
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]