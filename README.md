# Multi-Tenant SaaS & RBAC Engine

One backend application that serves multiple companies (tenants) at the same time,
with each company's data completely isolated and access controlled by user roles.

## What This Project Will Do (Planned)

- Multiple companies register on one application, each company is a tenant
- Every tenant's data is isolated by tenant_id - one company can never see another's data
- Users log in inside their own tenant and get a JWT token
- Role-based access: ADMIN, MANAGER, USER - each role can do different things
- No login = 401, wrong role = 403, cross-tenant access = blocked and tested
- Final phase: a permission-aware AI assistant (Spring AI + Ollama, local and free)
  that checks the user's role and tenant before answering

## Tech Stack

- Java 25
- Spring Boot 4.2.0
- Spring Security + JWT (planned)
- Spring Data JPA / Hibernate
- PostgreSQL (H2 in-memory is used temporarily during early setup)
- Maven, JUnit 5, Docker Compose (planned), Swagger / OpenAPI (planned)

## Current Status - In Progress

- [x] Day 1 - Project created with Spring Initializr, app runs on port 8080
- [x] Day 2 - Git and GitHub setup, first commit and push
- [ ] Tenant and User models with database
- [ ] Registration and login with BCrypt password hashing
- [ ] JWT authentication and Spring Security filter
- [ ] RBAC and tenant isolation with tests

## How To Run (Current Setup)

1. Clone this repository
2. Open the project folder in VS Code or any Java IDE
3. Run the main class: MultitenantApplication.java
   Or from terminal: mvnw.cmd spring-boot:run (on Windows)
4. App starts at http://localhost:8080
   Note: Spring Security currently generates a temporary password in the
   console log on every run (username: user). Real login is built later.