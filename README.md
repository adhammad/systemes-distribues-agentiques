# Systèmes Distribués Agentiques

Projet de cours sur les systèmes distribués agentiques : de l'implémentation d'un micro-service Spring Boot jusqu'à une architecture micro-services pilotée par un agent IA conversationnel (Spring AI + MCP).

## Contenu

| Dossier | Description |
|---|---|
| [tp1-microservice-implementation](tp1-microservice-implementation/README.md) | TP1 : micro-service de gestion de comptes bancaires (Spring Boot, JPA, H2, REST, Swagger, Spring Data Rest, DTOs/Mappers, GraphQL) |
| [tp2-architecture-microservices](tp2-architecture-microservices/README.md) | TP2 : architecture micro-services de facturation (customer, inventory, billing, Gateway, Eureka, Config Service) rendue agentique via MCP, avec clients Discord, Telegram et Angular |
| [projet-systemes-distribues-agentiques](projet-systemes-distribues-agentiques/README.md) | Projet : Customer-Service et EBank-Service (OpenFeign, Resilience4J, Gateway, Discovery) puis agent IA Spring AI exposé via MCP, testé avec REST, Telegram et Discord |

## Technologies

Spring Boot, Spring Data JPA, H2, Spring Cloud Gateway, Eureka, OpenFeign, Resilience4J, Spring AI, MCP, GraphQL, Angular.

## Prérequis

- JDK et Maven
- Une clé API OpenAI fournie par variable d'environnement (`OPENAI_API_KEY`)

## Structure

Chaque dossier contient son propre README avec l'énoncé et le travail à faire.
