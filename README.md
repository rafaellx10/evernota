# evernota
Evernota, a simple task management.

## Technologies
- Java 1.8
- Maven
- Spring boot
- Spring security
- JPA and Hibernate
- Thymeleaf
- MySQL on localhost and PostgreSQL on Heroku

## How to use
You can test the applcation on Heroku or on your machine.
### Online on Heroku
You can use on this link ![here](https://intelligent-choucroute-43849.herokuapp.com/). The application is hosted on Heroku, so the first access will take a while (30 seconds-ish) to load the web application, but just for the first time.

### On your localhost
1. Download or clone the code.
2. import to your IDE (Eclipse, IntelliJ IDEA or NetBeans).
3. Set a connection to you database on **src/main/resources/application.properties** (MySQL in my case). 
```
# ++++Spring data
spring.jpa.show-sql = true
spring.datasource.url=jdbc:mysql://localhost:3306/{YOUR_DATABASE}
spring.datasource.username={YOUR_DATABASE_USER}
spring.datasource.password={YOUR_DATABASE_PASSWORD}
spring.jpa.hibernate.ddl-auto=update
spring.datasource.testWhileIdle = true
spring.datasource.validationQuery = SELECT 1
#spring.datasource.driver-class-name=org.postgresql.Driver
```
4. And run it.
