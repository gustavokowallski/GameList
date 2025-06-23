# GameList - Organize seus Jogos Favoritos

## License

[MIT License](https://github.com/gustavokowallski/dslist/blob/main/LICENSE)

https://dslist-production-55f3.up.railway.app

## Sobre o Projeto GameList

O **GameList** é uma aplicação web backend desenvolvida com o objetivo de gerenciar listas de jogos de forma personalizada e intuitiva.

O projeto permite que usuários visualizem jogos cadastrados, criem suas próprias listas e organizem os jogos de acordo com suas preferências, podendo inclusive reordenar os jogos dentro de uma mesma lista.

Este projeto foi desenvolvido com foco em boas práticas de programação, utilização de ferramentas modernas no back-end e arquitetura limpa.

## Funcionalidades do Projeto

* Visualização de jogos disponíveis no sistema
* Criação de listas personalizadas de jogos
* Inclusão de jogos em listas específicas
* Alteração da ordem dos jogos dentro de uma lista
* Separação de responsabilidades via camadas: controller, service e repository
* Utilização de modelo conceitual baseado em relacionamento entre entidades `Game` e `GameList`

## Modelo Conceitual / Diagrama de Domínio

O modelo de domínio do GameList possui as seguintes entidades principais:

* **Game**: representa um jogo com informações como nome, capa, descrição, gênero, etc.
* **GameList**: representa uma lista personalizada de jogos.
* **BelongsTo**: representa a associação entre jogos e listas, com uma posição definida para cada jogo na lista.

## Tecnologias Utilizadas

### Back-end

* Java 21
* Spring Boot
* JPA / Hibernate
* Maven
* API REST
* PostgreSQL (para persistência de dados)
* Docker (utilizado no processo de deploy)

### Front-end

* Não utilizado neste projeto (foco exclusivo no back-end da API).

## Como Executar o Projeto Localmente

**Pré-requisitos:**

* Java Development Kit (JDK) 21+
* Maven (ou utilize o wrapper `./mvnw`)
* Banco de Dados PostgreSQL (rodando localmente ou em um serviço externo)

**Passos:**

1.  **Clonar o repositório:**
    ```bash
    git clone [https://github.com/gustavokowallski/GameList.git](https://github.com/gustavokowallski/GameList.git)
    ```
2.  **Entrar na pasta do projeto:**
    ```bash
    cd GameList # Alterado de 'dslist' para 'GameList' para corresponder ao repositório
    ```

3.  **Executar o projeto:**
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

## Autor

**Gustavo Eiji Kowalski Hatada**
* [Seu perfil do GitHub](https://github.com/gustavokowallski) (Opcional, mas muito recomendado!)
* [Seu perfil do LinkedIn](https://www.linkedin.com/in/seu-perfil-linkedin) (Opcional, mas muito recomendado!)
