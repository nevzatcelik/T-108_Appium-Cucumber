package pages.BrowserPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserDriver;

public class MealCenterPage {

    public MealCenterPage(){
        PageFactory.initElements((WebDriver) BrowserDriver.getBrowserDriver(),this);
    }


    @FindBy(xpath ="//div[@class='hamburger hamburger--3dx']")
    public WebElement ucCizgiButon;

    @FindBy(xpath = "(//*[text()='Sign in'])[2]")
    public WebElement signInButton;

    @FindBy(xpath = "//img[@src='/themes/karenderia_v2/assets/images/shopping-bag.svg']")
    public WebElement headerCart;

    @FindBy(xpath = "(//img[@class='img-200'])[1]")
    public WebElement headerLogo;


}
