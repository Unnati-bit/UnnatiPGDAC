package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateXPATH {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CDAC\\Desktop\\UnnatiSE\\chromedriver-win32\\chromedriver.exe");

		WebDriver wd1 = new ChromeDriver();
		wd1.get("https://demo.automationtesting.in/Register.html");
		wd1.manage().window().maximize();
	}
}
