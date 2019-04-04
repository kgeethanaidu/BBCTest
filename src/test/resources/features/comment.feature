@comments
Feature:Viewing a comment feature in BBC News artical

  Background:
    Given I go to the BBC home page

  Scenario: verify that comment is enabled for artical
    When I click on sign in button on the navigation bar
    And I sign in using user name as "MYUSERNAME" and password as "MYPASSWORD"
    When I click on first new headlines link to goto the artical
    Then I see comment box exist when comment section is available
    And I Logout from the account

    #This URL is an example for artical having
    #comment section and comment box not enabled(https://www.bbc.co.uk/news/health-47742899#comp-comments-bu
  Scenario: verify that comment box  is enabled in comment section for artical
    When I click on sign in button on the navigation bar
    And I sign in using user name as "MYUSERNAME" and password as "MYPASSWORD"
    #When I go to URL "https://www.bbc.co.uk/news/health-47742899#comp-comments-button"
    When I go to URL "https://www.bbc.co.uk/news/uk-politics-47783127"
    Then I see comment box exist when comment section is available
    And I Logout from the account

  @manual
  Scenario: Verify that user can't write comments for artical without sign in
    Given I go to URL "https://www.bbc.co.uk/news/uk-northern-ireland-47808880"
    When I click on view comments
    Then I see comment box is not enabled to write comments

  @manual
  Scenario: Verify that non signed in user has option to sign in or register to write comments
    Given I go to URL "https://www.bbc.co.uk/news/uk-northern-ireland-47808880"
    When I click on view comments
    Then I see Sign in or Register options are available

  @manual
  Scenario: Verify that Post comment button is available and enabled to submit the comments
    Given I go to the BBC home page
    When I click on sign in button on the navigation bar
    And I sign in using user name as "MYUSERNAME" and password as "MYPASSWORD"
    When I click on new headlines link to goto the artical
    Then I see comment box exist is enabled and post comment button is available and enabled
    And I Logout from the account

  @manual
  Scenario: Verify that View all option is available to view the comments without sign in
    Given I go to URL "https://www.bbc.co.uk/news/uk-northern-ireland-47808880"
    When I click on view comments
    Then I will see "view all" is available to view comments

  @manual
  Scenario: Verify that you're signed in as me.Sign out message is available under comments
    Given I go to URL "https://www.bbc.co.uk/news/uk-northern-ireland-47808880"
    When I click on view comments
    Then I will see you're signed in as <user name>.Sign out under comments

  @manual
  Scenario: Verify that View your previous comments is available under comments after sign in
    Given I go to the BBC home page
    When I click on sign in button on the navigation bar
    And I sign in using user name as "MYUSERNAME" and password as "MYPASSWORD"
    When I click on new headlines link to goto the artical
    Then I see comment box exist is enabled and "View your previous comments" is available and enabled
    And I Logout from the account

