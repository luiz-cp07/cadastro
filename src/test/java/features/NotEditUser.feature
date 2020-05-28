# language: pt
@NotEditUser
Funcionalidade: Não realizar a edição do cadastro e verificar se o sistema informa ao usuário que o usuário não foi editado;

  Esquema do Cenário: Validar se o sistema exibe mensagem de alerta de não edição do cadastro para o usuário;
    Dado a busca pelo campo: <telefone>
    E realizar a busca pelos valores: <id> <telefone>
    E realizar a edição do campo: <email>
    Então valida se é exibida a mensagem de alerta <msg>

    Exemplos: 
      | id | telefone         | email                  | msg                            |
      |  1 | "+5534999991213" | "mariateste@yahoo.com" | "Você não mudou nada!" |
