
# 🛒 **ProdutosMVC**

<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white" alt="Thymeleaf">
  <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL">
  <img src="https://img.shields.io/badge/CRUD-Complete-FF6F00?style=for-the-badge&logo=server&logoColor=white" alt="CRUD">
</p>

---

## 🚀 **Overview**

**ProdutosMVC** é uma aplicação web moderna desenvolvida com Spring Boot que implementa um sistema completo de gerenciamento de produtos. Este projeto demonstra um exemplo prático de um aplicativo CRUD (Create, Read, Update, Delete), proporcionando uma experiência visual agradável e funcional.

### 🔗 **[Acesse a Aplicação em Produção](https://produtosmvc.onrender.com/produtos)**

Clique no link acima para visualizar a aplicação em funcionamento e explorar as funcionalidades diretamente na versão em produção, hospedada e acessível.

---

## 💡 **Principais Funcionalidades**

- 📝 **Cadastro de Produtos**: Interface intuitiva para adicionar novos produtos ao sistema.
- 📄 **Listagem de Produtos**: Tabela dinâmica exibindo todos os produtos cadastrados.
- ✏️ **Edição de Produtos**: Modifique facilmente os detalhes dos produtos existentes.
- 🗑️ **Exclusão de Produtos**: Remova produtos do sistema com um simples clique.

---

## 🛠️ **Tecnologias Utilizadas**

Este projeto foi desenvolvido utilizando as mais recentes tecnologias, garantindo robustez, desempenho e escalabilidade:

- **Java 17** ![Java](https://img.shields.io/badge/-007396?style=flat&logo=java&logoColor=white): Linguagem principal do backend.
- **Spring Boot 3.3.2** ![Spring Boot](https://img.shields.io/badge/-6DB33F?style=flat&logo=spring-boot&logoColor=white): Framework para desenvolvimento ágil de aplicações.
- **Thymeleaf 3.0.12** ![Thymeleaf](https://img.shields.io/badge/-005F0F?style=flat&logo=thymeleaf&logoColor=white): Motor de template para renderização do frontend.
- **PostgreSQL** ![PostgreSQL](https://img.shields.io/badge/-4169E1?style=flat&logo=postgresql&logoColor=white): Banco de dados relacional usado para armazenar os dados dos produtos.
- **Maven** ![Maven](https://img.shields.io/badge/-C71A36?style=flat&logo=apache-maven&logoColor=white): Gerenciador de dependências do projeto.
- **Lombok** ![Lombok](https://img.shields.io/badge/-FF7F50?style=flat&logo=lombok&logoColor=white): Biblioteca que ajuda a reduzir o código boilerplate no Java.

---

## 📂 **Arquitetura do Projeto**

O projeto segue a arquitetura MVC (Model-View-Controller), organizando o código de forma modular e facilitando a manutenção e expansão futura:

```plaintext
src/
 └── main/
     ├── java/
     │   └── br/com/forms/
     │       ├── config/                # Configurações da aplicação
     │       ├── controller/            # Controladores MVC
     │       │   └── ProdutoController.java
     │       ├── entity/                # Entidades JPA
     │       │   └── Produto.java
     │       ├── repository/            # Repositórios de dados
     │       │   └── ProdutoRepository.java
     │       └── FormsApplication.java  # Ponto de entrada da aplicação
     └── resources/
         ├── static/
         │   ├── css/                   # Arquivos de estilo CSS
         │   ├── js/                    # Scripts JavaScript
         │   ├── img/                   # Imagens estáticas
         └── templates/
             └── produtos/              # Templates Thymeleaf
                 ├── index.html         # Página de listagem
                 └── formulario.html    # Página de formulário
```

---

## 🎨 **Interface do Usuário**

A aplicação foi projetada para ser simples e funcional, com uma interface de usuário clara e direta. Abaixo estão alguns exemplos da interface:

### 🖥️ **Página Inicial - Lista de Produtos**

<p align="center">
  <img src="imagens/Captura de Tela 2024-08-20 às 19.50.43.png" alt="Lista de Produtos" width="80%" style="border-radius: 10px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);">
</p>

### 📝 **Formulário de Cadastro/Edição**

<p align="center">
  <img src="imagens/Captura de Tela 2024-08-20 às 19.51.42.png" alt="Formulário de Produtos" width="80%" style="border-radius: 10px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);">
</p>

---


**ProdutosMVC** está disponível para acesso público, oferecendo uma demonstração clara e objetiva das suas funcionalidades diretamente em produção.

---
