# language: pt
@RegistrationUser
Funcionalidade: Realizar o cadastro do usuario no sistema

  Esquema do Cenário: Validar se o sistema está cadastrando o usuário com sucesso;
    Dado o clique no botão Add usuários;
    E preencher todos os campos: <nome> <email> <telefone>
    E clicar no botão Adcionar
    Então realizar a busca pelos valores: <id> <telefone>

    Exemplos: 
      | id | nome    | email                  | telefone         |
      |  1 | "Maria" | "mariateste@gmail.com" | "+5534999991213" |
