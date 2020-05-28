# language: pt
@SearchAllFieldsUser
Funcionalidade: Realizar busca preenchendo todos os campos do filtro de busca

  Esquema do Cenário: Validar se o sistema está retornando a busca informando todos os campos;
    Dado a busca pelos campos: <nome> <email> <telefone>
    Então realizar a busca pelos valores: <nome> <email> <telefone>

    Exemplos: 
      | nome    | email                  | telefone         |
      | "Maria" | "mariateste@gmail.com" | "+5534999991213" |
