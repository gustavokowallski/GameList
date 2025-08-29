# 🎮 GameList - Organize seus Jogos Favoritos

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1-brightgreen)
![PostgreSQL](https://img.shields.io/badge/Database-PostgreSQL-blue)
![Docker](https://img.shields.io/badge/docker-enabled-blue)
![License](https://img.shields.io/badge/License-MIT-blue.svg)

---

> 📢 Projeto focado em backend com Java + Spring Boot, com deploy no Railway e suporte completo a reordenação de listas de jogos.

---

## 🔎 Sobre o Projeto

O **GameList** é uma API REST que permite a gestão de listas personalizadas de jogos, com visualização, organização e reordenação de jogos cadastrados.

O projeto foi desenvolvido com foco em boas práticas, organização em camadas e arquitetura limpa.

---

## 🧩 Funcionalidades

- 🔍 Visualizar todos os jogos cadastrados  
- 📝 Criar e gerenciar listas de jogos  
- 🔄 Reordenar jogos dentro de uma lista  
- 🔗 Associação entre jogos e listas via entidade intermediária  
- ✅ Separação por camadas: Controller, Service, Repository  

---

## 🧱 Modelo Conceitual

O modelo de domínio contém:

- **Game**: entidade principal com título, capa, gênero, descrição, etc  
- **GameList**: coleção personalizada de jogos criada pelo usuário  
- **BelongsTo**: relação entre `Game` e `GameList`, com posição (posição do jogo na lista)



---

## 🧰 Tecnologias Utilizadas

- Java 21  
- Spring Boot  
- Spring Data JPA / Hibernate  
- PostgreSQL  
- Docker  
- Maven  
- API REST  

---

## ⚙️ Como Executar Localmente

### Pré-requisitos
- JDK 21+  
- PostgreSQL rodando localmente  
- Maven instalado (ou use `./mvnw`)

### Passos

```bash
# Clone o repositório
git clone https://github.com/gustavokowallski/GameList.git
cd GameList
```
# Execute a aplicação
```bash
./mvnw spring-boot:run
```

    O projeto será executado em `http://localhost:8080` por padrão. (Mais abaixo tem o link do Postman para teste, apenas troque a URL para a local).

## Deploy

Esta aplicação está deployada e acessível publicamente através do **Railway**.

**URL da API:** [https://dslist-production-55f3.up.railway.app](https://dslist-production-55f3.up.railway.app)

## Testando a API

Você pode testar os endpoints da API utilizando esta coleção pública do Postman:

[**Coleção Postman GameList API**](https://nawszera.postman.co/workspace/nawszera's-Workspace~ea6779bc-203d-4c77-8395-e87a3f1091fa/collection/45108000-b29a0724-66f5-4da8-9db4-0e085172f89d?action=share&source=copy-link&creator=45108000)

**Instruções para usar a coleção:**

1.  Acesse o link da coleção.
2.  Clique em "Fork Collection" para importar a coleção para sua própria workspace no Postman.
3.  Certifique-se de que a variável de ambiente `baseUrl` (ou similar) na coleção esteja configurada para a URL do seu deploy: `https://dslist-production-55f3.up.railway.app`
4.  Execute as requisições para testar as funcionalidades da API.

---

## 👨‍💻 Autor

**Gustavo Eiji Kowalski Hatada**  
[![LinkedIn Badge](https://img.shields.io/badge/-Gustavo%20Kowalski-blue?style=flat&logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/gustavo-kowalski-94234b322/)

