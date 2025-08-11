
# Spring Boot Project

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

A simple Spring Boot application demonstrating basic CRUD operations with `Product` entities.

---

## Table of Contents

- [About](#about)  
- [Features](#features)  
- [Technologies Used](#technologies-used)  
- [Getting Started](#getting-started)  
- [Usage](#usage)  
- [API Endpoints](#api-endpoints)  
- [Contributing](#contributing)  
- [License](#license)  

---

## About

This project is a basic Spring Boot application built for managing products. It covers the use of REST controllers, service layers, and model entities using Spring Framework.

---

## Features

- Create, Read, Update, and Delete (CRUD) operations on products
- Simple service layer for business logic
- REST API implementation using Spring Boot
- In-memory list for product storage (can be extended to use a database)

---

## Technologies Used

- Java 17+  
- Spring Boot 3.x  
- Maven or Gradle (depending on your build system)  
- Lombok (for boilerplate code reduction)

---

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or above installed  
- Maven or Gradle installed  
- IDE (Eclipse, IntelliJ IDEA, VSCode, etc.)  

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/vkp000/Spring-Boot.git
   cd Spring-Boot
   ```

2. Build the project:

   ```bash
   mvn clean install
   ```

3. Run the Spring Boot application:

   ```bash
   mvn spring-boot:run
   ```

---

## Usage

Once the application is running, the API endpoints are accessible at:

```
http://localhost:8080/products
```

You can use tools like Postman or curl to interact with the API.

---

## API Endpoints

| Method | Endpoint             | Description                  |
|--------|----------------------|------------------------------|
| GET    | `/products`          | Get list of all products      |
| GET    | `/products/{id}`     | Get product by ID             |
| POST   | `/products`          | Create a new product          |
| PUT    | `/products/{id}`     | Update an existing product    |
| DELETE | `/products/{id}`     | Delete a product by ID        |

---

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements.

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## Contact

For any questions or feedback, you can reach me at:

- GitHub: [vkp000](https://github.com/vkp000)  
- Email: vivekprajapat03@gmail.com  

---

*Happy coding!* 🚀
