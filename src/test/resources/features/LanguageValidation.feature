Feature: validate language changes
  I as a user
  Want to change the language page
  To enjoy a desired experience

  @Language @smoke
  Scenario: User changes the site language to Portuguese (BR)
    Given that the user is on the HomePage
    When the user selects the desired language
    Then the HomePage is displayed in the new language