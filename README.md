# Aspire DemoApp
## Ideal test Environment
This project has been tested with
- Eclipse IDE
- Chrome Browser 97.0.4692.71 (chrome Driver for same has been provided in resources folder)
- Java Compiler 1.8

## Components
This project has following components
- **main/java** : this package contains following
        -   Object Repository
        -   Application Reusable Functions
        -   Driver Reusable Functions
        -   Properties
- **resources** : this package conatains the resources required by the project example chtomedriver
- **test/java/tests** : this package contains testng test

## How to configure test
Some basis runtime setting can be edited from aspire/src/main/java/properties/RuntimeProp.java file
Please Note:- Right now only chrome is supported
Please Note:- Product name is sufffixed with timestamp
Please Note:- Dependencies are downloaded from maven

## How To Execute
- Clean and build Project. For Eclipse IDE follow following steps
        - Click on **Project** menu (Alt+P shortcut on Windows)
        - Ensure **Build Automatically** option is checked
        - Click on Clean
- Update and save aspire/src/main/java/properties/RuntimeProp.java file as required
- Execute aspire/src/test/java/tests/ValidateManufacturingOrder.java as testng test

Please Note:- Execution steps are showcased in execution.
