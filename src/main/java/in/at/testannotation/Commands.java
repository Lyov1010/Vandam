package in.at.testannotation;

import com.lowagie.text.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commands
{
    WebDriver driver;
    public  Commands (WebDriver driver){
        this.driver=driver;
    }
    public void Click(By by) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Thread.sleep(500);
        driver.findElement(by).click();
    }
    public void IndexClick(By by,int index) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Thread.sleep(500);
        driver.findElements(by).get(index).click();
    }
}
