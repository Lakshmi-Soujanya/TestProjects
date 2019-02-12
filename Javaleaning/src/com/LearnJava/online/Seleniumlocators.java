package com.LearnJava.online;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumlocators {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Soujanya\\softwares\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		/*driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.id("identifierId")).sendKeys("Soujanya");
		driver.findElement(By.xpath("//*[@id="view_container"]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[3]/button"));
*/	
		driver.get("http://www.javacodegeeks.com");
	    WebElement element = driver.findElement(By.xpath("/html/body[@class='home blog gecko']/div[@id='wrapper']/div[@id='bottom']/div[1]/a[@class='ext-link']"));
	    System.out.println(element.getText());
	    System.out.println("Page title is: " + driver.getTitle());
	    driver.quit();	
	
	
	}

}
