package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;

@RunWith(Cucumber.class)
public class Stepdefinition {
   
    @Given("^user is on landing page$")
    public void user_is_on_landing_page() throws Throwable{
    	
    	System.out.println("one");
      
    }

    @When("^user login into an application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_an_application_with_and_password(String s,String b) throws Throwable{
    	
    	System.out.println(s);
    	System.out.println(b);
       
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable{
    	System.out.println("othree");
    }
    
    @When("^user signup with details$")
    public void user_signup_with_details(DataTable data) throws Throwable{
    	List<List<String>> obj=data.asLists();
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));
    	System.out.println(obj.get(0).get(4));
    	
    }
    	
    	 @When("user login with (.+) and (.+)$")
    public void user_login_with_and(String t,String p) throws Throwable{
    		 
    		 System.out.println(t);
    	    	System.out.println(p);
    		
       
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable{
    	System.out.println("four");
    }
}
