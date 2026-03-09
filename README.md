# Java User CRUD (Console Application)

A simple console-based CRUD application written in Java to practice backend fundamentals such as object-oriented programming, collections, and basic service architecture.

## Features

* Create a user
* Read a user by ID
* Update user information
* Delete a user
* List all users

The application runs in the console using a menu interface.

## Technologies

* Java
* Java Collections (`List`, `ArrayList`)
* `LocalDate` API
* Console input using `Scanner`

## Project Structure

```
src
├─ main
│   └─ Main.java
│
├─ model
│   └─ User.java
│
└─ service
    └─ UserService.java
```

### model

Contains the domain entity:

* `User`

### service

Contains the business logic and CRUD operations:

* `UserService`

### main

Contains the application entry point and the console menu logic.

## User Attributes

Each user contains:

* `id`
* `name`
* `birthDate`
* `profession`

The user's age is calculated dynamically based on the birth date using the Java `LocalDate` API.

## Data Storage

Users are stored in memory using a `List<User>`.

Each new user receives an automatically incremented ID.

## Exception Handling

The system throws a `NoSuchElementException` when a user with the specified ID cannot be found.

## Running the Application

Compile the project:

```
javac Main.java
```

Run the application:

```
java Main
```

## Learning Goals

This project was created to practice:

* Object-Oriented Programming
* CRUD operations
* Basic service-layer architecture
* Java Collections
* Console-based applications

## Future Improvements

* Separate printing logic from service layer
* Add input validation
* Persist users in a database
* Build a REST API using Spring Boot
* Create a web interface
