Feature: Testing Chceckout feautre functionality

  Scenario: Positive test validating Chceckout functionality
    Given Initialize the browser with chrome
    When Navigate to HomePage
    And Hover over productimage
    And click on onHover add to cart button
    And click on continue shopping
    And click on cart
    And click on checkout button
    Then verify the url of the page
    And Close the browser
