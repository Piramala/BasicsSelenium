import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EbaySearch {
    WebDriver driver;
    @BeforeTest
    public void initBrowser()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void basicsSearch()
    {
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("mobile pnone");
        driver.findElement(By.xpath("//input[@id=\"gh-btn\"]")).click();
    }
    @AfterTest
    public void quiteBrowser()
    {
        driver.quit();
    }
}
