package Com.Orangelive.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.qa.TestBaseDemo.Testbase;

public class LoginPage extends Testbase
{
@FindBy(id="email")
WebElement userEmail;

@FindBy(id="pass")
WebElement userPass;

@FindBy(xpath="//input[@value='Log in']")
WebElement loginbutton;

public LoginPage()
{
	PageFactory.initElements(driver,this);
}
public String verifyTitle()
{
	return driver.getTitle();
}

public void verifyLogin()
{
	userEmail.sendKeys(prop.getProperty("username"));
	userPass.sendKeys(prop.getProperty("userPass"));
	loginbutton.click();
	driver.navigate().back();
}
}

