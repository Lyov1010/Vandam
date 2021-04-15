package in.at.testannotation;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import java.util.List;
import java.util.NoSuchElementException;

public class BetConstructModels {
    WebDriver driver;
    Screen screen = new Screen();
    public BetConstructModels(WebDriver driver) {
        this.driver = driver;
    }

    public void BetConstructModel() throws InterruptedException {
        Actions actions = new Actions(driver);
        Commands commands = new Commands(driver);
        Models models = new Models(driver);
        models.GoToCasino("BETCONSTRUCT");
        models.Scroll();
        String Balance = driver.findElements((By.cssSelector("#wallet>ul>li>span"))).get(0).getText();
        System.out.println(Balance);
        List<WebElement> count = driver.findElements(By.cssSelector(".games-name"));
        System.out.println(count.size()); //game count
        for (int i = 3; i <=count.size()+2; i++) {
            WebDriverWait wait = new WebDriverWait(driver,10);
            String GameName = driver.findElements(By.cssSelector(".games-name")).get(i-3).getAttribute("title");
            WebElement elem = driver.findElements((By.cssSelector(".all-casino-games-list-content>.all-games-container>a"))).get(i-3);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
            Thread.sleep(500);
            System.out.println(i-2);
            WebElement Play = driver.findElements(By.cssSelector(".games-buttons")).get(i).findElement(By.cssSelector("strong>button"));
            Thread.sleep(1000);
            try {
                actions.click(Play).perform();
            }catch (JavascriptException NewGame){
                System.out.println("It's New Game  "+GameName+"   "+driver.getCurrentUrl());
                commands.Click(StaticWebElements.Slote_X_icon);
                System.out.println(i);
                i--;
                continue;
            }
            String GetUrlNum="";
            int Num = 0;
            try {
                Thread.sleep(1000);
                 GetUrlNum = driver.getCurrentUrl().replaceAll("\\D+", "");
                 Num = Integer.parseInt(GetUrlNum);
            }catch (NumberFormatException e)
            {
                System.out.println("Mtela format exeption------------------------------------------------------------------------------------");
                actions.click(Play).perform();
                GetUrlNum = driver.getCurrentUrl().replaceAll("\\D+", "");
                Num = Integer.parseInt(GetUrlNum);
            }
                try {
                    int QUEEN_MYSTIC_RELICS = 23086;
                    if (Num == QUEEN_MYSTIC_RELICS)//QUEEN_MYSTIC_RELICS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\1.png", 15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int SLY_VIRUS = 17833;
                    if (Num == SLY_VIRUS) //SLY_VIRUS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\2.png", 15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int FLOW_OF_CANDIES = 21169;
                    if (Num == FLOW_OF_CANDIES) //SLY_VIRUS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\3.png", 15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int SOCCER_NATION = 19597;
                    if (Num == SOCCER_NATION) //SOCCER NATION
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\4.png", 15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int GOLD_DRAGON = 17862;//17862
                    if (Num == GOLD_DRAGON) //GOLD_DRAGON
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\5.png", 15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int WORLD_OF_DIAMONDS = 17779;
                    if (Num == WORLD_OF_DIAMONDS) //WORLD_OF_DIAMONDS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\6.png", 15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int HOT_STUFF=17788;
                    if (Num==HOT_STUFF) //HOT_STUFF
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\7.png",15);
                        screen.click();
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\8.png",15);
                        screen.click();
                        System.out.println(GameName);
                        Thread.sleep(1500);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int FASHION_SECRETS=17776;
                    if (Num==FASHION_SECRETS) //FASHION_SECRETS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\9.png",15); //
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int BERRY_DINNER=16164;
                    if (Num==BERRY_DINNER) //BERRY_DINNER
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\10.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int RISE_OF_EMPIRE=15576;
                    if (Num==RISE_OF_EMPIRE) //RISE_OF_EMPIRE
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\11.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int FASHION_SHOW=9691;
                    if (Num==FASHION_SHOW) //FASHION_SHOW
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\13.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int FASHION_CLUB=9695;
                    if (Num==FASHION_CLUB) //FASHION_CLUB
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\12.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int FASHION_BOUTIQUE=10234;//
                    if (Num==FASHION_BOUTIQUE) //FASHION_BOUTIQUE
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\14.png",15); //sxal
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int BONUS_MACHINE=13643;
                    if (Num==BONUS_MACHINE) //BONUS_MACHINE
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\15.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int DIAMOND_RUSH=9693;
                    if (Num==DIAMOND_RUSH) //DIAMOND_RUSH
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\16.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int FRUITLAND=12154;
                    if (Num==FRUITLAND) //FRUITLAND
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\17.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int DIAMOND_FRUITS=10236;
                    if (Num==DIAMOND_FRUITS) //DIAMOND_FRUITS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\18.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int BILLIONAIRE_TOYS=9698;
                    if (Num==BILLIONAIRE_TOYS) //BILLIONAIRE_TOYS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\19.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int BIKINI_ANGELS=9689;
                    if (Num==BIKINI_ANGELS) //BIKINI_ANGELS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\20.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int BEYOND_CRYSTAL_POWER=11359;
                    if (Num==BEYOND_CRYSTAL_POWER) //BEYOND_CRYSTAL_POWER
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\21.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int XMAS_CHANCE=9974;
                    if (Num==XMAS_CHANCE) //XMAS_CHANCE
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\22.png",15);
                        Thread.sleep(7000);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int CYBER_GIRLS=12174;
                    if (Num==CYBER_GIRLS) //CYBER_GIRLS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\23.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int PERSEPOLIS=9976;
                    if (Num==PERSEPOLIS) //PERSEPOLIS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\24.png",15);
                        Thread.sleep(7000);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int HEROES_VS_VILLAINS=9982;
                    if (Num==HEROES_VS_VILLAINS) //PERSEPOLIS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\25.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);

                    }
                    int FRESH_FRUITS=4170;
                    if (Num==FRESH_FRUITS) //FRESH_FRUITS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));

                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\26.png",15);
                        Thread.sleep(8000);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int UNDER_WATER=4172;
                    if (Num==UNDER_WATER) //UNDER_WATER
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\27.png",15);
                        screen.click();
                        Thread.sleep(2000);
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\28.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);

                    }
                    int SANTA_SURPRISE=2902;
                    if (Num==SANTA_SURPRISE) //SANTA_SURPRISE
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\29.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int IVANUSHKA_DURACHOK=615;
                    if (Num==IVANUSHKA_DURACHOK) //IVANUSHKA_DURACHOK
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\30.png",15);
                        screen.click();
                        System.out.println(GameName);
                        driver.findElement(By.cssSelector(".big-game-control>.icon-delete")).click();//casino bet
                    }
                    int FRUIT_COCKTAIL=1635;
                    if (Num==FRUIT_COCKTAIL) //FRUIT_COCKTAIL
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        Thread.sleep(3000);
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\31.png",15);
                        System.out.println(GameName);
                        screen.click();
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int FLAMING_FRUITS=521;
                    if (Num==FLAMING_FRUITS) //FLAMING_FRUITS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\32.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int GOLD_RUSH=735;
                    if (Num==GOLD_RUSH) //GOLD_RUSH
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\33.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);

                    }
                    int CHAIRS=734;
                    if (Num==CHAIRS) //CHAIRS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        Thread.sleep(2000);
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\33.png",15);
                        screen.click();
                        Thread.sleep(2000);
                        commands.Click(StaticWebElements.Slote_X_icon);
                        System.out.println(GameName);
                    }
                    int SHAMANS_QUEST=2427;
                    if (Num==SHAMANS_QUEST) //SHAMANS_QUEST
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\34.png",15);
                        Thread.sleep(2000);
                        screen.click();
                        Thread.sleep(2000);
                        commands.Click(StaticWebElements.Slote_X_icon);
                        System.out.println(GameName);
                    }
                    int ALICE_IN_WONDERLAND=1546;
                    if (Num==ALICE_IN_WONDERLAND) //ALICE_IN_WONDERLAND
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\35.png",15);
                        screen.click();
                        Thread.sleep(2000);
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\36.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int VIKING_TREASURES=2982;
                    if (Num==VIKING_TREASURES) //VIKING_TREASURES
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\37.png",15);
                        screen.click();
                        Thread.sleep(3000);
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\38.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int RABBIT_FIRE_CIRCUS=1636;
                    if (Num==RABBIT_FIRE_CIRCUS) //RABBIT_FIRE_CIRCUS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\39.png",15);
                        screen.click();
                        Thread.sleep(3000);
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\40.png",15);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);

                    }
                    int TENS_OR_BETTER=2992;
                    if (Num==TENS_OR_BETTER) //TENS_OR_BETTER
                    {
                        try {
                            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                            screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\41.png",15);
                            screen.click();
                            Thread.sleep(2000);
                            commands.Click(StaticWebElements.Slote_X_icon);
                            System.out.println(GameName);
                        }catch (TimeoutException d){
                            screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\41.png",15);
                            screen.click();
                            Thread.sleep(2000);
                            commands.Click(StaticWebElements.Slote_X_icon);
                            System.out.println(GameName);
                        }
                    }
                    int BONUS_POKER=2996;
                    if (Num==BONUS_POKER) //BONUS_POKER
                    {
                        try {
                            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                            screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\41.png",15);
                            screen.click();
                            System.out.println(GameName);
                            commands.Click(StaticWebElements.Slote_X_icon);

                        }catch (TimeoutException d)
                        {
                            screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\41.png",15);
                            screen.click();
                            System.out.println(GameName);
                            commands.Click(StaticWebElements.Slote_X_icon);
                        }
                    }
                    int CRAZY_DUCKY=2994;
                    if (Num==CRAZY_DUCKY) //CRAZY_DUCKY
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\42.png",15); ////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int BAKE_HOUSE=2978;
                    if (Num==BAKE_HOUSE) //BAKE_HOUSE
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\43.png",15); ////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int HALLOWEEN_NIGHT=2980;
                    if (Num==HALLOWEEN_NIGHT) //HALLOWEEN_NIGHT
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\44.png",15); ////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int WOLFS_BET=2984;
                    if (Num==WOLFS_BET) //WOLFS_BET
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\45.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int DOUBLE_DOUBLE_BONUS_POKER=2986;
                    if (Num==DOUBLE_DOUBLE_BONUS_POKER) //DOUBLE_DOUBLE_BONUS_POKER
                    {
                        try{
                            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                            screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\46.png",15); /////
                            screen.click();
                            System.out.println(GameName);
                            commands.Click(StaticWebElements.Slote_X_icon);
                        }

                        catch (TimeoutException d)
                        {
                            screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\46.png",15); /////
                            screen.click();
                            System.out.println(GameName);
                            commands.Click(StaticWebElements.Slote_X_icon);
                        }
                    }
                    int JACKS_OR_BETTER=2988;
                    if (Num==JACKS_OR_BETTER) //JACKS_OR_BETTER
                    {
                        try {
                            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                            screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\46.png",15); /////
                            screen.click();
                            System.out.println(GameName);
                            commands.Click(StaticWebElements.Slote_X_icon);
                        }
                        catch (TimeoutException d){
                            screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\46.png",15); /////
                            screen.click();
                            System.out.println(GameName);
                            commands.Click(StaticWebElements.Slote_X_icon);
                        }
                    }
                    int Poker_am=733;
                    if (Num==Poker_am) //Poker_am
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\47.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int SPORTS_BET=743;
                    if (Num==SPORTS_BET) //SPORTS_BET
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\48.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int CRAZY_MONKEY=798;
                    if (Num==CRAZY_MONKEY) //CRAZY_MONKEY
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\49.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int ALL_AMERICAN_POKER=2990;
                    if (Num==ALL_AMERICAN_POKER) //ALL_AMERICAN_POKER
                    {
                        try {
                            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                            screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\50.png",15); /////
                            screen.click();
                            System.out.println(GameName);
                            commands.Click(StaticWebElements.Slote_X_icon);

                        }catch (TimeoutException d){
                            screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\50.png",15); /////
                            screen.click();
                            System.out.println(GameName);
                            commands.Click(StaticWebElements.Slote_X_icon);

                        }
                    }
                    int SOCCER_SHOOTOUT=9611;
                    if (Num==SOCCER_SHOOTOUT) //SOCCER_SHOOTOUT
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\51.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);

                    }
                    int MYSTICAL_AMBER=9157;
                    if (Num==MYSTICAL_AMBER) //MYSTICAL_AMBER
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\52.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);

                    }
                    int MIDSUMMER_MAGICAL_NIGHT=9613;
                    if (Num==MIDSUMMER_MAGICAL_NIGHT) //MIDSUMMER_MAGICAL_NIGHT
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\53.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);

                    }
                    int MERRY_CHRISTMAS=7215;
                    if (Num==MERRY_CHRISTMAS) //MERRY_CHRISTMAS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        Thread.sleep(8000);
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\54.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);

                    }
                    int MAGICAL_CHRISTMAS=9802;
                    if (Num==MAGICAL_CHRISTMAS) //MAGICAL_CHRISTMAS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\55.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int LULUBET=9024;
                    if (Num==LULUBET) //LULUBET
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\56.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int LUCKY_LOVE_STORY=10284;
                    if (Num==LUCKY_LOVE_STORY) //LUCKY_LOVE_STORY
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\57.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int LUCKY=24485;
                    if (Num==LUCKY) //LUCKY
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\005.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int CHINGA_CHOONG=6484;
                    if (Num==CHINGA_CHOONG) //CHINGA_CHOONG
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        Thread.sleep(2000);
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\58.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int BUBBLY_FRUITS=9538;
                    if (Num==BUBBLY_FRUITS) //BUBBLY_FRUITS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\59.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int BLING_SPINS=9159;
                    if (Num==BLING_SPINS) //BLING_SPINS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\15.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);

                    }
                    int ANIMALS=9021;
                    if (Num==ANIMALS) //ANIMALS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\61.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int onetwothree=9026;
                    if (Num==onetwothree) //onetwothree
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\62.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int SPACE=9980;
                    if (Num==SPACE) //SPACE
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\63.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int ICE_FRUITS=11256;
                    if (Num==ICE_FRUITS) //ICE_FRUITS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\64.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);

                    }
                    int FIRST_EMPIRE=11356;
                    if (Num==FIRST_EMPIRE) //FIRST_EMPIRE
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\65.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);

                    }
                    int MEGA_DIAMONDS=13022;
                    if (Num==MEGA_DIAMONDS) //MEGA_DIAMONDS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\66.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);

                    }
                    int LUXURY_DESTINATIONS=13020;
                    if (Num==LUXURY_DESTINATIONS) //LUXURY_DESTINATIONS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\67.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);

                    }
                    int CRAZY_WIN=13727;
                    if (Num==CRAZY_WIN) //CRAZY_WIN
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\68.png",15); /////
                        screen.click();
                        System.out.println(GameName);

                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int PIRATES_GOLD=14146;
                    if (Num==PIRATES_GOLD) //PIRATES_GOLD
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\69.png",15); /////
                        screen.click();
                        System.out.println(GameName);

                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int DIZZYING_FRUITS=14151;
                    if (Num==DIZZYING_FRUITS) //DIZZYING_FRUITS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\70.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int CHINA_TOWN=14152;
                    if (Num==CHINA_TOWN) //CHINA_TOWN
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\71.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                    int CUTE_MONSTERS=14188;
                    if (Num==CUTE_MONSTERS) //CUTE_MONSTERS
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\72.png",15); /////
                        Thread.sleep(2000);
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);

                    }
                    int HAPPY_FARM=14229;
                    if (Num==HAPPY_FARM) //HAPPY_FARM
                    {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframe-jackpot-coins")));
                        screen.wait("C:\\Users\\hambardzumyan.levon\\IdeaProjects\\VbetProviders\\src\\test\\java\\73.png",15); /////
                        screen.click();
                        System.out.println(GameName);
                        commands.Click(StaticWebElements.DepositPopup);
                        commands.Click(StaticWebElements.Slote_X_icon);
                    }
                } catch (FindFailed e) {
                    System.out.println(GameName+"---"+driver.getCurrentUrl());
                    driver.navigate().back();
                }
            }

        }

    }


