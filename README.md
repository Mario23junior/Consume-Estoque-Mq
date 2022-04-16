 


 ![Build Status](https://app.travis-ci.com/Mario23junior/Estoque-API-Mq.svg?branch=main)
 
 
👨‍💻

<h1 align="center"> Api de envio de mensagens entre sistemas</h1>
<p align="center">
API REST de código aberto para dados de consulta de  pesquisa  as informações nela contida  foi desenvolvida usando como base organizacional um sistema de mensageria 
entre sistemas esta camada consume as mensagens vindo do projeto <a href="https://github.com/Mario23junior/Estoque-API-Mq" target="_blank">Estoque-API-Mq</a>  
<p>


### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Java](https://www.java.com/pt-BR/)
- [SpringBoot](https://spring.io/projects/spring-boot)
- [Docker](https://www.docker.com/)
- [RabbitMQ](https://www.rabbitmq.com/)
- [Travis-CI](https://app.travis-ci.com/)


💻
## Primeiro execute o mave
```bash
 mvn package
```

## Em seguida faça compile o projeto

```
java -jar target/consumer-1.0-SNAPSHOT.jar
```

# Contribuindo
Solicitações pull são bem-vindas. Para mudanças importantes, abra um problema primeiro para discutir o que você gostaria de mudar.

Certifique-se de atualizar os testes conforme apropriado

## License
[MIT](https://choosealicense.com/licenses/mit/)
