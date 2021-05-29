# ManziniSales

Mono repository made with Spring and React, using some requests from a backend to build a screen with data about a company's salespeople and their sales.

## Technologies
- Java 11
- Spring Boot
- Maven 
- React
- Node JS
- Bootstrap
- HTML5
- CSS3
- Heroku
- Netlify

## Description

This repository has the intention of learning more of the interaction of the BackEnd with the FrontEnd. 

### BackEnd

The backend was developed with Java using the Spring framework and Maven to manage the dependencies, the backend is responsible by extract data from the database and
return the data as ```get requests``` using the JSON format to return.

The good practices of Java programming were implemented efficiently, dividing the functions for the responsible packages and each class with its function. 

![java_structure](https://user-images.githubusercontent.com/39606289/120080349-d9fc1f00-c08e-11eb-840e-602c768e9792.png)

Being:

The sales package is the root package and has the main class inside.

![sales_package](https://user-images.githubusercontent.com/39606289/120080420-3101f400-c08f-11eb-8fb7-33098485198c.png)


The controller package is a child of the sales package and has the rest request controller classes of both DTO classes that access the database and has the request 
mapping functions, assembling the returns to the path specified in each function of the classes.


![controllers](https://user-images.githubusercontent.com/39606289/120080590-13815a00-c090-11eb-99b3-8133327103ec.png)

The DTO package has the classes that hold the queries returns made in the obj package, we do not use the classes in the obj package for a single reason, 
the classes in the obj package access the database, and it is not a good practice to use them in controllers, because the front-end service would have direct
access to our database.

![dto_package](https://user-images.githubusercontent.com/39606289/120081346-9f48b580-c093-11eb-9bfc-2a1e7a7057f2.png)

TODO obj and so on