//    public  void  GoToVivaroGames() throws InterruptedException {
//        //  driver.get("https://www.vbet.com/#/");
//        driver.get("https://gaming.vivarobet.am/#/");
//        Commands commands=new Commands(driver);
//
//        driver.manage().window().maximize();
//        Thread.sleep((2000));
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body")));
//        try{
//            // driver.switchTo().frame(0);
//            commands.Click(By.cssSelector(".pu-button-wrap-j>div>button"));
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".signin-reg-buttons-b"))).findElements(By.cssSelector("ul>li"));
//            driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElements(By.cssSelector("ul>li")).get(0).click();
//        }
//        catch (TimeoutException e){
//            driver.switchTo().defaultContent();
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button")));
//            WebElement elem=driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElement(By.cssSelector("ul>li>button"));
//            wait.until(ExpectedConditions.elementToBeClickable(elem));
//            driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElement(By.cssSelector("ul>li>button")).click();
//        }
//        catch (NoSuchFrameException e){
//            driver.switchTo().defaultContent();
//
//            commands.Click(By.cssSelector(".pu-button-wrap-j>div>button"));
//
//            WebElement elem=driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElement(By.cssSelector("ul>li>button"));
//            wait.until(ExpectedConditions.elementToBeClickable(elem));
//            driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElement(By.cssSelector("ul>li>button")).click();
//        }
//        catch (NoSuchElementException e){
//            driver.switchTo().defaultContent();
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button")));
//            WebElement elem=driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElement(By.cssSelector("ul>li>button"));
//            wait.until(ExpectedConditions.elementToBeClickable(elem));
//            driver.findElement(By.cssSelector(".signin-reg-buttons-b")).findElement(By.cssSelector("ul>li>button")).click();
//        }
//        Thread.sleep((1000));
//        driver.findElements((By.cssSelector(".ng-valid-maxlength"))).get(1).sendKeys("azat.yeremyan@betconstruct.com");
//        driver.findElements((By.cssSelector(".ng-valid-maxlength"))).get(2).sendKeys("a12345678$");
//        Thread.sleep((1500));
//        commands.Click(By.cssSelector(".button-confirm"));
//        Thread.sleep(4000);
//        commands.Click(By.cssSelector(".leng-b"));
//        commands.Click(By.cssSelector(".eng"));
//        driver.get("https://gaming.vivarobet.am/#/casino/?category=all&provider=all");
//    }
