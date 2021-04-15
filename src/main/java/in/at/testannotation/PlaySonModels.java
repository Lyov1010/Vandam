package in.at.testannotation;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.util.List;

public class PlaySonModels
{
    WebDriver driver;
    Screen screen = new Screen();

    public PlaySonModels(WebDriver driver) {
        this.driver = driver;
    }
    public void PlaySon() throws InterruptedException, FindFailed {
        Models model = new Models(driver);
        model.GoToCasino("PLAYSON");

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
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_1.png", Num, 25499, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_1.png", Num, 25442, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_1.png", Num, 22624, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_10.png", Num, 24656, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_1.png", Num, 24395, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_1.png", Num, 24173, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_1.png", Num, 19463, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_1.png", Num, 10376, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_5.png", Num, 16735, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_6.png", Num, 21708, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_1.png", Num, 18036, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_1.png", Num, 9577, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_1.png", Num, 11826, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_1.png", Num, 13757, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_7.png", Num, 14368, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_1.png", Num, 20168, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_8.png", Num, 20108, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_9.png", Num, 14479, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_11.png", Num, 9264, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_12.png", Num, 9684, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_6.png", Num, 8248, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_13.png", Num, 12961, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_14.png", Num, 22398, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_15.png", Num, 21484, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_16.png", Num, 21119, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_17.png", Num, 19881, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_18.png", Num, 18909, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_19.png", Num, 10188, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_20.png", Num, 9945, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_21.png", Num, 9772, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_22.png", Num, 9038, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_23.png", Num, 9126, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_4.png", Num, 7487, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_24.png", Num, 8589, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_25.png", Num, 8439, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_26.png", Num, 8906, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_27.png", Num, 8698, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_28.png", Num, 8074, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_29.png", Num, 6639, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_30.png", Num, 2301, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_31.png", Num, 2298, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_32.png", Num, 2296, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_33.png", Num, 8836, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_34.png", Num, 8998, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_35.png", Num, 2294, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_36.png", Num, 2289, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_37.png", Num, 7602, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_38.png", Num, 2287, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_39.png", Num, 6894, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_40.png", Num, 8941, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_51.png", Num, 2285, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_42.png", Num, 6565, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_43.png", Num, 2282, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_44.png", Num, 7278, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_45.png", Num, 7689, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_46.png", Num, 3989, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_47.png", Num, 10015, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_48.png", Num, 10313, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_49.png", Num, 10555, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_50.png", Num, 10814, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_52.png", Num, 11511, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_53.png", Num, 11639, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_54.png", Num, 11674, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_55.png", Num, 12021, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_56.png", Num, 12317, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_57.png", Num, 13197, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_58.png", Num, 14010, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_59.png", Num, 14020, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_60.png", Num, 14035, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_61.png", Num, 14851, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_62.png", Num, 14955, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_63.png", Num, 15444, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_64.png", Num, 15964, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_65.png", Num, 17497, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_67.png", Num, 25683, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_68.png", Num, 14013, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_69.png", Num, 14017, GameName);
                model.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Playson\\Screenshot_70.png", Num, 14018, GameName);

            } catch (FindFailed e) {
                System.out.println(GameName + " - -  " + driver.getCurrentUrl());
                driver.navigate().back();
            }
        }
    }
}
