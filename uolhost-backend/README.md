# Projeto: Teste para BackEnd para UOL HOST

## Descrição

Projeto desenvolvido como parte do desafio proposto no seguinte link: [Teste para BackEnd para UOL HOST](https://github.com/uolhost/test-backEnd-Java). Ele envolve a construção de uma aplicação backend com foco em montar uma aplicação Java capaz de recuperar informações de um arquivo XML e de um arquivo JSON, persistir um cadastro em um banco de dados em memória ou em arquivo e listar os cadastros em uma interface simples, utilizando tecnologias como Spring Boot, H2 Database, e outras bibliotecas relevantes.

## Funcionalidades

- **Cadastro de Jogadores**: Usuários podem cadastrar jogadores com nome, e-mail, telefone e grupo (Liga da Justiça ou Os Vingadores).
- **Listagem de Jogadores**: Listagem de todos os jogadores cadastrados, exibindo detalhes como nome, email, telefone e codinome.
- **Codinome Automático**: Geração automática de codinomes exclusivos para cada jogador.
- **Persistência de Dados**: Utilização do banco de dados H2 para armazenar as informações.
- **Tratamento de Exceções**: Handler global para exceções que padroniza as respostas de erro.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- H2 Database (banco de dados em memória)
- Thymeleaf (para renderização de páginas web)

## Como Rodar o Projeto

### Pré-requisitos:

- Java 17 ou superior
- Maven instalado para gerenciamento de dependências

## API Endpoints
[http://localhost:8080/](http://localhost:8080/)
### Jogadores

- **POST /jogadores**: Cadastrar um novo jogador

  Exemplo de corpo de requisição:

    ```json
    {
      "nome": "Bruce Wayne",
      "email": "bruce@wayne.com",
      "telefone": "123456789",
      "tipoGrupo": "JUSTICE_LEAGUE"
    }
    ```
- **GET /jogadores**: Listar todos os jogadores cadastrados.

