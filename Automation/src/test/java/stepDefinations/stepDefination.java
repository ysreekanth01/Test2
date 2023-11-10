package stepDefinations;

import java.util.List;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	
	


@Given("User is on netbanking login page")
public void user_is_on_netbanking_login_page() {
	System.out.println("User is on netbanking login page executed successfully");
}
@When("user login into application with username and password")
public void user_login_into_application_with_username_and_password() {
	System.out.println("user login into application with username and password executed successfully");
	
}
@Then("home page is populated")
public void home_page_is_populated() {
	System.out.println("home page is populated executed successfully");
}





@When("user sign up with following details")
public void user_sign_up_with_following_details(io.cucumber.datatable.DataTable dataTable) {
   List<List<String>>obj = dataTable.asLists(); //in above it is in table format. we are converting here from table to list format
    System.out.println(obj.get(0).get(0));
    System.out.println(obj.get(0).get(1));
    System.out.println(obj.get(0).get(2));
    System.out.println(obj.get(0).get(3));
    System.out.println(obj.get(0).get(4));
}  





@When("user login into application with username {string} and password {string}")
public void user_login_into_application_with_username_and_password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println(string);
    System.out.println(string2);
}



@Then("cards are displayed")
public void cards_are_displayed() {
	System.out.println("cards are displayed executed successfully");
}




@Then("cards displayed are {string}")
public void cards_displayed_are(String string) {
	System.out.println(string);
    
}




@When("^user login in to application with (.*) and password (.*)$")
public void user_login_in_to_application_with_username_user1_and_password_pass1(String username, String password) {
	System.out.println(username);
	System.out.println(password);
    
}



@Given("validate the browser")
public void validate_the_browser() {
	System.out.println("navigate to login url");
  
}
@When("Browser is triggered")
public void browser_is_triggered() {
	System.out.println("browser is triggered");
   
}
@Then("check if browser is started")
public void check_if_browser_is_started() {
	System.out.println("browser opened");
  
}











}
