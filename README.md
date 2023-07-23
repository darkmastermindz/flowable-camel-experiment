# Flowable Camel Example
Made with ❤️ by Hansel Wei
* Follows Official Flowable Example

# Read Me First
* Project created by following documentation and tutorials which are listed below to illustrate flowable and flowable running camel processes
* The following was discovered as part of building this project:

# Getting Started

Running example:
* `curl -H "Content-Type: application/json" -d '{"assignee" : "Evee"}' http://localhost:9000/process`
* `curl http://localhost:9000/tasks?assignee=1`

### Reference Documentation
For further reference, please consider the following sections:
* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.15-SNAPSHOT/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.15-SNAPSHOT/gradle-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.15-SNAPSHOT/reference/htmlsingle/#using.devtools)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.7.15-SNAPSHOT/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.15-SNAPSHOT/reference/htmlsingle/#web)
* [Spring for Apache ActiveMQ Artemis](https://docs.spring.io/spring-boot/docs/2.7.15-SNAPSHOT/reference/htmlsingle/#messaging.jms.artemis)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/2.7.15-SNAPSHOT/reference/htmlsingle/#messaging.kafka)
### Guides
The following guides illustrate how to use some features concretely:

* [Flowable BPMN User Guide](https://www.flowable.com/open-source/docs/bpmn/ch05a-Spring-Boot)
* [Using Apache Camel with Spring Boot](https://camel.apache.org/camel-spring-boot/latest/spring-boot.html)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Messaging with JMS](https://spring.io/guides/gs/messaging-jms/)
* [Spring Framework Reference - Beans Factory XML](https://docs.spring.io/spring-framework/docs/3.0.x/spring-framework-reference/html/beans.html#beans-factory-xml-import)
* [Flowable Camel Ping Pong Example](https://www.seedim.com.au/getting-started-with-flowable-and-camel/)

### Additional Links
These additional references should also help you:
* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
* [Could not find org.flowable.camel.CamelBehavior](https://github.com/flowable/flowable-engine/issues/1322)

### Not for Production Use Disclaimer 
This project is not meant for production use, the following security measures were taken out:
* [Disabled Spring Security for Demo Purposes](https://stackoverflow.com/questions/23894010/spring-boot-security-disable-security)