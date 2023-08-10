
Feature: Vessel Search
 

  @testcasekey=TRKNGB-47270 @testcasekey=TRKNGB-47266 @testcasekey=TRKNGB-47279 @testcasekey=TRKNGB-47265 @tag1
  Scenario: Check the page elements and add documents and reset the page
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Vessel Registration
    When Register with vessel english name "TOM" and nationality "Egypt" and vessel type "other" and uniqe IMO
    And Click save in vessel Registration page
    And Click Yes on navigate license is missing popup
    When Switch to default frame
    And User navigate to Vessel Search
    When Switch to Iframe "frame2"
    Then Check elements
    When Enter IMO Number
    And Click search in Vessel Search Page
    Then Check table titles "VESSEL NAME" , "VESSEL FLAG" , "OFFICIAL NUMBER" , "IMO NO" , "VESSEL TYPE" , "OWNER NAME" , "NAVIGATION LICENSE NUMBER" , "LICENSE EXPIRY DATE" , "BLOCK"
    And The search result in Vessel Search Page
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame2"
    And Click add document in Vessel Search Page
    And Enter document name document type "706" and file name "save.pdf"
    And Vessel Search Doument added sucessfully
    Then Click reset in Vessel Search Page
    


		@testcasekey=TRKNGB-47310 @tag1
    Scenario: Search for not existing vessel
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Vessel Search
    When Switch to Iframe "frame1"
    When Enter IMO Number not exist in vessel search
    And Click search in Vessel Search Page
    Then Check that no register vessel msg "There is no registered vessel. Please register a new vessel"
    
    
    @testcasekey=TRKNGB-47299 @testcasekey=TRKNGB-47247 @tag1
    Scenario: update vessel and block vessel
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Vessel Registration
    When Register with vessel english name "TOM" and nationality "Egypt" and vessel type "other" and uniqe IMO
    And Check true navigation licence
    And Click save in vessel Registration page
    When Switch to default frame
    And User navigate to Vessel Search
    When Switch to Iframe "frame2"
    When Enter IMO Number
    And Click search in Vessel Search Page
    And The search result in Vessel Search Page
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame2"
    And Click edit in vessel search page
    And Update vessel english name in vessel search page
    And Click update in vessel search page
    #And Click No on navigation license is missing popup in vessel search page
    Then Vessel updated successfully msg "Vessel updated successfully."
    And Click block in vessel search page
    And Write the reason of the block "test"
    And Click block popup in vessel search page
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame2"
    Then Vessel blocked successfully msg "Vessel Blocked Successfully"
    
    

