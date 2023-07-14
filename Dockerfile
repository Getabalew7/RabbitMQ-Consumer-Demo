FROM openjdk:17-jdk-alpine

RUN apk add --no-cache maven

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn  clean package -DskipTests

EXPOSE 9091

CMD ["java", "-jar","target/RabbitMQ-Consumer-Demo-0.0.1-SNAPSHOT.jar"]