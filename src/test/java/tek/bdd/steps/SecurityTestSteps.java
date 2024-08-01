package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SecurityTestSteps extends SeleniumUtility {

    @When("user click on sign in link")
    public void userClickOnSignInLink(){
        clickOnElement(By.linkText("Sign in"));
    }
    @When("user enter username and password and click on login")
    public void userEnterUserAndPasswordAndClickLogin(){
        sendText(By.id("email"),"saeed123@gmail.com");
        sendText(By.id("password"),"Saeed@1234");
        clickOnElement(By.id("loginBtn"));
    }

    @Then("user should be able to see account link")
    public void suerShouldBeableToSeeLogout(){
        boolean isLogoutBtnVisable=isElementEnabled(By.linkText("logoutBtn"));
        Assert.assertTrue(isLogoutBtnVisable);
    }
}
