# Group Shared Expense Calculator (in progres)

* [General info](#general-info)  
* [Requirement](#requirements)  
* [API Documentation](#api-documentation) 
* [Technologies](#technologies) 
* [Conclusion](#conclusion)

## General info:

This cost sharing program can be used to calculate the cost share of each person in the group. For example, when you go on a trip with friends, where several people pay for joint expenses. At the end of the trip you will need to calculate how much each person owes and to whom. With this program, you can automate the entire process.

## Requirements:

#### Admin

> - should be able to add, confirm, cancel, extend the subscription
> 
> - has access to view all subscribers

#### Subscription

> - the user must be able to register  after subscribing

> - after logging in, the user must be able to add other participants  
> 
> - after adding other participants, the generated login and password should be sent to the participants' mail  
> 
> - a subscribed member can create an event  
> 
> - a signed member can create, edit, delete an event  
> 
> - a signed member has access to create, edit, and modify expenses  
> 
> - at the end of the deadline, participants must receive a report by email 

#### Participant

> - the participant must be able to register

> - the participant has the opportunity to create a new expense, review expenses and balance

#### UX/UI:

> - information about the list of expenses should be displayed on the expenses subpage
> 
> - information about the balance of participants should be displayed on the balance subpage

## API Documentation:

| Operation                                                | URL template                     |
| -------------------------------------------------------- | -------------------------------- |
| Eureka Server Page (registration of all active services) | GET http://localhost:8761/eureka |
| Get a list of events                                     | GET /events                      |
| Create a new event                                       | POST /events                     |
| Get a list of expenses associated with the event         | GET /expenses/event/{id}         |
| Create a new expenses                                    | POST /expenses                   |
| Create a new participant                                 | POST /participants               |

## Technologies:

- Java 17  
- Spring Boot 
- Eureka Server
- Spring Cloud
- Spring Security  
- Spring Data
- Spring Scheduler
- Hexagonal Architecture
- Liquibase
- CI/CD
- RabbitMQ
- JUnit 5  
- AssertJ  
- Mockito  
- Lombok  
- MySQL  
- Docker  
- Git

## Conclusion:
