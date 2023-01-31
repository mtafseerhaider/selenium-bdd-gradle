# Test Automation Framework

This framework is based on Selenium WenDriver + TestNG + Cucumber using Java language.

This README includes information about the project structure and instructions to execute functional & usability tests suites.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for evaluating my effort on this challenge.

### Technologies

* Selenium WebDriver v4.8.0 - for Web Based UI Automation Testing
* Java JDK 17 - for Development
* Gradle v7.6 - as Build Tool
* TestNG v7.7.1 - as Test Framework
* Cucumber v7.11.0 - as BDD Framework

### External Libraries Used

* WebDriverManager v5.3.2 - for the automatic management of the binary drivers (i.e. chromedriver, msedgedriver, geckodriver) required by Selenium WebDriver.
* AssertJ v3.24.2 - for implementing assertions

## Framework Requirements

### Browsers Selection

* Google Chrome
* Microsoft Edge Chromium
* Mozilla Firefox

## Project Structure

### src/test/java/com/company/support/base

- contains the **AutomationBase.java** a singleton class acts as base class that all tests & some utilities inherit
- contains the **AutomationFactory.java** a class developed on factory design pattern to hold Selenium WebDriver objects
- contains the **DriverOptions.java** an enum that handles browser capabilities and options
- contains the **IDriverSetup.java** an interface that holds a signature of Selenium WebDriver objects with desired capabilities

### src/test/java/com/company/support/pages

- contains the **page object classes** implemented using the very famous design pattern **Page Object Model**.

### src/test/java/com/company/support/utils

- contains all the utility methods needed to support the framework

### src/resources/configs

- contains the **application.properties** file to hold application url

### src/test/java/com/company/features

- contains feature files

### src/test/java/com/company/steps

- contains steps files

### build.gradle

- contains the information of the project and configurations to build the project such as dependencies, build directory, source directory,
  test source directory, plugins, goals etc.

## Guide to Execute Test Suites

Please either clone this project or download it on your local machine. Once done, please follow below steps to execute   
the tests.

### Executing the Tests Suite

Open **CMD** or any terminal . Go to the project root directory and run the following commands.

Note: Recommended option is to use **IntelliJ Idea Maven runner.**

Use below Gradle command to run tests (with default settings i.e. browser = chrome):

gradle clean test

Use below Gradle command to run tests on Firefox:

gradle **-D**browser=**firefox** clean test