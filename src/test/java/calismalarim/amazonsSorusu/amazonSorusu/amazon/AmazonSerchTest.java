package calismalarim.amazonsSorusu.amazonSorusu.amazon;

import com.sun.tools.javac.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AmazonSerchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // google a git amazon yaz ve arat
        driver.get("https://www.google.com");
        WebElement googleArmaKutusuElementi = driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"));
        googleArmaKutusuElementi.sendKeys("https://www.amazon.com" + Keys.ENTER);

        // a amazonsayfasina click
        WebElement amazonLinkiElementi = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/div/a"));
        amazonLinkiElementi.click();

       // search"city bike"
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("city bike"+ Keys.ENTER);

        //c Amazonda goruntulenen ilgili sonuclarin sayisini yazdirin
       List<WebElement> aramaSonucSayisi = driver.findElements(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        WebElement istenilenSonucSayisi = aramaSonucSayisi.get(0);
        System.out.println(istenilenSonucSayisi.getText());



        // karsimiza cikan ilk sonucun resmine tikla
        WebElement ilkSonucElementi = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
        ilkSonucElementi.click();




    }
}
