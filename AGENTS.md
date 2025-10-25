# MyBatis Spring Boot application demo

This is a MyBatis demo application with Spring Boot, MySQL 9,Flyway for database migration, DBUnit for database test.

## Tech Stack

- Java 21
- Apache Maven 3.9.11
- Spring Boot 3 with Spring MVC
- MyBatis 3.5
- Junit 5.13
- AssertJ: Fluent assertions, please use it instead of JUnit assertions.

## Project structure

- base package: `org.mvnsearch.mybatis.demo`
- RESTful API controller package: `org.mvnsearch.mybatis.demo.web`
- project base test: `org.mvnsearch.mybatis.demo.ProjectBaseTest`，new test class should extend `ProjectBaseTest`

## Database

- Main database: MySQL 9.4
- Database migration: Flyway 11 and migration script directory: `src/main/resources/db/migration`
- Database test: DbUnit with XML dataset, and dataset directory: `src/main/resources/db/dataset`
- SQL mapper: MyBatis 3.5

## Build and run

The project uses Maven as the build tool and [just](https://github.com/casey/just) as the task runner.

- Build: `mvn -DskipTests package`
- Run: `mvn spring-boot:run`

## Java Guide line

- Use jspecify to annotate nullable and non-nullable types: `org.jspecify.annotations.NonNull` and
  `org.jspecify.annotations.Nullable`
- Use slf4j for logging

## Configuration

The project uses `src/main/resources/application.properties` as the configuration file.

