package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {

        /* en ilkel hali ile bir otomasyon yapmak icin
           class imiza otomasyon icin gerekli olan web driverin yerini
           gostermemiz gerekir
           bunun icin java kutuphanesinden System.setProperty("","") methodu kullaniriz
           mthod 2 paremetre istemektedir
           ilki kullanacagimiz driver:webdriver.chrome.driver
           ikincisi ise bu driverin fiziki yolu : sag tiklayarak copypath yapilir.
         */
        System.setProperty("webDriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com"); // istedigimiz sayfaya gider
        Thread.sleep(2000);
        driver.get("http://www.facebook.com");
        Thread.sleep(2000);
        //driver.close();


        // driver.close(); // gittigimiz sayfayi kapatir

    }


}
