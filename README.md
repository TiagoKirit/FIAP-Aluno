# Cadastro de Alunos

Este projeto foi criado com o intuíto de aprendizagem. Logo, podem haver erros, mas sobretudo, temos um sistema funcional.

## 🚀 Começando


Este projeto consistem um uma API CRUD, ou seja, ele proporciona: Criar, Consultar, Alterar e Deletar registros em uma base de dados.

### 🌎 Composição do projeto
O projeto foi criado utilizando os seguintes recursos / ferramentas:
 - Spring Framework com as seguintes dependências:
   - Spring Data JPA
   - Spring Web
   - Lombok
   - PostgreSQL Driver
 - Docker (subir e gerenciar imagem/container do Postgre)
 - PostgreSQL (banco de dados)

### 📋 Como executar o projeto:

Para que seja possível a execução do projeto em ambiente local, é necessário:

```
1° - Abra o terminar na pasta raiz do projeto e execute:
     docker-compose up --build
     Este comando irá criar duas imagens no Docker - Uma para aplicação e outra para o postgres.
     Além de criar as imagens ele irá executar os containers, então é só aguardar um pouco.

2° - Utilize a collection abaixo para importar no postman:
     FIAP.postman_collection.json
     
3° - Além de visualizar os registros no próprio Postman, 
também é possível visalizar os registros utilizando o programa PGAdmin.

```
### 📚 Mapeamento dos EndPoints
```
Descrição: Esta rota irá criar um registro na tabela aluno.
Verbo: POST
URL: http://localhost:8080/api/v1/aluno/create
Body: 
{
    "nome": "Tiago",
    "email": "Tiago@tiago.com",
    "dataCriacao": "1993-11-22T18:18:00.055+00:00"
}
------------------------------------------------------

Descrição: Esta rota irá consultar todos os registros da tabela aluno.
Verbo: GET
URL: http://localhost:8080/api/v1/aluno/buscar-todos
------------------------------------------------------

Descrição:Esta rota irá consultar um único registro baseado no ID correspondente na URL
Verbo: GET
URL: http://localhost:8080/api/v1/aluno/buscar-aluno/1
------------------------------------------------------

Descrição: Esta rota irá alterar o registro correspondente ao ID da URL
Verbo: PUT
URL: http://localhost:8080/api/v1/aluno/update/1
Body:
{
    "nome": "jose antonio",
    "email": "jose@antonio.com",
    "dataCriacao": "2023-12-29T18:12:41.055+00:00"
}
------------------------------------------------------

Descrição:Esta rota irá deletar um único registro baseado no ID correspondente na URL
Verbo: DELETE
URL: http://localhost:8080/api/v1/aluno/delete/1
------------------------------------------------------
```


## ⚙️ Projeto em andamento
### Ainda farei atualizções aqui

---
Por: Tiago Kiritschenko Maffi
