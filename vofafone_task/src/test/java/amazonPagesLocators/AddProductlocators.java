package amazonPagesLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProductlocators {

    public WebElement getAddItemLoc(WebDriver driver)
    {
        WebElement add_cart = driver.findElement(By.id("add-to-cart-button"));
        return add_cart;
    }
}
