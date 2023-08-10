
Feature: Register Owner
  Owner Registration with postive and negative scenarios

 @testcasekey=TRKNGB-47339 @testcasekey=TRKNGB-47328
  Scenario: Owner Already Exist
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Owner Registration
    When Register a old owner name "TOM" and nationality "Egypt"
    Then msg will appear "Owner Already Exist"
    


    @testcasekey=TRKNGB-47302 @testcasekey=TRKNGB-47309
  Scenario: Register with new owner and click yes on popup and check that navigat to vessel registration
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Owner Registration
    When Register a new owner name and nationality "Egypt"
    Then msg will contain "Owner registered successfully"
    Then go to vessal page and the title
    
    @testcasekey=TRKNGB-47349 @testcasekey=TRKNGB-47315 @testcasekey=TRKNGB-47313 @testcasekey=TRKNGB-47372 @testcasekey=TRKNGB-47368 @testcasekey=TRKNGB-47365 @testcasekey=TRKNGB-47294 
    Scenario: Register with new owner and click no on popup and go to owner search check the code 
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Owner Registration
    When Register a new owner name and nationality "Egypt"
    Then msg will contain "Owner registered successfully"
    And Check that stay in the same page after click NO
    When Switch to default frame
    Then navigate to owner search
    When Switch to Iframe "frame2"
    And Enter english name in owner search page 
    And Click search in owner search page
    And Click search result row
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame2"
    And Click edit in owner search page
    And Update english name in owner search page 
    And Click update in owner search page
    Then Updated successfully msg "updatemsginownersearchpage"