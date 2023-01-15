package amazonPagesLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPageLocators  {


   public WebElement getFirstItemLoc(WebDriver driver)
   {
        WebElement select_first = driver.findElement(By.className("a-size-base-plus"));
        return select_first;
    }





}
