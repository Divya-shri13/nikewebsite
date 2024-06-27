package Testcases;

import org.testng.annotations.Test;
import Webpages.Scenario1;

public class Scenario1_Test extends DriveRclass {
	@Test

	public void Nike_method() throws InterruptedException {
		Scenario1 SC1 = new Scenario1(driver);
SC1.newfeatures();
SC1.Bestseller();
SC1.sort_dropdown();
SC1.price_dropdown();
SC1.product();
SC1.product_name();
	}

}
