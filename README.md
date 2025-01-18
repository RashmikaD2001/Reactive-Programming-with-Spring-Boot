# 🚀 Reactive Student Management API

This project demonstrates a simple REST API implementation for reactive programming using Spring Boot, R2DBC, and MySQL. The tutorial focuses on creating non-blocking, asynchronous APIs to manage student data.

## ✨ Key Features

- **Reactive REST APIs** powered by Spring WebFlux
- **Non-blocking Database Operations** using R2DBC
- **Automated Schema Management** with Flyway
- **Modern Java 21** features
- **Clean Architecture** principles

## 🛠️ Tech Stack

- **Spring Boot 3.4.1** - Modern application framework
- **Spring WebFlux** - Reactive web framework
- **R2DBC** - Reactive database driver
- **MySQL** - Database engine
- **Flyway** - Database migrations
- **Lombok** - Reduces boilerplate code
- **Maven** - Dependency management

## 🏗️ Prerequisites

Make sure you have the following installed:

- Java 21
- MySQL Server
- Maven

## 🎯 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/v1/students` | Create a new student |
| GET | `/api/v1/students` | Retrieve all students |
| GET | `/api/v1/students/{id}` | Get student by ID |
| PUT | `/api/v1/students/{id}` | Update student details |
| DELETE | `/api/v1/students/{id}` | Remove a student |
