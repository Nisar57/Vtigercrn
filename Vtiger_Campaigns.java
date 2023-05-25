package Vtiger_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger_Campaigns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("appnavigator")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()=' MARKETING']"));

		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[@title='Campaigns']")).click();
		driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("xyz");
		driver.findElement(By.id("s2id_autogen3")).click();
		driver.findElement(By.xpath("//div[text()='Planning']")).click();
		driver.findElement(By.id("s2id_autogen5")).click();
		driver.findElement(By.xpath("//div[text()='Conference']")).click();
		driver.findElement(By.id("Campaigns_editView_fieldName_targetaudience")).sendKeys("150");
		driver.findElement(By.id("Campaigns_editView_fieldName_closingdate")).click();
		driver.findElement(By.xpath("(//td[text()='8'])[1]")).click();
//		driver.findElement(By.id("Campaigns_editView_fieldName_product_id_select")).click();
//		driver.findElement(By.xpath("(//a[text()='Software'])[1]")).click();
		driver.findElement(By.id("Campaigns_editView_fieldName_product_id_create")).click();
		driver.findElement(By.id("Products_editView_fieldName_productname")).sendKeys("vtiger");
		driver.findElement(By.id("Products-editview-fieldname-unit_price")).sendKeys("25");
		driver.findElement(By.id("tax1_check")).click();
		driver.findElement(By.id("tax2_check")).click();
		driver.findElement(By.id("tax3_check")).click();
		driver.findElement(By.id("Products_editView_fieldName_qtyinstock")).sendKeys("35");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		driver.findElement(By.id("Campaigns_editView_fieldName_sponsor")).sendKeys("apple");
		driver.findElement(By.id("Campaigns_editView_fieldName_targetsize")).sendKeys("100");
		driver.findElement(By.id("Campaigns_editView_fieldName_numsent")).sendKeys("50");
		driver.findElement(By.id("Campaigns_editView_fieldName_budgetcost")).sendKeys("100");
		driver.findElement(By.id("Campaigns_editView_fieldName_actualcost")).sendKeys("50");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.id("s2id_autogen7")).click();
		driver.findElement(By.xpath("//div[text()='Good']")).click();
		driver.findElement(By.id("Campaigns_editView_fieldName_expectedrevenue")).sendKeys("30");
		driver.findElement(By.id("Campaigns_editView_fieldName_expectedsalescount")).sendKeys("50");
		driver.findElement(By.id("Campaigns_editView_fieldName_actualsalescount")).sendKeys("30");
		driver.findElement(By.id("Campaigns_editView_fieldName_expectedresponsecount")).sendKeys("100");
		driver.findElement(By.id("Campaigns_editView_fieldName_actualresponsecount")).sendKeys("80");
		driver.findElement(By.id("Campaigns_editView_fieldName_expectedroi")).sendKeys("100");
		driver.findElement(By.id("Campaigns_editView_fieldName_actualroi")).sendKeys("90");
		driver.findElement(By.id("Campaigns_editView_fieldName_description")).sendKeys("Thank you !!!!");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		driver.findElement(By.xpath("//span[@title='Atlas Jeniffer(admin)']")).click();
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		
	}

}
