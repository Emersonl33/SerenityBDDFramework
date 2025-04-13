package amazonAutomation;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeScenario() {
        String url = System.getProperty("app.url", "https://www.amazon.com");
        System.setProperty("webdriver.base.url", url);
        System.out.println(">>> URL carregada nos hooks: " + url);
    }

    @After
    public void afterScenario() {
        System.out.println(">>> Depois do cenário");

    }
}

