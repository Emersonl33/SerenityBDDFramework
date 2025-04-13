package testcase.components;


import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@Getter
public class LoginOkComponents extends PageObject {

    @FindBy(id = "submit")
    private WebElementFacade botaoSubmit;

    @FindBy(id = "username")
    private WebElementFacade inputUsuario;

    @FindBy(id = "password")
    private WebElementFacade inputSenha;

    @FindBy(xpath = "//h1[@class=\"post-title\"]")
    private WebElementFacade mensagem;

    public void validarTexto(){
        assertThat(mensagem.isDisplayed()).isTrue();
    }

}
