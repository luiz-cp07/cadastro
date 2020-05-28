# language: pt
@SearchUserName
Funcionalidade: Realizar busca no sistema pelo filtro campo nome

  Esquema do Cenário: Validar se o sistema está retornando a busca pelo filtro do campo nome;
    Dado a busca pelo campo: <nome>
    Então realizar a busca pelos valores: <id> <nome>

    Exemplos: 
      | id | nome    |
      |  2 | "Maria" |
