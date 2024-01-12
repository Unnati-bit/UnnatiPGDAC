package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioGuru7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CDAC\\Desktop\\UnnatiSE\\chromedriver-win32\\chromedriver.exe");

		WebDriver wd1 = new ChromeDriver();
		wd1.get("https://demo.guru99.com/v4/");
		wd1.manage().window().maximize();

		wd1.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		wd1.findElement(By.xpath("//a[contains(text(),'Radio & Checkbox Demo')]")).click();
		Thread.sleep(2000);

	}

}
