# Car Renting Application  README


This is a Java web application based on Spring Boot and the technical stacks are listed as follows:
  - Database: MySQL
  - Building connection between Model classes and tables in DB: Hibernate JPA
  - Back-end: Spring Boot
  - Data transmission between webpages and Java controller files: Thymeleaf
  - Front-end: HTML/CSS/JavaScript


# * Configuration for Project *
1. Having downloaded the MySQL Driver on the computer, and finish setting up the MySQL account
2. The local database configured in my web project is named 'car_rental'. So, after building the connection with the MySQL, create a new database called 'car_rental'
3. Within the file of application.properties: replace these three lines with your own MySQL account information and DB connection data
   <br />
   spring.datasource.url=jdbc:mysql://localhost:3306/car_rental<br />
   spring.datasource.username=root<br />
   spring.datasource.password=Bowen831<br />
4. It is able to test the connection with the IDE of IntelliJ Idea, and after it shows successful, click the run button to start running the project


# Default User Account

###  Regular User Account:
* Username: admin 

* Password: admin


###  Administrator Account 

* Username: root

* Password: 1234
