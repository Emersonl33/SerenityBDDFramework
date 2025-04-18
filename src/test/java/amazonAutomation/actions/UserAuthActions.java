package amazonAutomation.actions;

import amazonAutomation.CommonActions;
import amazonAutomation.pages.UserAuthPage;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.annotations.DriverOptions;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.WebElement;

@Slf4j
public class UserAuthActions extends UIInteractions {

    @Managed
    UserAuthPage userAuthPage;
    CommonActions commonActions;

    @Step("HomePage validate")
    public void homePageValidate() {
        WebElement logoAmazon = userAuthPage.logoAmazon();
        boolean condition = logoAmazon.isDisplayed();
        commonActions.applyHighlights(logoAmazon, condition ? "green" : "red", condition ? "lightgreen" : "lightcoral");
        log.info("HomePage validate: logoAmazon is {}.", condition ? "displayed" : "not displayed");

    }

    @Step("Select language")
    @SneakyThrows
    public void selectLanguage() {
        WebElement buttonSelectLanguage = userAuthPage.languageButton();
        WebElementFacade checkBoxSelectLanguage = userAuthPage.languageSelect;
        String expectedLanguageText = "português";

        boolean buttonCondition = buttonSelectLanguage.isDisplayed();
        commonActions.applyHighlights(buttonSelectLanguage, buttonCondition ? "green" : "red", buttonCondition ? "lightgreen" : "lightcoral");
        buttonSelectLanguage.click();

        boolean selectCondition = checkBoxSelectLanguage.isClickable();
        commonActions.applyHighlights(checkBoxSelectLanguage, selectCondition ? "green" : "red", selectCondition ? "lightgreen" : "lightcoral");
        checkBoxSelectLanguage.containsSelectOption(expectedLanguageText);
        checkBoxSelectLanguage.click();
    }

    @Step("Validate language changes")
    public void validateLanguageChanges() {
        WebElementFacade languageLabel = userAuthPage.languageLabel;
        String expectedLanguage = "PT";
        boolean labelCondition = languageLabel.containsText(expectedLanguage);
        commonActions.applyHighlights(languageLabel, labelCondition ? "green" : "red", labelCondition ? "lightgreen" : "lightcoral");
        log.info("HomePage validate: languageIcon is {}.", labelCondition ? "displayed" : "not displayed");
    }
}
