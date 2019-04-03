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
    #When I do to URL "https://www.bbc.co.uk/news/health-47742899#comp-comments-button"
    When I do to URL "https://www.bbc.co.uk/news/uk-politics-47783127"
    Then I see comment box exist when comment section is available
    And I Logout from the account



    # Scenario: Verify that user can't write comments for artical without sign in
      #  Scenario: Verify that non signed in user has option to sign in or register to write comments
        # Scenario: Verify that Post comments button is available and enabled for post comment box
        # Scenario: Verify that View all option is available to view the comments
        # Scenario: Verify that you're signed in as me.Sign out message is available under comments
        # Scenario: Verify that View your previous comments message is available under comments after sign in
        # Scenario: Verify that All posts are reactively-moderated and must obey the house rules message is available after post comments
       #   Scenario: Verify that comments disabled after user signed out