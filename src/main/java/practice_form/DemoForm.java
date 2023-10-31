package practice_form;

import io.netty.util.Constant;
import org.junit.jupiter.api.Test;

public class DemoForm extends BaseTest {

    @Test
    public void test1(){
//        driver.get(Constant.DEV_ENV);
        registrationPage.enterFirstName("Nuta");
    }
}