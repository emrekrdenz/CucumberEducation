package stepDefinition;

import PageObjectModel.register_Page;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.Driver;


import java.util.concurrent.TimeUnit;

public class Register_Steps {

    private WebDriver driver;
    register_Page register_page=new register_Page();

    @Given("Navigate to Website")
    public void navigate_to_website() {

        driver= Driver.getDriver();

        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("click Sign in button")
    public void click_sign_in_button() {

        register_page.clickOnSignInButton();
    }

    @And("type email {string}")
    public void type_email(String email) {

        register_page.typeEmail(email);
    }

    @And("click on Create an Account button")
    public void click_on_create_an_account_button() {

        register_page.clickOnSubmitButton();
    }

    @And("choose title")
    public void choose_title() {

    }

    @And("type firstname {string} and lastname {string}")
    public void type_firstname_and_lastname(String firstname, String lastname) {

        register_page.typeFirstnameAndLastName(firstname,lastname);
    }

    @And("type password {string}")
    public void type_password(String password) {

        register_page.typePassword(password);
    }

    @And("type Company {string}")
    public void type_company(String company) {

        register_page.typeCompany(company);
    }


    @And("type address {string}")
    public void typeAddress(String address) {

        register_page.typeAddress(address);
    }

    @After
    public void quitDriver() throws InterruptedException {

        Thread.sleep(2000);
        Driver.closeDriver();
    }



}
