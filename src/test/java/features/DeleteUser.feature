# language: pt
@DeleteUser
Funcionalidade: Realizar a exclusão do cadastro de um usuário;

  Esquema do Cenário: Validar se o sistema está excluindo cadastro de um usuário;
    Dado a busca pelo campo: <telefone>
    E realizar a busca pelos valores: <id> <telefone>
    E clicar no botão deletar
    Então valida se é exibida a mensagem de alerta <msg>

    Exemplos: 
      | id | telefone         | msg                    |
      |  1 | "+5534999991213" | "Usuário excluído com sucesso!" |
