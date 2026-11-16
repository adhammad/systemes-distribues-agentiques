## Objectif

Reprendre la démarche de cette vidéo montrant comment créer un micro-service qui permet de gérer des comptes bancaires : https://www.youtube.com/watch?v=2-qIoZcvhAw

## Travail à faire

1. Créer un projet Spring Boot avec les dépendances Web, Spring Data JPA, H2, Lombok
2. Créer l'entité JPA Compte
3. Créer l'interface CompteRepository basée sur Spring Data
4. Tester la couche DAO
5. Créer le Web service RESTful qui permet de gérer des comptes
6. Tester le web micro-service en utilisant un client REST comme Postman
7. Générer et tester la documentation Swagger des API REST du Web service

   Utilisez cette dépendance au lieu de celle qui est mentionnée dans la vidéo :

   ```xml
   <dependency>
     <groupId>org.springdoc</groupId>
     <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
     <version>2.8.13</version>
   </dependency>
   ```

8. Exposer une API RESTful en utilisant Spring Data Rest en exploitant des projections
9. Créer les DTOs et Mappers
10. Créer la couche Service (métier) du micro-service
11. Créer un Web service GraphQL pour ce micro-service en utilisant cette vidéo : https://www.youtube.com/watch?v=FsdR09jlqaE
