Feature: Validating the functionality of uploading Auth Attachments and Create Dynamic document

  Background: Navigate to Home page of MobilityX application
    Given he is logged into MobilityX application as a client user
    And he has filled all the mandatory information on 'Authorization Home Page' after selecting as "A new transfer or assignment" for an employee
    And he attaches a dynamic and an external document to the Authorization form
    And he is able to view and download the uploaded document

  Scenario: uploading a relevent document to the submitted authorization form
    Given he deletes all the attached documents from the authorization form
    And he creates dynamic document and submits the form
    And he serches for the submitted Authorization form from dashboard
    When he uploads a new document
    Then an upload confirmation message should be displayed

  Scenario Outline: Create and attach a dynamic document to the authorization form and verify whether the transfree can view the document
    Given he made the <checkbox_selection> to make the document employee-viewable in MobilityX
    And he clicks on Submit to Aires link
    When he impersonate as the created transferee
    Then he should be able to view the documents as per the <Checkbox_selection>

    Examples: 
      | checkbox_selection |
      | Viewable           |
      | Not Viewable       |
