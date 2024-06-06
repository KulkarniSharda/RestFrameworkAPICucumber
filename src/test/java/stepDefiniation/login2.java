package stepDefiniation;

import io.cucumber.java.en.When;

public class login2 {


    @When("user enter <username> and <password>")
    public void user_enter_username_and_password(io.cucumber.datatable.DataTable dataTable) {

        System.out.println( dataTable);
    }











}
