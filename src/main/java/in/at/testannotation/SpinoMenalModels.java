package in.at.testannotation;

import in.at.testannotation.Commands;
import in.at.testannotation.Models;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.util.List;

public class SpinoMenalModels {
    WebDriver driver;
    Screen screen = new Screen();

    public SpinoMenalModels(WebDriver driver) {
        this.driver = driver;
    }
    public void SpinoMenal() throws InterruptedException, FindFailed {
        Commands commands = new Commands(driver);
        Models models = new Models(driver);
        models.GoToCasino("SPINOMENAL");

        models.Scroll();
        Actions actions = new Actions(driver);
        String Balance = driver.findElements((By.cssSelector("#wallet>ul>li>span"))).get(0).getText();
        System.out.println(Balance);
        List<WebElement> count = driver.findElements(By.cssSelector(".games-name"));
        System.out.println(count.size()); //game count

        for (int i =3; i <= count.size() + 2; i++) {
            String GameName = driver.findElements(By.cssSelector(".games-name")).get(i-3).getAttribute("title");
            WebElement elem = driver.findElements((By.cssSelector(".all-casino-games-list-content>.all-games-container>a"))).get(i-3);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
            Thread.sleep(500);
            WebElement Play=driver.findElements(By.cssSelector(".games-buttons")).get(i).findElement(By.cssSelector("strong>button"));
            //WebElement Play = driver.findElements(By.cssSelector(".all-games-container")).get(1).findElements(By.cssSelector("a")).get(i).findElement(By.cssSelector(".games-buttons>strong>button")); //play now
            Thread.sleep(1000);
            try {
                actions.click(Play).perform();
            }catch (JavascriptException NewGame){
                System.out.println("It's New Game  "+GameName+"   "+driver.getCurrentUrl());
                commands.Click(StaticWebElements.Slote_X_icon);

                i--;
                continue;
            }
            String GetUrlNum="";
            int Num = 0;
            Thread.sleep(2000);
            try{
                 GetUrlNum = driver.getCurrentUrl().replaceAll("\\D+", "");
                  Num = Integer.parseInt(GetUrlNum);
            }catch (NumberFormatException e)
            {
                System.out.println("Mtela format exeption------------------------------------------------");
                actions.click(Play).perform();
                GetUrlNum = driver.getCurrentUrl().replaceAll("\\D+", "");
                Num = Integer.parseInt(GetUrlNum);
            }
                try
                {
                    int GameNumber=i-2;
                    System.out.println("GameNumber  "+GameNumber);
                    Models modelsGame=new Models(driver);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_188.png",Num,24141,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_1000.png",Num,24519,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_261.png",Num,24412,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_262.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_333.png",Num,24536,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_444.png");

                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\01.png",Num,23447,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\02.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\aa.png",Num,23526,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\aaa.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\006.png",Num,24021,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\007.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\04.png",Num,20130,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\05.png",Num,22406,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\06.png",Num,23286,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\07.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\9.png",Num,23261,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\10.png",Num,23061,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\11.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\13.png",Num,23056,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\14.png",Num,23022,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\15.png",Num,22700,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\16.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\17.png",Num,22688,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\18.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\19.png",Num,22542,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\20.png",Num,22540,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\21.png",Num,22501,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\22.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\23.png",Num,8835,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\24.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\25.png",Num,22156,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\26.png",Num,22054,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\27.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\28.png",Num,21919,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\29.png",Num,21691,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\30.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\31.png",Num,21599,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\32.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\666.png",Num,21521,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\34.png",Num,21391,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\35.png",Num,21175,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\36.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\37.png",Num,20937,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\38.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\39.png",Num,20856,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\40.png",Num,20629,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\41.png",Num,20570,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\42.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\43.png",Num,20129,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\44.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\45.png",Num,20088,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\46.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\47.png",Num,18887,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\48.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\49.png",Num,20032,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\50.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\51.png",Num,19963,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\52.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\53.png",Num,19854,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\54.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\55.png",Num,19682,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\56.png",Num,19560,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\57.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\58.png",Num,19483,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\60.png",Num,19187,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\59.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\61.png",Num,19003,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\62.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\63.png",Num,18617,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\64.png",Num,18506,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_1.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_3.png",Num,18206,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_2.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_4.png",Num,18029,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_5.png",Num,17845,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_6.png",Num,17804,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_7.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_8.png",Num,10198,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_9.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_10.png",Num,10046,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_11.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_12.png",Num,9706,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_13.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_14.png",Num,9704,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_15.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_16.png",Num,9740,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_17.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_18.png",Num,9657,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_19.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_20.png",Num,9659,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_21.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_22.png",Num,7678,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_23.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_24.png",Num,6773,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_25.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_26.png",Num,8072,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_27.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_28.png",Num,6807,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_29.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_30.png",Num,7571,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_31.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_32.png",Num,8586,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_33.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_34.png",Num,9268,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_35.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_36.png",Num,8720,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_37.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_38.png",Num,8970,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_39.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_40.png",Num,8520,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_41.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_113.png",Num,6819,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_43.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_44.png",Num,6746,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_45.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_46.png",Num,6742,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_47.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_987.png",Num,6761,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_49.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_50.png",Num,8004,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_51.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_52.png",Num,6799,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_53.png",Num,6755,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_54.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_55.png",Num,7272,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_56.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_57.png",Num,6801,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_58.png",Num,6785,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_59.png",Num,6855,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_102.png",Num,6863,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_103.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_60.png",Num,8277,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_61.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_62.png",Num,6877,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_63.png",Num,6809,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_64.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_65.png",Num,6859,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_66.png",Num,6861,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_67.png",Num,6851,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_68.png",Num,7275,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_69.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_70.png",Num,6717,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_73.png",Num,6714,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_71.png",Num,6811,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_72.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_74.png",Num,6750,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_75.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_76.png",Num,6740,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_77.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_78.png",Num,6766,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_79.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_80.png",Num,6712,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_81.png",Num,6768,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_82.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_83.png",Num,6823,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_84.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_85.png",Num,6803,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_86.png",Num,6849,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_87.png",Num,6881,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_88.png",Num,6771,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_89.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_90.png",Num,6879,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_91.png",Num,6847,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_92.png",Num,6845,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_93.png",Num,6821,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_94.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_95.png",Num,6843,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_96.png",Num,6706,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_97.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_98.png",Num,6728,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_99.png",Num,6764,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_100.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_101.png",Num,6725,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_106.png",Num,6797,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_107.png",Num,6795,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_108.png",Num,6723,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_109.png",Num,6759,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_110.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_111.png",Num,6857,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_112.png",Num,6875,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_113.png",Num,6873,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_114.png",Num,6757,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_115.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_116.png",Num,6841,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_117.png",Num,6871,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_118.png",Num,6721,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_119.png",Num,6719,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_120.png",Num,6753,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_121.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_122.png",Num,6869,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_123.png",Num,6704,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_124.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_125.png",Num,6853,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_126.png",Num,6839,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_126.png",Num,6794,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_126.png",Num,6837,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_800.png",Num,6867,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_126.png",Num,6716,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_126.png",Num,6791,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_127.png",Num,6774,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_128.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_126.png",Num,6835,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_126.png",Num,6833,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_126.png",Num,6831,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_129.png",Num,6781,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_130.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_999.png",Num,6865,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_131.png",Num,6780,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_132.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_133.png",Num,6815,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_134.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_135.png",Num,6748,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_136.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_800.png",Num,6710,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_800.png",Num,6829,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_800.png",Num,6827,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_800.png",Num,6708,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_137.png",Num,6744,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_138.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_139.png",Num,6813,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_140.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_800.png",Num,6790,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_800.png",Num,6787,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_141.png",Num,6737,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_142.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_143.png",Num,6825,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_144.png",Num,6735,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_145.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_143.png",Num,6784,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_146.png",Num,6730,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_147.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_148.png",Num,9452,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_149.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_150.png",Num,10283,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_151.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_152.png",Num,10315,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_153.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_154.png",Num,10361,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_155.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_157.png",Num,10448,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_158.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_159.png",Num,10684,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_160.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_161.png",Num,11272,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_162.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_163.png",Num,11503,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_164.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_167.png",Num,11505,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_179.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_180.png",Num,11515,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_181.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_169.png",Num,11693,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_186.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_171.png",Num,11952,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_187.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_189.png",Num,12134,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_190.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_184.png",Num,12218,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_185.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_182.png",Num,12221,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_183.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_191.png",Num,12844,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_192.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_193.png",Num,13239,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_194.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_197.png",Num,14000,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_198.png",Num,14140,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_199.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_200.png",Num,14245,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_201.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_202.png",Num,14468,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_203.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_204.png",Num,14571,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_205.png",Num,14748,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_206.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_207.png",Num,14875,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_208.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_209.png",Num,14965,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_210.png",Num,15115,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_211.png",Num,15357,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_212.png",Num,15612,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_213.png",Num,15768,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_214.png",Num,15923,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_215.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_218.png",Num,16608,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_219.png",Num,13186,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_220.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_221.png",Num,13413,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_222.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_225.png",Num,14049,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_226.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_227.png",Num,14174,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_228.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_229.png",Num,14407,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_230.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_231.png",Num,14504,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_232.png",Num,14653,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_233.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_234.png",Num,14873,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_235.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_236.png",Num,14925,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_237.png",Num,15021,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_238.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_239.png",Num,14968,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_240.png",Num,15008,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_241.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_242.png",Num,15678,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_243.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_244.png",Num,15778,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_245.png",Num,16162,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_246.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_247.png",Num,16592,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_248.png",Num,17139,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_249.png");
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_250.png",Num,17272,GameName);
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_251.png",Num,17615,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_252.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_256.png",Num,13903,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_257.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_254.png",Num,13676,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_255.png");
                    modelsGame.GameImformWhenPath_2("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_258.png",Num,16568,GameName,"C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\SPINOMENAL_img\\Screenshot_259.png");

                }
                catch (FindFailed e) {
                    System.out.println(GameName+" - -  "+driver.getCurrentUrl());
                    driver.navigate().back();
                }
                }
           }
        }
