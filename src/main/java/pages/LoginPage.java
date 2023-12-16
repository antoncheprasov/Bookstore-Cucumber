package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public SelenideElement bookStoreAppLinkFromMain = $(By.xpath("//div[@class='card mt-4 top-card'][6]"));
    public SelenideElement loginLinkButton = $(By.id("login"));
    public SelenideElement usernameInputField = $(By.id("userName"));
    public SelenideElement passwordInputField = $(By.id("password"));
    public SelenideElement loginButton = $(By.xpath("//div[@class='text-right button'][1]"));
    public SelenideElement errorMessageWhenLogin = $(By.xpath
                    ("//p[@id='name' and contains(text(), 'Invalid username or password!')]"));

    public SelenideElement loginPageHeader = $(By.xpath
            ("//div[@class='main-header' and contains(text(), 'Login')]"));
}
