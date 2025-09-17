#  GameList 

Aplicação backend para organização de listas de jogos, desenvolvida com foco em **boas práticas, separação de camadas, arquitetura limpa e deploy em produção via Railway**. Projeto ideal para consolidar conhecimentos em **Spring Boot + PostgreSQL + Docker**, com suporte completo a reordenação de listas.


<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=java,spring,postgres,docker" />
  </a>
</p>
<p align="center">
<img src="https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Deploy-Railway-purple?style=for-the-badge" />
  <img src="https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge" />
</p>

## Visão Geral do Projeto

O **GameList** é uma aplicação backend REST para gerenciamento de listas personalizadas de jogos.

### 🔹 Antes da Refatoração

O projeto foi originalmente desenvolvido como um exercício introdutório para praticar:
- CRUD simples com **Java + Spring Boot**
- Relacionamentos básicos (`Game`, `GameList`, `BelongsTo`)
- Deploy com **Railway** para exposição pública da API

No entanto, não havia:
- Tratamento de exceções estruturado
- Validações adequadas dos dados
- Separação total de responsabilidades (camadas estavam acopladas)



### 🔸 Depois da Refatoração

A nova versão do projeto evoluiu para um backend **muito mais robusto e alinhado com padrões profissionais**, incluindo:

-  Arquitetura em **camadas bem definidas** (`Controller`, `Service`, `DTO`, `Exception`, `Mapper`) ✔️
-  Aplicação de princípios **SOLID** ✔️
-  **Validações automáticas** com Bean Validation (`@NotNull`, `@Size`, etc.) ✔️
-  **Tratamento global de erros** via `@ControllerAdvice` ✔️
-  Estrutura pronta para evoluir com novas features ✔️

> 🔄 Essa refatoração não apenas elevou a qualidade do projeto, como também mostra meu domínio crescente sobre boas práticas, testes, e design limpo em aplicações reais com Spring Boot.

##  Aprendizados Técnicos

- Manipulação de relacionamentos complexos com JPA (ManyToMany com entidade intermediária) ✔️  
- Uso de projeções com Spring Data JPA para melhorar a performance ✔️  
- Separação clara por camadas e responsabilidades (controller, service, repository) ✔️  
- Aplicação real de arquitetura limpa em projetos REST ✔️  
- Deploy de aplicações backend com banco de dados no **Railway** ✔️  
- Integração com Postman para testes completos dos endpoints ✔️

---
##  Modelo Conceitual

A estrutura do domínio foi modelada com foco na organização e reordenação de jogos:

- **Game**: entidade principal contendo título, capa, descrição, gênero e outras propriedades do jogo
- **GameList**: lista personalizada de jogos, criada para organizar preferências do usuário
- **BelongsTo**: entidade de associação entre `Game` e `GameList`, com um atributo de `position` que indica a ordem do jogo dentro da lista

##  Tecnologias Utilizadas

| Tecnologia       | Descrição                                        |
|------------------|--------------------------------------------------|
| **Java 21**       | Linguagem principal da aplicação                 |
| **Spring Boot 3** | Framework para criação de APIs REST              |
| **Spring Data JPA / Hibernate** | Persistência e ORM                      |
| **PostgreSQL**    | Banco de dados relacional                       |
| **Docker**        | Containerização do banco de dados

---

📬 Conecte-se comigo 
  <a href="https://www.linkedin.com/in/gustavokowalski/" target="_blank">LinkedIn</a> | 
  <a href="mailto:kkowalskigustavo@gmail.com">Email</a>
