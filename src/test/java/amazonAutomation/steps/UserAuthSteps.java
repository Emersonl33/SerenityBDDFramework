package amazonAutomation.steps;

import amazonAutomation.HomePage;
import amazonAutomation.actions.UserAuthActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;

public class UserAuthSteps extends PageObject {

    @Managed
    UserAuthActions userAuthActions;
    HomePage homePage;

    @Given("that the user is on the HomePage")
    public void that_the_user_is_on_the_home_page() {
        homePage.open();

        userAuthActions.homePageValidate();
    }

    @When("the user access account and lists tab to login")
    public void the_user_access_account_and_lists_tab_to_login() {

    }

    @When("he authenticates with his email and password")
    public void he_authenticates_with_his_email_and_password() {

    }

    @Then("the HomePage is showed again with the message Hello, username in the account and lists tab")
    public void the_home_page_is_showed_again_with_the_message_hello_username_in_the_account_and_lists_tab() {

    }

}
