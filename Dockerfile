FROM maven:3.6.0-jdk-11-slim AS build
COPY pom.xml /app/
COPY src /app/src
RUN mvn -f /app/pom.xml clean package

FROM openjdk:11
COPY --from=build /app/target/bhagavad-gita-service*.jar /app/service.jar
ENTRYPOINT ["java","-jar","/app/service.jar"]