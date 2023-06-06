![Job-Listings](https://github.com/Sowndarya9920/JobSearchPortal/assets/112794922/378873a3-475e-444b-a1c4-b36183ac9c57)

##### 🔸The student administration system you have built using the Spring Boot framework is designed to handle basic CRUD (Create, Read, Update, Delete) operations for managing student records.
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
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
## :three: Dataflow (Functions Used In)
### :white_flower: 1. Model - This used to show the mirror of our database which involves real world entities.
#### :o: Student.java

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

### :white_flower: 2. Service - This Layer is used to perform business functionalities.
#### :o: StudentService.java

----------------------------------------------------------------------------------------------------------------------------------------------------

### :white_flower: 3. Controller - This Controller is used to create RestApi's and perform basic CRUD operations.
#### :o: StudentController.java

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
### :white_flower: 4. Repository : data access object (DAO) is an object that provides an abstract interface to some type of database or other persistence mechanisms.
#### :o: IStudentsDao.java

-------------------------------------------------------------------------------------------------------------------------------------------------------
### :white_flower: 5. Application.properties File : The application.properties file in Spring Boot is a configuration file used to specify various settings and properties for the application.
```java
spring.datasource.url=jdbc:h2:mem:studentdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
```
-------------------------------------------------------------------------------------------------------------------------------------------------------
## :five: Test Rest Api's
#### :white_check_mark: Student Controller
```java
http://localhost:8080/add-student
```

```java
http://localhost:8080/find-all-students
```

```java
http://localhost:8080/find-student/id/{id}
```

```java
http://localhost:8080/update-student
```

```java
http://localhost:8080/delete-student
```

## :six: Documentation in Swagger
```java
 http://localhost:8080/swagger-ui/index.html#/
```

#  Summary
- :small_orange_diamond: Implemented basic CRUD operations (Create, Read, Update, Delete) to manage student records, and you utilized the H2 database for storing and manipulating the data.
- :small_orange_diamond: The system allows you to create new student records, retrieve existing records based on various criteria, update student information, and delete student records as needed, all using the H2 database as the underlying storage.
