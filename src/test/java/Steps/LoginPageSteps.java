package Steps;

import UIPages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginPageSteps {

    private LoginPage loginPage;


    //Go to the URL
    @Step
    public void isOnLoginPage() {
        loginPage.open();
    }

    @Step
    public void loginAsUser() {
        loginPage.doLogin();
    }

    @Step
    public void userShouldBeLoggedIn() {
        Assert.assertTrue(loginPage.productsPageIsVisible().equals("PRODUCTS"));

    }


}
