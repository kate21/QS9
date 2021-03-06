package testlink.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by admin on 08.04.2015.
 */
public class HomePage extends AbstractPage{
    private static final By version = By.xpath("//div[@class='menu_title']/span[contains(text(),'TestLink')]");
    private static final By logout = By.linkText("logout");
    private static final By planManagement = By.linkText("Test Plan Management");

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public TestPlanManagementPage openTestPlanManagement(){
        switchToMainFrame();
        driver.findElement(planManagement).click();
        return new TestPlanManagementPage(driver);
    }

    public boolean isOpened(){
        switchToTitleBar();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(version));
        return !driver.findElements(version).isEmpty();
    }

    public void logout(){
        driver.findElement(logout).click();
    }
}
