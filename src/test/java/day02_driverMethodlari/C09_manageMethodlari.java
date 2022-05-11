package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://amaazon.com");
        /*
        ileride wait konusunu daha genis elealacagiz
        bir sayfa acilirken ilk basta sayfanin icerisinde bulunanan
        elementlere gore bir yuklenme suresine ihtiyac vardir
        veya bir web elementinin kullanilmasi icin zamana ihtiyac olabilir
        implicitlyWait(Duration.ofSeconds(15)); bize sayfanin yuklenmesi ve
        sayfadaki elementlere ulasilmasi icin beklenecek maksimum sureyi belirleme olanagi tanir

         */
        Thread.sleep(15000);
        driver.close();
    }
}
