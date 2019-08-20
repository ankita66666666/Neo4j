
FROM openjdk:11
WORKDIR usr/src
ADD ./target/neo4j-demo-0.0.1-SNAPSHOT.jar /usr/src/neo4j-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["neo4j-demo-0.0.1-SNAPSHOT.jar"]