@RunWith(SerenityRunner.class)
Feature: validate functions of cart consistence
  I as a user
  Want to add an remove a product to my cart and see consistent information
  To enjoy a seamless experience

  @Login @smoke
  Scenario: : User authentication
    Given that the user is on the HomePage
    When the user access account and lists tab to login
    And he authenticates with his email and password
    Then the HomePage is showed again with the message Hello, username in the account and lists tab

  @Cart @smoke
  Scenario: Add a product to my cart and verify the present information correctly
    Given that the user is logged in
    When the user chooses a product in the site to add to the cart
    And the user access the cart to validate the cart content
    Then the site shows the product's name, price and quantity in the cart
