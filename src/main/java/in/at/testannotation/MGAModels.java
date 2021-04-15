package in.at.testannotation;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.util.List;

public class MGAModels {
    WebDriver driver;
    Screen screen = new Screen();

    public MGAModels(WebDriver driver) {
        this.driver = driver;
    }
    public void MGA() throws InterruptedException {
        Models models = new Models(driver);
        models.GoToCasino("MGA");

        models.Scroll();
        Actions actions = new Actions(driver);
        String Balance = driver.findElements((By.cssSelector("#wallet>ul>li>span"))).get(0).getText();
        System.out.println(Balance);
        List<WebElement> count = driver.findElements(By.cssSelector(".games-name"));
        System.out.println(count.size()); //game count
        for (int i = 0; i <= count.size() - 1; i++) {
            String GameName = driver.findElements(By.cssSelector(".games-name")).get(i).getAttribute("title");
            WebElement elem = driver.findElements((By.cssSelector(".all-casino-games-list-content>.all-games-container>a"))).get(i);
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
                //  commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
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
                int GameNumber = i + 1;
                System.out.println("GameNumber  " + GameNumber);
                models.GameImformWhenPath_3("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_1.png", Num, 13143, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_2.png", "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_3.png");
                models.GameImformWhenPath_3("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_4.png", Num, 13145, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_19.png", "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_5.png");
                models.GameImformWhenPath_3("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_6.png", Num, 13148, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_7.png", "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_8.png");
                models.GameImformWhenPath_3("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_9.png", Num, 13149, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_10.png", "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_11.png");
                models.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_12.png", Num, 13151, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_13.png");
                models.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_14.png", Num, 13153, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_15.png");
                models.GameImformWhenPath_3("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_16.png", Num, 13155, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_17.png", "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\MGA\\Screenshot_18.png");

            } catch (FindFailed e) {
                System.out.println(GameName + " - -  " + driver.getCurrentUrl());
                driver.navigate().back();
            }
        }
    }
    public void NolimitCity() throws InterruptedException, FindFailed {

        Models models = new Models(driver);
        models.GoToCasino("NOLIMITCITY");

        models.Scroll();
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
                Commands modelsGame = new Commands(driver);
                //Models models = new Models(driver);
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_1.png", Num, 24784, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_2.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_3.png", Num, 24163, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_4.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_5.png", Num, 23452, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_6.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_7.png", Num, 22990, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_8.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_9.png", Num, 21951, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_10.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_11.png", Num, 20176, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_12.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_13.png", Num, 21577, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_14.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_15.png", Num, 20635, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_16.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_17.png", Num, 15858, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_18.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_19.png", Num, 20027, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_20.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_21.png", Num, 15106, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_22.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_23.png", Num, 15089, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_24.png");

                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_25.png", Num, 15086, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_26.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_27.png", Num, 15075, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_28.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_29.png", Num, 15079, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_30.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_31.png", Num, 15100, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_32.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_33.png", Num, 15104, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_34.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_35.png", Num, 15112, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_36.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_37.png", Num, 15083, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_38.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_39.png", Num, 15114, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_40.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_41.png", Num, 19440, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_42.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_43.png", Num, 15088, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_44.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_45.png", Num, 14412, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_46.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_47.png", Num, 15095, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_48.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_49.png", Num, 15091, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_50.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_51.png", Num, 15081, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_52.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_53.png", Num, 17317, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_54.png");

                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_70.png", Num, 16606, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_71.png");

                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_55.png", Num, 15093, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_56.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_57.png", Num, 15077, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_58.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_59.png", Num, 18025, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_60.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_61.png", Num, 15110, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_62.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_63.png", Num, 15101, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_64.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_65.png", Num, 15098, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_66.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_67.png", Num, 18986, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_68.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_69.png", Num, 15098, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_70.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_71.png", Num, 18986, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_72.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_73.png", Num, 15108, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_74.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_75.png", Num, 16399, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_76.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_77.png", Num, 15860, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_78.png");
                models.GameImformWhenPath_2ForNolim("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_79.png", Num, 19585, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\NOLIMITCITY\\Screenshot_80.png");
            } catch (FindFailed e) {
                System.out.println(GameName + " - -  " + driver.getCurrentUrl());
                driver.navigate().back();
            } catch (NullPointerException ee) {
                System.out.println(GameName + " - -  " + driver.getCurrentUrl());
                //commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                driver.navigate().back();
            }
        }
    }
    public void ONETOUCH() throws InterruptedException {
        Models models = new Models(driver);
        models.GoToCasino("ONETOUCH");
Commands commands=new Commands(driver);
        models.Scroll();
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
                Commands modelsGame = new Commands(driver);
               // Models models=new Models(driver);
                models.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_1.png", Num, 21532, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_2.png");
                models.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_3.png", Num, 24782, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_4.png");
                models.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_5.png", Num, 22238, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_6.png");
                models.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_7.png", Num, 21156, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_8.png");
                models.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_100.png", Num, 20687, GameName);
                models.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_10.png", Num, 20126, GameName);
                if (Num == 8949) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                if (Num == 8951) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                if (Num == 8953) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                if (Num == 8956) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                if (Num == 8959) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                if (Num == 9013) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                if (Num == 9015) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                if (Num == 10615) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                if (Num == 13661) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                if (Num == 13665) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                if (Num == 13901) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                if (Num == 17265) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                if (Num == 17266) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                if (Num == 13667) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                if (Num == 17740) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                if (Num == 17743) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                if (Num == 17734) {
                    commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
                }
                models.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_11.png", Num, 10762, GameName);
                models.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_22.png", Num, 17738, GameName);
                models.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_12.png", Num, 13663, GameName);
                models.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_13.png", Num, 13669, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_14.png");
                models.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_15.png", Num, 13671, GameName);
                models.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_16.png", Num, 14051, GameName);
                models.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_17.png", Num, 14372, GameName);
                models.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_18.png", Num, 14376, GameName);
                models.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_19.png", Num, 16611, GameName);
                // commands.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_20.png", Num, 17734, GameName);
                models.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_21.png", Num, 17737, GameName);
                models.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_23.png", Num, 17892, GameName, "C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\ONETOUCH\\Screenshot_24.png");
            } catch (FindFailed e) {
                System.out.println(GameName + " - -  " + driver.getCurrentUrl());
                commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
            } catch (NullPointerException ee) {
                System.out.println(GameName + " - -  " + driver.getCurrentUrl());
                driver.navigate().back();
                //commands.Click(By.cssSelector(".big-game-control>.icon-delete"));
            }
        }
    }

}
