package in.at.testannotation;

import in.at.testannotation.Commands;
import in.at.testannotation.Models;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.util.List;

public class PragmaticModels {
    WebDriver driver;
    Screen screen = new Screen();

    public PragmaticModels(WebDriver driver) {
        this.driver = driver;
    }

    public void Pragmatic() throws InterruptedException, FindFailed {
        Commands commands = new Commands(driver);
        Models models = new Models(driver);
        models.GoToCasino("PRAGMATIC PLAY");

        models.Scroll();
        Actions actions = new Actions(driver);
        String Balance = driver.findElements((By.cssSelector("#wallet>ul>li>span"))).get(0).getText();
        System.out.println(Balance);
        List<WebElement> count = driver.findElements(By.cssSelector(".games-name"));
        System.out.println(count.size()); //game count

        for (int i = 23; i <= count.size() + 2; i++) {
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
                int GameNumber = i - 2;
                System.out.println("GameNumber  " + GameNumber);
                Models modelsGame = new Models(driver);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_1.png", Num, 24165, GameName);
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_2.png", Num, 24026, GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_3.png", Num, 23806, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_4.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_125.png", Num, 24503, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_126.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_5.png", Num, 24090, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_6.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_7.png", Num, 12243, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_8.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_10.png", Num, 22454, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_11.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_12.png", Num, 5580, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_13.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_14.png", Num, 15690, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_15.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_16.png", Num, 17863, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_18.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_19.png", Num, 18388, GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_20.png", Num, 14862, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_96.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_22.png", Num, 22610, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_23.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_24.png", Num, 22148, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_25.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_26.png", Num, 16813, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_27.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_28.png", Num, 18912, GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_29.png", Num, 21805, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_30.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_31.png", Num, 20248, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_32.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_33.png", Num, 18633, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_34.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_35.png", Num, 20107, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_36.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_37.png", Num, 15903, GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_38.png", Num, 19655, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_39.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_40.png", Num, 21704, GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_41.png", Num, 22852, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_42.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_45.png", Num, 16657, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_46.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_47.png", Num, 23527, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_48.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_49.png", Num, 23466, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_50.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_51.png", Num, 22810, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_52.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_53.png", Num, 22371, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_54.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_55.png", Num, 23287, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_56.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_57.png", Num, 20036, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_58.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_59.png", Num, 22099, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_60.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_61.png", Num, 21703, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_62.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_63.png", Num, 21612, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_97.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_65.png", Num, 21481, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_66.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_67.png", Num, 21092, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_68.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_69.png", Num, 20641, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_70.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_71.png", Num, 20599, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_72.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_73.png", Num, 20164, GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_74.png", Num, 20167, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_75.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_76.png", Num, 19992, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_77.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_78.png", Num, 19871, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_79.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_80.png", Num, 19465, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_81.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_82.png", Num, 19147, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_83.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_84.png", Num, 19014, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_85.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_86.png", Num, 11291, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_87.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_88.png", Num, 10281, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_89.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_90.png", Num, 10068, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_91.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_92.png", Num, 9722, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_93.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_94.png", Num, 8150, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_95.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_98.png", Num, 7315, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_99.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_100.png", Num, 9454, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_101.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_102.png", Num, 9626, GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_103.png", Num, 8680, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_104.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_105.png", Num, 6583, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_106.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_107.png", Num, 9274, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_108.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_109.png", Num, 9119, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_110.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_111.png", Num, 9017, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_112.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_113.png", Num, 8976, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_114.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_115.png", Num, 8922, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_116.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_117.png", Num, 8831, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_118.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_119.png", Num, 8582, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_120.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_121.png", Num, 8261, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_122.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_123.png", Num, 8086, GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_127.png", Num, 8018, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_128.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_129.png", Num, 7787, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_130.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_131.png", Num, 6885, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_132.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_133.png", Num, 6667, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_134.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_135.png", Num, 7664, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_136.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_137.png", Num, 7662, GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_138.png", Num, 7612, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_139.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_140.png", Num, 7251, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_141.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_142.png", Num, 7489, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_143.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_144.png", Num, 6988, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_145.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_146.png", Num, 6986, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_147.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_148.png", Num, 6611, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_149.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_150.png", Num, 8593, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_151.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_152.png", Num, 6532, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_153.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_154.png", Num, 6501, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_155.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_156.png", Num, 6240, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_157.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_158.png", Num, 6083, GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_159.png", Num, 6085, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_160.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_161.png", Num, 5311, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_162.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_163.png", Num, 5643, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_164.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_165.png", Num, 5598, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_166.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_167.png", Num, 5492, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_168.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_169.png", Num, 3068, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_170.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_171.png", Num, 5351, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_172.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_173.png", Num, 4571, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_174.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_175.png", Num, 5060, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_176.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_177.png", Num, 4988, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_178.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_179.png", Num, 4891, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_180.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_181.png", Num, 3192, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_182.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_183.png", Num, 4164, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_184.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_185.png", Num, 2765, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_186.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_187.png", Num, 3072, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_188.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_189.png", Num, 2881, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_190.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_191.png", Num, 2852, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_192.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_193.png", Num, 1922, GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_194.png", Num, 3226, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_195.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_196.png", Num, 7616, GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_197.png", Num, 10345, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_198.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_199.png", Num, 10430, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_200.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_201.png", Num, 10810, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_202.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_203.png", Num, 11647, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_204.png");
                modelsGame.GameImformWhenPath_3("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_205.png", Num, 11707, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_206.png","C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_207.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_208.png", Num, 11788, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_209.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_210.png", Num, 11972, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_211.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_212.png", Num, 12128, GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_213.png", Num, 12167, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_214.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_215.png", Num, 12725, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_216.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_217.png", Num, 5117, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_218.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_219.png", Num, 13128, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_220.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_221.png", Num, 13257, GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_222.png", Num, 13646, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_223.png");
                if(Num==13679)
                {
                    commands.Click(StaticWebElements.Slote_X_icon);
                }
                if(Num==13681)
                {
                    commands.Click(StaticWebElements.Slote_X_icon);
                }
                if(Num==13683)
                {
                    commands.Click(StaticWebElements.Slote_X_icon);
                }
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_226.png", Num, 13753, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_227.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_228.png", Num, 14004,GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_229.png", Num, 13931, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_230.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_231.png", Num, 14183,GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_232.png", Num, 14274, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_233.png");
                if(Num==13686)
                {
                commands.Click(StaticWebElements.Slote_X_icon);
                }
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_234.png", Num, 14483, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_235.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_236.png", Num, 14641, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_237.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_238.png", Num, 14730, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_239.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_240.png", Num, 15042, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_241.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_242.png", Num, 15442, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_243.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_244.png", Num, 15592, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_245.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_246.png", Num, 15772, GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_247.png", Num, 15955, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_248.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_249.png", Num, 16560, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_250.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_251.png", Num, 16598, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_252.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_253.png", Num, 17270, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_254.png");
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_255.png", Num, 17688, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_256.png");
                modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_257.png", Num, 15644, GameName);
                modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_258.png", Num, 16155, GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\Pragmatic\\Screenshot_259.png");

            }
            catch (FindFailed e) {
                System.out.println(GameName+" - -  "+driver.getCurrentUrl());
                driver.navigate().back();
            }
        }
    }
}
