package ksrtcPagesLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class siteBookingLocators {

    public  WebElement getBookingTripLoc(WebDriver driver)
    {
        WebElement chossed_country = driver.findElement(By.xpath("/html/body/main/section/div/div/div[1]/div/div/div/div[1]/div/div/ul/li[4]/a"));
        return chossed_country;

    }

    public  WebElement getdateOfTripLoc(WebDriver driver)
    {
        WebElement date_of_depature = driver.findElement(By.id("txtJourneyDate"));
        return date_of_depature;
    }
    public  WebElement getDayOfTrip(WebDriver driver)
    {
        WebElement dayOfTrip = driver.findElement(By.linkText("16"));
        return dayOfTrip;
    }
    public  WebElement getSearchBus(WebDriver driver)
    {
        WebElement search_bus = driver.findElement(By.cssSelector("button[onclick=\"openTTDConfirmPopoUp('1',this.form);\"]"));
        return search_bus;
    }
}