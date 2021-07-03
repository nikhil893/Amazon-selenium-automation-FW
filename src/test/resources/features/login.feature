Feature: login

  @login:
  Scenario: user is able to login with correct username and password
    Given : user is on login page
    Then : user is enter username as "8459705488" and password as "Nikhil@1234"
    When : user is able to access this URL
