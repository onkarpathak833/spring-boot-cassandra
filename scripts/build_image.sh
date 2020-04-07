mkdir image
cp /jar/spring-cassandra-1.0-SNAPSHOT-application.jar /image
docker build -t gcr.io/project1-186407/spring-cassandra .