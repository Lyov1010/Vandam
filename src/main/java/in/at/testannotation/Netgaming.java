package in.at.testannotation;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;

import java.util.List;

public class Netgaming {
    WebDriver driver;

    public Netgaming(WebDriver driver) {
        this.driver = driver;
    }

    public void Net() throws InterruptedException, FindFailed {
        Models model = new Models(driver);
        model.GoToCasino("NETGAMING");

        model.Scroll();
        Actions actions = new Actions(driver);
        String Balance = driver.findElements((By.cssSelector("#wallet>ul>li>span"))).get(0).getText();
        System.out.println(Balance);
        List<WebElement> count = driver.findElements(By.cssSelector(".games-name"));
        System.out.println(count.size()); //game count
        for (int i = 3; i <= count.size() + 2; i++) {
            String GameName = driver.findElements(By.cssSelector(".games-name")).get(i - 3).getAttribute("title");
            WebElement elem = driver.findElements((By.cssSelector(".all-casino-games-list-content>.all-games-container>a"))).get(i - 3);
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
                //commands.Click(StaticWebElements.Slote_X_icon);
                driver.navigate().back();

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
                int GameNumber = i - 2;
                System.out.println("GameNumber  " + GameNumber);
                model.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_1.png", Num, 25575, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_2.png");
                model.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_3.png", Num, 22830, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_4.png");
                model.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_5.png", Num, 22839, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_6.png");
                model.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_7.png", Num, 22840, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_8.png");
                model.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_9.png", Num, 23798, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_10.png");
                model.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_11.png", Num, 24683, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_12.png");
                model.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_13.png", Num, 22824, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_14.png");
                model.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_15.png", Num, 22828, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_16.png");
                model.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_17.png", Num, 22818, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_18.png");
                model.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_19.png", Num, 22837, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_20.png");
                model.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_21.png", Num, 22816, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_22.png");
                model.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_23.png", Num, 22814, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_24.png");
                model.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_25.png", Num, 22820, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_26.png");
                model.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_22.png", Num, 22826, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_30.png");
                model.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_28.png", Num, 22822, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_29.png");
                model.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_30.png", Num, 22832, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Netgaming\\Screenshot_31.png");
            }catch (FindFailed e) {
                System.out.println(GameName + " - -  " + driver.getCurrentUrl());
                driver.navigate().back();
            }
        }
    }
}

