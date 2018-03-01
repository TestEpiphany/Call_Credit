package CallCredit_Pacckage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CallCreditForms {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.workthere.com/");
		//driver.get("workthere.epiphanydev4.co.uk/nl-nl/");
		Thread.sleep(5000);
	
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div/div/div/div[2]/div[2]/a/p")).click(); //Select UK
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div/div/div/div[2]/div[4]/a/p")).click(); //Select France
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[1]/ul/li[5]/a")).click(); //Login
		
	
		

		driver.findElement(By.xpath("//*[@id=\"EmailAddress\"]")).sendKeys("testing@epiphanysolutions.co.uk");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Xp4w6e9s");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/form/div/div/button")).click(); //Login Button
		
		
		Actions action = new Actions(driver); //Account Overview mouse over
		WebElement we = driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[1]/ul/li[4]/div/div[1]/span"));
		action.moveToElement(we).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[1]/ul/li[4]/div/div[2]/ul/li[3]/a")).click(); //Log out
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[1]/ul/li[5]/a")).click(); //Login
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/form/label[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"EmailAddress\"]")).sendKeys("testing@epiphanysolutions.co.uk");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/form/div/div/button")).click();
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"EmailAddress\"]")).sendKeys("testing@epiphany.co.uk");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Xp4w6e9s");	
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/form/div/div/button")).click(); //Reset Password
	
		driver.get("https://www.workthere.com/dashboard/reset-password/?resetGUID=8a1a6965624841448c41b29ee92641c920ea37abc5ce1c402b4a043385705366");
		driver.findElement(By.xpath("//*[@id=\"EmailAddress\"]")).sendKeys("testing@epiphanysolutions.co.uk");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Xp4w6e9ss");
		//*[@id="container"]/div/a
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/a")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div/div/div/div[2]/div[2]/a/p")).click(); //Select UK
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[1]/ul/li[5]/a")).click(); //Login
		driver.findElement(By.xpath("//*[@id=\"EmailAddress\"]")).sendKeys("testing@epiphanysolutions.co.uk");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Xp4w6e9s1");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/form/div/div/button")).click(); //Login Button
		
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div[3]/div/div/div/form/label[1]/div/div/i[2]/svg/path")).click();
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div[3]/div/div/div/form/label[1]/div/div/i[2]/svg/path")).click();
		
//		Select sel = new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div[3]/div/div/div/form/label[1]/div/div/i[2]/svg")));
//		sel.selectByIndex(2);
//		//*[@id="container"]/div[1]/div[3]/div/div/div/form/label[1]/div/div
		
		//SIGN UP
		
//		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[1]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"EmailAddress\"]")).sendKeys("emmbnael.dele@epiphany.com");
//		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Xp4w6e9s11");
//		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Emmannnn");
//		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Loreey");
//		driver.findElement(By.xpath("//*[@id=\"Telephone\"]")).sendKeys("07999455363");
//		driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("Epiphany");
////		Select sel = new Select(driver.findElement(By.xpath("//*[@id=\\\"container\\\"]/div/div/div[1]/div/div/div/form/div[6]/div[1]/label/div/div")));
////		sel.selectByValue("USD");
//		
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[1]/div/div/div/form/div[7]/div/button")).click();
//		
//		driver.get("https://www.workthere.com/");
//		driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[2]/nav[1]/ul/li[1]/div/a[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"enquiry-form\"]/label[1]/textarea")).sendKeys("We can find you the type of space you need, whether that’s a hot desk, a co-working office, or your own private office. ");
//		driver.findElement(By.xpath("//*[@id=\"enquiry-form\"]/label[2]/input")).sendKeys("Loresdddey");
//		driver.findElement(By.xpath("//*[@id=\"enquiry-form\"]/label[3]/input")).sendKeys("Emmakkshsgdg");
//		driver.findElement(By.xpath("//*[@id=\"enquiry-form\"]/label[4]/input")).sendKeys("Epiphany@edfp.com");
//		driver.findElement(By.xpath("//*[@id=\"enquiry-form\"]/label[5]/input")).sendKeys("38383302029");
//		driver.findElement(By.xpath("//*[@id=\"enquiry-form\"]/label[6]/input")).sendKeys("Epiphany.com");
//		driver.findElement(By.xpath("//*[@id=\"enquiry-form\"]/button")).click();
//		
		
		
		
		
	
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		

	}

}
