FROM java:8
VOLUME /tmp
ADD /build/libs/spring-cassandra-1.0-SNAPSHOT-application.jar app.jar
#RUN sh -c 'touch app.jar'
ENV PORT 8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=local","app.jar"]