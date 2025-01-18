This project demonstrates a simple REST API implementation for reactive programming using Spring Boot, R2DBC, and MySQL. The tutorial focuses on creating non-blocking, asynchronous APIs to manage student data.

#### Features
1. RESTful API for managing student records
2. Reactive programming using Spring WebFlux
3. Non-blocking database access with R2DBC and MySQL
4. Database schema migration using Flyway

#### Prerequisites
1. Java 21
2. Maven
3. MySQL Server

#### Technologies Used
Spring Boot 3.4.1
Spring WebFlux: For building reactive REST APIs
R2DBC: Reactive database connectivity
MySQL: Database
Flyway: Database schema migration tool
Lombok: Simplifies Java code with annotations

#### API Endpoints
1. Create a Student - POST /api/v1/students
2. Get All Students - GET /api/v1/students
3. Get Student by ID - GET /api/v1/students/{id}
4. Update a Student - PUT /api/v1/students/{id}
5. Delete a Student - DELETE /api/v1/students/{id}
