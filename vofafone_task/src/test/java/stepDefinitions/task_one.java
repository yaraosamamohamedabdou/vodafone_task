package stepDefinitions;

import amazonPagesLocators.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;

import java.time.Duration;


public class task_one
{
    //public WebHOOKS.driver HOOKS.driver ;
    HomePageLocators homlocs = new HomePageLocators();
    ProductsPageLocators productpagelocs = new ProductsPageLocators();
    AddProductlocators productaddlocs = new AddProductlocators();
    AssertionPageLocators assertpageLocs = new AssertionPageLocators();

    TodayDealsLocator todayDealLocs = new TodayDealsLocator();

    SelectDepartmentsLocator selDepLocs = new SelectDepartmentsLocator();

    @Given("user navigates to amazon website")
    public void user_navigates_to_website()
    {
        HOOKS.driver.navigate().to("https://www.amazon.com/");
        HOOKS.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
    }

    @When("user enters {string} and click search button")
    public void user_enters_product_name_and_click_search_button(String product_name)
    {
        homlocs.getSearchBarLoc(HOOKS.driver).sendKeys(product_name);
        homlocs.getSearchButtonLoc(HOOKS.driver).click();
    }
    @And("select first item and add it to the cart")
    public void select_first_item_and_add_it_to_the_cart()
    {
        productpagelocs.getFirstItemLoc(HOOKS.driver).click();
        productaddlocs.getAddItemLoc(HOOKS.driver).click();
    }
   @When("user opens today's meals")
    public void user_opens_today_meals()
    {
        JavascriptExecutor executor = (JavascriptExecutor)HOOKS.driver;
        executor.executeScript("arguments[0].click();", todayDealLocs.gettodaydealsLoc(HOOKS.driver));
    }
    @And("user selects filter_one and filter_two and selects discount percentage")
    public void  user_selects_departments()
    {
        JavascriptExecutor js = (JavascriptExecutor)HOOKS.driver;
        js.executeScript("window.scrollBy(0,1200)", "");
        HOOKS.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

     //   selDepLocs.select_deprt1Loc(HOOKS.driver);

        WebElement GRO1 = HOOKS.driver.findElement(By.xpath("//span[text()='Grocery']"));
        JavascriptExecutor j = (JavascriptExecutor) HOOKS.driver;
        j.executeScript("arguments[0].click();", GRO1);
        // GRO1.click();
        WebElement GRO2 = HOOKS.driver.findElement(By.xpath("//span[text()='Headphones']"));

        j.executeScript("arguments[0].click();", GRO2);

        WebElement disc = HOOKS.driver.findElement(By.xpath("//span[text()='10% off or more']"));
        disc.click();
    }


    @And("user opens fourth page and select item")

    public void user_opens_fourth_page()
    {
        for (int i = 3;i<5;i++)
        {
            String S = Integer.toString(i);
            HOOKS.driver.findElement(By.linkText(S)).click();
            HOOKS.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        }
    }
    @And("add the item to card")
    public void add_the_item_to_card()
    {
        HOOKS.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        WebElement selectItem1 = HOOKS.driver.findElement(By.className("DealContent-module__truncate_sWbxETx42ZPStTc9jwySW"));
        selectItem1.click();
}
//        WebElement addItem = HOOKS.driver.findElement(By.cssSelector("a[title=\"Add to card\"]"));
//        addItem.click();
//    }
//
    @Then("check item is added successfully")
    public void check_item_is_added_successfully()
    {
  //      boolean condition = assertpageLocs.getIconLoc(HOOKS.driver).isDisplayed();
        //Assert.assertTrue(condition);
    }
//



}

