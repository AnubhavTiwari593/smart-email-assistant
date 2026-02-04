# Smart Email Assistant using ChatGPT AI (Spring Boot Backend)

Smart Email Assistant is a Spring Boot based backend application that generates automated and context-aware email replies based on user input and email type.

## Features
- Generate automated email replies
- Supports multiple email types (business, internship, support, complaint, general)
- RESTful APIs using Spring Boot
- Controller-Service-DTO architecture
- Tested using Postman

## Tech Stack
- Java
- Spring Boot
- Maven
- REST API
- Postman

## API Endpoint

POST /api/email/generate-reply

### Sample Request
{
  "emailText": "I want to apply for internship",
  "type": "internship"
}

### Sample Response
Thank you for your interest in internship opportunities. Our HR team will contact you.

## How to Run Project

1. Clone the repository
git clone https://github.com/AnubhavTiwari593/smart-email-assistant.git

2. Open project folder
cd smart-email-assistant

3. Run application
mvn spring-boot:run

4. Open Postman and test API
http://localhost:8080/api/email/generate-reply

## Author
Anubhav Tiwari
