package Pages;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Aulas_Base.BaseTest;

public class AnnouncementPage extends BaseTest

{
	@FindBy(xpath="//a[@href='/announcement']")
	WebElement Announcement;
	@FindBy(xpath="//div[contains(@class,'ant-page-header-compact')]")
	WebElement AnnouncementText;
	//**************validateAnyOneAnnouncement******************//
	@FindBy(xpath="//div[@class='ant-tabs-tab']")
	WebElement Announced;
	@FindBy(xpath="(//div[@class='sc-dJjYzT CmgHA cursor-pointer'])[1]")
	WebElement anyoneAnnouncement;
	@FindBy(xpath="//span[@class='anticon anticon-close ant-modal-close-icon']")
	WebElement CloseButton;
		//*******************CreateNewAnnounced*********************************//
	@FindBy(xpath="(//*[@class='ant-btn ant-btn-primary'])[1]")
	WebElement CreateButton;
	@FindBy(xpath="(//input[@class='ant-input'])[2]")
	WebElement EnterTitle;
	@FindBy(xpath="(//input[@class='ant-input'])[3]")
	WebElement EnterTitle1;
	@FindBy(xpath="//div[contains(@class,'container')]/div[1]")
	WebElement EnterDescription;
	@FindBy(xpath="(//div[contains(@class,'ant-select-selector')])[2]")
	WebElement SelectTarget;
	@FindBy(xpath="(//div[contains(@class,'ant-select-selector')])[3]")
	WebElement SelectTarget1;
	//Target
	@FindBy(xpath="(//*[@class='rc-virtual-list']/div/div/div/div[1])[1]")
	WebElement TargetAll;
	@FindBy(xpath="(//*[@class='rc-virtual-list']/div/div/div/div[2])[1]")
	WebElement TargetTeacher;
	@FindBy(xpath="(//*[@class='rc-virtual-list']/div/div/div/div[3])[1]")
	WebElement TargetStudent;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[3]")
	WebElement StudentClassSelector;
	@FindBy(xpath="(//*[@class='rc-virtual-list']/div/div/div/div[1])[2]")
	WebElement StudentClass;
	@FindBy(xpath="(//*[@class='rc-virtual-list']/div/div/div/div[4])[1]")
	WebElement TargetDataOperator;
	@FindBy(xpath="(//*[@class='rc-virtual-list']/div/div/div/div[5])[1]")
	WebElement TargetOperation;
	@FindBy(xpath="(//span[text()='Save As Draft'])[1]")
	WebElement SaveAsDraftbtn;
	@FindBy(xpath="(//span[text()='Announce Now'])[1]")
	WebElement AnnounceBtn;
	@FindBy(xpath="//span[@class='ant-modal-close-x']")
	WebElement CloseAnnounceBtn;

	//*******************Header/font Change*********************************//
	@FindBy(xpath="//span[@class='ql-picker-label']")
	WebElement SelectHeading;
	@FindBy(xpath="(//span[@class='ql-picker-item'])[1]")
	WebElement Heading1;
	@FindBy(xpath="(//span[@class='ql-picker-item'])[2]")
	WebElement Heading2;
	@FindBy(xpath="(//span[@class='ql-picker-item'])[3]")
	WebElement NormalHeading;
	@FindBy(xpath="//button[@class='ql-bold']")
	WebElement Bold;
	@FindBy(xpath="//button[@class='ql-italic']")
	WebElement Italic;
	@FindBy(xpath="//button[@class='ql-underline']")
	WebElement Underline;
	@FindBy(xpath="(//button[@class='ql-list'])[1]")
	WebElement Numbers;
	@FindBy(xpath="(//button[@class='ql-list'])[2]")
	WebElement bulletpoints;
	@FindBy(xpath="//button[@class='ql-link']")
	WebElement links;
	///////////////***********Draft************//////////
	@FindBy(xpath="(//div[@class='ant-tabs-tab-btn'])[1]")
	WebElement Draft;
	@FindBy(xpath="(//div[@class='sc-bqiRlB dTUKFo cursor-pointer'])[1]")
	WebElement Draft1;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-default']")
	WebElement SaveAsDraft;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[2]")
	WebElement DeleteDraft;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[3]")
	WebElement AnounceNowDraft;
	@FindBy(xpath="(//input[@class='ant-input'])[1]")
	WebElement DraftEnterSearch;
	@FindBy(xpath="(//span[@class='ant-input-suffix'])[1]")
	WebElement DraftEnterSearchClose;
	@FindBy(xpath="(//span[@class='ant-input-group-addon'])[1]")
	WebElement DraftSearch;
	@FindBy(xpath="//span[@style='font-weight: bold; font-family: roboto;']")
	WebElement DraftCount;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[1]")
	WebElement DraftFilter;
	
	
    ///////////////***********Announce************//////////
	@FindBy(xpath="(//div[@class='ant-tabs-tab-btn'])[2]")
	WebElement Announce;
	@FindBy(xpath="(//div[@class='sc-dJjYzT CmgHA cursor-pointer'])[1]")
	WebElement Announce1;
	@FindBy(xpath="//button[@class='ant-modal-close']")
	WebElement IntoMarkClose;
	@FindBy(xpath="(//input[@class='ant-input'])[2]")
	WebElement AnnounceEnterSearch;
	@FindBy(xpath="(//span[@class='ant-input-suffix'])[2]")
	WebElement AnnounceEnterSearchClose;
	@FindBy(xpath="(//span[@class='ant-input-group-addon'])[2]")
	WebElement AnnounceSearch;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[2]")
	WebElement AnnounceFilter;
	
	
	
