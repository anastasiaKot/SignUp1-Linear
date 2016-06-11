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

    @Test
    public void test001() {
        boolean lala;
        lala = appjava.presentOrNot("id_f_title");

        Assert.assertTrue(lala, "kjdksa");

    }



}
