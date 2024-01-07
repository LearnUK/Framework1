package com.ea.test.ppages;
import com.ea.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployeeList extends BasePage{
    public EmployeeList() {
    }
        @FindBy(how = How.CSS, using = "[class*='btn-primary']")
        public WebElement btnCreate;
}
