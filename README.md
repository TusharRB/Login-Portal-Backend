# Login Portal Backend

This project is a backend implementation for a login and signup REST API with security features and web tokens for authentication. It is built using the Spring Boot framework and utilizes the H2 database for storing user account information.


This project is a backend implementation for a login and signup REST API with security features and web tokens for authentication. It is built using the Spring Boot framework and utilizes the H2 database for storing user account information.

## Project Setup

1. Clone the repository:

   ```shell
   git clone git clone https://github.com/TusharRB/Login_Portal_Backend

2. Navigate to the project directory:
   ```shell
   cd login-portal-backend

3. Build the project using Maven:
   ```shell
   mvn clean install

4. Run the project:
   ```shell
   mvn spring-boot:run


## Additional Dependencies

The following additional dependencies are used in the project:

- **Spring Web**: Provides the necessary components for building RESTful APIs.
- **Spring Data JPA**: Simplifies the data access layer by providing repository interfaces.
- **H2 Database**: An in-memory database for storing user account information.
- **Spring Security**: Provides security features for user authentication and authorization.
- **JSON Web Token (JWT)**: Used for generating and verifying authentication tokens.
- **Spring Security JWT**: Integrates JWT with Spring Security for authentication and authorization.

All these dependencies are managed through Maven and will be downloaded automatically
  when building the project.

## Configuration

The project uses the default configuration provided by Spring Boot,
including the application properties file (`application.properties`) 
for configuring the H2 database and other application-specific properties. 
You can modify these configurations as per your requirements.

## API Endpoints

The following API endpoints are available in the project:

- `POST /user/signup`: Creates a new user account. Expects a JSON payload containing the user details.

- `POST /user/login`: Authenticates a user and generates an authentication token. Expects the username and password as request parameters.

## Security

The project implements security measures to protect user data and prevent unauthorized access. It uses JSON Web Tokens (JWT) for user authentication and authorization. User passwords are securely hashed using the BCryptPasswordEncoder.

**Note:** Make sure to update the security configurations, such as secret keys and token expiration times, before deploying the project in a production environment.

## Database Schema

The project uses the H2 database to store user account information. The database schema is automatically generated based on the entity model. The `User` entity has the following attributes:

- `id`: The unique identifier for the user.
- `username`: The username of the user.
- `password`: The hashed password of the user.
- `email`: The email address of the user.


## Feel free to modify and customize the project as per your requirements.
