package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {
    public void runAlerts() {

        //Declare the String
        String text = "Aisha";
//        Set your Chrome Driver path, very common steps
        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //To enter into edit box "Declaring the String variable stored as Aisha"
        driver.findElement(By.id("name")).sendKeys(text);

        //Click on the Alert button
        driver.findElement(By.cssSelector("[id='alertbtn']")).click(); //You can build cssSelector by creating an 'id'

        //Getting the Text present on the Alert
        System.out.println(driver.switchTo().alert().getText());

        //Handling the Popup to click 'Ok'(In Selenium there is a Method to switch to Alerts and Accept)
        driver.switchTo().alert().accept();

//        Another type of Java Alert is "Confirm - to click 'ok/cancel'"
        //Click on Confirm button
        driver.findElement(By.id("confirmbtn")).click();

        System.out.println(driver.switchTo().alert().getText());

        //To click on 'Cancel' in Selenium the method to cancel id 'Dismiss'
        driver.switchTo().alert().dismiss();
    }
}
