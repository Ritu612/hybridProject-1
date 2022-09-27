package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage 
{
   @FindBy(id="course")
   private WebElement coursetab;
   
   @FindBy(name="addresstype")  // Tc2- Select testing from dropdown
   private WebElement coursedd;
   
   public WebElement getCoursedd() // getters method for selection from Dropdown
   {
	return coursedd;
}

@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
   private WebElement seleniumtrainingbox;
   
   public SkillraryDemoLoginPage(WebDriver driver )
   {
	   PageFactory.initElements(driver,this);
   }

public WebElement getCoursetab() 
{
	return coursetab;
}
   
   public void seleniumtrainingtab()
   {
	   seleniumtrainingbox.click();
   }
}


