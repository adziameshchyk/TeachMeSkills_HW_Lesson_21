# Task:
	Implement a calculator via a servlet.   
	The url has three parameters - the first number, the second and the operand.  
	The result will be displayed on the browser page.  
	In the form: (first number) (operation sign) (second number) = (result)
 ---


# CalculatorServlet

CalculatorServlet is a simple web application that performs basic arithmetic operations using a servlet. The application takes three parameters from the URL: two numbers and an operation, and returns the result of the operation.

## Features

- Addition
- Subtraction
- Multiplication
- Division

## Getting Started

### Prerequisites

- Java 19
- Apache Maven
- Apache Tomcat 11
- IntelliJ IDEA (Community or Ultimate Edition)

### Installation

#### 1. Using Command Line

1. **Clone the repository:**
    ```bash
    git clone https://github.com/adziameshchyk/TeachMeSkills_HW_Lesson_21_CalculatorServlet.git
    cd TeachMeSkills_HW_Lesson_21_CalculatorServlet
    ```

2. **Build the project using Maven:**
    ```bash
    mvn clean package
    ```

3. **Deploy the generated WAR file to your Tomcat server:**
    - Copy the `target/CalculatorServlet.war` file to the `webapps` directory of your Tomcat installation.
    - Start Tomcat if it's not already running.

#### 2. Using IntelliJ IDEA

1. **Clone the repository:**
    - Open IntelliJ IDEA.
    - Select `File > New > Project from Version Control > Git`.
    - Enter the URL of your GitHub repository and click `Clone`.

2. **Import the Maven project:**
    - IntelliJ IDEA should automatically detect the `pom.xml` file and import the project as a Maven project.
    - If it doesn't, right-click on the `pom.xml` file in the project explorer and select `Add as Maven Project`.

3. **Build the project:**
    - Open the Maven tool window (View > Tool Windows > Maven).
    - In the Maven tool window, expand the project and navigate to `Lifecycle`.
    - Double-click on `clean` and then `package`.

4. **Configure Tomcat in IntelliJ IDEA:**
    - Go to `Run > Edit Configurations`.
    - Click the `+` icon and select `Tomcat Server > Local`.
    - Configure your Tomcat server by setting the Tomcat installation directory.
    - Under the `Deployment` tab, click the `+` icon and select `Artifact`.
    - Choose the `CalculatorServlet:war` artifact.

5. **Run the project:**
    - Click `Apply` and `OK` to save the configuration.
    - Click the Run button or press `Shift + F10` to start the Tomcat server with your deployed application.
### Usage

To use the calculator, open your web browser and navigate to the following URL, replacing the placeholders with your numbers and operation:  
http://localhost:8080/CalculatorServlet/calc?num1=NUMBER1&num2=NUMBER2&operation=OPERATION

Example:  
http://localhost:8080/CalculatorServlet/calc?num1=6&num2=2&operation=div  
![screenshot](https://github.com/adziameshchyk/TeachMeSkills_HW_Lesson_21_CalculatorServlet/assets/123600438/c678f3cc-fb70-4551-aa42-51abc433aeb6)



### Supported Operations

- `add` - Addition
- `sub` - Subtraction
- `mul` - Multiplication
- `div` - Division

## Project Structure

```plaintext
CalculatorServlet/
├── pom.xml
├── .gitignore
└── src/
    └── main/
        └── java/
            └── com/
                └── tms/
		    ├── entity/
		    |	└── Calculator.java
		    ├── service/
		    |	└── CalculatorService.java
		    └── servleet/
			└── CalculatorServlet.java
  

Description of Classes

Calculator.java: Interface with a static method for performing calculations.
CalculatorService.java: Interface with a static method for converting operation strings to characters.
CalculatorServlet.java: Servlet that handles GET requests, performs calculations, and returns the result.

Configuration

pom.xml: Maven configuration file with dependencies and build instructions.
