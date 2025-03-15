## Description
This project is a template for a Spring Boot application, designed to streamline the setup and deployment process. It includes a basic structure for a RESTful API, integration with Maven for build automation, and instructions for running the application locally.

## Repo Structure
```
/cloudmersive-interview
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cloudmersive
│   │   │           └── controller
│   │   │           |    └── ApiController.java ## Configure all HTTP Request here
|	|	|			└── service  ## Add all Buisness logic Transformations here
|	|	|			└── dto     ## 
|	|	|			
│   │   └── resources
│   │       └── application.properties
│   └── test
│       ├── java
│       │   └── com
│       │       └── cloudmersive
│       │           └── service  ## All the tests for all the buisness logic transformations
│       └── resources
├── .gitignore
├── pom.xml						## Maven Config
└── README.md					## You Should read this
```

## How to compile for deployment with hotreload
Run the following command ```SPRING_PROFILES_ACTIVE=dev docker-compose up --build --watch```

## Hotreload, but re run tests each time
Run ```docker compose --profile test up --watch```
Will have to check container logs, to review the tests of the results.

## How to compile the Source Code for deployment
Simply ```docker-compose up --build```



## How the code is compiled
Technically Docker & Docker compose handles all this for us.

1. Build with all the latest Changes using Maven
```maven clean package```
2. Launch the Springboot Server
```java -jar target/cloudmersive-interview-1.0-SNAPSHOT.jar ```


