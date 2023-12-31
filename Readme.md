# Checkout API
## Table of Contents
* [Description](#description)
* [API Endpoints](#api-endpoints)
* [Dependencies](#dependencies)
* [Running the application](#running-the-application)
* [API Contract](#api-contract)
  * [Swagger Editor](#swagger-editor)
  * [Swagger UI](#swagger-ui)

## Description
This project demonstrates the use of GitHub Copilot to generate a 
Contract-first API using OpenAPI 3.x.  The steps to create this project
have been documented here:
* [Generate an OpenAPI 3.0.3 specification using GitHub Copilot](documentation/Codegeneration_OpenAPI.mp4)

  The video shows how to use the GitHub Copilot plugin for IntelliJ IDEA to generate an OpenAPI 3.0.3 specification.  See the file being created under
  - 'src/main/resources' : OpenAPI 3.0.3 specification file

* [Generate a build.gradle file using GitHub Copilot](documentation/video1.mp4)

  The video shows how to use the GitHub Copilot plugin for IntelliJ IDEA to generate a build.gradle file. See the file being created under the root directory of the project.
* [Generate Controller and Service classes using GitHub Copilot](documentation/video1.mp4)

  The video shows how to use the GitHub Copilot plugin for IntelliJ IDEA to generate example Controller and Service classes. See the files being created under
  - 'src/main/java/com/ai/codegeneration/sig/api' : Controller classes
  - 'src/main/java/com/ai/codegeneration/sig/services' : Service classes
* [Generate Entity, Repository and Mapper classes using GitHub Copilot](documentation/video1.mp4)

  The video shows how to use the GitHub Copilot plugin for IntelliJ IDEA to generate example Entity, Repository and Mapper classes. See the files being created under
  - 'src/main/java/com/ai/codegeneration/sig/entities' : Entity classes
  - 'src/main/java/com/ai/codegeneration/sig/repositories' : Repository classes
  - 'src/main/java/com/ai/codegeneration/sig/mapper' : Mapper classes
* [Generate Exception and ControllerAdvice classes using GitHub Copilot](documentation/video1.mp4)

  The video shows how to use the GitHub Copilot plugin for IntelliJ IDEA to generate example Exception and ControllerAdvice classes. See the files being created under
  - 'src/main/java/com/ai/codegeneration/sig/exceptions' : Exception classes
  - 'src/main/java/com/ai/codegeneration/sig/api' : ControllerAdvice classes

## API Endpoints
* Card endpoints
  * POST /cards : Save a card
  * GET /cards/{cardId} : Get a card by cardId
* Transaction endpoints
  * POST /transactions : Checkout a transaction for a saved card
  * GET /transactions/{transactionId} : Get a transaction by transactionId
  * GET /transactions?cardId={cardId} : Get all transactions for a cardId

## Dependencies
* Java Spring Boot
* OpenAPI
* Swagger UI
* Spring Data JPA
* Lombok
* H2 Database

## Running the application
```
./gradlew bootRun
```
## API Contract
### Swagger Editor
To help with editing the Open API contract, view the openapi.yaml file in the Swagger Editor available at: https://editor.swagger.io/

### Swagger UI
http://localhost:8080/swagger-ui/index.html when the application is running.


