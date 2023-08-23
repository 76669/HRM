import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRM_Time {

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
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div/button")).click();
		
		  try {
		 	Thread.sleep(2000);
		  } catch (InterruptedException e) {
			e.printStackTrace();
		  }
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button")).click();
		
		  try {
		 	Thread.sleep(2000);                 
		  } catch (InterruptedException e) {
			e.printStackTrace();
		  }
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[2]/td/button/i")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[2]/td[10]/button")).click();  
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]"));
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[1]/a")).click();
		
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
	 
		
	}
	
			
}
////*[@id="app"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[1]/a