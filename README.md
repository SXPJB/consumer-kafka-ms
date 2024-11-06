# Consumer-Kafka-ms

## Description

This is a simple API that allows you to perform consume kafka messages. It was developed using Kotlin and Spring Boot,
and can be built and run with Gradle.

## Pre-requisites

- Java 17
- Gradle 8.2 or later
- Latest version of Postgres
- Docker

## Installation

1. Clone the repository: `git clone git@github.com:SXPJB/consumer-kafka-ms.git`
2. Download the dependencies with Gradle: `./gradlew build`
3. Run the application: `./gradlew run`
4. Configure the environment variables in your ide or replace the value in application.yml file
5. Enjoy!

## Project Structure

The project follows the standard structure of a Spring Boot project with Gradle:

- `src/main/kotlin`: This is where all the Java source code files are located.
- `src/main/resources`: This is where resource files, such as application configurations, are located.
- `src/test`: This is where all the test files are located.