package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {
        /*
        Eger testimiz sirasinda birden fazla sayfa arasinda ileri geri hareket edeceksek
driver.get() yerine driver.navigate().to() method'unu kullaniriz
ve sonrasinda forward(), back() veya refresh() method'larini kullanabiliriz
         */


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        // facebook a gidelim
        driver.navigate().to("https://www.faceboook.com");
        Thread.sleep(2000);

        // amazona geri don
        driver.navigate().back();
        Thread.sleep(2000);

        // facebook geri don
        driver.navigate().forward();
        Thread.sleep(2000);

        //refresh
        driver.navigate().refresh();
        Thread.sleep(2000);




    }
}
