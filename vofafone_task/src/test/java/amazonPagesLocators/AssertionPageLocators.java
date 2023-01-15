package amazonPagesLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssertionPageLocators {

    public WebElement getIconLoc(WebDriver driver)
    {
        WebElement icon =  driver.findElement(By.className("a-icon-alert"));
        return icon;
    }

}
