package testcase.pages.login;


import lombok.Getter;
import lombok.SneakyThrows;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;

import net.serenitybdd.core.steps.UIInteractions;
import testcase.components.LoginOkComponents;

@Getter
public class LoginOkPage extends UIInteractions {

    @Managed
    LoginOkComponents loginOkComponents;


    @Step("Preencher campos obrigatorios")
    public void preencherCampos() {
        loginOkComponents.getInputUsuario().click();
        loginOkComponents.getInputUsuario().sendKeys("student");
        loginOkComponents.getInputSenha().click();
        loginOkComponents.getInputSenha().sendKeys("Password123");
    }

    @Step("Submeter o login")
    public void submitLogin() {
        loginOkComponents.getBotaoSubmit().click();
    }


    @Step("Validar Login")
    public void validarLogin() {
        loginOkComponents.validarTexto();
    }
}
