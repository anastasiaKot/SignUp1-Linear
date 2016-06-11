import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;


public class SignUp1Test
{
    public static  SignUp1 appjava = new SignUp1();
    static String aidee = null;

    @Test
    public void field_FirstNameIsPresent() {
        aidee = "id_f_title";
        boolean exist = SignUp1.presentOrNot(aidee);
        Assert.assertTrue(exist, "MEME");
        SignUp1.close();

    }

    @Test
    public void field_LastNameIsPresent()
    {
        boolean exist = SignUp1.presentOrNot("id_l_tditssle");

        Assert.assertTrue(exist, "BEBE");
        SignUp1.close();

    }



}
