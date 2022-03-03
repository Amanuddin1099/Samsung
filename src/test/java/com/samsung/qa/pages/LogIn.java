package com.samsung.qa.pages;

import com.samsung.qa.utils.BaseClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn extends BaseClass {

    @Test
    public void logInTest () throws InterruptedException {
        driver.get("https://www.samsung.com");
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.className("gnb__login-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#wrap > div.gnb.js-mobile-open.isHybrid > nav > div > div > div.gnb__menu-wrap.ae-exclude > div > div.gnb__sub > ul.gnb__utility > li.gnb__login.before-login-context > div > ul > li:nth-child(1) > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#iptLgnPlnID")).sendKeys("Admin123@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#iptLgnPlnPD")).sendKeys("Admin123");
        Thread.sleep(2000);
        driver.findElement(By.className("main-inner")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"signInButton\"]")).submit();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"signInButton\"]")).click();



    }
}
