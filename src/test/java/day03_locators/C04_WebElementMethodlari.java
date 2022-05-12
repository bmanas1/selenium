package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {
    /*
1- amazon.com'a gidip arama kutusunu locate edin
2- arama kutusunun tagName'inin input oldugunu test edin
3- arama kutusunun name attribute'nun degerinin ...... oldugunu test edin
 */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


       // 1- amazon.com'a gidip arama kutusunu locate edin
         driver.get("https://www.amazon.com");
         WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

         //  2- arama kutusunun tagName'inin input oldugunu test edin
        String expectedtagName= "input";
        String actualtagName=aramaKutusu.getTagName();

        if(expectedtagName.equals(actualtagName)){
            System.out.println("tag Name testi PASSED");
        }else{
            System.out.println("tag Name testi Failed");
        }

      //  3- arama kutusunun name attribute'nun degerinin "field-keywords" oldugunu test edin

        String expectedNameDegeri="field-keywords";
        String actualNamedegeri=aramaKutusu.getAttribute("name");

        if(expectedNameDegeri.equals(actualtagName)){
            System.out.println("Name attribute testi PASSED");
        }else{
            System.out.println("Name attribute testi FAILED");
        }
        System.out.println("konum"+aramaKutusu.getLocation());

        driver.close();
        /*
        webElwmwntIsmi.getTagName()--> daha once locate ettigimiz bir webelementin tagname ni dondurur
        webElementIsmi.getAttribute(attributeIsmi)-->daha once locate ettigimiz
             bir webelementin istedigim attribute nun degerini dondurur
         */


    }
}
