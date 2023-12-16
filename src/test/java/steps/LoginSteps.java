package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class LoginSteps extends BaseSteps{

    @Given("^I open the Main page$")
    public void iOpenTheMainPage() {
        open("https://demoqa.com/");
    }

    @Then("^I push Bookstore button$")
    public void iPushBookstoreButton() { loginPage.bookStoreAppLinkFromMain.scrollTo().click();
    }

    @When("^I input \"([^\"]*)\" to username field$")
    public void iInputToUsernameField(String usernameValue) {
        loginPage.usernameInputField.setValue(usernameValue);
    }

    @And("^input \"([^\"]*)\" to password field$")
    public void inputToPasswordField(String passwordValue) {
        loginPage.passwordInputField.setValue(passwordValue);
    }

    @When("^I push the Login button$")
    public void iPushTheLoginButton() {
        loginPage.loginButton.scrollTo().click();
    }

    @Then("^I am on the Profile Page$")
    public void iAmOnTheProfilePage() {

    }


    @Then("^I am on the Bookstore Page$")
    public void iAmOnTheBookstorePage() { bookStorePage.bookStorePageHeader.shouldHave(Condition.visible);
    }

    @Then("^I push Login button from Bookstore Page$")
    public void iPushLoginButtonFromBookstorePage() { loginPage.loginLinkButton.scrollTo().click();
    }

    @Then("^The error message \"([^\"]*)\" is displayed$")
    public void theErrorMessageIsDisplayed(String expectedMessageText)  {
        loginPage.errorMessageWhenLogin.shouldBe(Condition.visible).shouldHave(text(expectedMessageText));
    }

    @When("^I click the Logout Link$")
    public void iClickTheLogoutLink() { bookStorePage.logOutButton.scrollTo().click();
    }

    @Then("^I'm on Login Page$")
    public void iMOnLoginPage() { loginPage.loginPageHeader.shouldHave(Condition.visible);
    }
}
