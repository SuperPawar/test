package Demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Parll2 {

	WebDriver driver;

	@Test
	public void Test1() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		System.out.println("Test 1 " + Thread.currentThread().getId());
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@Test
	public void Test2() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		System.out.println("Test 1 " + Thread.currentThread().getId());
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

}
