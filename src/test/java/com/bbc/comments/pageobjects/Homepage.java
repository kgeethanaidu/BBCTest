package com.bbc.comments.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Homepage extends BasePage {

    public Homepage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how = How.ID,using = "idcta-link")
    private WebElement signIn;

    @FindBy(how = How.XPATH,using = "//div[@class='top-story__wrapper gel-layout__item hp-bp-m-one-third top-story--small-image hp-ts--other' and @data-bbc-container='news headlines']/a")
    private List<WebElement> headlinesList;

    public WebElement getSignIn() {
        return signIn;
    }

    public List<WebElement> getHeadlinesList() {
        return headlinesList;
    }

    public void clickonsignin()
    {
        getSignIn().click();
    }
}
