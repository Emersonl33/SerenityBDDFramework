package amazonAutomation;

import groovy.util.logging.Slf4j;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

@Slf4j
public class CommonActions extends PageObject {

    public void applyHighlights(WebElement element, String borderColor, String backgroundColor) {
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

    public static void clickWithRetry(WebElement element, int attempts) {
        int i = 0;

        while (i++ < attempts) {
            try {
                if
                (element.isDisplayed()) {
                    element.click();
                    return;
                }
            } catch (Exception ignored) {}
            try {
                Thread.sleep(1300);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
                break;
            }
            throw new
                    RuntimeException("Element is not visible in" + attempts + "attempts!");
        }
    }

    public static void locateRetry(WebElement element, int attempts) {
        int i = 0;

        while (i++ < attempts) {
            try {
                if
                (element.isDisplayed()) {
                    return;
                }
            } catch (Exception ignored) {}
            try {
                Thread.sleep(1300);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
                break;
            }
            throw new
                    RuntimeException("Element is not visible in" + attempts + "attempts!");
        }
    }
}
