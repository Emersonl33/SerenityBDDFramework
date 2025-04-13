package amazonAutomation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;


public class CommonActions extends PageObject {

    public void applyHighlights(WebElementFacade element, String borderColor, String backgroundColor) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        int timeOutMilliSeconds = 500;

        if (element != null) {
            jsExecutor.executeScript(
                    "var elem = arguments[0];" +
                            "elem.style.border='3px solid " + borderColor + "';" +
                            "elem.style.backgroundColor='" + backgroundColor + "';" +
                            "setTimeout(function(){" +
                            " elem.style.border='';" +
                            " elem.style.backgroundColor='';" +
                            "}, " + timeOutMilliSeconds + ");",
                    element
            );
        }
    }
}
