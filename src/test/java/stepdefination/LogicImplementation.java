package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogicImplementation {

	 ChromeDriver driver;
	
	@Given("OpenBrowser and Enter Url")
	public void OpenBrowser_and_Enter_Url() {
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
	}
	
	@When("User Entered valid username")
	public void UserEnteredvalidusername() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	}
	@And("User Entered valid password")
	public void User_Entered_valid_Passsword() {
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
	}
	@When("User Click On Login Btn")
	   public void User_Click_On_Login_Btn() {
			driver.findElement(By.tagName("button")).click();
		}
	   
	   @Then("It should display Dashboardapage")
	   public void It_should_naviagte_to_Dashboard_page() {
		   
		  String ActualValue= driver.findElement(By.xpath("(//h1)[2]")).getText();
		  String ExpectedValue="Dashboard";
		  Assert.assertEquals(ExpectedValue, ActualValue);
	   }
	
	   @And("close the browser")
	   public void close_the_browser() {
		   driver.close();
	   }
	   
	   
	   @When("User Entered invalid username")
	   public void user_entered_invalid_username() {
		   driver.findElement(By.id("Email")).clear();
			driver.findElement(By.id("Email")).sendKeys("adminstore.com");
		
	   }

	   @When("User Entered invalid password")
	   public void user_entered_invalid_password() {
		   driver.findElement(By.id("Password")).clear();
			driver.findElement(By.id("Password")).sendKeys("abcadmin");

	   }

	   @Then("It should display Error message")
	   public void it_should_display_error_message() {
		   System.out.println("error");
	   }

}
