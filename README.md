# GameList - Organize seus Jogos Favoritos  
**License**

## Sobre o Projeto GameList  
O **GameList** é uma aplicação web backend desenvolvida com o objetivo de gerenciar listas de jogos de forma personalizada e intuitiva.  
O projeto permite que usuários visualizem jogos cadastrados, criem suas próprias listas e organizem os jogos de acordo com suas preferências, podendo inclusive reordenar os jogos dentro de uma mesma lista.

Este projeto foi desenvolvido com foco em boas práticas de programação, utilização de ferramentas modernas no back-end e arquitetura limpa.

---

## Funcionalidades do Projeto  
- Visualização de jogos disponíveis no sistema  
- Criação de listas personalizadas de jogos  
- Inclusão de jogos em listas específicas  
- Alteração da ordem dos jogos dentro de uma lista  
- Separação de responsabilidades via camadas: controller, service e repository  
- Utilização de modelo conceitual baseado em relacionamento entre entidades `Game` e `GameList`

---

## Modelo Conceitual / Diagrama de Domínio  
O modelo de domínio do GameList possui as seguintes entidades principais:  
- `Game`: representa um jogo com informações como nome, capa, descrição, gênero, etc.  
- `GameList`: representa uma lista personalizada de jogos.  
- `BelongsTo`: representa a associação entre jogos e listas, com uma posição definida para cada jogo na lista.



![Modelo Conceitual](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

## Tecnologias Utilizadas

### Back-end  
- Java 21  
- Spring Boot  
- JPA / Hibernate  
- Maven  
- API REST  

### Front-end  
*Não utilizado neste projeto (foco exclusivo no back-end da API).*

---

## Como Executar o Projeto

### Pré-requisitos:  
- Java Development Kit (JDK) 21+  
- Maven (ou utilize o wrapper `./mvnw`)

### Passos:  

1. Clonar o repositório:
```bash
git clone https://github.com/gustavokowallski/GameList.git
```
2.  **Entrar na pasta do projeto:**
    ```bash
    cd dslist
    ```
3.  **Executar o projeto:**
    ```bash
    ./mvnw spring-boot:run
    ```
    *O projeto será executado em `http://localhost:8080` por padrão.*

### **Autor**

**Gustavo Eiji Kowalski Hatada**
[![LinkedIn Badge](https://img.shields.io/badge/-Gustavo%20Kowalski-blue?style=flat&logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/gustavo-kowalski-94234b322/)

---
