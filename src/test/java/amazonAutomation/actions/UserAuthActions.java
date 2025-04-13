package amazonAutomation.actions;

import amazonAutomation.pages.UserAuthPage;
import lombok.SneakyThrows;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class UserAuthActions extends UIInteractions {

    @Managed
    UserAuthPage userAuthPage;

    @SneakyThrows
    @Step("HomePage validate")
    public void homePageValidate(){
        boolean condition = userAuthPage.logoAmazon.isDisplayed();
        userAuthPage.applyHighlights(userAuthPage.logoAmazon, condition ? "green" : "red", condition ? "lightgreen" : "lightcoral");
    }




}
