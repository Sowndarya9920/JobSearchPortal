![Job-Listings](https://github.com/Sowndarya9920/JobSearchPortal/assets/112794922/378873a3-475e-444b-a1c4-b36183ac9c57)

##### 🔸The Job search portal have built using the Spring Boot framework is designed to handle basic CRUD (Create, Read, Update, Delete) operations for managing job searches with some validations.
## :one: Frameworks and Languages Used -
    1. SpringBoot
    2. JAVA
    3. Postman
    4. H2 Database
    
## :two: Dependency Used
    1. Spring Web
    2. Spring Boot Dev Tools
    3. Lombok
    4. Spring Data JPA
    5. H2
    6. Validations
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
## :three: Dataflow (Functions Used In)
### :white_flower: 1. Model - This used to show the mirror of our database which involves real world entities.
#### :o: Job.java
#### :o: JobType.java

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

### :white_flower: 2. Service - This Layer is used to perform business functionalities.
#### :o: JobService.java

----------------------------------------------------------------------------------------------------------------------------------------------------

### :white_flower: 3. Controller - This Controller is used to create RestApi's and perform basic CRUD operations.
#### :o: JobController.java

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
### :white_flower: 4. Repository : data access object (DAO) is an object that provides an abstract interface to some type of database or other persistence mechanisms.
#### :o: IJobDao.java

-------------------------------------------------------------------------------------------------------------------------------------------------------
### :white_flower: 5. Application.properties File : The application.properties file in Spring Boot is a configuration file used to specify various settings and properties for the application.
```java
spring.datasource.url=jdbc:h2:mem:studentdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true

// To view queries in console

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true
```
-------------------------------------------------------------------------------------------------------------------------------------------------------
## :five: Test Rest Api's
#### :white_check_mark: Job Controller
```java
http://localhost:8080/addJobs
```

```java
http://localhost:8080/getJobByTitle/{title}/{description}
```

```java
http://localhost:8080/delete/location/{location}
```

```java
http://localhost:8080/updateJob/{id}/{salary}
```
## :six: Documentation in Swagger
```java
 http://localhost:8080/swagger-ui/index.html#/
```

#  Summary
- :small_orange_diamond: Implemented basic CRUD operations (Create, Read, Update, Delete) to manage job records, and you utilized the H2 database for storing and manipulating the data.
- :small_orange_diamond: The system allows you to create new job records, retrieve existing records based on various criteria, update job information, and delete job records as needed, all using the H2 database as the underlying storage with validations.
