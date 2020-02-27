
Feature: To validate facebook functionality
 
  Scenario: To verify login with invalidated credentials
  Given user is on facebook login page
  When user enters the email "kalai" and pass "kalai@123"
  Then user click login button
    
  
  
    