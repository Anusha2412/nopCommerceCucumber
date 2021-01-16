package utilities;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class RandomString {


    public static String randomStringGenerator(){
        String generateString = RandomStringUtils.randomAlphabetic(5);
        return (generateString);
    }

}
