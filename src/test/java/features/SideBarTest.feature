@Sidebar

  Feature: Navigation
    Background: I open Login Page
      Given I open the Main page
      Then I push Bookstore button
      Then I push Login button from Bookstore Page
      When I input "cucumber1" to username field
      And input "Qwerty!12" to password field
      When I push the Login button
      Then I am on the Bookstore Page

    @navigating_in_sidebar
    Scenario: Checking Navigation In Sidebar
      When I push the Login Link in Sidebar
      Then I'm on Login Page
      When I push the Bookstore Link In Sidebar
      Then I am on the Bookstore Page
      When I push the Profile Link In Sidebar
      Then I'm On Profile Page