    Feature: SwagLabs Login tests
    Scenario: Validate Captcha message
      Given I go to "https://magento.softwaretestingboard.com/"
      Then Just wait 2000
      And Click on Sign in button
      And I fill username "roni_cost@example.com"
      And I fill password "roni_cost3@example.com"
      Then I click on loginButton
      And Just wait 3000
      Then Validate captcha message
      And Just wait 3000

    Scenario: Add products to your cart
      Given I go to "https://magento.softwaretestingboard.com/"
      And go to Hoodies and TShirts section
      And Just wait 2000
      And Add Helena Hooded to the cart
      And Just wait 2000
      Then select options
      Then click Home
      And Just wait 3000
      And Add Push it Messenger Bag
      And click Shopping cart link
      And Just wait 3000
      Then validate Helena hooded was added to the cart
      Then validate Push it Bag was added to the cart
      And click on Proceed to checkout
      And Just wait 5000
      And I fill checkout form
        | email      | test1234@test.com |
        | name       | John          |
        | lastName   | Doe           |
        | street     | 917 Osage St  |
        | city       | San Diego     |
        | province   | California    |
        | zipCode    | 92114         |
        | phoneNumber| 8002021971    |
      And Click Next Button
      And Just wait 5000
      And Click Place Order Button
      And Just wait 3000
      And Validate final message
      And Just wait 5000