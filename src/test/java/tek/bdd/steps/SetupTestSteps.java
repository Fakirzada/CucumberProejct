package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SetupTestSteps extends SeleniumUtility {
    @Given("Open browser and navigate to retail app")
    public void openBrowserAndNavigate() {
        setupBrowser();
    }
    @Then("validate top left corner is TEKSCHOOL")
    public void validateTopLeftLogo() {
        String topLeftCornerText = getElementText(By.className("top-nav__logo"));
        Assert.assertEquals("TEKSCHOOL" , topLeftCornerText);
    }
    @Then("Validate Sign in button is Enabled")
    public void validateSignInButtonEnabled() {
        boolean isSignInBtnEnabled = isElementEnabled(By.id("signinLink"));
        Assert.assertTrue(isSignInBtnEnabled);
    }

    @When("Validate Sign in page")
    public void validateSigninPage(){

    }
}
