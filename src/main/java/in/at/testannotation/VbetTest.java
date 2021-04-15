package in.at.testannotation;

import in.at.testannotation.BetConstructModels;
import in.at.testannotation.EGTModels;
import in.at.testannotation.PragmaticModels;
import in.at.testannotation.SpinoMenalModels;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.Timer;
import java.util.TimerTask;

public class VbetTest {
    WebDriver driver;

    @BeforeTest
    public  void  Setup() throws FindFailed, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\chrome\\chromedriver.exe");
        driver=new ChromeDriver();
       driver.navigate().to("https://www.vbet.com/#/");
    }
    @Test
    public void BetConstruct() throws InterruptedException, FindFailed {
        BetConstructModels row=new BetConstructModels(driver);
        row.BetConstructModel();
        }
    @Test
    public void SpinoMenal() throws InterruptedException, FindFailed
    {
        SpinoMenalModels SpinoMenal=new SpinoMenalModels(driver);
        SpinoMenal.SpinoMenal();
    }
    @Test
    public void Playson() throws InterruptedException, FindFailed
    {
        PlaySonModels Son=new PlaySonModels(driver);
        Son.PlaySon();
    }
    @Test
    public void EGT() throws InterruptedException, FindFailed
    {
       EGTModels egtModels=new EGTModels(driver);
       egtModels.EGTModels();
    }
    @Test
    public void Pragmatic() throws InterruptedException, FindFailed
    {
         PragmaticModels pragmaticModels=new PragmaticModels(driver);
         pragmaticModels.Pragmatic();
    }
    @Test
    public void PlayNgo() throws InterruptedException, FindFailed
    {
        PlaynGoModels Play=new PlaynGoModels(driver);
        Play.PLAYNGO();
    }
    @Test
    public void ONETOUCH() throws InterruptedException, FindFailed
    {
        MGAModels ONETOUCH=new MGAModels(driver);
        ONETOUCH.ONETOUCH();
    }
    @Test
    public void NOLIMITCITY() throws InterruptedException, FindFailed
    {

        MGAModels NOLIMITCITY=new MGAModels(driver);
        NOLIMITCITY.NolimitCity();
    }
    @Test
    public void NETGAMING() throws InterruptedException, FindFailed
    {
        Netgaming NetGam=new Netgaming(driver);
        NetGam.Net();
    }
    @Test
    public  void  Popok() throws InterruptedException, FindFailed {
        Commands commands=new Commands(driver);
        GoToVivaroGames();
        PopokModels popok=new PopokModels(driver);
        Thread.sleep(3000);
        commands.Click(By.linkText("POPOK GAMING"));
        popok.Popok();
    }
public  void  GoToVivaroGames() throws InterruptedException {
    //  driver.get("https://www.vbet.com/#/");
    driver.get("https://gaming.vivarobet.am/#/");
    Commands commands=new Commands(driver);

    driver.manage().window().maximize();
    Thread.sleep((2000));
    WebDriverWait wait = new WebDriverWait(driver,10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body")));
    try{
        // driver.switchTo().frame(0);
        commands.Click(By.cssSelector(".pu-button-wrap-j>div>button"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".signin-reg-buttons-b"))).findElements(By.cssSelector("ul>li"));
        driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElements(By.cssSelector("ul>li")).get(0).click();
    }
    catch (TimeoutException e){
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button")));
        WebElement elem=driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElement(By.cssSelector("ul>li>button"));
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElement(By.cssSelector("ul>li>button")).click();
    }
    catch (NoSuchFrameException e){
        driver.switchTo().defaultContent();

        commands.Click(By.cssSelector(".pu-button-wrap-j>div>button"));

        WebElement elem=driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElement(By.cssSelector("ul>li>button"));
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElement(By.cssSelector("ul>li>button")).click();
    }
    catch (NoSuchElementException e){
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button")));
        WebElement elem=driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElement(By.cssSelector("ul>li>button"));
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElement(By.cssSelector("ul>li>button")).click();
    }
    Thread.sleep((1000));
    driver.findElements((By.cssSelector(".ng-valid-maxlength"))).get(1).sendKeys("azat.yeremyan@betconstruct.com");
    driver.findElements((By.cssSelector(".ng-valid-maxlength"))).get(2).sendKeys("a12345678$");
    Thread.sleep((1500));
    commands.Click(By.cssSelector(".button-confirm"));
    Thread.sleep(4000);
    commands.Click(By.cssSelector(".leng-b"));
    commands.Click(By.cssSelector(".eng"));
  driver.get("https://gaming.vivarobet.am/#/casino/?category=all&provider=all");
}

}


