package JUnit;

import java.util.concurrent.TimeUnit;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitProject {

WebDriver driver;
	
	@Before
public void init() {

System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");

driver= new ChromeDriver();

driver.manage().deleteAllCookies();

driver.get("https://techfios.com/test/104/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
}

@Test
public void test1()throws InterruptedException {

WebElement toggleAllBox = driver.findElement(By.name("allbox"));
toggleAllBox.click();
Thread.sleep(300);		
	
}

@Test
public void test2()throws InterruptedException {

WebElement checkBox = driver.findElement(By.name("todo[1]"));
checkBox.click();
Thread.sleep(300);	

WebElement removeSubmitButton = driver.findElement(By.name("submit"));
removeSubmitButton.click();
Thread.sleep(300);
}


@Test
public void test3()throws InterruptedException {

WebElement toggleAllBox = driver.findElement(By.name("allbox"));
toggleAllBox.click();
Thread.sleep(300);	

WebElement removeSubmitButton = driver.findElement(By.name("submit"));
removeSubmitButton.click();
Thread.sleep(300);
}}







