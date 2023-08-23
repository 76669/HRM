import java.util.Iterator;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRM_Time2 {

	public static void main(String[] args) {
		 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		   try {
			Thread.sleep(2000);
		   } catch (InterruptedException e) {
			e.printStackTrace();
		   }
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		try {
			Thread.sleep(2000);
		   } catch (InterruptedException e) {
			e.printStackTrace();
		   }
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a")).click();
		
		 try {
			 	Thread.sleep(2000);   
		 } catch (InterruptedException e) {
				e.printStackTrace();
			  }
			 
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]"));
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]")).click();
		
		try {
		 	Thread.sleep(2000);   
	    } catch (InterruptedException e) {
			e.printStackTrace();
		  }
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]"));
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[1]/a")).click();
		
		try {
		 	Thread.sleep(2000);   
	    } catch (InterruptedException e) {
			e.printStackTrace();
		  }
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2] /form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys(" ASF - Phase 1");
		try {
		 	Thread.sleep(2000);   
	    } catch (InterruptedException e) {
			e.printStackTrace();
		  }
		 List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'oxd-autocomplete-dropdown --positon-bottom')]"));
		  
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			String txt = ((WebElement) itr.next()).getText();
			if(txt == "Enabled") {
				((WebElement) itr.next()).click();
			}
			 }
		
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys("2023-08-21");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div/input")).sendKeys("2023-08-22");
		
		try {
		 	Thread.sleep(2000);   
	    } catch (InterruptedException e) {
			e.printStackTrace();
		  }
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]"));
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[2]/a")).click();
		
		try {
		 	Thread.sleep(2000);   
	    } catch (InterruptedException e) {
			e.printStackTrace();
		  }
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]"));
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[3]/a")).click();
		
		 }

	}


