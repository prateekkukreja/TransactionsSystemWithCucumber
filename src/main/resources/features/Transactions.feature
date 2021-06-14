Feature: Transactions

  Scenario Outline:

    Given Prateek has <initBal>
    When Prateek spends <spend>
    Then Prateek should have <remainBal>
    Examples:
      | initBal | spend | remainBal |
      | 1000    | 100   | 900       |
      | 975     | 175   | 800       |
