package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest1 {
private WebDriver driver;
@BeforeEach
    void setUp(){
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");
}
@Test
    public void Test1(){
    WebElement header = driver.findElement(By.xpath("//h1[@class='display-6']"));
    String string = header.getText();
    assertEquals("Web form",string,"Incorrect header");
}
}
