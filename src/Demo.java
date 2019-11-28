import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) {
		Test2 myObj=new Test2();
		myObj.invokeBrowser();
	}
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users⁩/srishti⁩/Downloads/chromedriver_mac64.zip⁩");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		
	}

}
