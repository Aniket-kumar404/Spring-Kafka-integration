# 🚀 Spring Boot Kafka Integration Example

This project demonstrates a complete **Apache Kafka + Spring Boot** integration, showcasing how to build a real-time event-driven pipeline using a **Producer**, **Consumer**, and **Kafka cluster running on Docker**.

It covers:
- Kafka Producer using `KafkaTemplate`
- Kafka Consumer using `@KafkaListener`
- Kafka topic communication
- Docker-based Kafka setup
- Spring Boot auto-configuration

---
## 📂 Project Structure

springboot-kafka-integration/
│
├── src/main/java/com/example/kafka/
│ ├── controller/
│ │ └── KafkaController.java
│ ├── producer/
│ │ └── KafkaProducerService.java
│ ├── consumer/
│ │ └── KafkaConsumerService.java
│ └── SpringbootKafkaIntegrationApplication.java
│
├── src/main/resources/
│ └── application.properties 
│
├── docker-compose.yml
└── README.md
