package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //maxsimize iken boyutlari alalim
        System.out.println("maximize konum: " + driver.manage().window().getPosition());
        System.out.println("maximize konum: " + driver.manage().window().getSize());

        //fullscreen boyutlari alalim
        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum: " + driver.manage().window().getPosition());
        System.out.println("fullscreen konum: " + driver.manage().window().getSize());



    }
}
