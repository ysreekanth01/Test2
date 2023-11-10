package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	 @Before("@mobileTest")
	 public void beforevalidation() {
		 System.out.println("before mobile hook");
	 }

	 @After("@mobileTest")
	 public void afterValidation() {
		 System.out.println("after mobile hook");
	 }
	 
	 @Before("@webTest")
	 public void beforewebTest() {
		 System.out.println("before mobile hook");
	 }

	 @After("@webTest")
	 public void afterwebTest() {
		 System.out.println("after mobile hook");
	 }

}
