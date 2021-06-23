package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_Steps {

    @Given("Amazon sitesine git")
    public void amazon_sitesine_git() {

        System.out.println("Siteye gidildi");
    }

    @Given("login butonuna tıkla")
    public void login_butonuna_tıkla() {
        System.out.println("Logine tıklandı");
    }

    @Given("isim gir")
    public void isim_gir() {
        System.out.println("isim girildi");
    }

    @Given("sifre gir")
    public void sifre_gir() {
        System.out.println("sifre girildi");
    }

    @When("submit butonuna tıkladıgımda")
    public void submit_butonuna_tıkladıgımda() {
        System.out.println("submit");
    }

    @Then("success mesajini verify et")
    public void success_mesajini_verify_et() {
        System.out.println("mesajj");
    }



}
