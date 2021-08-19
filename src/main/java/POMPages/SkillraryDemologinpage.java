package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemologinpage {
	
	@FindBy(id="course")
	private WebElement courcebtn;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	
	
	public WebElement getCoursedd() {
		return coursedd;
	}

	public SkillraryDemologinpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCourcebtn() {
		return courcebtn;
	}

	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	public void courcebtn()
	{
		courcebtn.click();
	}
	
	public void seleniumtraining()
	{
		seleniumtraining.click();
	}

}
