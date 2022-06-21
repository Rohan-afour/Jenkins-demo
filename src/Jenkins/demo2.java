package Jenkins;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

public class demo2 {				
    		
    public static void main(String[] args) {									
        String baseUrl = "https://www.saucedemo.com/";					
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohan.M\\Desktop\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);					
        driver.manage().window().maximize();
		driver.findElement(By.name("user-name")).sendKeys("standard_user");		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		
		driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
	
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.name("checkout")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Rohan");
		driver.findElement(By.id("last-name")).sendKeys("Mandavkar");
		driver.findElement(By.id("postal-code")).sendKeys("415612");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("finish")).click();
		
		
		
		System.out.println("Test succesful");
        //driver.quit();			
    }	
}