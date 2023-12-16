package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.switchTo;

public class BookstoreSteps extends BaseSteps{

    @Then("^I'm on Bookstore Page$")
    public void iMOnBookstorePage() { bookStorePage.bookStorePageHeader.shouldBe(Condition.visible);
    }


    @Then("^I push Git Pocket Guide Link$")
    public void iPushGitPocketGuideLink() { bookStorePage.titleGitBook.scrollTo().click();
    }

    @Then("^I on Git Pocket Guide Page$")
    public void iOnGitPocketGuidePage() {
        bookStorePage.gitBookPage.shouldBe(Condition.visible).shouldHave(Condition.text("Git Pocket Guide"));
    }

    @When("^I click Add To Your Collection Button, Book added to my Collection$")
    public void iClickAddToYourCollectionButtonBookAddedToMyCollection() {
        bookStorePage.addBookToCollectionButton.scrollTo().click();
        switchTo().alert().accept();
    }

    @When("^I click Back To Book Store Button$")
    public void iClickBackToBookStoreButton() { bookStorePage.backToBookStoreButton.scrollTo().click();
    }

    @Then("^I push Programming JavaScript Applications Button Link$")
    public void iPushProgrammingJavaScriptApplicationsButtonLink() {
        bookStorePage.titleProgrammingJSAppsBook.scrollTo().click();
    }

    @Then("^I on the Programming JavaScript Applications Page$")
    public void iOnTheProgrammingJavaScriptApplicationsPage() {
        bookStorePage.programmingJavaScriptApplicationsPage.shouldBe(Condition.visible)
                .shouldHave(Condition.text("Programming JavaScript Applications"));
    }
}
