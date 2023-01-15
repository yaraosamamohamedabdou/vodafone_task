package amazonPagesLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectDepartmentsLocator {

    public WebElement select_deprt1Loc(WebDriver driver)
    {
        WebElement select_dep1 = driver.findElement(By.xpath("//span[text()='Headphones'])"));
        return select_dep1;
    }

    public WebElement select_deprt2Loc(WebDriver driver)
    {  //WebElement GRO1 = HOOKS.driver.findElement(By.xpath("//span[text()='Grocery']"));
        WebElement select_dep2 = driver.findElement(By.xpath("//span[text()='Grocery'])"));
        return select_dep2;
    }

    public WebElement select_discountLoc(WebDriver driver)
    {
        WebElement select_discount = driver.findElement(By.xpath( "//span[text()='10% off or more']"));
        return select_discount;
    }
}

