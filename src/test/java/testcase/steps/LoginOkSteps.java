package testcase.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;

import testcase.pages.login.LoginOkPage;

public class LoginOkSteps extends PageObject {

    LoginOkPage loginOkPage;

    @Given(": que o usuário está na tela de login")
    public void que_o_usuário_está_na_tela_de_login() {
        open();
        loginOkPage.preencherCampos();
    }

    @When(": o usuário insere credenciais válidas")
    public void o_usuário_insere_credenciais_válidas() {
        loginOkPage.submitLogin();

    }

    @Then(": o usuário é redirecionado para a página inicial")
    public void o_usuário_é_redirecionado_para_a_página_inicial() {
        loginOkPage.validarLogin();
    }
}
