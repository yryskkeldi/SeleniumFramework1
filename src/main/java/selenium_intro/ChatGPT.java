package selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChatGPT {

    @Test
    public void textToChatGPT(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://translate.yandex.ru/?source_lang=ru&target_lang=en");

        System.out.println(driver.getTitle());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement inputField = driver.findElement(By.id("fakeArea"));
        inputField.sendKeys("Я оканчиваю первый курс факультета психологии, и скоро буду сдавать зачеты по " +
                "предмету \"Психология общения\". Но ты будешь в роли моего репетитора/преподавателя, а я буду учеником" +
                " в возрасте 15 лет, который мало что знает о психологии и плохо понимает это все. Распиши мне полностью" +
                " раскрыто, подробно и максимально понятно тему \"Формы и средства общения по М.И. Лисиной\". Объяснение " +
                "должно состоять из не менее чем 300 слов.", Keys.ENTER);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
