
Feature: Title of your feature
  I want to use this template for my feature file

  @testcasekey=TRKNGB-47375
  Scenario: Search for not existing owner
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And navigate to owner search
    When Switch to Iframe "frame1"
    And Enter random english name in owner search page 
    And Click search in owner search page
    Then Check that no record found msg "NoRecordMsgInOwnerSearchPage"
    
    
  @testcasekey=TRKNGB-47364
  Scenario: Search with not filling up any fields
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And navigate to owner search
    When Switch to Iframe "frame1"
    And Click search in owner search page
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame1"
    Then Check that no field entered msg "NoFiieldEnteredMsgInOwnerSearchPage"
    
   @testcasekey=TRKNGB-47357 @testcasekey=TRKNGB-47383 @testcasekey=TRKNGB-47369  @testcasekey=TRKNGB-47258 @tag
  Scenario: translate to arabic and reset
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And navigate to owner search
    When Switch to Iframe "frame1"
    Then Check that ienglish name, arabic name , nationalty , search button ,reset button , trnslate to arabic button, trnslate to english button is displayed
    And Enter random english name in owner search page
    And Choose nationalty in owner search page "NationaltyInOwnerSearchPage"
    And Click translate to arabic in owner search page
    And Click reset button in owner search page
    And Enter random arabic name in owner search page
    Then Click translate to english in owner search page
    

