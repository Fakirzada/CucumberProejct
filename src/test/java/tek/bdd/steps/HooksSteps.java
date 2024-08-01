package tek.bdd.steps;

import org.junit.After;
import org.junit.Before;
import tek.bdd.utility.SeleniumUtility;

public class HooksSteps extends SeleniumUtility {
    @Before
    public void beforeEachScenario(){
      setupBrowser();
    }
    @After
    public void afterEachScenario(){
        quitBrowser();
    }
}
