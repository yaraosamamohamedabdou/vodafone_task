Feature: amazon operation

  Scenario Outline: user could login with valid data
    Given user navigates to amazon website
    When user enters "<product_name>" and click search button
    And select first item and add it to the cart
    Then check item is added successfully
    Examples:
    |product_name|
    |car accessories|


  Scenario:select department and discount
    Given user navigates to amazon website
    When  user opens today's meals
    And user selects filter_one and filter_two and selects discount percentage
    And user opens fourth page and select item
   And add the item to card
 Then check item is added successfully
