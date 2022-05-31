package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazona gidip nutella arat
        driver.get("https://amazon.com");

        // findElement(By.......locator) --> istedigimiz web elementini bize dondurur
        // bizde o web elementini kullanmak icin bir objeye assgn ederiz

       WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        WebElement aramaKutusu1= driver.findElement(By.id("twotabsearchtextbox"));


        /*
        WebElement aramaKutusu= driver.findElement(By.id("nav-search-field"));
        bu locator calismadi
        locator alirken gozumuzden kacan detaylar olabilir
        aldigiiz bir locator calismazsa alternatif locator lar denemeliyiz
        */

        // herhangi bir webelemenetine istedigimiz yaziyi yollamak istersek

        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        driver.close();

    }
}
