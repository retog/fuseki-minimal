FROM maven:3.8.4-jdk-11

COPY src ./src
COPY pom.xml ./
RUN mvn -f pom.xml clean package


EXPOSE 3330
ENTRYPOINT ["java","-jar", "target/fuseki-minimal-1.0-SNAPSHOT.jar"]