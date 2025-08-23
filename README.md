
# Spring Boot Web App

A simple Spring Boot web application with **H2 in-memory database** integration.

## 🚀 Features

- Spring Boot-based REST API
- H2 in-memory database support
- JPA & Hibernate integration
- Embedded Tomcat server
- Easy configuration via `application.properties`
- H2 database console for testing

## 🛠️ Tech Stack

- **Java**: 17+ (or compatible version)
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database**
- **Maven**

## 📂 Project Structure

```
Spring-Boot/
├── src/
│   ├── main/
│   │   ├── java/       # Java source code
│   │   ├── resources/  # application.properties & static files
│   └── test/           # Test cases
├── pom.xml             # Maven dependencies
└── README.md
```

## ⚙️ Configuration

The app uses an **H2 in-memory database** by default.  
Check `src/main/resources/application.properties`:

```properties
spring.application.name=simpeWebApp
server.port=8098

spring.datasource.url=jdbc:h2:mem:vivek
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=viksa
spring.datasource.password=veena

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

spring.jpa.show-sql=true
```

## ▶️ How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/vkp000/Spring-Boot.git
   cd Spring-Boot
   ```

2. **Build and run the project**
   ```bash
   mvn spring-boot:run
   ```

3. **Access the application**
    - App URL → `http://localhost:8098`
    - H2 Console → `http://localhost:8098/h2-console`
        - **JDBC URL**: `jdbc:h2:mem:vivek`
        - **Username**: `viksa`
        - **Password**: `veena`

## 🧪 Testing

Run tests using:
```bash
mvn test
```

## 📌 Notes

- The H2 database is **in-memory**, meaning data is lost when the app stops.
- To persist data, you can configure a real database like MySQL or PostgreSQL.

## 🤝 Contribution

Feel free to fork this repository, create a branch, and submit a pull request.

## 📜 License

This project is licensed under the MIT License.
