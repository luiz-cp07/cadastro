# language: pt
@SearchUserPhone
Funcionalidade: Realizar busca no sistema pelo filtro campo telefone

  Esquema do Cenário: Validar se o sistema está retornando a busca pelo filtro do campo telefone;
    Dado a busca pelo campo: <telefone>
    Então realizar a busca pelos valores: <id> <telefone>

    Exemplos: 
      | id | telefone         |
      |  1 | "+5534999991213" |
