# language: pt
@EditUser
Funcionalidade: Realizar a edição do cadastro de um usuário

  Esquema do Cenário: Validar se o sistema está editando o cadastro de usuário;
    Dado a busca pelo campo: <telefone>
    E realizar a busca pelos valores: <id> <telefone>
    E realizar a edição do campo: <email>
    Então valida se é exibida a mensagem de alerta <msg>

    Exemplos: 
      | id | telefone         | email                  | msg                            |
      |  1 | "+5534999991213" | "mariateste@yahoo.com" | "Usuário editado com sucesso!" |
