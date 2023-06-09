# Quarkus

## A Powerful Java Framework for Cloud-Native Applications


### Introduction
In this presentation, we will explore Quarkus, an innovative Java framework designed for building cloud-native applications. This project aims to demonstrate the key features and advantages of Quarkus and provide a comparison with the widely-used Spring framework.

### Overview
Quarkus is a lightweight, open-source framework that enables efficient development of microservices and serverless applications. It focuses on optimizing startup time, memory consumption, and resource utilization while maintaining developer productivity. Quarkus combines popular Java EE and Eclipse MicroProfile standards with a modern approach to deliver exceptional performance in containerized environments.

### How to run
There are 2 ways of running a quarkus application, native and non-native, in the section below there will be links and steps on how to run it both ways:<br>
* Install jdk17, can be downloaded from oracles  [official website](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
* Clone the repo
* Maven > Lifecycle > package (be sure to not have the native profile crossed) to build the application
* Running the application <br>* to run it locally you just need to select the Quarkus-POC configuration and run it, can be tested [here](http://localhost:8080/starting-with-quarkus/login?username=user1&password=password2) 
<br>* to run it on docker you first need to make the docker image using this command: " docker build -f src/main/docker/Dockerfile.jvm -t quarkus-quickstart/getting-started . " <br> ** after building the image it needs to be started: "  docker run -i --rm -p 8080:8080 quarkus/code-with-quarkus-jvm  " after that it can be tested [here](http://localhost:8080/starting-with-quarkus/login?username=user1&password=password2)
* Native: please follow the instructions on their [website](https://quarkus.io/guides/building-native-image) on how to run the application natively for each type of OS
<br>
### Key Features
1.	Lightweight and Fast: Quarkus offers lightning-fast startup times and low memory footprint through its innovative compile-time bootstrapping and GraalVM-native binary compilation techniques. <br><br>
2.	Developer-Friendly: Quarkus supports familiar APIs from Java EE, Eclipse MicroProfile, and Spring, allowing developers to quickly adapt and leverage their existing skills. <br><br>
3.	Cloud-Native Support: Quarkus seamlessly integrates with Kubernetes, OpenShift, and serverless platforms, enabling easy deployment and scaling in modern cloud environments. <br><br>
4.	Extensive Extension Ecosystem: Quarkus provides a rich ecosystem of extensions that simplify integration with various libraries, frameworks, and technologies. <br>

### Panache: Effortless Data Access with Quarkus
One of the standout features of Quarkus is Panache, a powerful extension that simplifies data access and persistence in Java applications. Panache offers an intuitive and developer-friendly approach by leveraging the active record pattern. It allows you to define persistent entities using simple Java classes, reducing the need for boilerplate code and tedious mapping configurations. Panache also provides a fluent API that enables seamless querying, pagination, sorting, and other database operations. With Panache, developers can focus on the core business logic, accelerating development cycles and ensuring efficient data management within Quarkus applications, offering an alternative to Spring JPA.

### Spring comparison
When comparing Quarkus and Spring, we can highlight the following differences: <br><br>
a. Performance: Quarkus prioritizes performance optimization, achieving near-instantaneous startup times and efficient resource utilization. Spring emphasizes developer flexibility and provides a broader range of features. <br> <br>
b. Footprint: Quarkus boasts a smaller memory footprint, making it ideal for resource-constrained environments. Spring's comprehensive feature set results in a larger footprint and memory usage. <br><br>
c. Cloud-Native Approach: Quarkus is purpose-built for cloud-native architectures, ensuring seamless integration with containerization platforms. While Spring has made advancements in this area, Quarkus offers a more streamlined cloud-native experience. <br><br>
d. Growing Ecosystem: Spring has a mature ecosystem with extensive community support, while Quarkus is rapidly expanding its ecosystem and integrating with popular frameworks and technologies. <br>

### Conclusion
Quarkus presents an exciting opportunity for developing cloud-native applications with enhanced performance and efficiency. Its lightweight nature, developer-friendly APIs, seamless cloud-native support, and expanding extension ecosystem make it a compelling choice for university projects. By utilizing Quarkus, you can leverage its unique strengths to build modern and scalable applications.

