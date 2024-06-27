package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;
import Testcases.DriveRclass;
import junit.framework.Assert;

public class Scenario1 extends Baseclass {
	
	WebDriver driver;
	
public 	Scenario1(WebDriver driver) {
				this.driver = driver;
}

 By newfeatures = By.xpath("//button[@aria-label='New & Featured']");
By  Bestseller = By.xpath("(//div[@id='DesktopMenu-0-0-0']/child::div//child::div//child::a[7])[position()=1]");
By  sort_dropdown = By.xpath("//button[@class='dropdown__btn css-10h9yp8']");
 By price_dropdown = By.xpath("//button[@value='priceAsc']");
 By product = By.xpath("//img[@alt='Nike Kawa Baby & Toddler Slides']");
 By product_name = By.xpath("(//h1[@class='headline-2 css-16cqcdq'])[2]");
 By size = By.linkText("UK 1.5");
 By Addtocart = By.xpath("//button[@class='ncss-btn-primary-dark btn-lg add-to-cart-btn']");
public void newfeatures() throws InterruptedException {
 Actions actions = new Actions(driver);
 WebElement newcar = driver.findElement(newfeatures);
		// driver.findElement(By.xpath("//button[@aria-label='New & Featured']"));
actions.moveToElement(newcar).perform();
Thread.sleep(3000);
WebElement ele = driver.findElement(Bestseller);
actions.moveToElement(ele).click().perform();

}

public void Bestseller() throws InterruptedException {

			Thread.sleep(3000);
}
public void sort_dropdown() throws InterruptedException {
	WebElement sort = driver.findElement(sort_dropdown);
	sort.click();
	Thread.sleep(3000);
	System.out.println("Sorting clicked");
}
public void price_dropdown() {
	WebElement pre = driver.findElement(price_dropdown);
	pre.click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,650)");
}

public void product() {
	WebElement pr = driver.findElement(product);
	pr.click();
	//takecreenshots("product");
	
}
public void product_name() {
	String act = "Nike Kawa";
	WebElement txt = driver.findElement(product_name);
	System.out.println(txt.getText());
	String exp = txt.getText();
	Assert.assertEquals(act, exp);
	
	System.out.println("The page belomgs to nike kawa");
}

public void size() {
	WebElement uk = driver.findElement(size);
	uk.click();
}
public void Addtocart() {
	WebElement bag  = driver.findElement(Addtocart);
	bag.click();
}

}