package script;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import POMPages.AddToCartPage;
import POMPages.SkillraryDemologinpage;
import POMPages.SkillraryLoginPage;
import genericLib.Baseclass;

public class AddingToCart extends Baseclass {

		@Test
		
		public void tc1() throws FileNotFoundException, IOException
		{
			SkillraryLoginPage s = new SkillraryLoginPage(driver);
			s.gearsbtn();
			s.skillrarydemoapp();
			
			utilitiies.switchingTabs(driver);
			
			SkillraryDemologinpage d = new SkillraryDemologinpage(driver);
			utilitiies.mouseHover(driver, d.getCourcebtn());
			d.seleniumtraining();
			
			AddToCartPage a = new AddToCartPage(driver);
			utilitiies.doubleClick(driver,a.getAddbtn());
			a.Addtocartbtn();
			utilitiies.alertPopup(driver);
			
			Assert.assertEquals(driver.getTitle(), p.getData("srtitle"));
			
			
			
		}
		
		

	}


