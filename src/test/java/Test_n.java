/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author netphenix
 */
public class Test_n {

//  private static String Base_Url = "https://www.facebook.com";
//    private static String Base_Url = "http://parabank.parasoft.com";
//    private WebDriver driver;

    @Before
    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "/home/netphenix/Downloads/chromedriver_linux64/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get(Base_Url);
    }

    @After
    public void after() {
//        driver.quit();
    }
    
       @Test
    public void testFormMessage() {
        //Asserts that two Strings are equal                
        String expResult = "Hello World";
        String result = "Hello World";
        System.out.println("* HelloWorldTest: test method 1 testFormMessage()");
        Assert.assertEquals(expResult, result);

        
    }

//    @Test
//    public void successfulLoginLogout() {
//
//        Assert.assertEquals(driver.getTitle(), "ParaBank | Welcome | Online Banking");
//        driver.findElement(By.name("username")).sendKeys("john");
//        driver.findElement(By.name("password")).sendKeys("demo");
//        driver.findElement(By.cssSelector("input[value='Log In']")).click();
//        Assert.assertEquals(driver.getTitle(), "ParaBank | Accounts Overview");
//        driver.findElement(By.linkText("Log Out")).click();
//        Assert.assertEquals(driver.getTitle(), "ParaBank | Welcome | Online Banking");
//    }
//    @Test
//    public void testCasePassed()
//    {
//        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='login_form']")).isDisplayed());
//    }

//    @Test
//    public void testCaseFailed()
//    {
//        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='failed case']")).isDisplayed());
//    }
//    @Ignore
//    @Test
//    public void testCaseIgnored()
//    {
//        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='ignored case']")).isDisplayed());
//    }
}
