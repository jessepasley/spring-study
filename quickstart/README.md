# Notes

This tutorial can be found at https://spring.io/quickstart

Download starter app from ...

Run this to create maven wrapper:
mvn -N io.takari:maven:wrapper

To run application:
./mvnw spring-boot:run

urls to try:
http://localhost:8080/hello
http://localhost:8080/hello?name=Amy

Annotations used:
@SpringBootApplication
@RestController
@GetMapping("/hello")
@RequestParam(value = "name", defaultValue = "World") String name