@Smoketest

Feature: Ability to create a new User via a Create User API

  Scenario Outline: Creating a new user against the API
    When I create a new user with firstname <firstname>
    Then Confirm I get the correct responsecode <responseCode> to indicate success
    Examples:
      |firstname|responseCode|
      |Shane    | 201        |

