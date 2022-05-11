package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {
    // amazon sitesine gidip kaynak kodlarinda "spend" yazdigini test ediniz
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        String sayfaKaynakKodlari =driver.getPageSource();
        String arananKelime="spend";
        if (sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("kaynak kod ted passed");

        }else{
            System.out.println("Kaynak kodlarinda " + arananKelime +" yok, test FAILED");
        }
driver.close();
    }
}
