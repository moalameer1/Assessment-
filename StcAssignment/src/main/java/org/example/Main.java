package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Main {
    WebDriver driver;
    SoftAssert softAssert;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        softAssert = new SoftAssert();
    }

    @Test(priority = 1)
    public void TC001_Sa() {
        driver.get("https://www.stctv.com/sa-en");

        String litePrice = "15";
        String classicPrice = "25";
        String premiumPrice = "60";
        String expectedCurrency = "SAR/month";

        // Get the Links of the packages
        WebElement liteLink = driver.findElement(By.id("liteSelection"));
        String actualLiteLink = liteLink.getAttribute("href");
        WebElement classicLink = driver.findElement(By.id("classicSelection"));
        String actualClassicLink = classicLink.getAttribute("href");
        WebElement premiumLink = driver.findElement(By.id("premiumSelection"));
        String actualPremiumLink = premiumLink.getAttribute("href");

        // Get the Price and Currency for the packages
        WebElement litePackage = driver.findElement(By.id("lite_tierCurrency"));
        String actualLitePackage = litePackage.getText();
        WebElement classicPackage = driver.findElement(By.id("classic_tierCurrency"));
        String actualClassicPackage = classicPackage.getText();
        WebElement premiumPackage = driver.findElement(By.id("premium_tier"));
        String actualPremiumPackage = premiumPackage.getText();

        // Validate Lite Package
        softAssert.assertEquals(driver.findElement(By.id("lite")).getText(), "LITE");
        softAssert.assertTrue(actualLiteLink.contains("https://subscribe.stctv.com/sa-en?tier=1"), "Lite Link doesn't match" );
        softAssert.assertTrue(actualLitePackage.contains(litePrice), "Lite Price doesn't Match");
        softAssert.assertTrue(actualLitePackage.contains(expectedCurrency), "Lite Currency doesn't Match");

        // Validate Classic Package
        softAssert.assertEquals(driver.findElement(By.id("classic")).getText(), "CLASSIC");
        softAssert.assertTrue(actualClassicLink.contains("https://subscribe.stctv.com/sa-en?tier=2"), "Classic Link doesn't match" );
        softAssert.assertTrue(actualClassicPackage.contains(classicPrice), "Classic Price doesn't Match");
        softAssert.assertTrue(actualClassicPackage.contains(expectedCurrency), "Classic Currency doesn't Match");

        // Validate Premium Package
        softAssert.assertEquals(driver.findElement(By.id("premium")).getText(), "PREMIUM");
        softAssert.assertTrue(actualPremiumLink.contains("https://subscribe.stctv.com/sa-en?tier=3") ,"Premium Link doesn't match");
        softAssert.assertTrue(actualPremiumPackage.contains(premiumPrice), "Premium Price doesn't Match");
        softAssert.assertTrue(actualPremiumPackage.contains(expectedCurrency), "Premium Currency doesn't Match");

        // Assert all
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void TC002_Bh() {
        driver.get("https://www.stctv.com/bh-en");

        String country = "bh";
        String litePrice = "2";
        String classicPrice = "3";
        String premiumPrice = "6";
        String expectedCurrency = "BHD/month";

        // Get the Links of the packages
        WebElement liteLink = driver.findElement(By.id("liteSelection"));
        String actualLiteLink = liteLink.getAttribute("href");
        WebElement classicLink = driver.findElement(By.id("classicSelection"));
        String actualClassicLink = classicLink.getAttribute("href");
        WebElement premiumLink = driver.findElement(By.id("premiumSelection"));
        String actualPremiumLink = premiumLink.getAttribute("href");

        // Get the Price and Currency for the packages
        WebElement litePackage = driver.findElement(By.id("lite_tierCurrency"));
        String actualLitePackage = litePackage.getText();
        WebElement classicPackage = driver.findElement(By.id("classic_tierCurrency"));
        String actualClassicPackage = classicPackage.getText();
        WebElement premiumPackage = driver.findElement(By.id("premium_tier"));
        String actualPremiumPackage = premiumPackage.getText();

        // Validate Lite Package
        softAssert.assertEquals(driver.findElement(By.id("lite")).getText(), "LITE");
        softAssert.assertTrue(actualLiteLink.contains("https://subscribe.stctv.com/bh-en?tier=1"), "Lite Link doesn't match" );
        softAssert.assertTrue(actualLitePackage.contains(litePrice), "Lite Price doesn't Match");
        softAssert.assertTrue(actualLitePackage.contains(expectedCurrency), "Lite Currency doesn't Match");

        // Validate Classic Package
        softAssert.assertEquals(driver.findElement(By.id("classic")).getText(), "CLASSIC");
        softAssert.assertTrue(actualClassicLink.contains("https://subscribe.stctv.com/bh-en?tier=2"), "Classic Link doesn't match" );
        softAssert.assertTrue(actualClassicPackage.contains(classicPrice), "Classic Price doesn't Match");
        softAssert.assertTrue(actualClassicPackage.contains(expectedCurrency), "Classic Currency doesn't Match");

        // Validate Premium Package
        softAssert.assertEquals(driver.findElement(By.id("premium")).getText(), "PREMIUM");
        softAssert.assertTrue(actualPremiumLink.contains("https://subscribe.stctv.com/bh-en?tier=3") ,"Premium Link doesn't match");
        softAssert.assertTrue(actualPremiumPackage.contains(premiumPrice), "Premium Price doesn't Match");
        softAssert.assertTrue(actualPremiumPackage.contains(expectedCurrency), "Premium Currency doesn't Match");

        // Assert all
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void TC003_Kw() {
        driver.get("https://www.stctv.com/kw-en");

        String country = "kw";
        String litePrice = "1.2";
        String classicPrice = "2.5";
        String premiumPrice = "4.8";
        String expectedCurrency = "KWD/month";

        // Get the Links of the packages
        WebElement liteLink = driver.findElement(By.id("liteSelection"));
        String actualLiteLink = liteLink.getAttribute("href");
        WebElement classicLink = driver.findElement(By.id("classicSelection"));
        String actualClassicLink = classicLink.getAttribute("href");
        WebElement premiumLink = driver.findElement(By.id("premiumSelection"));
        String actualPremiumLink = premiumLink.getAttribute("href");

        // Get the Price and Currency for the packages
        WebElement litePackage = driver.findElement(By.id("lite_tierCurrency"));
        String actualLitePackage = litePackage.getText();
        WebElement classicPackage = driver.findElement(By.id("classic_tierCurrency"));
        String actualClassicPackage = classicPackage.getText();
        WebElement premiumPackage = driver.findElement(By.id("premium_tier"));
        String actualPremiumPackage = premiumPackage.getText();

        // Validate Lite Package
        softAssert.assertEquals(driver.findElement(By.id("lite")).getText(), "LITE");
        softAssert.assertTrue(actualLiteLink.contains("https://subscribe.stctv.com/kw-en?tier=1"), "Lite Link doesn't match" );
        softAssert.assertTrue(actualLitePackage.contains(litePrice), "Lite Price doesn't Match");
        softAssert.assertTrue(actualLitePackage.contains(expectedCurrency), "Lite Currency doesn't Match");

        // Validate Classic Package
        softAssert.assertEquals(driver.findElement(By.id("classic")).getText(), "CLASSIC");
        softAssert.assertTrue(actualClassicLink.contains("https://subscribe.stctv.com/kw-en?tier=2"), "Classic Link doesn't match" );
        softAssert.assertTrue(actualClassicPackage.contains(classicPrice), "Classic Price doesn't Match");
        softAssert.assertTrue(actualClassicPackage.contains(expectedCurrency), "Classic Currency doesn't Match");

        // Validate Premium Package
        softAssert.assertEquals(driver.findElement(By.id("premium")).getText(), "PREMIUM");
        softAssert.assertTrue(actualPremiumLink.contains("https://subscribe.stctv.com/kw-en?tier=3") ,"Premium Link doesn't match");
        softAssert.assertTrue(actualPremiumPackage.contains(premiumPrice), "Premium Price doesn't Match");
        softAssert.assertTrue(actualPremiumPackage.contains(expectedCurrency), "Premium Currency doesn't Match");

        // Assert all
        softAssert.assertAll();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
