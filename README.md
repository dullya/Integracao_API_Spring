# 🚀 Integração Front-End + Back-End com Spring Boot

Projeto desenvolvido com o objetivo de praticar a integração entre um **Front-End em HTML + JavaScript** e uma **API REST desenvolvida com Spring Boot**.

Este projeto demonstra comunicação HTTP utilizando métodos **GET e POST**, consumo de API com `fetch()` e estrutura básica de arquitetura REST.

## 🛠️ Tecnologias Utilizadas

* ☕ Java 17+
* 🌱 Spring Boot
* 🌐 HTML5
* 🎨 CSS3
* ⚡ JavaScript (Fetch API)

## 📌 Funcionalidades

### 🔹 GET `/api/mensagem`

Retorna uma mensagem do back-end.

**Resposta JSON:**

json
{
  "mensagem": "Dados do Back-End Spring Boot",
  "autor": "Dullya"
}


### 🔹 POST `/api/dados`

Recebe dados enviados pelo front-end.

**Exemplo de requisição:**

```json
"123"
```

**Resposta:**

```json
{
  "mensagem": "Recebido: 123",
  "autor": "API"
}
```


## 🏗️ Estrutura do Projeto

```
src
 └── main
     ├── java
     │    └── controller
     │    └── dto
     └── resources
          └── static
               ├── index.html
               └── js/app.js

```

## ▶️ Como Executar o Projeto

1️⃣ Clonar o repositório
```
git clone https://github.com/seu-usuario/nome-do-projeto.git
```
### 2️⃣ Rodar a aplicação

No terminal:

```
./mvnw spring-boot:run
```

No Windows PowerShell:

```
.\mvnw spring-boot:run
```

### 3️⃣ Acessar no navegador

```
http://localhost:8080

```

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com foco em:

* Entendimento da arquitetura REST
* Separação de responsabilidades
* Criação de DTO para transporte de dados
* Uso de `ResponseEntity` para controle de status HTTP
* Integração entre front-end e back-end


## 📚 Próximos Passos

* Implementar CRUD completo
* Adicionar validação com `@Valid`
* Implementar tratamento global de exceções
* Documentar API com Swagger
* Adicionar testes automatizados


## 👩‍💻 Autora

Desenvolvido por **Dullya Petronilio**
Em transição para Engenharia de Software com foco em Java Backend 🚀


##  📸 Preview


<img width="527" height="449" alt="image" src="https://github.com/user-attachments/assets/49078407-061e-43b3-adfd-f91e2c7e1ee0" />
