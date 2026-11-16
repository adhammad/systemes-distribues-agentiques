# Projet Systèmes Distribués Agentiques

Présentation du projet : https://www.youtube.com/watch?v=ua5XHtSPI3Y

## Partie 1

Vidéo : https://www.youtube.com/watch?v=cdFz3VemT1Q

- Développer le service Customer-Service
- Développer le service EBank-Service
- Faire communiquer les deux services avec OpenFeign
- Fault Tolerance avec Circuit Breaker : Resilience4J
- Développer la Gateway
- Développer le Discovery Service
- Tester les services backend avec un client REST : Postman et Swagger-UI

## Partie 2

Vidéo : https://www.youtube.com/watch?v=JHvxSZTWSsY

- Développer l'Agent AI basé sur Spring AI
- Exposer les fonctionnalités des micro-services via MCP
- Tester les micro-services via un client MCP
- Connecter le chatbot avec les micro-services via MCP
- Tester le chatbot avec un client REST
- Tester le chatbot avec un client Telegram
- Tester le chatbot avec un client Discord

## Partie 3

Vidéo : https://youtu.be/wDheR7_2jkQ

## Configuration

La clé API OpenAI ne doit jamais être écrite dans le dépôt. Fournissez-la par variable d'environnement :

```bash
export OPENAI_API_KEY=<votre-clé>
```
