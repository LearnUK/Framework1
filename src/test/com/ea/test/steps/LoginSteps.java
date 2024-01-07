package com.ea.test.steps;

import com.ea.framework.base.Base;
import com.ea.test.ppages.HomePage;
import com.ea.test.ppages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.lang.reflect.Type;
import java.util.List;

public class LoginSteps extends Base {
    @And("I ensure application opened")
    public void iEnsureApplicationOpened () throws Throwable
    {
        CurrentPage = GetInstance(HomePage.class);
        Assert.assertTrue("The login page is not loaded", CurrentPage.As(HomePage.class).IsLogin());
        Thread.sleep(3000);
    }

    @Then("I click on link")
    public void iClickOnLink() throws Throwable {
        //Navigation to Login Page
        CurrentPage = CurrentPage.As(HomePage.class).clickLogin();
        Thread.sleep(3000);
    }

    @When("I enter UserName and Password")
    public void iEnterUserNameAndPassword(DataTable data) throws Throwable {
        List<List<String>> table = data.asList((Type) String.class);
        //List<List<String>> table = data.raw();
        CurrentPage.As(LoginPage.class).Login(table.get(1).get(0).toString(), table.get(1).get(1).toString());
    }

    @Then("I click on login button")
    public void iClickOnLoginButton() throws Throwable {
        //Home Page
        CurrentPage = CurrentPage.As(LoginPage.class).ClickLogin();
        Thread.sleep(3000);
    }

    @Then("I should see the username with hello")
    public void iShouldSeeTheUsernameWithHello() {
        Assert.assertEquals("The user is not admin", CurrentPage.As(HomePage.class).GetLoggedInUSer(), "Hello admin!");
    }
}
