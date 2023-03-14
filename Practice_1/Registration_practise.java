package examPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("F:\\Year 3 sem 2\\CS 3212 Practical Work on CS3222\\Practice_1\\index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("f_name")).sendKeys("Joseph Vijay");
		driver.findElement(By.name("l_name")).sendKeys("Chandrasekhar");
		driver.findElement(By.name("dob")).sendKeys("22/06/1974");
		driver.findElement(By.id("email")).sendKeys("vijaya@yahoo.com");
		driver.findElement(By.name("phnno")).sendKeys("+9167 765 43214");
		driver.findElement(By.id("adrs")).sendKeys("64, Kaveri Street, Saligramam, Chennai 600093, Tamil Nadu, India");
		
		driver.findElement(By.id("male")).click();
		driver.findElement(By.name("hobby_1")).click();
		driver.findElement(By.name("hobby_3")).click();
		driver.findElement(By.className("cs3")).click();
		
		String error_msg = "Passwords are not equal";
		
		WebElement password = driver.findElement(By.name("pswd"));
		password.sendKeys("vijay@123456");
		
		WebElement rpassword = driver.findElement(By.id("rpswd"));
		rpassword.sendKeys("vijay@12345");
		
		String pswd = password.getAttribute("value");
		String rswd = rpassword.getAttribute("value");
		
		if(!pswd.equals(rswd)) {
			System.out.println(error_msg);
		}

	}

}
