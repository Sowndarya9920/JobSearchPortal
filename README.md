
# ***JOB SEARCH PORTAL***

- The aim of the project is to perform the basic CRUD operations with some validations.
- Spring initializer was used to create a spring boot application project.


## **Frameworks and Languages used :**

- Java
- Spring Boot

![image](https://user-images.githubusercontent.com/112794922/235358831-a37bfd60-a5e3-414a-80d9-2f2b00447cef.png)


## **Dependency used :**

- Spring web
- Spring Boot Dev Tool
- Lombok
- Validations
- H2 database

## **Data Flow :**

## **Model :** 

- It consists of a Job class which consists of Entity's used to model our data application.
- By using Lombok dependency , ___@Data___ , ___@AllArgsConstructor___ , ___@NoArgsConstructor___ is used to create getters and setters as well as default and parameterized constructors.

## **Controller :**

- It consists of JobController class which basically control the flow of data.
- ___@RestController___ annotation is used to make the RestaurantController class as controller layer.
- ___@GetMapping , @PostMapping , @PutMapping , @DeleteMapping___ annotations are used to perform the CRUD operations.
- ___@Valid___ is used in post mapping in order to do some validations while inserting the data.

![image](https://user-images.githubusercontent.com/112794922/235452732-5ef9931f-b8fe-4916-8178-92c3e315ed95.png)



- ### **API Reference :**

#### ***Get Jobs by title and description***

```http
  http://localhost:8080/getJobByTitle/{title}/{description}
```

#### ***Add Jobs***

```http
  http://localhost:8080/addJobs
```

#### ***Delete Users by Location***

```http
  http://localhost:8080/delete/location/{location}
```

#### ***Update Users by salary***

```http
  http://localhost:8080/updateJob/{id}/{salary}
```

## **Service :** 

- It consists of JobService class which helps us to write the business functionalities.
- ___@Service___ annotation is used to make the class as a service layer.

![image](https://user-images.githubusercontent.com/112794922/235452761-3d3bb08b-beb1-4f84-b280-7f9108d6595c.png)


## **Repository :**

- It consists of JobDao which is used to manage or datas.
- ___@Repository___ annotation is used to make the class repository layer.
- ![image](https://user-images.githubusercontent.com/112794922/235452781-2ee14061-9af6-4e4b-9957-edbc5e4136c2.png)


## **Validations :** 
- ___@NotEmpty___ is used as validation for title in order to specify that the name inserted must not be empty.
- @NotNull is used as validation for description to be not null.
 


## **Summary :**

- In this project , I had created the RestApi's performing various ___CRUD operations___ such as fetch , save , delete and update users with ___validations___.
- The RestApi's are tested by using ___Postman___ which is a client used to test our Api's.
- The data's were stored in the ___H2 database___ which is ___in-memory database___.

