package test.automatizacion;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class GooglePrueba {
	private WebDriver driver;
	
	@Before
	public void setUp () {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/empleos-testing/");
	}
	
	@Test
	public void testGooglePage() {
		//WebElement searchbox = driver.findElement(By.name("analista"));
		//searchbox.clear();
		//searchbox.sendKeys("analista");
		//searchbox.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//assertEquals ("empleos testing - Choucair Testing",driver.getTitle() );
	}
	
	@After
	public void tearDown () {	
		driver.quit();	
	}
}
