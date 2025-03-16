## Description
This project is a template for a Spring Boot application, designed to streamline the setup and deployment process. It includes a basic structure for a RESTful API, integration with Maven for build automation, and instructions for running the application locally. The code base has been built on the Model View Controller Architecture.

If anyone simply wants to start building api, simply copy down the source code and follow the following steps.

	1. Configure incoming Object Type in the ```src/java/com/{project-name}/dto/``` folder.
	1. Configure the API Configuration in the ```src/java/com/{project-name}/controller/``` in the Api Controller.
	1. Write down Any Tests for any business logic in the ```test/java/com/{project-name}/ service/``` folder.
	1. Write down the logic for the Service in ```src/java/com/{project-name}/service/``` folder.

*All the above code samples have been provided.*

Any issues have been record in the issues section of the repo.

## Repo Structure
```
/{project-name}
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cloudmersive
│   │   │           └── controller
│   │   │           |    └── ApiController.java ## Configure all HTTP Request here
│	│	│			└── service ## Add all Buisness logic Transformations here
│	│	│			└── dto ## Configure, Incoming JSON Format for Controllers
|	|	│			
│   │   └── resources
│   │       └── application-dev.properties ## Configure Springboot Profile Environment Variales
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
Run the following command ```docker-compose --profile dev up --build --watch``` .  

## Hotreload, but re-run tests each time
Run ```docker compose --profile test up --watch```, which will lauch the server in hot
Will have to check container logs, to review the tests of the results.

Note : You cannot query the API in this mode, this is specifically designed for CI/CD purposes to ensure that it can be ensured that all tests are passing.

## How to compile the Source Code for deployment
Simply ```docker-compose --profile prod up```, after copying down the source code, and ensuring that docker is installed on the production server.

## How the code is compiled
Technically Docker & Docker compose handles all this for us.

1. Build with all the latest Changes using Maven
```maven clean package```
2. Launch the Springboot Server
```java -jar target/cloudmersive-interview-1.0-SNAPSHOT.jar ```



## Project Management

### Name Change

If you change the name of the project, make sure to also change it from the ```pom.xml``` file.

### Installing Dependency

Copy down the XML info, into the ```pom.xml``` file, and then let the container rebuilt. In dev and test mode, it will automatically rebuild.

### Unit Testing

Currently the repo is set to use [JUnit Framework]() to unit test the code base.



## References

[JUNIT Testing Framework](https://junit.org/junit4/javadoc/4.8/org/junit/Assert.html) 
