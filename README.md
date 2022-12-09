Template DDD project structure with jMolecules
==============================================

A project shows standard structure of Domain Driven Design project with Spring Boot.

# Domain Driven Design Architecture

![Domain Driven Design](src/site/images/ddd-landscape.png)

# Domain Driven Design Layers

![DDD Layers](src/site/images/ddd-layers.png)

# Hexagonal (Ports & Adapters) Architecture with DDD

![Hexagonal Architecture with DDD](src/site/images/hexagon-ddd.png)

# CQRS(Command Query Responsibility Separation) Pattern

![CQRS Pattern](src/site/images/cqrs-pattern.png)

# Reactive DDD - communication between bounded contexts

![Reactive DDD](src/site/images/reactive-ddd.png)

* Async vs Sync
* Message Driven & Back Pressure
* Reactive(RSocket) protocols: Request/Response, Request/Stream, Fire & Forget, Channel
* Reactive Stream Frameworks: Reactor(Mono,Flux), RxJava, Akka Streams, Smallrye Mutiny, Kotlin Flow

# Features

* Project directory/package structure
* Validation with specification
* Exception with error package: Spring 6 ProblemDetail integration
* Annotations with jMolecules
* DDD application layer with Hexagonal architecture
* Event firing/listener with Spring Events
* ArchUnit integrated

# Requirements

* Java 17
* Apache Maven 3.5+

# Tips

* DTO(Data Transfer Object): please use record instead of class - https://blog.sebastian-daschner.com/entries/java-records
* Please consider Observability into your architecture: Logging, Metrics, Tracing, Events.

# References

* jMolecules: https://github.com/xmolecules/jmolecules
* Architecturally evident Java applications with jMolecules: https://www.youtube.com/watch?v=IzLHmPNmLLw
* Hexagonal architecture: https://alistair.cockburn.us/hexagonal-architecture/
* CQRS: https://martinfowler.com/bliki/CQRS.html
* Spring Modulith: https://spring.io/projects/spring-modulith
* ArchUnit: https://www.archunit.org/
* Cargo Tracker: https://eclipse-ee4j.github.io/cargotracker/
* jMolecules with Spring Data: https://spring.io/blog/2021/04/20/what-s-new-in-spring-data-2021-0#jmolecules
* Architecturally evident Java applications with jMolecules: https://www.youtube.com/watch?v=IzLHmPNmLLw
* Hexagonal (Ports & Adapters) Architecture: https://medium.com/idealo-tech-blog/hexagonal-ports-adapters-architecture-e3617bcf00a0
* DDD, Hexagonal, Onion, Clean, CQRS, … How I put it all
  together: https://herbertograca.com/2017/11/16/explicit-architecture-01-ddd-hexagonal-onion-clean-cqrs-how-i-put-it-all-together/
* Spring Events: https://www.baeldung.com/spring-events
