package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locator_Practice {
    protected static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("http://www.automationpractice.pl/index.php");
      int count =  driver.findElements(By.className("homeslider-description")).size();
        System.out.println("Total number of slider are : "+count);
        int count2 = driver.findElements(By.className("item-img")).size();
        System.out.println("Total number of images : "+count);
        int link = driver.findElements(By.tagName("link")).size();
        System.out.println("Total number List item elements are : "+link);
        //tag and attribute
           driver.findElement(By.cssSelector("a[title=Women]")).click();
           //tag,class,attribute
           driver.findElement(By.cssSelector("img[alt='Faded Short Sleeve T-shirts']")).click();
           //tag and id
        driver.findElement(By.cssSelector("a.fancybox shown")).getSize();
driver.quit();

    }
}
