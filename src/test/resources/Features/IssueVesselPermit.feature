
Feature: Issue Vessel Permit

	 @testcasekey=TRKNGB-47322 
  Scenario Outline: verfiy the issue vessel permit page
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Issue Vessel Permit
    When Switch to Iframe "frame1"
    Then Check page title <pagetitle> displayed successfully entry , exit radio button displayed successfully search , reset button displayed successfully  
    
     Examples: 
    | pagetitle |
    | "ISSUE VESSEL PERMIT" |
    
     @testcasekey=TRKNGB-47273 @testcasekey=TRKNGB-47385 
     Scenario: Create the issue vessel permit Internal succsefully 
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Vessel Registration
    When Register with vessel english name "TOM" and nationality "Egypt" and vessel type "other" and uniqe IMO
    And Click save in vessel Registration page
    And Click Yes on navigate license is missing popup
    And Click Yes popup and navigate to issue vessel permit
    When Switch to default frame
    When Switch to Iframe "frame2"
    And Enter Establishment Name "emaratech"
    And Click Establishment search
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame2"
    And Click Establishment result row
    And Select Classification "Internal"
    And Select Departing Port "local waters"
    And Click Add Seaman button
    And Enter SeamanType "Captain" and Religion "other" and Date of birth "06-07-1989" and Nationalty "india"
    And Enter Seaman passport details Issue Country "india" and Expiry Date "06-07-2028"
    And Enter Seaman book Nationalty "india"
    And Click submit Seaman button
    And Click Add Seaman button
    And Enter SeamanType "passenger" and Religion "muslim" and Date of birth "06-07-1999" and Nationalty "Egypt"
    And Enter Seaman passport details Issue Country "Egypt" and Expiry Date "06-07-2027"
    And Enter Seaman book Nationalty "Egypt"
    And Click submit Seaman button
    And Click Add Seaman button
    And Enter SeamanType "crew" and Religion "muslim" and Date of birth "06-07-1999" and Nationalty "Egypt"
    And Enter Seaman passport details Issue Country "Egypt" and Expiry Date "06-07-2027"
    And Enter Seaman book Nationalty "Egypt"
    And Click submit Seaman button
    And Click Add Seaman button
    And Enter SeamanType "SAILOR" and Religion "muslim" and Date of birth "06-07-1999" and Nationalty "Egypt"
    And Enter Seaman passport details Issue Country "Egypt" and Expiry Date "06-07-2027"
    And Enter Seaman book Nationalty "Egypt"
    And Click submit Seaman button
    Then Check application updated succssefuly "Application updated Successfuly with the Application"
    And Click save Vessel Permit
    And Click yes to navigate to review vessel permit
    When Switch to default frame
    When Switch to Iframe "frame1"
    Then Check that navigate to review vessel permit
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame1"
    And Click Approve in review vessel permit page
    Then Check Entry Permit Created Successfuly message "Entry Permit Created Successfuly with the Permit No"
    
    
      @testcasekey=TRKNGB-47356
     Scenario: Create the issue vessel permit and reset it
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Vessel Registration
    When Register with vessel english name "TOM" and nationality "Egypt" and vessel type "other" and uniqe IMO
    And Click save in vessel Registration page
    And Click Yes on navigate license is missing popup
    And Click Yes popup and navigate to issue vessel permit
    When Switch to default frame
    When Switch to Iframe "frame2"
    And Enter Establishment Name "emaratech"
    And Click Establishment search
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame2"
    And Click Establishment result row
    And Select Classification "International "
    #And scroll down untill find elements
    And Select Arrival Port "Local waters"
    Then Check change arrival port message "The Port is selected successfully"
    And Select Departing Country "Egypt"
    And Click Add Seaman button
    And Enter SeamanType "Captain" and Religion "muslim" and Date of birth "06-07-1999" and Nationalty "Egypt"
    And Enter Seaman passport details Issue Country "Egypt" and Expiry Date "06-07-2027"
    And Enter Seaman book Nationalty "Egypt"
    And Click submit Seaman button
    Then Check application created succssefuly "Application for vessel entry permit created successfuly"
    And Click add document
    And Issue vessel permit Doument added sucessfully
    Then Click Reset
    And Reset succsefully
    
    
    @testcasekey=TRKNGB-47388 @testcasekey=TRKNGB-47259
     Scenario: Create the issue vessel permit  International succsefully
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Vessel Registration
    When Register with vessel english name "TOM" and nationality "Egypt" and vessel type "other" and uniqe IMO
    And Click save in vessel Registration page
    And Click Yes on navigate license is missing popup
    And Click Yes popup and navigate to issue vessel permit
    When Switch to default frame
    When Switch to Iframe "frame2"
    And Enter Establishment Name "emaratech"
    And Click Establishment search
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame2"
    And Click Establishment result row
    And Select Classification "International "
    #And scroll down untill find elements
    And Select Arrival Port "Local waters"
    Then Check change arrival port message "The Port is selected successfully"
    And Select Departing Country "Egypt"
    And Click Add Seaman button
    And Enter SeamanType "Captain" and Religion "muslim" and Date of birth "06-07-1999" and Nationalty "Egypt"
    And Enter Seaman passport details Issue Country "Egypt" and Expiry Date "06-07-2027"
    And Enter Seaman book Nationalty "Egypt"
    And Click submit Seaman button
    Then Check application created succssefuly "Application for vessel entry permit created successfuly"
    And Click save Vessel Permit
    And Click yes to navigate to review vessel permit
    When Switch to default frame
    When Switch to Iframe "frame1"
    Then Check that navigate to review vessel permit
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame1"
    And Click Approve in review vessel permit page
    Then Check Entry Permit Created Successfuly message "Entry Permit Created Successfuly with the Permit No"
    
    
    @testcasekey=TRKNGB-47281 
    Scenario: Can not create exit permit without entry permit
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Vessel Registration
    When Register with vessel english name "TOM" and nationality "Egypt" and vessel type "other" and uniqe IMO
    And Click save in vessel Registration page
    And Click Yes on navigate license is missing popup
    And Click Yes popup and navigate to issue vessel permit
    When Switch to default frame
    When Switch to Iframe "frame2"
    And Select exit permit
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame2"
    And Click save Vessel Permit
    Then Check that it can not create exit permit message "No active Entry Permit found for selected vessel"
    
    @testcasekey=TRKNGB-47274 
     Scenario: Create the issue vessel permit  International succsefully without captain
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Vessel Registration
    When Register with vessel english name "TOM" and nationality "Egypt" and vessel type "other" and uniqe IMO
    And Click save in vessel Registration page
    And Click Yes on navigate license is missing popup
    And Click Yes popup and navigate to issue vessel permit
    When Switch to default frame
    When Switch to Iframe "frame2"
    And Enter Establishment Name "emaratech"
    And Click Establishment search
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame2"
    And Click Establishment result row
    And Select Classification "International "
    #And scroll down untill find elements
    And Select Departing Country "Egypt"
    And Click save Vessel Permit
    And Click yes to navigate to review vessel permit
    When Switch to default frame
    When Switch to Iframe "frame1"
    Then Check that navigate to review vessel permit
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame1"
    And Click Approve in review vessel permit page
    Then Check no captain popup message "This vessel has no captain. Are you sure you want to proceed?"
    And Click yes on no captain popup
    Then Check Entry Permit Created Successfuly message "Entry Permit Created Successfuly with the Permit No"
    
    
    @testcasekey=TRKNGB-47256 @testcasekey=TRKNGB-47380 @tag
    Scenario: Create the issue vessel permit  International succsefully add doucemnts
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Vessel Registration
    When Register with vessel english name "TOMmmy" and nationality "qatar" and vessel type "other" and uniqe IMO
    And Click save in vessel Registration page
    And Click Yes on navigate license is missing popup
    And Click Yes popup and navigate to issue vessel permit
    When Switch to default frame
    When Switch to Iframe "frame2"
    And Enter Establishment Name "emaratech"
    And Click Establishment search
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame2"
    And Click Establishment result row
    And Select Classification "International "
    And Select Departing Country "Egypt"
    And Click Add Seaman button
    And Enter SeamanType "Captain" and Religion "muslim" and Date of birth "06-07-1999" and Nationalty "Egypt"
    And Enter Seaman passport details Issue Country "Egypt" and Expiry Date "06-07-2027"
    And Enter Seaman book Nationalty "Egypt"
    And Click submit Seaman button
    Then Check application created succssefuly "Application for vessel entry permit created successfuly"
    And Click add document
    And Issue vessel permit Doument added sucessfully
    And Click save Vessel Permit
    And Click yes to navigate to review vessel permit
    When Switch to default frame
    When Switch to Iframe "frame1"
    Then Check that navigate to review vessel permit
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame1"
    And Click Approve in review vessel permit page
    Then Check Entry Permit Created Successfuly message "Entry Permit Created Successfuly with the Permit No"
    
    @testcasekey=TRKNGB-47384
     Scenario: Create the issue vessel permit Internal and reject it 
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Vessel Registration
    When Register with vessel english name "TOM" and nationality "Egypt" and vessel type "other" and uniqe IMO
    And Click save in vessel Registration page
    And Click Yes on navigate license is missing popup
    And Click Yes popup and navigate to issue vessel permit
    When Switch to default frame
    When Switch to Iframe "frame2"
    And Enter Establishment Name "emaratech"
    And Click Establishment search
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame2"
    And Click Establishment result row
    And Select Classification "Internal"
    #And scroll down untill find elements
    #And Select Arrival Port "Local waters"
    And Select Departing Port "local waters"
    And Click Add Seaman button
    And Enter SeamanType "Captain" and Religion "muslim" and Date of birth "06-07-1999" and Nationalty "Egypt"
    And Enter Seaman passport details Issue Country "Egypt" and Expiry Date "06-07-2027"
    And Enter Seaman book Nationalty "Egypt"
    And Click submit Seaman button
    Then Check application created succssefuly "Application for vessel entry permit created successfuly"
    And Click save Vessel Permit
    And Click yes to navigate to review vessel permit
    When Switch to default frame
    When Switch to Iframe "frame1"
    Then Check that navigate to review vessel permit
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame1"
    And Click Reject in review vessel permit page
    And Enter Reject Reason "Test"
    And Click Reject on popup
    Then Check Entry Permit Rejected Successfuly message "Reject Vessel Application Successful"
    
    @testcasekey=TRKNGB-47360 
     Scenario: Create the issue vessel permit Internal and view bussniess rule with expiry passport date
    Given login Vission Dashboard and go to SeaPort
    And switch window
    And User navigate to Vessel Registration
    When Register with vessel english name "TOM" and nationality "Egypt" and vessel type "other" and uniqe IMO
    And Click save in vessel Registration page
    And Click Yes on navigate license is missing popup
    And Click Yes popup and navigate to issue vessel permit
    When Switch to default frame
    When Switch to Iframe "frame2"
    And Enter Establishment Name "emaratech"
    And Click Establishment search
    When Switch to default frame
    And scroll down
    When Switch to Iframe "frame2"
    And Click Establishment result row
    And Select Classification "Internal"
    #And scroll down untill find elements
    #And Select Arrival Port "Local waters"
    And Select Departing Port "local waters"
    And Click Add Seaman button
    And Enter SeamanType "Captain" and Religion "muslim" and Date of birth "06-07-1999" and Nationalty "Egypt"
    And Enter Seaman passport details Issue Country "Egypt" and Expiry Date "06-07-2022"
    And Enter Seaman book Nationalty "Egypt"
    And Click submit Seaman button
    Then Check application created succssefuly "Application for vessel entry permit created successfuly"
    When Click on view Busniess Rules
    Then Check show Busniess rules
    
