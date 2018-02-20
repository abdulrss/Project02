import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.*;
import org.testng.annotations.Test;

import com.sun.jna.platform.win32.WinUser.KEYBDINPUT;




public class firstTest {

		
	@Test
	public void verifyGooglePage() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Test\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\Automation Test\\IEDriverServer.exe");
		WebDriver driver = new ChromeDriver();
	
		
		//WebDriver driver = new InternetExplorerDriver();
		driver.get("https://google.co.uk");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("linkedin uk");
		
		//driver.findElement(By.name("btnK")).click();
		
		System.out.print(driver.getTitle() + " is the title");
		//close
		driver.close();
	}

}
