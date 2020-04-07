#!/bin/bash
cp /jar/spring-cassandra-1.0-SNAPSHOT-application.jar /workspace/build
FILE=/workspace/build/spring-cassandra-1.0-SNAPSHOT-application.jar
if [ -f FILE ]; then
  echo "File exists at destination"
else
  echo "File copy failed here"
fi
docker build --build-arg JAR_FILE=/workspace/build/spring-cassandra-1.0-SNAPSHOT-application.jar -t gcr.io/project1-186407/spring-cassandra .