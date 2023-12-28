FROM maven:3.9.5-amazoncorretto-17
COPY . ./app
WORKDIR app
RUN mvn clean install
EXPOSE 8080
ENTRYPOINT ["java","-jar","target/springboot-restful-webservices-0.0.1-SNAPSHOT.jar"]


