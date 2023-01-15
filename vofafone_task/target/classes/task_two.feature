Feature:Ticket Reservation

  Scenario:cst reserve trip and bus and seats

    Given user navigates to website
    When user choose place of trip
    And user choose date of trip
    And user choose bus
    And user choose seats and boarding&dropping
    And user fill the data_payment
    Then verify reservation done



