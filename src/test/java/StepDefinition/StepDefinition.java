package StepDefinition;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.hooks;

public class StepDefinition {
	
	
	WebDriver driver = hooks.driver;
	
	

@Given("^userNavigatesto URL$")
public void usernavigatesto_URL() throws Throwable {
	
	

	driver.get("http://elearningm1.upskills.in/");

	
			
			//html/body
		}
	
	

	//*[@id="registration_phone"]

	//*[@id="registration_official_code"]

	
	
	
	
    //throw new PendingException();


@Then("^click on Signup$")
public void click_on_Signup() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,");
	driver.findElement(By.xpath("//*[@id=\"login-block\"]/div/ul/li[1]/a")).click();
   
}

@Given("^enter data$")
public void enter_data() throws Throwable {
	 driver.findElement(By.xpath("//input[@id='registration_firstname']")).sendKeys("Kalyani");
		driver.findElement(By.xpath("//input[@id='registration_lastname']")).sendKeys("ch");
		driver.findElement(By.xpath("//*[@id='registration_email']")).sendKeys("chavalikalyani@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("kkd941222");
		driver.findElement(By.xpath("//*[@id='pass1']")).sendKeys("Kalyani1122@");
		driver.findElement(By.xpath("//*[@id='pass2']")).sendKeys("Kalyani1122@");

}

@Given("^click on create button$")
public void click_on_create_button() throws Throwable {
	driver.findElement(By.xpath("//*[@id='registration_submit']")).click();
	
  
}

@Then("^User should be created$")
public void user_should_be_created() throws Throwable {

	String s1=driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/div/p[1]")).getText();
	String s2= "Kalyani ch";
			
	if (s1.contains(s2))
	{
		driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/a/img")).click();
		String s3=driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[1]/div/p")).getText();
		
		System.out.println("EMAIL"+s3);
		if(s3.contains("chavalikalyani@gmail.com"))
		{
			System.out.println(" Email is correct");
			
			driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[1]/div/a/p")).click();
			driver.findElement(By.xpath("//*[@id='sn-sidebar-collapse']/div/ul/li[2]/a")).click();
			driver.findElement(By.xpath("	//*[@id='toolbar']/div/div[1]/a[1]/img")).click();
		}	
			else
				
				System.out.println(" Email is not correct");
		}
		
	
}


@Then("^SendMessage$")
public void sendmessage() throws Throwable {
		
	driver.findElement(By.xpath("//input[@placeholder='Please select an option']")).sendKeys("Kalyani");
	System.out.println("Entered Data");
	Thread.sleep(2000);
	
	String searchText = "Kalyani ch";
	WebElement dropdown = driver.findElement(By.xpath("//*[@id='select2-compose_message_users-results']"));
	//dropdown.click(); // assuming you have to click the "dropdown" to open it
	
		List<WebElement> options = dropdown.findElements(By.tagName("li"));
		
		//dropdown.findElement(By.xpath("//option[.='" + searchText + "']")).click();
	
	for (WebElement option : options)
	{
		System.out.println("1111111111111111111");
		System.out.println(option.getText());
	    if (option.getText().contains(searchText))
	    {
	        option.click(); // click the desired option
	        break;
	    }
	}
		
		//String valtoSelect = "Kalyani ch";
	       // countryOfReg.click();
	      //  List<WebElement> webMom = Collections.singletonList(driver.findElement(By.tagName("li")));
	        /*for (int i = 1; i <= webMom.size()-1; i++) {
	            System.out.println(driver.findElement(By.xpath("//li[@class='select2-results__option']"+"["+i+"]")).getText());
	          //													li[@class="select2-results__option"]0']
	            if (driver.findElement(By.xpath("//li[@class=\"select2-results__option\"]"+"["+i+"]")).getText().contains(valtoSelect)){
	            
	                driver.findElement(By.xpath("//li[@class=\"select2-results__option\"]"+"["+i+"]")).click();
	                break;
	            }
	        }*/
		
		
	//	public void selectCountry(){
	        
	    
	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\'select2-compose_message_users-results']/li[2]")).click();
	Boolean staleElement = true; 

	while(staleElement){

	  try{
		  System.out.println(".........");

	     driver.findElement(By.xpath("//*[@id='compose_message_title']")).sendKeys("MAIL");
	     staleElement = false;


	  } catch(StaleElementReferenceException e){

	    staleElement = true;

	  }

	}
	driver.findElement(By.xpath("//*[@id='compose_message_title']"));
	WebElement frame=driver.findElement(By.xpath("//*[@id='cke_1_contents']/iframe")) ;
	driver.switchTo().frame(frame);
	driver.findElement(By.xpath("//body")).click();
	driver.findElement(By.xpath("//body/p")).sendKeys("body");
	
   
}

}