package calismalarim.amazonsSorusu.amazonSorusu.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class googleGitAmazon {
    public static void main(String[] args) {
        //google a git amazona gir
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com");
        WebElement SearchBox=driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
        SearchBox.sendKeys("calismalarim/amazonsSorusu/amazonSorusu/amazon" + Keys.ENTER);
        WebElement googleLinkClick=driver.findElement(By.xpath ("//*[@class='x2VHCd OSrXXb qzEoUe']"));
        googleLinkClick.click();

        WebElement amazonSearchBox=driver.findElement(By.xpath("//*[@type='text']"));
        amazonSearchBox.sendKeys("iphone"+Keys.ENTER);

        List<WebElement> searchResult=driver.findElements(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        WebElement resultsearch=searchResult.get(0);
        System.out.println(resultsearch.getText());


       WebElement amazonLinkClick=driver.findElement(By.xpath("//img[@class='s-image']"));
       amazonLinkClick.click();

    }
}
