package amazonPagesLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageLocators  {


    public WebElement getSearchBarLoc(WebDriver driver)
    {
        WebElement search_key = driver.findElement(By.id("twotabsearchtextbox"));
        return search_key;

    }

    public WebElement getSearchButtonLoc(WebDriver driver)
    {
        WebElement search_but = driver.findElement(By.id("nav-search-submit-button"));
        return search_but;

    }


}
