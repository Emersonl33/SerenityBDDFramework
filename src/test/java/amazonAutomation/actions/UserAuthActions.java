package amazonAutomation.actions;

import amazonAutomation.CommonActions;
import amazonAutomation.pages.UserAuthPage;
import lombok.SneakyThrows;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class UserAuthActions extends UIInteractions {

    @Managed
    UserAuthPage userAuthPage;
    CommonActions commonActions;

    @SneakyThrows
    @Step("HomePage validate")
    public void homePageValidate(){
        Thread.sleep(5000);
        boolean condition = userAuthPage.logoAmazon.isDisplayed();
        commonActions.applyHighlights(userAuthPage.logoAmazon, condition ? "green" : "red", condition ? "lightgreen" : "lightcoral");
    }




}
