Feature: Test facebook smoke scenarios

Scenario Outline: Test login with valid credentials
  
    Given Open firefox start application
    When I enter valid "<username>" and "<password>"
    Then User should be able to login successfully
    Then Application should be closed

Examples: 
      | username                | password     |
      | rupadebnath87@gmail.com | rupa_infosys |
      | rupadebnath@gmail.com   | rupa_infosys |