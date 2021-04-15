package in.at.testannotation;
import in.at.testannotation.Commands;
  import org.openqa.selenium.*;
  import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
  import org.sikuli.script.Screen;
import java.util.List;

  public class EGTModels {
        WebDriver driver;
        Screen screen = new Screen();

        public EGTModels(WebDriver driver) {
            this.driver = driver;
        }
        public void EGTModels() throws InterruptedException, FindFailed {
            Commands commands = new Commands(driver);
            Models models = new Models(driver);
            models.GoToCasino("EGT");

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
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_1.png",Num,3336,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_2.png",Num,24037,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_3.png",Num,3344,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_4.png",Num,6575,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_5.png",Num,3354,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_6.png",Num,11649,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_7.png",Num,3335,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_8.png",Num,7188,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_9.png",Num,6470,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_10.png",Num,3345,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_11.png",Num,10385,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_12.png",Num,10081,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_13.png",Num,9941,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_14.png",Num,7312,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_15.png",Num,6069,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_16.png",Num,3595,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_17.png",Num,14666,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_18.png",Num,3342,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_19.png",Num,3355,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_20.png",Num,6660,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_21.png",Num,3607,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_22.png",Num,20266,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_23.png",Num,23075,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_24.png",Num,22447,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_25.png",Num,21725,GameName);
                    if(Num==21390){
                        driver.navigate().back();
                    }
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_27.png",Num,21124,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_28.png",Num,19865,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_29.png",Num,19449,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_30.png",Num,17773,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_31.png",Num,18595,GameName);
                    if (Num==9944){
                        driver.navigate().back();
                    }
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_33.png",Num,3341,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_34.png",Num,2969,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_35.png",Num,8980,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_36.png",Num,3339,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_37.png",Num,3577,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_38.png",Num,8670,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_39.png",Num,8253,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_40.png",Num,8100,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_41.png",Num,7695,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_42.png",Num,7566,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_43.png",Num,7314,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_44.png",Num,7189,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_45.png",Num,4594,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_46.png",Num,4177,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_47.png",Num,2947,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_48.png",Num,5745,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_49.png",Num,6381,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_50.png",Num,5063,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_51.png",Num,3581,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_52.png",Num,3337,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_53.png",Num,4903,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_54.png",Num,6659,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_55.png",Num,6577,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_56.png",Num,6478,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_57.png",Num,6383,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_58.png",Num,6071,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_59.png",Num,5747,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_60.png",Num,5184,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_61.png",Num,5576,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_62.png",Num,5356,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_63.png",Num,5299,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_64.png",Num,5301,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_65.png",Num,2949,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_66.png",Num,5180,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_67.png",Num,5061,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_68.png",Num,4959,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_69.png",Num,3589,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_70.png",Num,3601,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_71.png",Num,2944,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_63.png",Num,4592,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_64.png",Num,3993,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_65.png",Num,3358,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_66.png",Num,2924,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_67.png",Num,2935,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_68.png",Num,2936,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_69.png",Num,2941,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_70.png",Num,2942,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_71.png",Num,2950,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_72.png",Num,2952,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_73.png",Num,2957,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_74.png",Num,2960,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_75.png",Num,2958,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_76.png",Num,2961,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_77.png",Num,2963,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_78.png",Num,2964,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_79.png",Num,2966,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_80.png",Num,2972,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_81.png",Num,2974,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_82.png",Num,3337,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_83.png",Num,3340,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_84.png",Num,3343,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_85.png",Num,3346,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_86.png",Num,3347,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_87.png",Num,3348,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_88.png",Num,3350,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_89.png",Num,3351,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_90.png",Num,3352,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_91.png",Num,3353,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_92.png",Num,3338,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_93.png",Num,3356,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_94.png",Num,3357,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_95.png",Num,3567,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_96.png",Num,3578,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_97.png",Num,3579,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_98.png",Num,3580,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_99.png",Num,3583,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_100.png",Num,3587,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_101.png",Num,3591,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_102.png",Num,3590,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_103.png",Num,3592,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_104.png",Num,3593,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_105.png",Num,3597,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_106.png",Num,3598,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_107.png",Num,3599,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_108.png",Num,3603,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_109.png",Num,3604,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_110.png",Num,3609,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_111.png",Num,3611,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_112.png",Num,3612,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_103.png",Num,3614,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_104.png",Num,3349,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_105.png",Num,3615,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_106.png",Num,4436,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_107.png",Num,2959,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_108.png",Num,5575,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_109.png",Num,5355,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_110.png",Num,6978,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_111.png",Num,6979,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_112.png",Num,2955,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_103.png",Num,2976,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_104.png",Num,10811,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_105.png",Num,11998,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_106.png",Num,13760,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_107.png",Num,14080,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_108.png",Num,14422,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_109.png",Num,15245,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_110.png",Num,15685,GameName);
                    modelsGame.GameImform("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\EGT\\Screenshot_111.png",Num,16149,GameName);
                }
                catch (FindFailed e) {
                    System.out.println(GameName+" - -  "+driver.getCurrentUrl());
                    driver.navigate().back();
                }
            }
        }
    }