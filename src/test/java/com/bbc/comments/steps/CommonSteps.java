package com.bbc.comments.steps;

import com.bbc.comments.pageobjects.ArticalPage;
import com.bbc.comments.pageobjects.Homepage;
import com.bbc.comments.pageobjects.SignInPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonSteps {

    public static WebDriver driver;
    public Homepage homePage;
    public SignInPage signinPage;
    public ArticalPage articalPage;
    public static WebDriverWait wait;

    public CommonSteps()
    {
        WebDriverManager.chromedriver().setup();
        if(driver==null) {
            driver = new ChromeDriver();
        }
        homePage=new Homepage(driver);
        signinPage=new SignInPage(driver);
        articalPage=new ArticalPage(driver);
        wait= new WebDriverWait(driver, 10);
    }

    public static void explecitWait(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
