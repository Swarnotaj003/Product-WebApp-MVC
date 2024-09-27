# Product WebApp MVC

## Objective
To implement a simple web based application that follows `MVC architecture` & study its benefits

## Features
- Login
- Add Product

## Tech Stack
- `Frontend` : JSP (HTML with Embedded Java), CSS
- `Backend` : Java Servlets
- `Database` : MySQL, JDBC

## Cloning
Use the following command to clone this repository
```
git clone https://github.com/Swarnotaj003/Product-WebApp-MVC.git
```

## Local Database
Run the following MySQL commands in your local device before executing
```
CREATE DATABASE mvcsample;

USE mvcsample;

CREATE TABLE product (
    id int PRIMARY KEY,
    name varchar(255),
    category varchar(255),
    quantity int,
    price double,
    image varchar(255)
);

DESC product;
```
