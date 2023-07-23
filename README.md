# Group Shared Expense Calculator (Microservices architecture)

* [General info](#general-info)  
* [Requirement](#requirements)  
* [Use Case](#use-case)  
* [Technologies](#technologies)  

## General info

This cost sharing program can be used to calculate the cost share of each person in the group. For example, when you go on a trip with friends, where several people pay for joint expenses. At the end of the trip you will need to calculate how much each person owes and to whom. With this program, you can automate the entire process.

## Requirements

#### Admin:

> - The admin can add, confirm, cancel, extend the subscription
> 
> - Admin has access to view all subscribers

#### Subscription:

> - The user must be able to register  after subscribing

> - After logging in, the user must be able to add other participants  
> 
> - After adding other participants, the generated login and password should be sent to the participants' mail  
> 
> - A subscribed member can create an event  
> 
> - A signed member can create, edit, delete an event  
> 
> - A signed member has access to create, edit, and modify expenses  
> 
> - At the end of the deadline, participants must receive a report by email 

#### Participant:

> - The participant must be able to register

> - The participant has the opportunity to create a new expense, review expenses and balance

#### UX/UI:

> - Information about the list of expenses should be displayed on the expenses subpage
> 
> - Information about the balance of participants should be displayed on the balance subpage



## Use Case

| url                          | call method | description                                                       |
|:---------------------------- |:-----------:| ----------------------------------------------------------------- |
| http://localhost:8761/eureka | -           | Go to the Eureka Server page. Registration of all active services |

## Technologies

- Java 17  
- Spring Boot 
- Eureka Server
- Spring Cloud
- Spring Security  
- Spring Data
- Spring Scheduler
- Hexagonal Architecture
- CI/CD
- RabbitMQ
- JUnit 5  
- AssertJ  
- Mockito  
- Lombok  
- MySQL  
- Docker  
- Git
