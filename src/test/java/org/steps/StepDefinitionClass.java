package org.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionClass {
	WebDriver  driver;
	@Given("user launches the adactin hotel url")
	public void user_launches_the_adactin_hotel_url() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
	    
	}

	@When("user enters the {string} and {string}")
	public void user_enters_the_and(String string, String string2) {
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
  	}

	@When("user click on the login button")
	public void user_click_on_the_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@When("user select the {string} and{string} and {string}and{string}and {string}and {string}")
	public void user_select_the_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException {
		WebElement location= driver.findElement(By.id("location"));
		Select s= new Select(location);
		s.selectByValue(string);
		
		WebElement Hotels= driver.findElement(By.id("hotels"));
		Select s1= new Select(Hotels);
		s1.selectByValue(string2);
		
		WebElement roomType= driver.findElement(By.id("room_type"));
		Select s2= new Select(roomType);
		s2.selectByValue(string3);
		
		WebElement roomNo= driver.findElement(By.id("room_nos"));
		Select s3= new Select(roomNo);
		s3.selectByValue(string4);
		
		WebElement adults= driver.findElement(By.id("adult_room"));
		Select s4= new Select(adults);
		s4.selectByValue(string5);
		
		WebElement childs= driver.findElement(By.id("child_room"));
		Select s5= new Select(childs);
		s5.selectByValue(string6);
		
		}

	@When("user click on the search and continue button")
	public void user_click_on_the_search_and_continue_button() throws InterruptedException {
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		WebElement radioButton = driver.findElement(By.id("radiobutton_0"));
		radioButton.click();
		WebElement contin=driver.findElement(By.id("continue"));
		contin.click();
		Thread.sleep(3000);
	    
	}

	@When("user enters the {string} and {string}and{string}and{string}")
	public void user_enters_the_and_and_and(String string, String string2, String string3, String string4) throws InterruptedException {
		WebElement firstName = driver.findElement(By.name("first_name"));
		firstName.sendKeys(string);
		WebElement lastName = driver.findElement(By.name("last_name"));
		lastName.sendKeys(string2);
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys(string3);
		WebElement cardNo = driver.findElement(By.name("cc_num"));
		cardNo.sendKeys(string4);   
	    
	}

	@When("user select the {string} and {string} and{string}")
	public void user_select_the_and_and(String string, String string2, String string3) {
		WebElement cardType = driver.findElement(By.id("cc_type"));
		Select se7=new Select(cardType);
		se7.selectByValue(string);
		WebElement selectMonth= driver.findElement(By.id("cc_exp_month"));
		Select se8=new Select(selectMonth);
		se8.selectByValue(string2);
		WebElement selectYear = driver.findElement(By.id("cc_exp_year"));
		Select se9=new Select(selectYear);
	    se9.selectByValue(string3);
	    
	}

	@When("user enters the{string}")
	public void user_enters_the(String string) {
		 WebElement cvv = driver.findElement(By.id("cc_cvv"));
		   cvv.sendKeys(string);
	   
	}

	@When("user click on book now")
	public void user_click_on_book_now() throws InterruptedException {
		WebElement submit = driver.findElement(By.id("book_now"));
	    submit.click();
	    Thread.sleep(3000);
	    
	}

	@Then("user validates the title of the webpage")
	public void user_validates_the_title_of_the_webpage() throws InterruptedException {
		boolean contains = driver.getTitle().contains("Facebook");
		Assert.assertTrue(contains);
		Thread.sleep(2000);
		driver.quit();
	    
	}




}
