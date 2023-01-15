package amazonPagesLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TodayDealsLocator {

    public WebElement gettodaydealsLoc(WebDriver driver)
    {
      //  WebElement today_deal = driver.findElement(By.cssSelector("a[href=\"/gp/goldbox?ref_=nav_cs_gb\"]"));
       // WebElement today_deal = driver.findElement(By.className("nav-a"));
        WebElement today_deal = driver.findElement(By.linkText("Today's Deals"));
        return today_deal;
    }

}
