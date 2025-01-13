# Payment Processing API

## Overview

The Payment Processing API is designed to manage payment transactions and subscriptions efficiently. This microservice provides endpoints to create, retrieve, update, and delete transactions, ensuring seamless payment processing for various applications. The API is built using the OpenAPI 3.0.0 specification, ensuring a standardized approach to API design and documentation.

### Features
- **Get all transactions**: Retrieve a comprehensive list of all payment transactions.
- **Create a new transaction**: Add a new transaction to the system.
- **Get a transaction by ID**: Fetch details of a specific transaction using its unique identifier.
- **Update a transaction by ID**: Modify the details of an existing transaction.
- **Delete a transaction by ID**: Remove a transaction from the system.

### Technical Details
- **Version**: 1.0.0
- **Base Path**: `/transactions`
- **Schema**: The `Transaction` schema includes fields such as `transaction_id`, `user_id`, `amount`, `currency`, `status`, `created_at`, and `updated_at`.

## Build Instructions

### Spring Boot Application
To build and run the application, follow these steps:
1. Ensure you have Java and Maven installed on your system.
2. Clone the repository and navigate to the project directory.
3. Run `mvn clean install` to build the application and generate the `.jar` file.

### Flyway DB Integration
To set up the database using Flyway:
1. Ensure Docker is installed on your system.
2. Use the following script to create the database:
   ```sql
   CREATE DATABASE IF NOT EXISTS `transaction_db`;
   ```
3. To avoid errors with reserved keywords, execute:
   ```sql
   SET sql_mode = 'ANSI_QUOTES';
   ```

## Running Locally

To run the application locally using Docker Compose:
1. Ensure Docker and Docker Compose are installed on your system.
2. Use the provided `docker-compose.yml` file to set up the environment.
3. The Docker Compose setup will:
   - Create a MySQL container.
   - Run `mvn clean install` to build the application and generate a `.jar` file.
   - Build the service image using the Dockerfile.
4. No pre-existing MySQL instance is required as the Docker Compose will handle the database setup.

## Markdown Formatting

This document uses proper Markdown headers and bullet points for readability. Code blocks are included for scripts and commands to ensure clarity and ease of use.