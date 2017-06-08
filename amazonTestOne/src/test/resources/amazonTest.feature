Feature: Search Product and Add to the Shopping cart on Amazon
  I as user
  waht to search Product
  And add to the shopping cart

  @test1
  Scenario Outline: Search the product
    Given I am on Home page of "Amazon.co.uk"
    When I enter "<product>" into search product page
    Then I should see page showing "<product>"
    And I select the "<Size>"  and add product to Shopping cart
    Then I can see "<product>" in shopping cart
    Then I click on Proceed to Checkout

    Examples:
      | product                                  | Size   |
      | Nike Men’s Air Max 90 Essential Trainers | 8 UK   |
      | Adidas Essentials Men's Sport T-Shirt    | Medium |


