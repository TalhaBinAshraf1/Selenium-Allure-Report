package com.internet.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage{

    public LandingPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "li:nth-of-type(1) > a")
    public WebElement abTesting;
    public WebElement getAbTesting(){
        return abTesting;
    }

    @FindBy(css = "ul > li:nth-of-type(2)")
    public WebElement addRemoveElements;
    public WebElement getAddRemoveElements(){
        return addRemoveElements;
    }


    @FindBy(css = "ul > li:nth-of-type(3)")
    public WebElement basicAuth;
    public WebElement getBasicAuth(){
        return basicAuth ;
    }


    @FindBy(css = "li:nth-of-type(4) > a")
    public WebElement brokenImage ;
    public WebElement getBrokenImage(){
        return brokenImage;
    }


    @FindBy(css = "ul > li:nth-of-type(6)")
    public WebElement checkBox;
    public WebElement getCheckBox(){
        return checkBox ;
    }


    @FindBy(css = "li:nth-of-type(7) > a")
    public WebElement contextMenu ;
    public WebElement getContextMenu(){
        return contextMenu;
    }
}
