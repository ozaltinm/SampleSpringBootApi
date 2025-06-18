# MySpringProject

A simple Spring Boot REST API example with Docker support.

## 🔧 Requirements

- Java 17+
- Maven 3+
- Docker

## 🚀 Build the Application

```bash
mvn clean package
docker build -t my-spring-project .
docker run -p 8080:8080 my-spring-project