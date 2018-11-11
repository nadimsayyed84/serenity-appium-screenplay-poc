@cucumber
Feature: SP-app welcome screen test
  As a forgetful person
  I want to launch SP application to navigate on Welcome screen


  Scenario Outline: Linda launch SPApp in iOS
  Given that Linda has a mobile containing SPApp installed
  When She click on category
  |Food|
  Then See Partner count
  When find the partner "<Partner Name>"
  Then match the amount "<Amount>" for "<Partner Name>"
    
  Examples:
  |Partner Name|Amount|
  |Select Catering Services Pte Ltd|187.25|
  
  

  Scenario: Simba navigate to GTE in chrome
  Given the Simba launch ford link "https://wwwint.brandap.ford.com/content/gte/au/en_au/home.html"  
  When Click on Book button
