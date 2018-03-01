package CallCredit_Pacckage;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;




public class Contact_Us {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "H:\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://callcredit.epiphanydev4.co.uk/contact-us");
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/table[2]/tbody/tr/td/span/a/span")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolderDefault_body_extra_FormLoader_19_RenderForm_20_rpFieldsets_rpFields_0_9e2baf96_ccc5_4f84_9141_29598f6dfc5c_0\"]")).sendKeys("ForenameEmma");
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolderDefault_body_extra_FormLoader_19_RenderForm_20_rpFieldsets_rpFields_0_051fc1b4_0d3f_4795_88bf_9895f2895277_1\"]")).sendKeys("SurnameEmma");
		
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolderDefault_body_extra_FormLoader_19_RenderForm_20_rpFieldsets_rpFields_0_43912e1f_3de6_4590_a7c4_7212d5964828_3\"]")).sendKeys("M11 3AD");		
		driver.findElement(By.xpath("//*[@id=\"page-1347\"]/div[4]/div[2]/div[2]/div[2]")).click();
		
		
	
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolderDefault_body_extra_FormLoader_19_RenderForm_20_rpFieldsets_rpFields_0_71e9e8e9_4a4f_4bf2_bd36_6ccb6e5c25a9_2\"]")).sendKeys("Mrs");
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolderDefault_body_extra_FormLoader_19_RenderForm_20_rpFieldsets_rpFields_0_0ec6936b_a72d_4d97_891f_1931f64118de_10\"]")).sendKeys("testing@epiphany.co.uk");
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolderDefault_body_extra_FormLoader_19_RenderForm_20_rpFieldsets_rpFields_0_558ac8f4_20a4_464a_95b2_f5f1dd0fd24b_11\"]")).sendKeys("03737373736535");
		
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolderDefault_body_extra_FormLoader_19_RenderForm_20_rpFieldsets_rpFields_0_1a7f79c0_7232_4994_b5f4_72bf23da6540_12\"]")));
		dropdown.selectByVisibleText("Business Services");
		
		Select dropdown2 = new Select(driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolderDefault_body_extra_FormLoader_19_RenderForm_20_rpFieldsets_rpFields_0_a8078bac_6b37_45de_96d7_ee96adf11186_13\"]")));
		dropdown2.selectByVisibleText("Word of Mouth");
		
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolderDefault_body_extra_FormLoader_19_RenderForm_20_rpFieldsets_rpFields_0_a3273910_76bf_4253_897b_4e722759f8f7_14\"]")).sendKeys("Please note that we are unable to answer queries");
	
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolderDefault_body_extra_FormLoader_19_RenderForm_20_rpFieldsets_rpFields_0_chkEmail_20\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolderDefault_body_extra_FormLoader_19_RenderForm_20_rpFieldsets_rpFields_0_be80c523_c946_4786_9f60_ec0d1fa4bb5b_21_1_21\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolderDefault_body_extra_FormLoader_19_RenderForm_20_rpFieldsets_rpFields_0_5d583e86_0841_47dc_af4a_810556a304e9_22\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolderDefault_body_extra_FormLoader_19_RenderForm_20_b_next\"]")).click();
		
		//driver.close();
	
	
	}

}
