@Smoketest


Feature: Ability to Search Bing by Keyword
  As a user I want to search on Bing on a specific term

  Scenario Outline: Searching for a term
    Given the user is researching stuff on the internet
    When the user looks up "<lookupterm>"
    Then the user should see information about "<lookupterm>"
    Examples:
    |lookupterm|
    |Oranges|
    |Apples|

