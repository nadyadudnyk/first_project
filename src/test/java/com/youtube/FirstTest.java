package com.youtube;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/dd300/Downloads/chromedriver_win32_2/chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
                driver.get("https://www.youtube.com/");

                String title = driver.getTitle();
        Assert.assertTrue(title.equals("YouTube"));

        driver.findElement(By.name("search_query")).sendKeys("123");

        driver.findElement(By.id("search-icon-legacy")).click();

        driver.findElement(By.id("video-title")).click();

        driver.manage().window().maximize();

        driver.quit();

    }
}
