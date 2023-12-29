# BookStore API with Springboot

## Requirements

For building and running the application you need:

- JDK 17
- Maven 3.9.5
- MySQL 5.7

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `Application` main class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Running application with docker

you can use docker-compose to install all requirements services and run the application with one commande 

`$ docker compose up -d`

or you can use docker file to install the springboot service only using 

`$ docker build -t bookStore .`

## Explore the API 

after install you can use swagger to explore all api in the project and you can find how you can use it : 

`$ http://localhost:8080/swagger-ui/index.html`

example of swagger : 

![image](https://github.com/tlijani-ux/springboot-restfull-api/assets/60841088/a79fcd7b-a5ac-46db-a515-bf60d9b66368)

## Conclustion

this is a simple example how we can make a simple web application using spring boot + MYSQL and how we can use spring data JPA to make a simple crud system



