package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
    public static void main(String[] args) {
        // WebDriverManager will automatically handle downloading the appropriate chromedriver
        WebDriverManager.chromedriver().setup();

        // Initialize ChromeDriver (this will launch the browser)
        WebDriver driver = new ChromeDriver();
        
        // Open SauceDemo page
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        
        // Interact with the login form
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Optional: Add sleep to allow the page to load before closing
        try {
            Thread.sleep(5000); // Sleep for 5 seconds to observe the page
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Close the browser after the task
        driver.quit();
    }
}

