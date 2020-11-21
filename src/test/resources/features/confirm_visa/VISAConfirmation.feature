Feature: Confirm whether a visa is required to visit the UK

  As a non-UK visitor
  I want to apply online by selecting my reason for visiting
  So that I am informed about whether I need a VISA or not before entering the UK

  Scenario Outline: Check UK VISA for > 6 months Study
    Given I provide a nationality of <nationality>
    And I select the reason <reason>
    And I state I am intending to stay for more than <visitDuration> months
    #And I state I am intending to stay for less than <visitDuration> months
    When I submit the form
    Then I will be informed <expectedReply>
    Examples:
      | nationality | reason | visitDuration | expectedReply                            |
      | Japan       | Study  | 6             | You’ll need a visa to study in the UK    |
      #| Japan       | Study  | 6             | You do not need a visa to come to the UK |


  Scenario Outline: Check UK VISA for Tourism
    Given I provide a nationality of <nationality>
    And I select the reason <reason>>
    When I submit the form
    Then I will be informed <expectedReply>
    Examples:
      | nationality | reason  | visitDuration | expectedReply                                           |
      | Japan       | tourism |               | You do not need a visa if you’re staying up to 6 months |


  Scenario Outline: Check UK VISA for Tourism not visiting family or partner
    Given I provide a nationality of <nationality>
    And I select the reason <reason>>
    And I state I am not travelling or visiting a partner or family
    When I submit the form
    Then I will be informed <expectedReply>
    Examples:
      | nationality | reason  | visitDuration | expectedReply                                           |
      | Russia      | Tourism |               | You do not need a visa if you’re staying up to 6 months |