package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage  // For Tc-1
{
    @FindBy(xpath="//a[text()=' GEARS ']")
    private WebElement gearsbtn;
    
    @FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2 ]")
    private WebElement skillrarydemoapp;	
    
    @FindBy(name="q") // Tc-3 (search bar)
    private WebElement searchtab;
    
    @FindBy(xpath="//input[@value='go']")
    private WebElement searchbtn;
    
    public SkillraryLoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void gearsbutton()
    {
    	gearsbtn.click();
    }
    
    public void skillrarydemoapplication()
    {
    	skillrarydemoapp.click();
    }
    
    public void searchTextbox(String name)
    {
    	searchtab.sendKeys(name);
    }
    
    public void goButton()
    {
    	searchbtn.click();
    	
    }
}
