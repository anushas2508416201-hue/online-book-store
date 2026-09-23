# Online Book Store

A simple Java Maven project developed to demonstrate Agile Scrum and DevOps practices using Jira, Git, GitHub, and GitHub Actions.

## Features

- Add books
- View available books
- Search books by title
- Search books by author
- Automated unit testing

## Technologies

- Java 17
- Maven
- JUnit 5
- Git
- GitHub
- Jira
- GitHub Actions

## Project Structure

online-book-store/

├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/bookstore/App.java
│   └── test/
│       └── java/
│           └── com/bookstore/AppTest.java
├── pom.xml
└── README.md

## Run the Application

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.bookstore.App"