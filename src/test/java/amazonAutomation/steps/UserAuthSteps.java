package amazonAutomation.steps;

import amazonAutomation.actions.UserAuthActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class UserAuthSteps extends PageObject {

    @Steps
    UserAuthActions userAuthActions;

    @Given("that the user is on the HomePage")
    public void that_the_user_is_on_the_home_page() {
        open();
        userAuthActions.homePageValidate();
    }

    @When("the user selects the desired language")
    public void theUserSelectsTheDesiredLanguage() {
        userAuthActions.selectLanguage();
    }
    @Then("the HomePage is displayed in the new language")
    public void theHomePageIsDisplayedInTheNewLanguage() {
        userAuthActions.validateLanguageChanges();

    }

}
