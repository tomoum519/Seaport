
Feature: Vessel Registration
  Create vessel Registration with nagtive and postive Scenarios 

@testcasekey=TRKNGB-47324
  Scenario: Create vessel Registration with dublicate IMO
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Vessel Registration
    When Register with vessel english name "TOM" and nationality "Egypt" and vessel type "other"
    And Click save in vessel Registration page
    And Click Yes on navigate license is missing popup
    Then Check that the error msg beacuse the IMO Dublicate 
    
    @testcasekey=TRKNGB-47280
    Scenario: Create vessel Registration
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Vessel Registration
    When Register with vessel english name "TOM" and nationality "Egypt" and vessel type "other" and uniqe IMO
    And Click save in vessel Registration page
    And Click Yes on navigate license is missing popup
    Then Check create vessel succes msg
    
    @testcasekey=TRKNGB-47342 @testcasekey=TRKNGB-47312
    Scenario: Create vessel Registration with navigation licence
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Vessel Registration
    When Register with vessel english name "TOMMY" and nationality "Egypt" and vessel type "other" and uniqe IMO
    And Check true navigation licence
    And Click save in vessel Registration page
    Then Check create vessel succes msg
    

 
