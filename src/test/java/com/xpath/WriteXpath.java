package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WriteXpath {

	public static void main(String[] args) throws InterruptedException {
		
		//set chrome driver path
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		
		//launch your browser
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://demo.nopcommerce.com/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		WebElement register=driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		register.click();
		WebElement day=driver.findElement(By.name("DateOfBirthDay"));
		
		Select select=new Select(day);
		select.selectByVisibleText("19");
		Thread.sleep(3000);
		
		select.selectByIndex(3);
		
		Thread.sleep(3000);
		
		select.selectByValue("28");

	}

}
