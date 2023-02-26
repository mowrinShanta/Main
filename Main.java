import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //open the chrome browser

        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //open the url

        driver.get("https://test.sharebus.co/");

        //maximize
        driver.manage().window().maximize();

        //click on sign in button

        driver.findElement(By.xpath("//*[@id=\"app\"]/nav/div/ul/li/button")).click();

        //email,password
        driver.findElement(By.id("email")).sendKeys("brainstation23@yopmail.com");
        driver.findElement(By.id("password")).sendKeys("Pass@1234");


        //click on submit button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/form/div[4]/button")).click();

        //select

       WebElement ddown = driver.findElement(By.className("text-start"));
       Select select = new Select(ddown);



        select.selectByIndex(2);

        //click on set up sharebus
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[4]/button")).click();

        //data insert
        driver.findElement(By.id("startPoint")).sendKeys("Oslo,Norway");
        driver.findElement(By.id("destination")).sendKeys("Kolbotn,Norway");


        //click yes
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[1]")).click();

        //select
        WebElement ddown = driver.findElement(By.id("Search or select"));
        Select select = new Select(ddown);



        select.selectByIndex(4);

        //click continue
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/div[2]/button[2]/span[1]")).click();

        //click no
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/button[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/button[2]")).click();

        //click create sharebus

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[5]/button[2]")).click();

        //click publish
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[4]/button")).click();

        //click review and publish
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/form/div[5]/button")).click();

        //click publish
        driver.findElement(By.xpath("//*[@id=\"tripPreviewModal\"]/div/div/div[3]/button[2]")).click();

        //click on my busses
        driver.findElement(By.xpath("//*[@id=\"app\"]/nav/div/ul/li[1]/button")).click();

        //














    }
}