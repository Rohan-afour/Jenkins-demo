package Jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
		      "C:\\Users\\Rohan.M\\Desktop\\chromedriver.exe");
		      //ChromeOptions object
		      ChromeOptions opt = new ChromeOptions();
		      //set language to Spanish
		      //opt.addArguments("−−lang=es");
		      String locale="fr";
		      opt.addArguments("--lang=" + locale);
		      // configure options parameter to Chrome driver
		      WebDriver driver = new ChromeDriver(opt);
		      driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		      driver.get("https://en.wikipedia.org/wiki/Main_Page");
				driver.findElement(By.name("search")).sendKeys("Tests logiciels");		
				driver.findElement(By.id("searchButton")).click();
				
				System.out.println("Test succesful");
				
		      
		      
}
}

