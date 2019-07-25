Feature: OrangeHRM login

  Scenario: Logo presence on OrangeHRM homepage
    Given launch chrome browser
    When Open OrangeHRM URL
    Then Verify Logo present on page
    And  Close browser



 