# 🏥 CarePulse Server

> **Backend REST API for the CarePulse Patient Management System** — A robust, scalable Spring Boot application that powers patient registration, appointment management, medical record handling, and file uploads for healthcare providers.

---

## 📑 Table of Contents

- [Overview](#-overview)
- [Tech Stack](#-tech-stack)
- [Project Structure](#-project-structure)
- [Features](#-features)
- [Prerequisites](#-prerequisites)
- [Getting Started](#-getting-started)
  - [Clone the Repository](#1-clone-the-repository)
  - [Configure the Database](#2-configure-the-database)
  - [Configure Application Properties](#3-configure-application-properties)
  - [Build & Run](#4-build--run)
- [API Base URL](#-api-base-url)
- [Environment & Deployment](#-environment--deployment)
- [Contributing](#-contributing)

---

## 📋 Overview

**CarePulse Server** is the backend engine of the CarePulse healthcare platform. It exposes a RESTful API consumed by the CarePulse frontend, handling all business logic for patient management, appointment scheduling, doctor records, and document/file storage.

Built on **Spring Boot 3.4.1** with **Java 21**, it follows a clean layered architecture (Controller → Service → Repository) backed by a **MySQL** relational database and uses **Spring Data JPA** for all data persistence operations.

---

## 🛠 Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 21 |
| Framework | Spring Boot 3.4.1 |
| Data Access | Spring Data JPA + Spring Data JDBC |
| Database | MySQL |
| HTTP Client | Spring Cloud OpenFeign |
| Load Balancing | Spring Cloud LoadBalancer |
| Monitoring | Spring Boot Actuator |
| Boilerplate Reduction | Lombok |
| Build Tool | Apache Maven (Maven Wrapper included) |
| Dev Experience | Spring Boot DevTools |
| Runtime Target | Java 21 (Heroku `system.properties`) |

**Spring Cloud Version:** `2024.0.0`

---

## 📁 Project Structure

```
carepulse_server/
│
├── .mvn/
│   └── wrapper/                  # Maven wrapper configuration
│       └── maven-wrapper.properties
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/cts/HospitalManagement/
│       │       ├── HospitalManagementApplication.java   # Main entry point (@SpringBootApplication)
│       │       ├── controller/                          # REST Controllers — handles incoming HTTP requests
│       │       ├── service/                             # Business logic layer
│       │       ├── repository/                          # Spring Data JPA repositories (DB access)
│       │       ├── model/                               # JPA Entity classes (Patient, Doctor, Appointment, etc.)
│       │       └── config/                              # App configuration (CORS, Feign, Beans, etc.)
│       │
│       └── resources/
│           ├── application.properties                   # DB connection, server port, JPA settings
│           └── static/                                  # Static resources (if any)
│
├── uploads/                      # Directory for uploaded patient/medical documents
│
├── pom.xml                       # Maven project descriptor — all dependencies declared here
├── mvnw                          # Maven wrapper (Unix)
├── mvnw.cmd                      # Maven wrapper (Windows)
├── system.properties             # Heroku runtime config: java.runtime.version=21
├── .gitignore
└── .gitattributes
```

> **Note:** The project follows the standard Spring Boot layered architecture. Each package has a single, clear responsibility — controllers delegate to services, services delegate to repositories, and entities map directly to MySQL tables via JPA.

---

## ✨ Features

**Patient Management**
- Register new patients with personal and medical details
- Retrieve, update, and delete patient records
- Upload and manage patient-related documents (stored in `uploads/`)

**Appointment Management**
- Book appointments between patients and doctors
- View, confirm, reschedule, and cancel appointments
- Admin-side overview of all scheduled appointments

**Doctor / Provider Management**
- Manage doctor profiles and availability
- Associate doctors with patient appointments

**File Uploads**
- Dedicated `uploads/` directory for handling medical documents, images, or prescriptions submitted by patients or staff

**Health Monitoring**
- Spring Boot Actuator endpoints expose application health, metrics, and environment information at `/actuator`

**Inter-Service Communication (Cloud Ready)**
- Spring Cloud OpenFeign enables declarative REST client calls to other microservices
- Spring Cloud LoadBalancer provides client-side load balancing for distributed deployments

---

## ✅ Prerequisites

Before running this project locally, make sure you have the following installed:

| Tool | Minimum Version |
|---|---|
| Java JDK | 21 |
| Apache Maven | 3.8+ (or use included `mvnw`) |
| MySQL Server | 8.0+ |
| Git | Any recent version |

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/0pain01/carepulse_server.git
cd carepulse_server
```

---

### 2. Configure the Database

Log into your MySQL instance and create a database for the application:

```sql
CREATE DATABASE carepulse_db;
```

---

### 3. Configure Application Properties

Open `src/main/resources/application.properties` and update the following values to match your local MySQL setup:

```properties
# Server Port
server.port=8080

# MySQL Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/carepulse_db
spring.datasource.username=YOUR_MYSQL_USERNAME
spring.datasource.password=YOUR_MYSQL_PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA / Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# File Upload Directory
file.upload-dir=uploads/
```

> ⚠️ **Security Note:** Never commit real credentials to version control. Use environment variables or a secrets manager for production deployments.

---

### 4. Build & Run

**Using the Maven Wrapper (recommended — no local Maven install required):**

On macOS / Linux:
```bash
./mvnw spring-boot:run
```

On Windows:
```cmd
mvnw.cmd spring-boot:run
```

**Or build a JAR and run it:**

```bash
# Build
./mvnw clean package -DskipTests

# Run
java -jar target/HospitalManagement-0.0.1-SNAPSHOT.jar
```

Once started, the server will be available at:

```
http://localhost:8080
```

---

## 🌐 API Base URL

All REST endpoints are served under:

```
http://localhost:8080/
```

Spring Boot Actuator health check:

```
http://localhost:8080/actuator/health
```

---

## ☁️ Environment & Deployment

This project includes a `system.properties` file which pins the Java runtime version for **Heroku** deployments:

```properties
java.runtime.version=21
```

To deploy on Heroku:

```bash
heroku create your-app-name
heroku config:set SPRING_DATASOURCE_URL=jdbc:mysql://<host>/<db>
heroku config:set SPRING_DATASOURCE_USERNAME=<user>
heroku config:set SPRING_DATASOURCE_PASSWORD=<password>
git push heroku main
```

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!

1. Fork the repository
2. Create your feature branch: `git checkout -b feature/your-feature-name`
3. Commit your changes: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin feature/your-feature-name`
5. Open a Pull Request

---

<p align="center">Built with ☕ Java & Spring Boot · CarePulse Patient Management System</p>
