
# A Simple Java Restful API using Spring and MongoDB

## Requirements
Java7 - http://www.oracle.com/technetwork/java/javase/downloads/jre7-downloads-1880261.html

Maven - http://maven.apache.org/download.cgi

## Available Resources
* users/
* listings/
* users/{id}
* listings/{id}
* users/{id}/listings


**These are all Http GET resources, there are no POST calls yet**

## Usage

Download and unzip this repository

Cd into `sample-java-restful-api`

<p>Build the jar file by running `mvn clean package`</p>

Then run the JAR by typing `java -jar target/gs-rest-service-0.1.0.jar`

On your browser go to `http://localhost:8080/users/`
