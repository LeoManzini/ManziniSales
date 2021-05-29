# ManziniSales

Mono repository made with Spring and React, using some requests from a backend to build a screen with data about a company's salespeople and their sales.

## Technologies
- Java 11
- Spring Boot
- Maven 
- React
- Yarn
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

The obj and repositories packages has the classes that handle with the database, execute some queries and send this data to the service classes that after receive, send to 
the DTO classes where the data received is sent to the controller ones.

![database](https://user-images.githubusercontent.com/39606289/120084455-a6c58a00-c0a6-11eb-9b81-298d94be23a6.png)

The services package handle with the extracted data from the base, and redirect the same to DTO classes.

For the last we have the utils package, with the data of some places where we can trust to acess our webpage.

![last_backend](https://user-images.githubusercontent.com/39606289/120084542-7f22f180-c0a7-11eb-9534-e36c41ee1c72.png)

The database used on Backend is hosted on heroku, where the frontend is configured to connect and is from there that we receive the data to render the graphics and the table
with each sell information.

## FrontEnd

The FrontEnd was made using React and Yarn to manage the dependencies, the application is separated at the src folder, there we have the assets with the CSS file and images,
our page components like the footer, graphics, table and so on, our two pages at the pages folder, the types we use inside the programs and the utils folder with some utilities.

The outside contains files like the app, the file that will render first, the routes one, that has the url routes where we can navegate at the application and so on.

We used bootstrap to style our application, using it to apply styles to the footer, navigation bar and the like.

React works by loading some elements between files, making a complex rendering chain altogether.

## Acess

You can access this page through Netlify, where you will see the base inside Heroku being read and having its data extracted by the backend with Java and Spring,
which sends the data to be rendered in the frontend made with React and stylized with Bootstrap, link below:

```
https://leomanzini-manzinisales.netlify.app/
```

If the graphics are having a slow render it's because the database was at sleeping mode, just wait some seconds and see the magic happens!7

![homepage](https://user-images.githubusercontent.com/39606289/120084950-cf4f8300-c0aa-11eb-9db9-70233f480e8b.png)

![dashboard](https://user-images.githubusercontent.com/39606289/120084976-f0b06f00-c0aa-11eb-901c-edf47e2af1ae.png)

At the footer you have my personal links to GitHub and Linkedin, fell free to visit!
