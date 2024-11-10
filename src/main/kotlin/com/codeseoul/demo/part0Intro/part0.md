## What is Spring

- It is a framework that provides various things to help develop JVM applications
- It is not only limited to web applications, but it is most commonly used in backend server development
- It is unopinionated and requires the developer to configure everything

## What is Spring Boot

- It is an opinionated setup of Spring that allows rapid development and quick initial development startup

## Main thing to know

- Spring Boot is based on Spring
- Spring Boot configures a lot of things for you which takes a while to figure out what things are getting configured
- You can use Spring Boot without knowing what it actually is doing(but it helps to know what's happening)

### What does Spring Boot configure for you?

- assuming Spring MVC
    - which application server to use, default: Tomcat
    - where to read application properties from, default: file called application.properties
    - what kind of serializer to use for json serialization/deserialization, default: Jackson