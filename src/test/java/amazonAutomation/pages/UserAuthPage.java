package amazonAutomation.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserAuthPage extends PageObject {

    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));

    public WebElement logoAmazon (){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='nav-logo-sprites']")));
    }

    public WebElement languageButton (){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='nav-flyout-button nav-icon nav-arrow' and @aria-label='Expand to Change Language or Country']")));
    }

    @FindBy (xpath = "//div[@id='nav-flyout-icp']")
    public WebElementFacade languageSelect;

    @FindBy (xpath = "//span[@class='icp-nav-link-inner']")
    public WebElementFacade languageLabel;
}
