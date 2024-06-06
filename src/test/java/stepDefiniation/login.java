package stepDefiniation;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import org.testng.annotations.Test;

public class login {

    @Before
    public void setup(){
        System.out.println("browser open in before");
    }

    @After
    public void tearDown(){
        System.out.println("browser close in after hook");
    }

    @BeforeStep
    public void test(){
        System.out.println("before every step");
    }


    @Given("Browser is open")
    public void browser_is_open() {
        System.out.println("browser open on background");
    }



    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("login page");
    }
    @When("page is loaded successful")
    public void page_is_loaded_successful() {
        System.out.println("login page");
    }
    @When("user enter username and password")
    public void user_enter_username_and_password() {
        System.out.println("login page");
    }
    @Then("user logged in successful")
    public void user_logged_in_successful() {
        System.out.println("login page");;
    }

    @When("user enter {string} and {string}")
    public void user_enter_and(String user, String pass) {
        System.out.println(" username "+user);
        System.out.println(" password "+pass);
    }
}
