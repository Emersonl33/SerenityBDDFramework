@RunWith(SerenityRunner.class)
Feature: Login no sistema
  Eu como usuário da plataforma
  Desejo fazer login com credenciais válidas
  Para acessar minha conta com sucesso

  @LoginOk @smoke
  Scenario: Login bem-sucedido
    Given : que o usuário está na tela de login
    When : o usuário insere credenciais válidas
    Then : o usuário é redirecionado para a página inicial
