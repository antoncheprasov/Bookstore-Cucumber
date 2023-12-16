package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.When;

public class SidebarSteps extends BaseSteps{

    @When("^I push the Bookstore Link In Sidebar$")
    public void iPushTheBookstoreLinkInSidebar() { sidebarPage.bookStoreLinkInSideBar.scrollTo().click();
    }


    @When("^I push the Profile Link In Sidebar$")
    public void iPushTheProfileLinkInSidebar() { sidebarPage.profileLinkInSideBar.scrollTo().click();
    }

    @When("^I click Profile Link in Sidebar$")
    public void iClickProfileLinkInSidebar() { sidebarPage.profileLinkInSideBar.scrollTo().click();
    }

    @When("^I push the Login Link in Sidebar$")
    public void iPushTheLoginLinkInSidebar() { sidebarPage.loginLinkInSideBar.scrollTo().click();
    }


}
