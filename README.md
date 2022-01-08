# README #

This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###

* This is simple login web application created using Spring Boot.
* Version of Spring Boot = 2.6.2
* Reference links :
	I)  https://www.youtube.com/watch?v=aRLoSDOlU3w
	II) https://www.codejava.net/frameworks/spring-boot/user-registration-and-login-tutorial

### How do I get set up? ###
* Summary of set up
	I) Just take clone of this repo and import it in the STS.

* Configuration

* Dependencies
	I) After cloning just run 'mvn clean install' command to download dependencies.

* Database configuration :
	I)   First Create DataBase with name 'LoginUsingSpringBoot' in mysql
	II)  Run testCreateUser() test case in UserRepositoryTest.java
	III) Check table 'users' has been created in LoginUsingSpringBoot database.
	IV)  Now set value of ‘spring.jpa.hibernate.ddl-auto’ to ’none’ in application.prop file.


### Who do I talk to? ###

* Ping me on linkedIn in case if you have any doubts(https://www.linkedin.com/in/vinayak-magadum-a2a90313b/).