package com.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class App implements WebDriver {
  public static void main(String[] args) {

    // instantiating Browser
    // e.g. Chrome - ChromeDriver

    // ChromeDriver.exe location
    System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

    // Two different implentations - the latter is better and more flexible (browser agnostic, to an extent)
    // ChromeDriver driver = new ChromeDriver();
    // WebDriver driver = new ChromeDriver();

    WebDriver driver = new ChromeDriver();
  }
}
