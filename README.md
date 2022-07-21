# Author: Shivanagouda S A <br />

## Movie catalog REST application

Java spring boot application using Microservice based architecture <br />
Service Discovery by **Netflix Eureka Server** <br />
Service configuration by **Spring Cloud Config Server** <br />

Services: <br />
**Movie catalog service**
> Main service that handles requests and calls other services <br />

**Ratings data service** 
>Service that gets ratings of movies <br />

**Movie info service** 
>Service that gets movie info from [MovieDb](https://www.themoviedb.org) <br />
<br />

**Dependencies** <br />
Java 11, Maven, Visual Studio, Postman <br />

**How to run?** <br />
1.Fork this repository and clone it <br />
2.Go to the project directory and build project with maven in cmd <br />
  >mvn clean install <br />

3.Run Spring boot app using maven <br />
  >mvn spring-boot : run <br />
  
4.Or run by creating jar <br />
  >java -jar target/projectName-0.0.1-SNAPSHOT.jar <br />

5.Now the application is runnnig in respective port <br />


