@Bookstore
  Feature: Bookstore

    Background: I open Login Page
      Given I open the Main page
      Then I push Bookstore button
      Then I push Login button from Bookstore Page
      When I input "cucumber1" to username field
      And input "Qwerty!12" to password field
      When I push the Login button
      Then I am on the Bookstore Page

      @adding_books_to_profile
      Scenario: Adding books items to User's Profile

        When I push the Bookstore Link In Sidebar
        Then I'm on Bookstore Page
        Then I push Git Pocket Guide Link
        Then I on Git Pocket Guide Page
        When I click Add To Your Collection Button, Book added to my Collection
        When I click Back To Book Store Button
        Then I'm on Bookstore Page
        Then I push Programming JavaScript Applications Button Link
        Then I on the Programming JavaScript Applications Page
        When I click Add To Your Collection Button, Book added to my Collection
        When I click Back To Book Store Button
        Then I'm on Bookstore Page
        When I push the Profile Link In Sidebar
        Then I'm On Profile Page
        Then Git Pocket Guide Book Is Displayed in Profile
        Then Programming JavaScript Applications Book Is Displayed in Profile

        @deleting_books_from_collection
        Scenario: Deleting books items from User's Profile

          When I click Profile Link in Sidebar
          Then I'm On Profile Page
          Then I click a Delete Icon to Delete First Book In Profile
          Then I click on OK button
          Then I click a Delete Icon to Delete Second Book In Profile
          Then I click on OK button