package amazonAutomation.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class UserAuthPage extends PageObject {

    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    public WebElementFacade logoAmazon;

    @FindBy(xpath = ("//button[@aria-label='Expand Account and Lists']"))
    public WebElementFacade buttonExpandAccountAndLists;

    @FindBy(xpath = ("//a[@data-nav-ref='nav_signin']"))
    public WebElementFacade buttonSigninNavBar;

    @FindBy(xpath = ("//input[@id='ap_email']"))
    public WebElementFacade inputEmail;

    @FindBy(xpath = ("//input[@id='continue']"))
    public WebElementFacade buttonContinue;

    @FindBy(xpath = ("//input[@id='ap_password']"))
    public WebElementFacade inputPassword;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    public WebElementFacade buttonSignIn;

}
