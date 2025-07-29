# Employee Management System

## Description
A web-based Java application to manage employee records using Spring MVC, Hibernate, and MySQL with role-based access control.

## Features
- Add, update, delete, and view employee data
- Role-based access using Spring Security
  - **Admin**: Can add, edit, delete, view
  - **User**: Can view only

## Technologies
- Java, Spring MVC, Hibernate, MySQL, Spring Security, JSP

## MySQL Setup
1. Run `schema.sql` to create the database and table
2. Update your DB credentials in `hibernate.cfg.xml`

## Login
- **Admin**:  
  - Username: `admin`  
  - Password: `admin123`  
- **User**:  
  - Username: `user`  
  - Password: `user123`

## How to Run
1. Import project in Eclipse/IntelliJ as Maven Project
2. Configure Tomcat
3. Run the project and open `http://localhost:8080/`

