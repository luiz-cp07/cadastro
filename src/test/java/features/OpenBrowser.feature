# language: pt
@OpenBrowser
Funcionalidade: Abertura do browser acessando o sistema de cadastro de usuários

  Cenário: Abrir o browser informar a url e acessar o sistema
    Dado a abertura do browswer "http://eainacaoqa.eu5.org/";
    Então verificar se o sistema está disponível pela "Crud sistema para automatizar"
