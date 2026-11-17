FOOD DELIVERY SYSTEM
====================

This ZIP follows the separate-project layout: eureka-server, restaurant-service,
and api-gateway are three independent Maven/Spring Boot projects. There is no
root parent pom.xml and no nested Maven module setup.

Requirements: JDK 17 and Maven 3.8+.

IMPORT INTO ECLIPSE / SPRING TOOL SUITE
1. Extract this ZIP.
2. In Eclipse choose File > Import > Maven > Existing Maven Projects.
3. Set Root Directory to the extracted FoodDeliverySystem folder.
4. Select all three pom.xml projects and click Finish.
5. Do not import the subfolders a second time.

RUN IN THIS ORDER
1. eureka-server/src/main/java/.../EurekaServerApplication.java
2. restaurant-service/src/main/java/.../RestaurantServiceApplication.java
3. api-gateway/src/main/java/.../ApiGatewayApplication.java

EUREKA DASHBOARD
http://localhost:8761
Wait for RESTAURANT-SERVICE to appear in the registered instances list.
Its port is dynamically selected because restaurant-service has server.port=0.

TEST THROUGH API GATEWAY
GET http://localhost:8080/restaurants

POST http://localhost:8080/restaurants
Content-Type: application/json
{
  "name": "Paradise Biryani",
  "location": "Vijayawada",
  "cuisine": "Indian"
}

GET http://localhost:8080/restaurants/1
DELETE http://localhost:8080/restaurants/1

The H2 database is in-memory and resets when Restaurant Service restarts.
Spring Boot 3.4.5, Spring Cloud 2024.0.1, Java 17.
