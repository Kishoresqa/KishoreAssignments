package Week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumBasic {
	

public static void main (String [] args) {
	
	ChromeDriver driver = new ChromeDriver();
	
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
String title = driver.getTitle();
System.out.println(title);

String url = driver.getCurrentUrl();
System.out.println(url);

driver.close();

	
}
	
	
}
