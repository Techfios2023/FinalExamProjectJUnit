package util;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
public static WebDriver driver;

 
	
	public   void init() {

		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/test/107/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//return driver;

	}
	 
	

    public static int randomnumber( ){
        Random rand = new Random();
        int randomNumber = rand.nextInt(99); 
 //       System.out.println("Random number: " + randomNumber);
		return randomNumber;
    }
}


