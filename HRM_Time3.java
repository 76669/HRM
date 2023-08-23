import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRM_Time3 {

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
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]"));
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		try {
			Thread.sleep(2000);
		   } catch (InterruptedException e) {
			e.printStackTrace();
		   }
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[2]/a")).click();

	}

}