	public AnnouncementPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	public void AnnouncementClick() throws InterruptedException
	{
      	Wait(Announcement);
		Announcement.click();
		WaitTil(1000);
		
		
	}
	public void AnnouncementClose() throws InterruptedException
	{
		Wait(CreateButton);
		CreateButton.click();
		WaitTil(2000);
		CloseAnnounceBtn.click();
		WaitTil(2000);
	}
	
	public void AnnouncementCreation(String selectRole) throws InterruptedException
	{
		WaitTil(5000);
		Wait(CreateButton);
		CreateButton.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				Random rnd = new Random();
				StringBuilder name = new StringBuilder(18);
				for (int n = 0; n < 18; n++)
				{
					name.append(captals.charAt(rnd.nextInt(captals.length())));
				}
		EnterTitle.sendKeys(name);
		WaitTil(2000);
		StringBuilder name1 = new StringBuilder(20);
		for (int n = 0; n < 20; n++)
		{
			name1.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		EnterDescription.sendKeys(name1);
		WaitTil(2000);
		validateAnnouncementDescription();
		WaitTil(2000);
		SelectTarget.click();
		WaitTil(2000);
		if(selectRole.equalsIgnoreCase("AnnouncementforAll")) {
    		WaitTil(2000);
    		TargetAll.click();
    		WaitTil(2000);
    		AnnounceBtn.click();
		}
		if(selectRole.equalsIgnoreCase("AnnouncementforTeacher")) {
			WaitTil(2000);
			TargetTeacher.click();
			WaitTil(2000);
			AnnounceBtn.click();

		}
		if(selectRole.equalsIgnoreCase("AnnouncementforStudent")) {
			WaitTil(2000);
			TargetStudent.click();
			WaitTil(2000);
		    StudentClassSelector.click();
		    WaitTil(2000);
			StudentClass.click();
			WaitTil(2000);
			AnnounceBtn.click();
		}
		if(selectRole.equalsIgnoreCase("AnnouncementforDataOperator")) {
			WaitTil(2000);
			TargetDataOperator.click();
			WaitTil(2000);
			AnnounceBtn.click();
		}
		if(selectRole.equalsIgnoreCase("AnnouncementforOperation")) {
			WaitTil(2000);
			TargetOperation.click();
			WaitTil(2000);
			AnnounceBtn.click();
	
		}
		if(selectRole.equalsIgnoreCase("SaveAsDraftCreationForAll")) {
			WaitTil(2000);
			TargetAll.click();
			WaitTil(2000);
		    SaveAsDraftbtn.click();
		}
		if(selectRole.equalsIgnoreCase("SaveAsDraftforTeacher")) {
			WaitTil(2000);
			TargetTeacher.click();
			WaitTil(2000);
		    SaveAsDraftbtn.click();
		}
		if(selectRole.equalsIgnoreCase("SaveAsDraftforStudent")) {
			WaitTil(2000);
			TargetStudent.click();
			WaitTil(2000);
		    StudentClassSelector.click();
		    WaitTil(2000);
			StudentClass.click();
			WaitTil(2000);
		    SaveAsDraftbtn.click();
		}
		if(selectRole.equalsIgnoreCase("SaveAsDraftforDataOperator")) {
			WaitTil(2000);
			TargetDataOperator.click();
			WaitTil(2000);
		    SaveAsDraftbtn.click();
		}
		if(selectRole.equalsIgnoreCase("SaveAsDraftforOperation")) {
			WaitTil(2000);
			TargetOperation.click();
			WaitTil(2000);
		    SaveAsDraftbtn.click(); 
		}
		WaitTil(1000);
		VerifyPopUp();
	}
	public void VerifyPopUp() throws InterruptedException
	{
		WebElement messagElement = driver.findElement(By.xpath("//div[@class='ant-notification-notice-content']"));
		String act = messagElement.getText();
		WaitTil(1000);
		System.out.println("The actual text is:" + act);
		WaitTil(1000);
		
	}
	public void EditDraftAnnouncement() throws InterruptedException
	{
		WaitTil(1000);	
		EditAnnouncement();
		WaitTil(1000);
		AnounceNowDraft.click();
		WaitTil(1000);
		VerifyPopUp();
		WaitTil(1000);
		driver.navigate().refresh();
		WaitTil(1000);
		EditAnnouncement();
		WaitTil(1000);
		SaveAsDraft.click();
		WaitTil(1000);	
		VerifyPopUp();
		WaitTil(1000);
		driver.navigate().refresh();
		WaitTil(1000);
		EditAnnouncement();
		WaitTil(1000);
		DeleteDraft.click();
		WaitTil(1000);
		VerifyPopUp();
		WaitTil(1000);
		driver.navigate().refresh();
		WaitTil(1000);
		SearchDraftAnnouncement();
		WaitTil(1000);
		driver.navigate().refresh();
		WaitTil(1000);
		DraftFilter();


	}
	public void EditAnnouncement() throws InterruptedException
	{
		WaitTil(1000);
		Draft1.click();
		WaitTil(1000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				Random rnd = new Random();
				StringBuilder name = new StringBuilder(18);
				for (int n = 0; n < 18; n++)
				{
					name.append(captals.charAt(rnd.nextInt(captals.length())));
				}
		WebElement ele=EnterTitle;
		ele.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		ele.sendKeys(Keys.DELETE);
		WaitTil(1000);
		ele.sendKeys(name);
		WaitTil(1000);
		StringBuilder des = new StringBuilder(18);
		for (int n = 0; n < 18; n++)
		{
			des.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		WebElement element=EnterDescription;
		element.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		element.sendKeys(Keys.DELETE);
		WaitTil(1000);
		element.sendKeys(des);
		WaitTil(1000);
		SelectTarget.click();
		WaitTil(1000);
		TargetAll.click();
		
		
	}
	

	public void OpenAnnouncedAnnouncement() throws InterruptedException
	{
		Wait(Announced);
		Announced.click();
		WaitTil(1000);
		anyoneAnnouncement.click();
		WaitTil(1000);
		CloseButton.click();
		WaitTil(1000);
		SearchAnnouncement();
		WaitTil(1000);
		driver.navigate().refresh();
		WaitTil(1000);
		AnnouncedFilters();
	}
	public void SearchDraftAnnouncement() throws InterruptedException
	{
		Wait(Draft);
		Draft.click();
		WaitTil(1000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				Random rnd = new Random();
				StringBuilder name = new StringBuilder(8);
				for (int n = 0; n < 8; n++)
				{
					name.append(captals.charAt(rnd.nextInt(captals.length())));
				}
		DraftEnterSearch.sendKeys(name);
		WaitTil(1000);
		DraftSearch.click();
		WaitTil(1000);
	}
	
	public void SearchAnnouncement() throws InterruptedException
	{
		Wait(Announce);
		Announce.click();
		WaitTil(1000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				Random rnd = new Random();
				StringBuilder name = new StringBuilder(8);
				for (int n = 0; n < 8; n++)
				{
					name.append(captals.charAt(rnd.nextInt(captals.length())));
				}
		AnnounceEnterSearch.sendKeys(name);
		WaitTil(1000);
		AnnounceSearch.click();
		WaitTil(1000);
	}
	public void DraftFilter() throws InterruptedException
	{
		Wait(Draft);
		Draft.click();
		WaitTil(1000);
		DraftFilter.click();
		WaitTil(1000);
		List<WebElement> ele=driver.findElements(By.xpath("//*[@class='rc-virtual-list']/div/div/div/div"));
		int size=ele.size();
		Draft.click();
		for(int i=0;i<size;i++) {
			WaitTil(1000);
			DraftFilter.click();
			WaitTil(1000);
			ele.get(i).click();
			WaitTil(1000);
			
		}
		
	}
	public void AnnouncedFilters() throws InterruptedException
	{
		Wait(Announce);
		Announce.click();
		WaitTil(1000);
		AnnounceFilter.click();
		WaitTil(1000);
		List<WebElement> ele=driver.findElements(By.xpath("//*[@class='rc-virtual-list']/div/div/div/div"));
		int size=ele.size();
		Announce.click();
		for(int i=0;i<size;i++) {
			WaitTil(1000);
			AnnounceFilter.click();
			WaitTil(1000);
			ele.get(i).click();
			WaitTil(1000);
			
		}
		
		
	}
	
	public void validateAnnouncementDescription() throws InterruptedException
	{
		WaitTil(1000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				Random rnd = new Random();
		SelectHeading.click();
		WaitTil(1000);
		Heading1.click();
		WaitTil(1000);
		Bold.click();
		WaitTil(1000);;
		StringBuilder des1 = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			des1.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		EnterDescription.sendKeys(des1);
		WaitTil(1000);
		Italic.click();
		WaitTil(1000);
		StringBuilder des2 = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			des2.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		EnterDescription.sendKeys(des2);
		WaitTil(1000);
		Underline.click();
		WaitTil(1000);
		StringBuilder des3 = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			des3.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		EnterDescription.sendKeys(des3);
		WaitTil(1000);
		Numbers.click();
		WaitTil(1000);
	}
     
}
	
	
	
   

