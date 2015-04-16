package testlink.tests.functional;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import testlink.steps.TestSteps;
import utils.PropertyLoader;
import webdriver.Browser;
import webdriver.BrowserFactory;


public class AbstractTest {
    protected Browser driver;
    protected TestSteps step;

    @BeforeSuite
    public void initEnv()
    {
        try {
            driver = BrowserFactory.create(PropertyLoader.loadProperty("browser"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterSuite
    public void shutEnv(){
        if (driver != null)
            driver.quit();
    }
}
