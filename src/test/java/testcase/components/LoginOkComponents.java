package testcase.components;


import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@Getter
public class LoginOkComponents extends PageObject {

    @FindBy(id = "submit")
    private WebElement botaoSubmit;

    @FindBy(id = "username")
    private WebElement inputUsuario;

    @FindBy(id = "password")
    private WebElement inputSenha;

    @FindBy(xpath = "//h1[@class=\"post-title\"]")
    private WebElement mensagem;

    public void validarTexto(){
        assertThat(mensagem.isDisplayed()).isTrue();
    }

}
