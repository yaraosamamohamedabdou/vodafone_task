package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class HOOKS {
    static ChromeDriver driver;
    @Before
    public void open_browser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);
    }
    @After
    public void closeDriver()
    {
        driver.quit();
    }


}
