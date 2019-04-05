# BBCTest

Assumptions
***********
To execute the test
1.JAVA 7 or above installed.
2.Maven installed.
3.Chrome driver is installed in default installation path.
4.Intelli J is used as code editor.

Run command:
************
1.Have the existing BBC account.
2.mvn clean install -DMYUSERNAME=<your BBC account username> -DMYPASSWORD=<your BBC account password>.

Test Scenario Assumptions
**************************
1. Few news articles have comments sections and few news articles don't have comments section, so assumption is that if comment section is available and comment box is not enabled then test scenario should fail.
2. If news article doesn’t have comments options then test scenario should pass and no need to check whether comment box is enabled or not.
3. First test scenario will pass if under news head line first article has comments and if comment box is enabled or if no comment section.
4. Second scenario is automated giving navigate to particular URL after sign in where comment section is available and check whether comment box is enabled or not.
5. In the second scenario while submitting the test it has comment section available and comment box enabled so test is passing.



