package advanced_mouse_interactions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MyTestPractice {

    WebDriver driver;
    Actions actions;

    @BeforeEach
    public void driverSetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/checkbox");
        actions = new Actions(driver);
    }

    @Test
    public void myTest() throws InterruptedException {
        driver.findElement(By.xpath("(//button[@title = 'Toggle'])[1]")).click();

        driver.findElement(By.xpath("(//button[@class = 'rct-collapse rct-collapse-btn'])[4]")).click();

        driver.findElement(By.xpath("(//span[@class = 'rct-checkbox'])[6]")).click();
        Thread.sleep(5000);

        System.out.println(driver.getWindowHandle());
    }

    @AfterEach
    public void browserClose(){
        driver.close();
    }

}
