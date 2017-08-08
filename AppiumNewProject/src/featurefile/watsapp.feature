@f-watsapp  @watsapp

Feature:Below feature file will send the message to the wats app contact

Background: customer open the application
#------------------------------------------------------------------------------------#
@watsapp-1
Scenario:customer select the watsapp and sends a message to the contacts

Given customer verifies the application header
When customer selecting the new message and verifies the target page
Then customer seleting the right contact in the contact list 
#Then customer typing the new message as "" for the contact name ""
Then Customer tabs the send button after typing the message and verifying the send message
#------------------------------------------------------------------------------------#