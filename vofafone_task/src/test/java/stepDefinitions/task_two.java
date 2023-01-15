package stepDefinitions;

import ksrtcPagesLocators.seatsLocators;
import ksrtcPagesLocators.siteBookingLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class task_two
{
    siteBookingLocators sitBokLoc = new siteBookingLocators();
    seatsLocators seatsBokLoc = new seatsLocators();
        @Given("user navigates to website")
        public void user_navigates_to_website()
        {
            HOOKS.driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        }

        @When("user choose place of trip")
        public void user_choose_place_of_trip()
       {
            JavascriptExecutor j = (JavascriptExecutor) HOOKS.driver;
            j.executeScript("arguments[0].click();", sitBokLoc.getBookingTripLoc(HOOKS.driver));
            // scroll down
            JavascriptExecutor js = (JavascriptExecutor) HOOKS.driver;
            js.executeScript("window.scrollBy(0,400)", "");
        }
        @And("user choose date of trip")
        public void user_choose_date_of_trip()
        {
            HOOKS.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
            // Choose the arrival date
            sitBokLoc.getdateOfTripLoc(HOOKS.driver).click();
            sitBokLoc.getDayOfTrip(HOOKS.driver).click();
        }
        @And("user choose bus")
         public void user_choose_bus()
        {
            HOOKS.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
            // Click “Search for bus”
            sitBokLoc.getSearchBus(HOOKS.driver).click();

          //  HOOKS.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        }

        @And("user choose seats and boarding&dropping")
        public void user_choose_seats_and_boarding_dropping()
        {
            HOOKS.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        //    choose seats;
        JavascriptExecutor jd = (JavascriptExecutor) HOOKS.driver;
        jd.executeScript("arguments[0].click();", seatsBokLoc.getseatsBooking(HOOKS.driver));

        // scroll down
        JavascriptExecutor jp = (JavascriptExecutor) HOOKS.driver;
        jp.executeScript("window.scrollBy(0,1500)", "");

        //choose boarding point
        seatsBokLoc.getBoardPoint(HOOKS.driver).click();
        seatsBokLoc.getselectBoard(HOOKS.driver).click();

        //choose Dropping point
        seatsBokLoc.getDropPoint(HOOKS.driver).click();
        seatsBokLoc.getselectDrop(HOOKS.driver).click();
    }
        //fill date of cst

    @And("user fill the data_payment")
    public void  used_fill_the_data_payment() {
        seatsBokLoc.getSelectMobile(HOOKS.driver).sendKeys("6789125987");
        seatsBokLoc.getSelectMail(HOOKS.driver).sendKeys("yara@gmail.com");
        HOOKS.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        seatsBokLoc.getPassengerNum(HOOKS.driver).click();
        seatsBokLoc.getPassName(HOOKS.driver).sendKeys("mohmaed");
        Select gender = new Select(seatsBokLoc.getGenderLoc(HOOKS.driver));
        gender.selectByVisibleText("MALE");
        seatsBokLoc.getAgeLoc(HOOKS.driver).sendKeys("28");
        Select Concession = new Select(seatsBokLoc.getConcLoc(HOOKS.driver));
        Concession.selectByValue("1466060086837");
        Select national = new Select(seatsBokLoc.getNatLoc(HOOKS.driver));
        national.selectByIndex(4);
        seatsBokLoc.getPassLOc(HOOKS.driver).sendKeys("33");
        seatsBokLoc.getforAddLoc(HOOKS.driver).sendKeys("yokohama");
        seatsBokLoc.getLoc(HOOKS.driver).click();
        HOOKS.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        seatsBokLoc.getDayOfPass(HOOKS.driver).click();
        seatsBokLoc.getSubmitBtn(HOOKS.driver).click();
    }
    @Then("verify reservation done")
    public void verify_reservation_done()
    {
        HOOKS.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        Assert.assertTrue(seatsBokLoc.getassertLoc(HOOKS.driver).isDisplayed());

    }

}
