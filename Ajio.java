package week3.day1;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='searchVal']"));
		searchBox.sendKeys("bags");
		searchBox.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(1000);
		String bagCount = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Count of the items found : "+bagCount);
		driver.findElement(By.xpath("//span[text()='brands']")).click();
		List<WebElement> brandName = driver.findElements(By.className("brand"));
		
		System.out.println("\nSize : "+brandName.size());
		Set<String> brandNameUniqueOnes = new LinkedHashSet <String>();
		System.out.println("Brand Name List : ");
		for (int i=0;i<brandName.size();i++) {
			WebElement element = brandName.get(i);
			String name = element.getText();
			brandNameUniqueOnes.add(name);
		}
		for (String string : brandNameUniqueOnes) {
			System.out.println(string);
		}
				
		List<WebElement> bagNameList = driver.findElements(By.className("name"));
		System.out.println("\nSize :" + bagNameList.size());
		System.out.println("Name of the Bags");
		for (WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		
	}
	
}

