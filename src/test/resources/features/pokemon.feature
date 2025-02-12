Feature: Pokemon API Testing

  Scenario: Verify that a flying type pokemon info is returned correctly for charizard
    Given I look for a flying type pokemon named "charizard"
    Then The search should return pokemon info
    And Status Code should return 200
    And The pokemon type is "flying"

  Scenario: Verify that a flying type pokemon info is returned correctly for butterfree
    Given I look for a flying type pokemon named "butterfree"
    Then The search should return pokemon info
    And Status Code should return 200
    And The pokemon type is "flying"

  Scenario: Verify that a flying type pokemon info is returned correctly for pidgey
    Given I look for a flying type pokemon named "pidgey"
    Then The search should return pokemon info
    And Status Code should return 200
    And The pokemon type is "flying"

  Scenario: Verify that a flying type pokemon info is returned correctly for dragonite
    Given I look for a flying type pokemon named "dragonite"
    Then The search should return pokemon info
    And Status Code should return 200
    And The pokemon type is "flying"
