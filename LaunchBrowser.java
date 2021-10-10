package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();// it will download the driver and setup the path
		// to open the chrome browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to maximize the window opened
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		//Thread.sleep(5000);
		//driver.close();

		/*// to setup edge browser
		WebDriverManager.edgedriver().setup();
		// to launch edge browser
		EdgeDriver drv = new EdgeDriver();
		drv.get("http://leaftaps.com/opentaps/control/main");*/

		// to setup firefox browser
		/*
		 * WebDriverManager.firefoxdriver().setup(); FirefoxDriver fire = new
		 * FirefoxDriver();
		 */
		
		// To close the browser
		
		//drv.close();
		//driver.quit();
		//drv.quit();
		
		//To locate a single element
		
	}

}
