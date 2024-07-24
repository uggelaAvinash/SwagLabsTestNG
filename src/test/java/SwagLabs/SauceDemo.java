package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SauceDemo {
WebDriver driver;

@Test(priority=1)
void OpenBrowser() {
	driver =new EdgeDriver();
	driver.manage().window().maximize();	
}
@Test(priority=2)
void Launchapp() {
	driver.get("https://www.saucedemo.com/inventory.html");
}
@Test(priority=3)
void UserLogin() throws InterruptedException {
	driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
}
@Test(priority=4)
void viewCart() {
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
}
@Test(priority=5)
void cartIcon( ) {
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
}
@Test(priority=6)
void checkout() throws InterruptedException {
	driver.findElement(By.name("checkout")).click();
	Thread.sleep(2000);
}
@Test(priority=7)
void checkoutinformation() {
	driver.findElement(By.id("first-name")).sendKeys("avinash");
	driver.findElement(By.id("last-name")).sendKeys("uggela");
	driver.findElement(By.id("postal-code")).sendKeys("521227");
}
@Test(priority=8)
void Continue() {
	driver.findElement(By.id("continue")).click();
	
}
@Test(priority=9)
void Finish() {
	driver.findElement(By.id("finish")).click();
}
@Test(priority=10)
void backhome() {
	driver.findElement(By.id("back-to-products")).click();
}

@Test(priority=11)
void logout() throws InterruptedException {
	driver.findElement(By.id("react-burger-menu-btn")).click();
	driver.findElement(By.id("logout_sidebar_link")).click();
	Thread.sleep(3000);
}
@Test(priority=12)
void closebrowser() {
}
}
