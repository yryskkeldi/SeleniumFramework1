package advanced_mouse_interactions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class PracticeActions {

    WebDriver driver;
    Actions actions;

    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        actions = new Actions(driver);
    }

    @Test
    public void testDoubleClick() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        WebElement doubleCLickButton = driver.findElement(By.id("doubleClickBtn"));

        actions = new Actions(driver);
        actions.doubleClick(doubleCLickButton).perform();

        WebElement doubleClickMessage = driver.findElement(By.id("doubleClickMessage"));
        Assertions.assertTrue(doubleClickMessage.getText().contains("You have done a double click"));

        Thread.sleep(5000);
    }

    @AfterEach
    public void closeBrowser(){
        driver.close();
    }

}
