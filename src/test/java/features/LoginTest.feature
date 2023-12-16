@Login
  Feature: Login

    Background: I open Login Page
      Given I open the Main page
      Then I push Bookstore button
      Then I push Login button from Bookstore Page

      @success_login
      Scenario: Success login with valid data
        When I input "cucumber1" to username field
        And input "Qwerty!12" to password field
        When I push the Login button
        Then I am on the Bookstore Page

      @invalid_data
      Scenario Outline: Login with invalid data
        When I input "<username>" to username field
        And input "<password>" to password field
        When I push the Login button
        Then The error message "<errorMessageText>" is displayed
        Examples:
          |username           |password      |errorMessageText               |
          |cucumber2          |Qwerty!12     |Invalid username or password!  |
          |cucumber1          |12Qwerty!12   |Invalid username or password!  |
          |cucumber2          |12Qwerty!12   |Invalid username or password!  |


      @success_logout
      Scenario: Success logout after login with valid data
        When I input "cucumber1" to username field
        And input "Qwerty!12" to password field
        When I push the Login button
        Then I am on the Bookstore Page
        When I click the Logout Link
        Then I'm on Login Page