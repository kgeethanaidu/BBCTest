package com.bbc.comments.pageobjects;

import com.bbc.comments.steps.CommonSteps;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArticalPage extends BasePage {

    public ArticalPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how=How.CLASS_NAME,using = "comments-button__link")
    private WebElement commentsLink;


    @FindBy(how=How.CLASS_NAME,using = "cmts-post-box")//"//*[@id='submit_new_comment']/textarea")
    private WebElement commentBox;

    @FindBy(how=How.ID,using = "idcta-username")
    private WebElement userAccount;

    @FindBy(how = How.XPATH,using = "//*[@id=\"container\"]/div/div/div[1]/div[1]/div/div/div/div/nav/ul/li[3]/a/span")
    private WebElement signout;

    public WebElement getCommentsLink() {
        return commentsLink;
    }

    public WebElement getCommentBox() {
        return commentBox;
    }

    public WebElement getUserAccount() {
        return userAccount;
    }

    public WebElement getSignout() {
        return signout;
    }

    /*
    *
    * Below method checks whether comment section available or not
    * If not available it returns true
    * If available and has comments box is enabled the returns true
    * If available and comments box is not enabled then returns false
    */
    public boolean assertCommentBoxForComments(){

        try {
            getCommentsLink().click();
            Thread.sleep(7000);
        } catch (InterruptedException | NoSuchElementException ex) {
            return true;
        }
        try {
            driver.switchTo().frame(0);
            driver.switchTo().defaultContent();
            if(getCommentBox().isEnabled())
            {
                return true;
            }
        } catch (NoSuchFrameException | NoSuchElementException ex) {
            driver.switchTo().defaultContent();
            return false;
        }
        return true;
    }

    public void signOut()
    {
        getUserAccount().click();
        CommonSteps.explecitWait(signout);
        getSignout().click();
    }


}
