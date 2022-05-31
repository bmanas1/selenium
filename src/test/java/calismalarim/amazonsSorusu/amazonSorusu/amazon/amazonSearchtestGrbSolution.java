package calismalarim.amazonsSorusu.amazonSorusu.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class amazonSearchtestGrbSolution {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com");

       WebElement googleArmaKutusuElementi = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        googleArmaKutusuElementi.sendKeys("https://www.amazon.com" + Keys.ENTER);

        WebElement amazonLinkiElementi = driver.findElement(By.xpath("//*[@class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']"));
        amazonLinkiElementi.click();

        WebElement amazonAramaKutusuElementi = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        amazonAramaKutusuElementi.sendKeys("city bike");
        amazonAramaKutusuElementi.submit();


        List<WebElement> aramaSonucSayisi = driver.findElements(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        WebElement sonucYazisiElementi=aramaSonucSayisi.get(0);
        System.out.println(sonucYazisiElementi);

        WebElement ilkSonucElementi = driver.findElement(By.xpath("//img[@class='s-image']"));
        ilkSonucElementi.click();


    }
}
