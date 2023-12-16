package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.en.Then;

import static com.codeborne.selenide.Selenide.switchTo;

public class ProfileSteps extends BaseSteps{

    @Then("^I'm On Profile Page$")
    public void iMOnProfilePage() { profilePage.profilePageHeader.shouldBe(Condition.visible);
    }

    @Then("^Git Pocket Guide Book Is Displayed in Profile$")
    public void gitPocketGuideBookIsDisplayedInProfile() {
        profilePage.titleGitBook.shouldBe(Condition.visible).shouldHave(Condition.text("Git Pocket Guide"));
    }

    @Then("^Programming JavaScript Applications Book Is Displayed in Profile$")
    public void programmingJavaScriptApplicationsBookIsDisplayedInProfile() {
        profilePage.titleProgrammingJSAppsBook.shouldBe(Condition.visible)
                .shouldHave(Condition.text("Programming JavaScript Applications"));
    }

    @Then("^I click a Delete Icon to Delete First Book In Profile$")
    public void iClickADeleteIconToDeleteFirstBookInProfile() { profilePage.deleteIcon.scrollTo().click();
    }

    @Then("^I click on OK button$")
    public void iClickOnOKButton() { profilePage.deleteBookConfirmation.scrollTo().click();
        switchTo().alert().accept();
    }

    @Then("^I click a Delete Icon to Delete Second Book In Profile$")
    public void iClickADeleteIconToDeleteSecondBookInProfile() { profilePage.deleteIcon.scrollTo().click();
    }

    @Then("^I click On Cancel Button$")
    public void iClickOnCancelButton() { profilePage.deleteBookCancel.scrollTo().click();
        switchTo().alert().accept();
    }
}
