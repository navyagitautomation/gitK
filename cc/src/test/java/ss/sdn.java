package ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sdn {

	WebDriver driver;
@Given("user launches browser")
public void user_launches_browser() {
	 driver=new ChromeDriver();
	
}

@And("launch url")
public void launch_url() {
   driver.get("https://www.facebook.com/");
}

@Then("enters username and password")
public void enters_username_and_password() {
	WebElement name=driver.findElement(By.id("email"));
	name.sendKeys("gghf");
	//driver.findElement(By.id("email")).sendKeys("Navya");
	// enter password
	driver.findElement(By.id("pass")).sendKeys("1234");
	
}



@Then("enters {string} and {string}")
public void enters_and(String UN, String pwd) {
	WebElement name=driver.findElement(By.id("email"));
	name.sendKeys(UN);
	//driver.findElement(By.id("email")).sendKeys("Navya");
	// enter password
	driver.findElement(By.id("pass")).sendKeys(pwd);
}


@And("clicks on login")
public void clicks_on_login() {
	driver.findElement(By.name("login")).click();

}



}
