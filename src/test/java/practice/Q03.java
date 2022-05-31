package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03 {
    // ...Exercise3...
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
//fill the firstname
//fill the firstname
//check the gender
//check the experience
//fill the date
//choose your profession -> Automation Tester
//choose your tool -> Selenium Webdriver
//choose your continent -> Antartica
//choose your command  -> Browser Commands
//click submit button
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // driver objesini olusturup chrome atama yapiyoruz
        driver.manage().window().maximize(); // artik driver methodlarini kullanip buyut
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

      // driver.manage().deleteAllCookies(); // bu code da ise yarayabilir
       // driver.findElement(By.xpath("//a[@id ='cookieChoiceDismiss']")).click(); bunuda yapmak gereke bilir

        //fill the firstname
       WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
       firstName.sendKeys("baha");
//fill the firstname
        WebElement lastName= driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("alta");
//check the gender

        driver.findElement(By.xpath("//input[@name='sex']")).click();
//check the experience
        driver.findElement(By.xpath("//input[@id='exp-6']")).click();
//fill the date
        WebElement date= driver.findElement(By.xpath("//input[@id='datepicker']"));
        date.sendKeys("20.02.2022");
//choose your profession -> Automation Tester
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
//choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
//choose your continent -> Antartica
        driver.findElement(By.xpath("//option[text()='Antartica']")).click();


//choose your command  -> Browser Commands
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();  // . yada text() olarak kullanilir
//click submit button

        driver.findElement(By.xpath("//button[@id='submit']")).click();


     driver.close();

    }

}
