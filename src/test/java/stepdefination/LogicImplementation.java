package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	   
	   @And("User clicked on catalog link")
	   public void User_clicked_on_catalog_link() {
		   driver.findElement(By.xpath("//i[@class=\"nav-icon fas fa-book\"]")).click();
	   }
	   @When("User clicked on productlink")
	   public void User_clicked_on_productlink() {
		   driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]")).click();
	   }

	   @Then("it should display Products page")
	   public void it_should_display_Products_page() {
	String actual =driver.findElement(By.xpath("//h1[@class='float-left']")).getText();
	String Exp="Products";	
	Assert.assertEquals(Exp, actual);
	   }
	   
	 @And("User Enterd productname")
	 public void User_Enterd_productname() {
	 	   WebElement ele=driver.findElement(By.id("SearchProductName"));
	 	   ele.sendKeys("Apple MacBook Pro 13-inch");
	 }
	 @And("user clicked on searchBtn")
	 public void user_clicked_on_searchBtn() throws InterruptedException {
	 	   driver.findElement(By.id("search-products")).click();
	 	   driver.manage().window().maximize();
	 	   Thread.sleep(3000);
	 }

	 
	 @Then("particular product details should be displayed")
	 public void particular_product_details_should_be__displayed() {
	 	   String ActualValue= driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText();
	 		System.out.println(ActualValue);
	 }
	   
}
