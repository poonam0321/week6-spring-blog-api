# Blog Management REST API

A comprehensive **RESTful Blog Management API** built using **Spring Boot 3.x**.  
This project provides CRUD operations for **Posts, Categories, and Comments**, with proper validation, exception handling, pagination, and Swagger documentation.

> Backend Development using Spring Boot

---

## 🚀 Features

- RESTful APIs for Posts, Categories, and Comments
- CRUD operations with proper HTTP status codes
- Input validation using Jakarta Validation
- Global exception handling
- Pagination and sorting support
- H2 in-memory database for development
- PostgreSQL configuration for production
- Swagger / OpenAPI documentation
- Clean layered architecture
- Unit and integration testing support

---

## 🛠 Technology Stack

| Technology | Description |
|---------|-------------|
| Java | Java 17 |
| Framework | Spring Boot 3.x |
| ORM | Hibernate |
| Persistence | Spring Data JPA |
| Database (Dev) | H2 In-Memory Database |
| Database (Prod) | PostgreSQL |
| API Docs | Swagger / OpenAPI |
| Build Tool | Maven |
| Testing | JUnit 5, Mockito |

---

## 🏗 Project Architecture

The application follows a **Layered Architecture**:

```

Controller Layer
↓
Service Layer
↓
Repository Layer
↓
Database

```

---

## 📌 API Endpoints

### 📝 Posts

| Method | Endpoint | Description |
|------|--------|-------------|
| GET | `/api/posts` | Get all posts (pagination supported) |
| GET | `/api/posts/{id}` | Get post by ID |
| POST | `/api/posts` | Create new post |
| PUT | `/api/posts/{id}` | Update post |
| DELETE | `/api/posts/{id}` | Delete post |
| GET | `/api/posts/category/{categoryId}` | Get posts by category |

---

### 📂 Categories

| Method | Endpoint | Description |
|------|--------|-------------|
| GET | `/api/categories` | Get all categories |
| GET | `/api/categories/{id}` | Get category by ID |
| POST | `/api/categories` | Create new category |
| PUT | `/api/categories/{id}` | Update category |
| DELETE | `/api/categories/{id}` | Delete category |

---

### 💬 Comments

| Method | Endpoint | Description |
|------|--------|-------------|
| GET | `/api/posts/{postId}/comments` | Get comments for a post |
| POST | `/api/posts/{postId}/comments` | Add comment to post |
| PUT | `/api/comments/{id}` | Update comment |
| DELETE | `/api/comments/{id}` | Delete comment |

---

## 🔍 Sample API Requests

### Create a Post
```bash
curl -X POST http://localhost:8080/api/posts \
-H "Content-Type: application/json" \
-d '{
  "title": "Getting Started with Spring Boot",
  "content": "Spring Boot simplifies backend development.",
  "author": "John Doe",
  "categoryId": 1
}'
````

---

### Get Posts with Pagination

```bash
curl "http://localhost:8080/api/posts?page=0&size=10&sort=createdAt,desc"
```

---

## ⚙️ How to Run the Project

### 1️⃣ Clone the Repository

```bash
git clone <repository-url>
cd week6-spring-blog-api
```

### 2️⃣ Run Using Maven

```bash
mvn spring-boot:run
```

### 3️⃣ Build and Run JAR

```bash
mvn clean package
java -jar target/blog-api-0.0.1-SNAPSHOT.jar
```

---

## 🌐 Access URLs

* **API Base URL:** `http://localhost:8080`
* **Swagger UI:**
  👉 `http://localhost:8080/swagger-ui.html`
* **H2 Console:**
  👉 `http://localhost:8080/h2-console`

---

## ✅ Validation & Error Handling

* Request validation using Jakarta Validation annotations
* Centralized exception handling using `@ControllerAdvice`
* Custom exceptions:

  * `ResourceNotFoundException`
  * `BlogApiException`

---

## 🧪 Testing

* Unit tests using **JUnit 5**
* Service layer tests with **Mockito**
* Manual testing via **Postman** and **Swagger UI**

---


