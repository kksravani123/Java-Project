package com.obs.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();

			co.setBinary("C:\\Users\\ADMIN\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
			
			
			//co.addArguments("--remote-allow-origins=*");
			
			

			//WebDriverManager.chromedriver().setup();
			WebDriver driver=(WebDriver) new ChromeDriver(co);
	}

}
