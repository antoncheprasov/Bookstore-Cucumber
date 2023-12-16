package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    public SelenideElement profilePageHeader = $(By.xpath
            ("//div[@class='main-header' and contains(text(), 'Profile')]"));


    public SelenideElement titleGitBook = $(By.id("see-book-Git Pocket Guide"));
    public SelenideElement titleLearningJavaScriptBook = $(By.id("see-book-Learning JavaScript Design Patterns"));
    public SelenideElement titleDesigningAPIBook = $(By.id("see-book-Designing Evolvable Web APIs with ASP.NET"));
    public SelenideElement titleSpeakingJavaScriptBook = $(By.id("see-book-Speaking JavaScript"));
    public SelenideElement titleYouDoNotKnowJSBook = $(By.id("see-book-You Don't Know JS"));
    public SelenideElement titleProgrammingJSAppsBook = $(By.id("see-book-Programming JavaScript Applications"));
    public SelenideElement titleEloquentJSBook = $(By.id("see-book-Eloquent JavaScript, Second Edition"));
    public SelenideElement titleUnderstandingECMAScriptBook = $(By.id("see-book-Understanding ECMAScript 6"));

    public SelenideElement deleteIcon = $(By.xpath("//span[@id='delete-record-undefined']"));
    public SelenideElement deleteBookConfirmation = $(By.id("closeSmallModal-ok"));
    public SelenideElement deleteBookCancel = $(By.id("closeSmallModal-cancel"));


}
