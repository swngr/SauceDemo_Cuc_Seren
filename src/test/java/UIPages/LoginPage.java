package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {


    public void doLogin() {
        $("#user-name").sendKeys("standard_user");
        $("#password").sendKeys("secret_sauce");
        $("#login-button").click();
    }

    public String productsPageIsVisible() {
        return $("//span[contains(text(),\"Products\")]").getText();
    }

}
