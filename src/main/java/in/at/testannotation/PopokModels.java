package in.at.testannotation;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.util.List;

public class PopokModels
{
    WebDriver driver;
    Screen screen = new Screen();

    public PopokModels(WebDriver driver) {
        this.driver = driver;
    }
    public void Popok() throws InterruptedException, FindFailed
    {
        Commands commands = new Commands(driver);
        Models models = new Models(driver);
        models.Scroll();
        Actions actions = new Actions(driver);
        String Balance = driver.findElements((By.cssSelector("#wallet>ul>li>span"))).get(0).getText();
        System.out.println(Balance);
        List<WebElement> count = driver.findElements(By.cssSelector(".games-name"));
        System.out.println(count.size()); //game count

        for (int i = 4; i < count.size() + 4; i++) {
            String GameName = driver.findElements(By.cssSelector(".games-name")).get(i - 4).getAttribute("title");

            WebElement elem = driver.findElements((By.cssSelector(".all-casino-games-list-content>.all-games-container>a"))).get(i - 4);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
            Thread.sleep(500);
            WebElement Play = driver.findElements(By.cssSelector(".games-buttons")).get(i).findElement(By.cssSelector("strong>button"));
            //WebElement Play = driver.findElements(By.cssSelector(".all-games-container")).get(1).findElements(By.cssSelector("a")).get(i).findElement(By.cssSelector(".games-buttons>strong>button")); //play now
            Thread.sleep(1000);
            try {
                actions.click(Play).perform();
            } catch (JavascriptException NewGame) {
                System.out.println("It's New Game  " + GameName + "   " + driver.getCurrentUrl());
                commands.Click(StaticWebElements.Slote_X_icon);
                i--;
                continue;
            }
            String GetUrlNum = "";
            int Num = 0;
            Thread.sleep(2000);
            try {
                GetUrlNum = driver.getCurrentUrl().replaceAll("\\D+", "");
                Num = Integer.parseInt(GetUrlNum);
            } catch (NumberFormatException e) {
                System.out.println("Mtela format exeption------------------------------------------------");
                actions.click(Play).perform();
                GetUrlNum = driver.getCurrentUrl().replaceAll("\\D+", "");
                Num = Integer.parseInt(GetUrlNum);
            }
            try {
                int GameNumber = i - 3;
                System.out.println("GameNumber  " + GameNumber);
                Models modelsGame = new Models(driver);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Popok\\Screenshot_1.png", Num, 25232, GameName);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Popok\\Screenshot_4.png", Num, 25248, GameName);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Popok\\Screenshot_3.png", Num, 25238, GameName);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Popok\\Screenshot_2.png", Num, 25254, GameName);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Popok\\Screenshot_5.png", Num, 25244, GameName);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Popok\\Screenshot_6.png", Num, 25228, GameName);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Popok\\Screenshot_7.png", Num, 25252, GameName);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Popok\\Screenshot_8.png", Num, 25240, GameName);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Popok\\Screenshot_9.png", Num, 25234, GameName);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Popok\\Screenshot_10.png", Num, 25250, GameName);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Popok\\Screenshot_11.png", Num, 25242, GameName);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Popok\\Screenshot_12.png", Num, 25246, GameName);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Popok\\Screenshot_13.png", Num, 25258, GameName);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Popok\\Screenshot_14.png", Num, 25230, GameName);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Popok\\Screenshot_15.png", Num, 25236, GameName);

            } catch (FindFailed e) {
                System.out.println(GameName + " - -  " + driver.getCurrentUrl());
                driver.navigate().back();
            }
        }
    }
}
