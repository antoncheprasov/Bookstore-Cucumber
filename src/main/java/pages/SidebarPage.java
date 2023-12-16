package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SidebarPage {

    public SelenideElement bookStoreLinkInSideBar = $(By.xpath("//span[@class='text'][text()='Book Store']"));
    public SelenideElement profileLinkInSideBar = $(By.xpath("//span[@class='text'][text()='Profile']"));
    public SelenideElement loginLinkInSideBar = $(By.xpath("//span[@class='text'][text()='Login']"));
}
