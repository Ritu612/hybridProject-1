package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass
{
   @Test
   
   public void tc1()
   {
	   SkillraryLoginPage s=new SkillraryLoginPage(driver);
	   s.gearsbutton();
	   s.skillrarydemoapplication();
	    
	   utilities.switchingtabs(driver); // switch the control to new tab
	   
	   SkillraryDemoLoginPage sd=new  SkillraryDemoLoginPage(driver);
	   utilities.mouseHover(driver,sd.getCoursetab()); // Mouse Hovering on course tab
	   sd.seleniumtrainingtab();
	   
	   AddtoCartPage a=new AddtoCartPage(driver);
	   utilities.doubleClick(driver, a.getAddbtn());
	   a.Addtocart();
	   
	   utilities.alertPopup(driver);
   }
   
}
