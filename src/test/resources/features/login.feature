#language: pt

Funcionalidade: Login

  Contexto:
    Dado que a modal esteja sendo exibida
  @clicarForaModal
  Cenario: Fechar a modal ao clicar fora da mesma
    Quando for realizado um clique fora da modal
    Entao a janela modal deve ser fechada
  @ClicarBtnFechar
  Cenario: Fechar a modal ao clicar no ícone fechar
    Quando for realizado um clique no ícone de fechar da modal
    Entao a janela modal deve ser fechada
  @LinkCreateAccount
  Cenario: Link Create New Account
    Quando for realizado um clique no link Create New Account
    Entao a pagina Create Account deve ser exibida
  @loginComSucesso
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | login       | <login>    |
      | password    | <password> |
      | remember    | <remember> |
    Quando for realizado o clique no botao sign in
    Entao deve ser possivel logar no sistema
    Exemplos:
      |identificacao          | login    | password    | remember |
      | campos obrigatórios   |          |             | false    |
      | todos os campos       |          |             | true     |
  @LoginInvalido
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | login       | <login>    |
      | password    | <password> |
      | remember    | <remember> |
    Quando for realizado o clique no botao sign in
    Entao o sistema devera exibir uma mensagem de erro
    Exemplos:
      |identificacao          | login | password | remember |
      | campos obrigatórios   |       |          | false    |
      | todos os campos       |       |          | true     |
  @LoginEmBranco
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | login       | <login>    |
      | password    | <password> |
      | remember    | <remember> |
    Quando for realizado o clique no botao sign in
    Entao o botao sign in deve permanecer desabilitado
    Exemplos:
      |identificacao          | login | password | remember |
      | usuario em branco     |       |          | false    |
      | senha em branco       |       |          | true     |


