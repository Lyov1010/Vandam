package in.at.testannotation;

import in.at.testannotation.Commands;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.text.DecimalFormat;
import java.util.NoSuchElementException;

public class Models
{
    WebDriver driver;
    public Models(WebDriver driver)
    {
        this.driver = driver;
    }
    public  void  GoToCasino(String ProviderLinkText) throws InterruptedException {
    driver.get("https://www.vbet.com/#/");
    driver.manage().window().maximize();
    Commands commands=new Commands(driver);
    Thread.sleep((2000));
    WebDriverWait wait = new WebDriverWait(driver,2);
    try{
        driver.switchTo().frame(0);
        commands.Click(By.cssSelector(".pop-con-close"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".signin-reg-buttons-b"))).findElements(By.cssSelector("ul>li"));
        driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElements(By.cssSelector("ul>li")).get(0).click();
    }
    catch (TimeoutException e){
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElement(By.cssSelector("ul>li>button")).click();
    }
    catch (NoSuchElementException e){
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElement(By.cssSelector("ul>li>button")).click();
    }
    Thread.sleep((1000));
    driver.findElements((By.cssSelector(".ng-valid-maxlength"))).get(1).sendKeys("lyov@mailinator.com");
    driver.findElements((By.cssSelector(".ng-valid-maxlength"))).get(2).sendKeys("Lyov1010");
    Thread.sleep((1500));
    commands.Click(By.cssSelector(".button-confirm"));
    try{
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe")));
        //driver.switchTo().frame(0);
        Thread.sleep(500);
        commands.Click(By.cssSelector(".pop-con-close"));
        commands.IndexClick(By.cssSelector(".top-menu-sub-a-t"),5); //casino

    }catch ( NoSuchElementException c){
        driver.switchTo().defaultContent();
        commands.IndexClick(By.cssSelector(".top-menu-sub-a-t"),5);//casino
    }
    catch ( TimeoutException c){
        driver.switchTo().defaultContent();
        commands.IndexClick(By.cssSelector(".top-menu-sub-a-t"),5);//casino
    }
       //driver.get("https://www.vbet.com/#/casino/?category=all&provider=all");
        Thread.sleep((1500));
        WebElement element = driver.findElement(By.cssSelector(".games-providers"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(700);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)");
        Thread.sleep(300);
        commands.Click(By.linkText(ProviderLinkText));
        Thread.sleep(1000);
}
public  void  Scroll() throws InterruptedException {
        Actions actions=new Actions(driver);
    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
    Thread.sleep(1000);
    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2000)");
    Thread.sleep(1000);
    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,4000)");
    Thread.sleep(1000);
    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,6000)");
    Thread.sleep(1000);
    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,8000)");
    Thread.sleep(1000);
    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,10000)");
    Thread.sleep(1000);
    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,12000)");
    Thread.sleep(1000);
    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,14000)");
    Thread.sleep(1000);
    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,16000)");
    ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    WebElement element = driver.findElement(By.cssSelector(".logo-nav-wrapper"));
    actions.moveToElement(element);
    actions.perform();
}
    public  void  GameImform(String path,int Num,int GameManual,String GameName) throws FindFailed, InterruptedException
    {
        Commands commands=new Commands(driver);
        Screen screen=new Screen();
        if (Num == GameManual)//QUEEN_MYSTIC_RELICS
        {
            try{
                Runnable runnable = () -> System.out.println("My Runnable started!");
                WebDriverWait wait = new WebDriverWait(driver,15);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                System.out.println(GameName);

                    Thread.sleep(1);
                    screen.wait(path,30);
                    screen.click();
                System.out.println("------------------------------------");
                commands.Click(StaticWebElements.Slote_X_icon);
            }catch (TimeoutException e){
                System.out.println(GameName);
                screen.wait(path,20);

                    screen.click();
                //Thread.sleep(5000);
                commands.Click(StaticWebElements.Slote_X_icon);
            }
        }
    }
    public  void  GameImformWhenPath_2(String path,int Num,int GameManual,String GameName,String path2) throws FindFailed, InterruptedException {
        Commands commands = new Commands(driver);
        Screen screen = new Screen();
        if (Num == GameManual) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                screen.wait(path, 15);
                screen.click();
                screen.wait(path2, 15);
                screen.click();
                commands.Click(StaticWebElements.Slote_X_icon);
                System.out.println(GameName);
            } catch (TimeoutException e) {
                screen.wait(path, 15);
                screen.click();
                }
                screen.wait(path2, 15);
                screen.click();
                Thread.sleep(500);
                commands.Click(StaticWebElements.Slote_X_icon);
                System.out.println(GameName);

            }

        }


    public  void  GameImformWhenPath_3(String path,int Num,int GameManual,String GameName,String path2,String path3) throws FindFailed, InterruptedException {
        Commands commands = new Commands(driver);
        Screen screen = new Screen();
        if (Num == GameManual) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                screen.wait(path, 30);
                screen.click();
                screen.wait(path2, 30);
                screen.click();
                screen.wait(path3, 30);
                screen.click();
                commands.Click(StaticWebElements.Slote_X_icon);
                System.out.println(GameName);
            } catch (TimeoutException e) {
                screen.wait(path, 30);
                screen.click();
                screen.wait(path2, 30);
                screen.click();
                screen.wait(path3, 30);
                screen.click();
                Thread.sleep(500);
                commands.Click(StaticWebElements.Slote_X_icon);
                System.out.println(GameName);
            }
        }
    }
    public  void  GameImformWhenPath_2ForNolim(String path,int Num,int GameManual,String GameName,String path2) throws FindFailed, InterruptedException {
        Commands commands = new Commands(driver);
        Screen screen = new Screen();
        if (Num == GameManual) {
            try {
//                WebDriverWait wait = new WebDriverWait(driver, 10);
//                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                screen.wait(path, 30);
                Thread.sleep(7000);
                screen.click();
                screen.wait(path2, 30);
                screen.click();
                commands.Click(StaticWebElements.Slote_X_icon);
                System.out.println(GameName);
            } catch (TimeoutException e) {
                screen.wait(path, 30);
                Thread.sleep(7000);
                screen.click();
                screen.wait(path2, 30);
                screen.click();
                Thread.sleep(500);
                commands.Click(StaticWebElements.Slote_X_icon);
                System.out.println(GameName);
            }

        }
    }

}
