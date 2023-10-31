package practice_form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends Methods {

    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    By firstNameLocator = By.xpath("//input[@id='firstName']");
    By lastNameLocator = By.xpath("//input[@id='lastName']");
    By emailLocator = By.xpath("//input[@id='userEmail']");
    By maleGenderButton = By.xpath("//input[@id='gender-radio-1']");
    By femaleGenderButton = By.xpath("//input[@id='gender-radio-2']");
    By otherGenderButton = By.xpath("//input[@id='gender-radio-3']");
    By mobileNumberButton = By.xpath("//input[@id='userNumber']");
    By dateField = By.xpath("//input[@id='dateOfBirthInput']");


    public void enterFirstName(String userName){
        sendKeys(firstNameLocator,userName);
    }

}