# language: pt
@SearchUserEmail
Funcionalidade: Realizar busca no sistema pelo filtro campo email

  Esquema do Cenário: Validar se o sistema está retornando a busca pelo filtro do campo email;
    Dado a busca pelo campo: <email>
    Então realizar a busca pelos valores: <id> <email>

    Exemplos: 
      | id | email                  |
      |  3 | "mariateste@gmail.com" |
