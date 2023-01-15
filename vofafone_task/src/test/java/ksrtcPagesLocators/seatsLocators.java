package ksrtcPagesLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class seatsLocators {

    public WebElement getseatsBooking(WebDriver driver)
    {
        WebElement select_seat =driver.findElement(By.id("SrvcSelectBtnForward0"));
        return select_seat;
    }
    public WebElement getBoardPoint(WebDriver driver)
    {
        WebElement boardPoint= driver.findElement(By.id("Forwardboarding-tab"));;
        return boardPoint;
    }
    public  WebElement getselectBoard(WebDriver driver)
    {
        WebElement  selectBoard =driver.findElement(By.id("Forward-1534137994208"));
        return selectBoard;
    }

    public  WebElement getDropPoint(WebDriver driver)
    {
        WebElement dropPoint= driver.findElement(By.id("Forwarddroping-tab"));
        return dropPoint;
    }
    public  WebElement getselectDrop(WebDriver driver)
    {
        WebElement  selectDrop =driver.findElement(By.id("Forward-1467550949362"));
        return selectDrop;
    }
   public WebElement getSelectMobile(WebDriver driver) {
       WebElement select_mobile = driver.findElement(By.id("mobileNo"));
       return select_mobile;
   }
    public WebElement getSelectMail(WebDriver driver) {
        WebElement select_email = driver.findElement(By.id("email"));
        return select_email;
    }
    public WebElement getPassengerNum(WebDriver driver)
    {
        WebElement passengernum = driver.findElement(By.id("Forward120"));
        return passengernum;
    }
    public WebElement getPassName(WebDriver driver)
    {
        WebElement passName = driver.findElement(By.id("passengerNameForward0"));
        return passName;
    }
    public WebElement getGenderLoc(WebDriver driver)
    {
        WebElement gengerLoc = driver.findElement(By.id("genderCodeIdForward0"));
        return gengerLoc;
    }

    public WebElement getAgeLoc(WebDriver driver)
    {
        WebElement ageLoc = driver.findElement(By.id("passengerAgeForward0"));
        return ageLoc;
    }
    public WebElement getConcLoc(WebDriver driver)
    {
        WebElement concLoc = driver.findElement(By.name("concessionIds"));
        return concLoc;
    }
    public WebElement getNatLoc(WebDriver driver)
    {
        WebElement natLoc = driver.findElement(By.id("nationalityForward0"));
        return natLoc;
    }
    public WebElement getPassLOc(WebDriver driver)
    {
        WebElement passLoc = driver.findElement(By.id("passportNoForward0"));
        return passLoc;
    }
    public WebElement getforAddLoc(WebDriver driver)
    {
        WebElement forAddLoc = driver.findElement(By.id("foreignerAddressForward0"));
        return forAddLoc;
    }
    public WebElement getDayOfPass(WebDriver driver)
    {
        WebElement dayOfPass = driver.findElement(By.linkText("12"));
        return dayOfPass;
    }
public WebElement getSubmitBtn(WebDriver driver)
{
    WebElement subBtn = driver.findElement(By.name("PgBtn"));
    return subBtn;
}
public WebElement getassertLoc(WebDriver driver)
{
    WebElement assLoc = driver.findElement(By.className("header-title"));
    return assLoc;
}
public WebElement getLoc(WebDriver driver)
{
    WebElement loc = driver.findElement(By.id("dobForward0"));
    return loc;
}
}
