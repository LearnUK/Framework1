package com.ea.test.ppages;
import com.ea.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {
    public LoginPage() {
    }
    /*public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }*/
    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUserName;
    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;
    @FindBy(how = How.CSS, using = "[class*='btn-default']")
    public WebElement btnLogin;

    public void Login(String Name, String Password){
        txtUserName.sendKeys((java.lang.CharSequence) Name);
        txtPassword.sendKeys((java.lang.CharSequence) Password);
    }
    public HomePage ClickLogin() {
        btnLogin.submit();
        //return new HomePage();
        return GetInstance(HomePage.class);
    }
}
