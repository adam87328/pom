# Example Maven Project

This project demonstrates how to use Maven to create a Java application that marshals XML data using a generated Java class from an XSD file.

## Project Structure

```
example-maven-project
├── pom.xml                # Maven configuration file
├── README.md              # Project documentation
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── example
    │   │           └── App.java  # Main application class
    │   └── resources
    │       └── example.xsd       # XML Schema Definition
    └── test
        └── java
            └── com
                └── example
                    └── AppTest.java  # Unit tests for the application
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven 3.6 or higher

### Building the Project

To build the project, navigate to the project directory and run:

```
mvn clean install
```

### Running the Application

After building the project, you can run the application using the following command:

```
mvn exec:java -Dexec.mainClass="com.example.App"
```

### Running Tests

To run the unit tests, use the following command:

```
mvn test
```

## License

This project is licensed under the MIT License. See the LICENSE file for more details.