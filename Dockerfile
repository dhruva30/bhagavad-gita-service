FROM openjdk:11
COPY target/bhagavad-gita-service-0.0.1-SNAPSHOT.jar bhagavad-gita-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/bhagavad-gita-service-0.0.1-SNAPSHOT.jar"]