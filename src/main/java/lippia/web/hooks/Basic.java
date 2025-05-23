package lippia.web.hooks;

import com.crowdar.driver.DriverManager;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import lippia.web.listeners.DriverValidatorListener;

public class Basic {

    @Before(order = 0)
    public void beforeScenario(Scenario scenario) {
        DriverManager.getDriverInstance().register(new DriverValidatorListener());
    }

    @After(order = 0)
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            DriverManager.getDriverInstance().quit();
        }
    }

}
