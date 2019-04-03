package com.bbc.comments.steps;

import com.bbc.comments.pageobjects.ArticalPage;
import com.bbc.comments.pageobjects.BasePage;
import com.bbc.comments.pageobjects.Homepage;
import com.bbc.comments.pageobjects.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CommentStepDefs extends CommonSteps   {

    @Given("^I go to the BBC home page$")
        public void iGoToTheBBCHomePage() {
        driver.get("https://www.bbc.co.uk/");
        }

    @When("^I click on sign in button on the navigation bar$")
    public void iClickOnSignInButtonOnTheNavigationBar() {
       homePage.clickonsignin();
    }

    @And("^I sign in using user name as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iSignInUsingUserNameAsAndPasswordAs(String username, String password) throws Throwable {
        String uName=System.getProperty(username);
        String pwd=System.getProperty(password);
        signinPage.signIn(uName,pwd);
    }


    @When("^I click on first new headlines link to goto the artical$")
    public void iClickOnFirstNewHeadlinesLinkToGotTheArtical() {
        List<WebElement> headLines=homePage.getHeadlinesList();
        headLines.get(0).click();
    }


     /* If comment section is not available in artical then test scenario will pass.
       If comment section is available and comment bos is not enabled then test scenario will fail.
     */
    @Then("^I see comment box exist when comment section is available$")
    public void iSeeCommentSectionIsAvailable() {

        boolean isCommentBox=articalPage.assertCommentBoxForComments();
        Assert.assertTrue("Comment section available but comment box is not enabled",isCommentBox);

    }

    @When("^I do to URL \"([^\"]*)\"$")
    public void iDoToURL(String url) throws Throwable {
        driver.get(url);
    }

    @And("^I Logout from the account$")
    public void iLogoutFromTheAccount() {
        articalPage.clickonusername();

    }

}

