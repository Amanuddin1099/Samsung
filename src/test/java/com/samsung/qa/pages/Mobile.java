package com.samsung.qa.pages;

import com.samsung.qa.utils.BaseClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mobile extends BaseClass {
    @Test
    public void mobileTest () throws InterruptedException {
        driver.get("https://www.samsung.com");
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.className("gnb__depth1-link-text")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#wrap > div.gnb.js-mobile-open.isHybrid > nav > div > div > div.gnb__menu-wrap.ae-exclude > div > div.gnb__main > ul > li:nth-child(1) > div > div.gnb__depth2-inner > ul > li:nth-child(2) > a.gnb__depth2-link > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#wrap > div.gnb.js-mobile-open.isHybrid > nav > div > div > div.gnb__menu-wrap.ae-exclude > div > div.gnb__main > ul > li:nth-child(1) > div > div.gnb__depth2-inner > ul > li:nth-child(2) > div > div > ul > li:nth-child(1) > a > div")).click();





    }
}
