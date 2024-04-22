# Project Management Web Application

This is a project management web application built using microservices architecture. It provides various functionalities such as user authentication, employee management, project management, attendance tracking, payroll management, and supplier management. Each functionality is implemented as a separate microservice to promote modularity, scalability, and maintainability.

## Microservices Overview

1. **Authentication and Authorization Microservice (auth-service)**
   - Handles user authentication and authorization.
   - Endpoints:
     - POST `/register` - Register a new user.
     - POST `/login` - Log in a user.
     - GET `/profile` - Fetch the authenticated user's profile.
     - DELETE `/{id}` - Remove a user.

2. **Employee Management Microservice (employee-service)**
   - Manages employee information.
   - Endpoints:
     - GET `/employees` - List all employees.
     - POST `/employees` - Add a new employee.
     - GET `/employees/{id}` - Retrieve an employee by ID.
     - PUT `/employees/{id}` - Update an employee's information.
     - DELETE `/employees/{id}` - Remove an employee.

3. **Project Management Microservice (project-service)**
   - Handles project-related operations.
   - Endpoints:
     - GET `/projects` - List all projects.
     - POST `/projects` - Create a new project.
     - GET `/projects/{id}` - Get details of a specific project.
     - PUT `/projects/{id}` - Update project details.
     - DELETE `/projects/{id}` - Delete a project.

4. **Attendance Tracking Microservice (attendance-service)**
   - Manages employee attendance records.
   - Endpoints:
     - POST `/check-in` - Employee check-in.
     - POST `/check-out` - Employee check-out.
     - GET `/records` - Fetch attendance records.

5. **Payroll Management Microservice (payroll-service)**
   - Handles payroll calculations and records.
   - Endpoints:
     - GET `/payroll` - List payroll records.
     - POST `/payroll/calculate` - Calculate salaries.
     - GET `/payroll/{id}` - Get details for a payroll entry.

6. **Supplier Management Microservice (supplier-service)**
   - Manages supplier information.
   - Endpoints:
     - GET `/suppliers` - List all suppliers.
     - POST `/suppliers` - Add a new supplier.
     - GET `/suppliers/{id}` - Get details of a specific supplier.
     - PUT `/suppliers/{id}` - Update supplier details.
     - DELETE `/suppliers/{id}` - Delete a supplier.

7. **Additional Infrastructure Microservices:**
   - **Discovery Service (Eureka):** Registers and discovers microservices for dynamic scaling and load balancing.
   - **Config Service (Spring Cloud Config):** Externalizes configuration for each microservice.
   - **API Gateway (Optional):** Routes requests to appropriate microservices and enforces security policies.

## Technologies Used

- Spring Boot: For building microservices with ease.
- Spring Data JPA: For interacting with the database.
- Spring Security: For authentication and authorization.
- MySQL: As the database for storing application data.
- Spring Cloud Netflix (Eureka): For service discovery and registration.
- Spring Cloud Config: For externalized configuration management.
- Spring Cloud OpenFeign: For declarative REST client.
- Lombok: For reducing boilerplate code.
- Flyway: For database schema migration.
- Spring Boot Actuator: For monitoring and managing microservices.

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/thenujad/pms-microservices.git

2. Navigate to each microservice directory and build using Maven:
   
   ```bash
   cd <microservice-directory>
   mvn clean install

