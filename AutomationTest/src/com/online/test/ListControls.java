package com.online.test;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.w3c.dom.stylesheets.LinkStyle;

public class ListControls {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://cleartrip.com/");
		String title = driver.getTitle();
		String clrurl =driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(clrurl);
		
		
		//lets
		//      This code is to count the no of cities
		
		/*driver.findElement(By.xpath("//*[@id='FromTag']")).sendKeys("hyd");
		driver.findElement(By.xpath("//*[@id='FromTag']")).click();
		Sleeper.sleepTightInSeconds(5);
	    List<WebElement> cities = driver.findElements(By.xpath("html/body/ul[1]/li/a"));
	    System.out.println(cities.size());
	    
//	    This code is to print the cities
	    
	    System.out.println(cities.get(0).getText());
	    System.out.println(cities.get(1).getText());
	    System.out.println(cities.get(2).getText());
	    driver.close();
	    */
	    
	    driver.get("https://www.yatra.com/?redirect=no&origin=UK");
	    String titley = driver.getTitle();
	    String yurl =driver.getCurrentUrl();
	    //safsd
	    System.out.println(titley);
	    System.out.println(yurl);
	    driver.findElement(By.xpath("//form/div/div[2]/ul/li[1]/input")).sendKeys("jai");
	    driver.findElement(By.xpath("//form/div/div[2]/ul/li[1]/input")).click();
	    Sleeper.sleepTightInSeconds(5);
	    List<WebElement> journey =  driver.findElements(By.xpath("html/body/div[13]/ul/div[2]/div/li"));
	    int journeys = journey.size();    
	    System.out.println(journeys);
	    
	    for (int i = 0; i < journey.size(); i++)
	    {
	    
	    	String journeyname = journey.get(i).getText();
	    	System.out.println(journeyname);
	    	
	    	
	    }
		
		driver.findElement(By.id("BE_flight_arrival_city")).sendKeys("lon");
		driver.findElement(By.id("BE_flight_arrival_city")).click();
		Sleeper.sleepTightInSeconds(10);
		List<WebElement> destination= driver.findElements(By.xpath("html/body/div[14]/ul/div[2]/div/li"));
		System.out.println(destination.size());
		
		for (int i = 0; i< destination.size(); i++)
		
		{
			String destinationnName = destination.get(i).getText();
			System.out.println(destinationnName);
					
			
		}

		driver.get("https://cleartrip.com/");
		driver.navigate().to("https://epaper.bhaskar.com/");
		driver.navigate().back();
		String titler = driver.getTitle();
		System.out.println(titler);
		driver.findElement(By.id("FromTag")).sendKeys("lon");
		driver.findElement(By.id("FromTag")).click();
		Sleeper.sleepTightInSeconds(5);
		List<WebElement> fromplace = driver.findElements(By.xpath("html/body/ul[1]/li/a"));
		System.out.println(fromplace.size());
		for (int i=0 ; i<fromplace.size(); i++)
		{
			
			String flyfrom = fromplace.get(i).getText();
			System.out.println(flyfrom);
			
			
		}
	}

}
