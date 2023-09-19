It is tough to define what Maven accomplishes.

Every day, Developer undertakes a variety of tasks.

Manages Dependencies - Web Layer (Spring MVC), Data Layer (JPA - Hibernate) etc..
Build a jar or a war or an ear
Run the application locally - Tomcat or Jetty
Deploy to a T environment
Add new dependencies to a project
Run Unit Tests
All of this and more is made possible by Maven...

Generate Projects
Create Eclipse Workspace
Getting Started
Git Repository - https://github.com/in28minutes/getting-started-in-5-steps
Pre-requisites - Java & Eclipse - https://www.youtube.com/playlist?list=PLBBog2r6uMCSmMVTW_QmDLyASBvovyAO3
We will use embedded maven in Eclipse
Step 1 : Creating and importing a Maven Project
We will create a Spring Boot project using http://start.spring.io
We will import it into Eclipse as a Maven Project
Step 2 : Understanding the pom.xml Project Object Model
Naming a project
Declaring Dependencies
Step 3 : Maven Build Life Cycle
run "mvn clean install"
Life Cycle Maven Build - Validate > Compile > Test > Package > Integration Test > Verify > Install > Deploy
Predefined folder structure trumps configuration.
Source Code
${basedir}/src/main/java
${basedir}/src/main/resources
Test Code
${basedir}/src/test
Step 4 : How does Maven Work?
Local Repository
Maven repository
stores all the versions of all dependencies. JUnit 4.2,4.3,4.4
mvn install - copies the created jar to local maven repository - a temp folder on my machine where maven stores the files.
Step 5 : Important Maven Commands
mvn --version
mvn compile (compiles source files)
mvn test-compile (compiles test files) - one thing to observe is this also compiles source files
mvn clean - deletes target directory
mvn test - run unit tests
mvn package - creates the jar
help:effective-settings
help:effective-pom
dependency:tree
dependency:sources
--debug
Complete Code Example
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>recruitment</groupId>
  <artifactId>apisample</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  
  <dependencies>
  <!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>5.3.1</version>
    <scope>test</scope>
</dependency>


<dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>json-path</artifactId>
      <version>5.3.2</version>
      <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.json</groupId>
    <artifactId>json</artifactId>
    <version>20230227</version>
</dependency>

<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.7.1</version>
    <scope>test</scope>
</dependency>

<!-- https://mvnrepository.com/artifact/com.github.scribejava/scribejava-apis -->
<dependency>
    <groupId>com.github.scribejava</groupId>
    <artifactId>scribejava-apis</artifactId>
    <version>8.3.1</version>
    <scope>runtime</scope>
</dependency>

<dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>json-schema-validator</artifactId>
      <version>5.3.2</version>
      <scope>test</scope>
</dependency>

<!-- https://mvnrepository.com/artifact/org.apache.cxf/cxf-xerces-xsd-validation -->
<dependency>
    <groupId>org.apache.cxf</groupId>
    <artifactId>cxf-xerces-xsd-validation</artifactId>
    <version>2.7.18</version>
</dependency>


 </dependencies>
  
</project>