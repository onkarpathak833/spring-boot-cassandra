FROM openjdk:8-jdk-alpine
RUN echo $JAR_FILE
COPY ${JAR_FILE} app.jar
ENV PORT 8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]