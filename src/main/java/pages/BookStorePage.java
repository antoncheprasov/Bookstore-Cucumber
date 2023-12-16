package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BookStorePage {

    public SelenideElement bookStorePageHeader = $(By.xpath
            ("//div[@class='main-header' and contains(text(), 'Book Store')]"));

    public SelenideElement logOutButton = $(By.xpath("//button[@id='submit'][text()='Log out']"));

    public SelenideElement titleGitBook = $(By.id("see-book-Git Pocket Guide"));
    public SelenideElement titleLearningJavaScriptBook = $(By.id("see-book-Learning JavaScript Design Patterns"));
    public SelenideElement titleDesigningAPIBook = $(By.id("see-book-Designing Evolvable Web APIs with ASP.NET"));
    public SelenideElement titleSpeakingJavaScriptBook = $(By.id("see-book-Speaking JavaScript"));
    public SelenideElement titleYouDoNotKnowJSBook = $(By.id("see-book-You Don't Know JS"));
    public SelenideElement titleProgrammingJSAppsBook = $(By.id("see-book-Programming JavaScript Applications"));
    public SelenideElement titleEloquentJSBook = $(By.id("see-book-Eloquent JavaScript, Second Edition"));
    public SelenideElement titleUnderstandingECMAScriptBook = $(By.id("see-book-Understanding ECMAScript 6"));

    public SelenideElement backToBookStoreButton = $(By.xpath
            ("//button[@id='addNewRecordButton' and contains(text(), 'Back To Book Store')]"));
    public SelenideElement addBookToCollectionButton = $(By.xpath
            ("//button[@id='addNewRecordButton' and contains(text(), 'Add To Your Collection')]"));
    public SelenideElement gitBookPage = $(By.xpath
            ("//label[@class='form-label' and contains(text(), 'Git Pocket Guide')]"));
    public SelenideElement programmingJavaScriptApplicationsPage = $(By.xpath
            ("//label[@class='form-label' and contains(text(), 'Programming JavaScript Applications')]"));
}
