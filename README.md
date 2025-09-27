#  GameList 

Aplicação backend para organização de listas de jogos, desenvolvida com foco em **boas práticas, separação de camadas, arquitetura limpa e deploy em produção via Railway**. Projeto ideal para consolidar conhecimentos em **Spring Boot + PostgreSQL + Docker**, com suporte completo a reordenação de listas.


<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=java,spring,postgres,docker,aws" />
  </a>
</p>
<p align="center">
  <img src="https://img.shields.io/badge/Deploy-AWS-orange?style=for-the-badge" />
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
-  **Validações automáticas** com Bean Validation (`@NotNull`, `@Size`, etc.) ✔️
-  **Tratamento global de erros** via `@ControllerAdvice` ✔️
-  Sistema de segurança utilizando SpringSecurity e tokens JWT ✔️
-  Estrutura pronta para evoluir com novas features ✔️
-  Deploy na AWS com EC2, RDS ✔️

> 🔄 Essa refatoração não apenas elevou a qualidade do projeto, como também me permitiu melhorar minhas habilidades em boas práticas e design limpo em aplicações reais com Spring Boot.

> ---

## Deploy e Otimização de Custos (AWS): A Batalha Vencida!

Colocar o **GameList** para rodar na **AWS** foi o toque final para consolidar a experiência de *cloud deployment*! Ver a aplicação **Spring Boot** subir em um ambiente de produção real, utilizando o **Docker**.

Este deploy não foi apenas um teste, mas a prova prática do domínio em:

* **Infraestrutura como Serviço (IaaS):** Consegui configurar e gerenciar uma instância **Amazon EC2** do zero para hospedar o *backend*.
* **Banco de Dados Gerenciado (RDS):** A experiência com o **Amazon RDS (PostgreSQL)** me mostrou como é fácil ter um banco de dados robusto, focado apenas no código e na performance, sem me preocupar com a infraestrutura.
* **Segurança e Redes:** Apliquei o conhecimento de **Security Groups** para garantir que o EC2 e o RDS conversassem de forma segura, o que é crucial em qualquer ambiente de produção.

**Status Atual: Cuidado e Otimização!**

> A infraestrutura foi desligada, mas o código, o **Dockerfile** e as configurações de deploy estão aqui no repositório, servindo como a **evidência completa** dessa jornada de aprendizado em *cloud deployment*.

### Evidências da Implementação (Sucesso Comprovado!)

Abaixo estão as "provas" de que a API funcionou perfeitamente:

* **Container Docker Rodando:** A execução do *backend* na instância EC2 (ver [Issue #6](https://github.com/kowalskiig/Gerenciador-de-Jogos/issues/6#issue-3459757712)).
* **Teste de Endpoints via Postman:** Demonstração do retorno da API em produção (ver [Issue #3](https://github.com/kowalskiig/Gerenciador-de-Jogos/issues/3#issue-3454867226)).
* **Estrutura de Banco de Dados:** A prova de que o PostgreSQL do RDS estava pronto para receber os dados (ver [Issue #7](https://github.com/kowalskiig/Gerenciador-de-Jogos/issues/7#issue-3459760728)).


##  Aprendizados Técnicos

- Manipulação de relacionamentos complexos com JPA (ManyToMany com entidade intermediária) ✔️  
- Uso de projeções com Spring Data JPA para melhorar a performance ✔️  
- Separação clara por camadas e responsabilidades (controller, service, repository) ✔️  
- Aplicação real de arquitetura limpa em projetos REST ✔️  
- Deploy de aplicações backend com banco de dados no **Railway** ✔️
- Deploy de aplicação backend com máquinas virtuais e banco de dados no **AWS** ✔️  
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
