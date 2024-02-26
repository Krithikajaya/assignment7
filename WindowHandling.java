package assignment7;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args)throws InterruptedException  {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-tr'])[3]")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> window=new ArrayList<String>(windowHandles); 
		driver.switchTo().window(window.get(1));
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(window.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> window1=new ArrayList<String>(windowHandles1); 
		driver.switchTo().window(window1.get(1));
		driver.findElement(By.xpath("//a[text()='EuroCustomer']")).click();
		driver.switchTo().window(window.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
        Alert al=driver.switchTo().alert();
        al.accept();
        String title = driver.getTitle();
        System.out.println(title);
				
	}

}
