package a_my_practice_package;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Talent_LMS_testing {

    WebDriver driver;

    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }


    @Test
    public void testLogin(){
        driver.get("https://yrys5916.talentlms.com/index");
        driver.findElement(By.xpath("//input[@name='login']"))
                .sendKeys("yryskeldi");
        driver.findElement(By.xpath("//input[@name='password']"))
                .sendKeys("zerotwo0216");
        driver.findElement(By.xpath("//input[@name='submit']"))
                .click();


    }
}
