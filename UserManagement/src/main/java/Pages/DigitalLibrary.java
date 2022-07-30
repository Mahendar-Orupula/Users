package Pages;
import java.awt.Robot;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.BaseTest;


public class DigitalLibrary extends BaseTest {
	ClassroomPage CR = new ClassroomPage();
	UserManagementPage UM=new UserManagementPage();
	Actions ac = new Actions(driver);
	Robot r;
	@FindBy(xpath = "//a[@href='/digital-library/division-card']")
	WebElement DigitalLibrary;
	@FindBy(xpath = "//div[text()='Digital library']")
	WebElement DigitalLibraryText;
	@FindBy(xpath = "//div[@class='ant-alert ant-alert-info ant-alert-no-icon']")
	WebElement StorageExpiredAlert;
	@FindBy(xpath = "(//div[@class='LibraryCard'])[1]")
	WebElement LectureNotesCount;
	@FindBy(xpath = "(//div[@class='LibraryCard'])[2]")
	WebElement VideosCount;
	@FindBy(xpath = "(//div[@class='LibraryCard'])[3]")
	WebElement QuestionBanksCount;
	@FindBy(xpath = "(//div[@class='adminSummaryCardB'])[1]")
	WebElement Performence;
	@FindBy(xpath = "//span[@class='anticon anticon-exclamation-circle']")
	WebElement PerformenceInfo;
	@FindBy(xpath = "//div[@class='ant-tooltip-inner']")
	WebElement PerformenceInfoData;
	@FindBy(xpath = "(//div[text()='Engagements'])[2]")
	WebElement EngagementsClick;
	@FindBy(xpath = "(//div[@class='adminSummaryCardB'])[2]")
	WebElement StorageUsage;
	@FindBy(xpath = "//div[@class='lecturenotestitle']")
	WebElement AllClasses;


	@FindBy(xpath = "(//span[text()='Get More Storage'])[1]")
	WebElement GetMoreStorage;
	@FindBy(xpath = "(//button[@class='ant-btn button-buy-storage'])[1]")
	WebElement SubscribePlan;
	@FindBy(xpath = "(//button[text()='Open Chat'])[1]")
	WebElement OpenChat;
	@FindBy(xpath = "(//*[@placeholder='Type your question here...'])[1]")
	WebElement EnterChat;
	@FindBy(xpath = "//*[@class='ant-layout-content']/div/div[2]/div/div[2]/div/div/div/div")
	WebElement SendChat;
	//////////// ************+Upload************////////////////////
	@FindBy(xpath = "//span[text()='+ Upload']")
	WebElement UploadBtn;
	@FindBy(xpath = "//div[@class='ant-modal rounded-border']")
	WebElement UploadContent;
	@FindBy(xpath = "(//span[@class='ant-radio'])[1]")
	WebElement LectureNotes;
	@FindBy(xpath = "//span[text()='Next']")
	WebElement Nextbtn;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement TopicEditSubjectField;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	WebElement SubjectField;
	@FindBy(xpath = "(//div[@class='rc-virtual-list'])[1]/div[1]/div/div/div[1]")
	WebElement SelSubject;
	@FindBy(xpath = "(//div[@class='rc-virtual-list'])[2]/div[1]/div/div/div[1]")
	WebElement SelSubject1;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[3]")
	WebElement ClassField;
	@FindBy(xpath = "(//div[@class='rc-virtual-list'])[2]/div[1]/div/div/div[1]")
	WebElement SelClass;
	@FindBy(xpath = "(//div[@class='rc-virtual-list'])[3]/div[1]/div/div/div[1]")
	WebElement SelClass1;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[4]")
	WebElement ChapterField;
	@FindBy(xpath = "(//div[@class='rc-virtual-list'])[3]/div[1]/div/div/div[1]")
	WebElement SelChapter;
	@FindBy(xpath = "(//div[@class='rc-virtual-list'])[4]/div[1]/div/div/div[1]")
	WebElement SelChapter1;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[5]")
	WebElement TopicField;
	@FindBy(xpath = "(//div[@class='rc-virtual-list'])[4]/div[1]/div/div/div[1]")
	WebElement SelTopic;
	@FindBy(xpath = "(//div[@class='rc-virtual-list'])[5]/div[1]/div/div/div[1]")
	WebElement SelTopic1;
	@FindBy(xpath = "//input[@class='ant-input ant-input-borderless']")
	WebElement EnterTitle;
	@FindBy(xpath = "//span[text()='CHOOSE FILE']")
	WebElement ChooseFile;
	@FindBy(xpath = "(//span[@class='ant-radio'])[2]")
	WebElement Videos;
	@FindBy(xpath = "(//span[@class='ant-radio'])[1]")
	WebElement VideosLocalDevice;
	@FindBy(xpath = "(//span[@class='ant-radio'])[2]")
	WebElement VideosYouTubeLinks;
	@FindBy(xpath = "(//span[@class='ant-radio'])[3]")
	WebElement QuestionBank;
	@FindBy(xpath = "//input[@class='ant-input']")
	WebElement videoLink;
	@FindBy(xpath = "//span[text()='PUBLISH']")
	WebElement PublishBtn;
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement CancelBtn;
	@FindBy(xpath = "//span[@class='ant-modal-close-x']")
	WebElement Close;
	@FindBy(xpath = "//button[text()='SEE IT NOW']")
	WebElement SEEITNOW;
	@FindBy(xpath = "//span[@class='anticon anticon-arrow-left']")
	WebElement BackButton;

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[2]")
	WebElement VideoClass;
	@FindBy(xpath = "(//div[@class='rc-virtual-list-holder-inner'])[2]/div[1]")
	WebElement VideoSelClass;
	@FindBy(xpath = "(//div[@class='ant-select-selector']/span/input)[3]")
	WebElement Chaptervideoclass;
	@FindBy(xpath = "(//div[@class='rc-virtual-list-holder-inner'])[1]/div[1]")
	WebElement QBSelSub;
	@FindBy(xpath = "(//div[@class='rc-virtual-list-holder-inner'])[2]/div[3]")
	WebElement QBSelClass;
	@FindBy(xpath = "//div[contains(@class,'sub-flex')]/div[2]")
	WebElement SubjectClass;

	// ********** Section Page *************////
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[6]")
	WebElement TopicField1;
	@FindBy(xpath = "(//div[@class='lecturenotesmain cursor-pointer'])[1]")
	WebElement SelectClass;
	@FindBy(xpath = "(//div[@class='ant-row'])[1]")
	WebElement OverallStatsData;
	@FindBy(xpath = "(//div[@class='teacherSummaryCardB'])[1]")
	WebElement TrafficData;
	@FindBy(xpath = "(//div[@class='teacherSummaryCardB'])[1]/div/h1/span/div/span")
	WebElement MostactiveTime;
	@FindBy(xpath = "(//div[@class='ant-tooltip-content'])[1]")
	WebElement MostactiveTimeContent;
	@FindBy(xpath = "(//div[@class='teacherSummaryCardB'])[2]")
	WebElement PerformanceInfoData;
	@FindBy(xpath = "(//div[@class='teacherSummaryCardB'])[2]/div/div/div/h1/span/div/span")
	WebElement PerformanceInfo;
	@FindBy(xpath = "(//div[@class='ant-tooltip-content'])[2]")
	WebElement PerformanceInfoContent;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement ImpressionDrpDwn;
	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[2]")
	WebElement ImpressionTab;
	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[1]")
	WebElement WeekTab;
	@FindBy(xpath = "(//div[text()='Month'])")
	WebElement Month;
	@FindBy(xpath = "(//div[text()='Engagements'])[2]")
	WebElement Engagements;

	//// *********** Subjects ********************/////
	@FindBy(xpath = "//div[text()='Subject(s)']")
	WebElement Subjects;
	@FindBy(xpath = "//div[@style='display: flex; flex-wrap: wrap;']")
	WebElement SubjectDetails;
	@FindBy(xpath = "//span[@class='ant-page-header-heading-title']")
	WebElement SubjectName;
	@FindBy(xpath = "(//span[text()='+Add A Teacher'])[1]")
	WebElement AddATeacher;
	@FindBy(xpath = "(//div[@class='m-r-10 cursor-pointer'])[1]")
	WebElement SettingsIcon;
	@FindBy(xpath = "//div[@class='ant-modal-body']")
	WebElement WindowContent;
	@FindBy(xpath = "//span[text()='Later']")
	WebElement Later;
	@FindBy(xpath = "(//span[text()='+Add A Teacher'])[2]")
	WebElement AddATeacher1;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement TeacherSelector;
	@FindBy(xpath = "(//div[@class='ant-select-item ant-select-item-option'])[1]")
	WebElement Teacher1;
	@FindBy(xpath = "//span[text()='Submit']")
	WebElement TeacherSubmit;

	//// ************Chapter Open *************////
	@FindBy(xpath = "(//div[@class='digital-library-chapter-card cursor-pointer'])[1]")
	WebElement ChapterOpen;
	@FindBy(xpath = "(//span[text()=' + Create a topic'])[1]")
	WebElement CreateATopic;
	@FindBy(xpath = "//input[@placeholder='Enter a Topic']")
	WebElement EnterATopic;
	@FindBy(xpath = "(//span[text()='Cancel'])[1]")
	WebElement Cancel;
	@FindBy(xpath = "(//span[text()='Create'])[1]")
	WebElement Create;
	@FindBy(xpath = "(//div[@class='digital-library-topic-card cursor-pointer'])[1]/div[1]/div[2]")
	WebElement MenuDots;
	@FindBy(xpath = "(//*[text()='Edit'])[1]")
	WebElement Edit;
	@FindBy(xpath = "(//*[text()='Save'])[1]")
	WebElement Save;
	@FindBy(xpath = "(//*[text()='Delete'])[1]")
	WebElement Delete;
	@FindBy(xpath = "//*[text()='YES']")
	WebElement Yes;
	@FindBy(xpath = "//*[text()='NO']")
	WebElement No;

	//////////// ******************* Topic Open ********************/////////////
	@FindBy(xpath = "(//div[@class='digital-library-topic-card cursor-pointer'])[1]")
	WebElement TopicOpen;
	@FindBy(xpath = "(//input[@class='ant-input'])[2]")
	WebElement TopicYoutubeLink;
	@FindBy(xpath = "//div[@class='ant-row']")
	WebElement TopicContentData;
	@FindBy(xpath = "(//div[@class='ant-tabs-tab'])[1]")
	WebElement TopicVideos;
	@FindBy(xpath = "(//div[@class='ant-tabs-tab'])[2]")
	WebElement TopicQuestionBanks;
	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']/div/div[1]/button[1]")
	WebElement AlphabeticalOrder;
	@FindBy(xpath = "//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']/div/div[1]/button[2]")
	WebElement NewestToOldest;
	

	@FindBy(xpath = "((//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active'])/div/div[2]/div/div)[1]")
	WebElement ContentOneOpen;
	@FindBy(xpath = "((//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active'])/div/div[2]/div/div)[1]/div/div/div")
	WebElement ContentOneMenuDots;
	@FindBy(xpath = "((//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active'])/div/div[2]/div/div)[1]/div[2]/div[2]")
	WebElement VideosOneMenuDots;
	@FindBy(xpath = "(//*[text()='Clone'])[1]")
	WebElement Clone;
	

	@FindBy(xpath = "(//span[text()='CANCEL'])[1]")
	WebElement CANCEL;
	@FindBy(xpath = "(//span[text()='PUBLISH'])[1]")
	WebElement PUBLISH;

	// ********** Search By ************//
	@FindBy(xpath = "(//input[@class='ant-input'])[1]")
	WebElement SearchBy;
	@FindBy(xpath = "(//span[@class='ant-input-group-addon'])[1]")
	WebElement Search;
	@FindBy(xpath = "(//span[@class='ant-input-suffix'])[1]")
	WebElement SearchClose;
	
	/************* Teacher&Student  ********/
	@FindBy(xpath = "(//*[@class='ant-layout-content'])[1]")
	WebElement DigitalLibraryPageText;
	@FindBy(xpath = "//div[@style='display: flex; flex-flow: row wrap; justify-content: flex-start;'][1]/div[1]")
	WebElement LectureNoteOpen;
	@FindBy(xpath = "(//*[@id='contentofvideocomponent'])[1]")
	WebElement VideoOpen;
	@FindBy(xpath = "//div[@style='display: flex; flex-flow: row wrap; justify-content: flex-start;'][3]/div[1]")
	WebElement QuestionBankOpen;
	@FindBy(xpath = "(//div[@style='width: 100%; height: 100%;'])[2]")
	WebElement VideoPlayer;
	
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public DigitalLibrary() {
		PageFactory.initElements(driver, this);
	}

	public String validateDigitalLibraryText() throws InterruptedException {

		Wait(DigitalLibrary);
		DigitalLibrary.click();
		WaitTil(6000);
		return DigitalLibraryText.getText();

	}

	public void Section() {
		WaitTil(2000);
		WebElement AllClasse = AllClasses;
		WaitTil(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", AllClasse);
		WaitTil(2000);
		SelectClass.click();
	}

	public void ValidateDigitalLibraryPage() throws InterruptedException {
		WaitTil(2000);
		validateDigitalLibraryText();
		Wait(UploadBtn);
		UploadBtn.click();
		System.out.println("Upload Button Clicked");
		WaitTil(2000);
		CancelBtn.click();
		String DigitalLibrarytext = DigitalLibraryText.getText();
		System.out.println(DigitalLibrarytext);
		WaitTil(1000);
		String StorageExpired = StorageExpiredAlert.getText();
		System.out.println(StorageExpired);
		WaitTil(1000);
		String TotalLectureNotes = LectureNotesCount.getText();
		System.out.println(TotalLectureNotes);
		WaitTil(1000);
		String TotalVideos = VideosCount.getText();
		System.out.println(TotalVideos);
		WaitTil(1000);
		String TotalQuestionBanks = QuestionBanksCount.getText();
		System.out.println(TotalQuestionBanks);
		WaitTil(1000);
		String Performencetext = Performence.getText();
		System.out.println("---: Impressions :--- " + Performencetext);
		WaitTil(1000);
		ac.moveToElement(PerformenceInfo).click().build().perform();
		WaitTil(1000);
		String PerformenceData = PerformenceInfoData.getText();
		System.out.println(PerformenceData);
		WaitTil(4000);
		ImpressionDrpDwn.click();
		WaitTil(1000);
		EngagementsClick.click();
		WaitTil(1000);
		String PerformenceEngmnttext = Performence.getText();
		System.out.println("---: Engagements  :--- " + PerformenceEngmnttext);
		WaitTil(1000);
		String StorageData = StorageUsage.getText();
		System.out.println("---: Storage Information  :--- " + StorageData);
		WaitTil(1000);
		WebElement AllClasse = AllClasses;
		WaitTil(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", AllClasse);
		String AllClass = AllClasses.getText();
		System.out.println(" " + AllClass);
		WaitTil(1000);
/*
		List<WebElement> ele = driver.findElements(By.xpath("//p[@class='lecturenotestitle']"));
		int size = ele.size();
		for (int i = 0; i < size; i++) {
			WaitTil(1000);
			String ClassName = ele.get(i).getText();
			System.out.println(" ---: Name Of The Class :--- " + " ' " + ClassName + " ' ");
			WaitTil(1000);
			List<WebElement> SectionsInfo = driver
					.findElements(By.xpath("//div[@style='display: flex; flex-wrap: wrap;']"));
			String SectionsData = SectionsInfo.get(i).getText();
			System.out.println(" ---: Name Of The Section  :---  ");
			System.out.println(" ---: Name Of The Course   :---  ");
			System.out.println(" ---: No of Lecture Notes  :---  ");
			System.out.println(" ---: No of Videos         :---  ");
			System.out.println(" ---: No of Question Banks :---  ");
			System.out.println(" ---: Name Of The Section is :-  " + SectionsData);

		}
		*/

	}
	public void GetMoreStorage(String RoleType)
	{
		Wait(GetMoreStorage);
		GetMoreStorage.click();
		if (RoleType.equalsIgnoreCase("SuperAdmin"))
		{
		WaitTil(2000);
		String text=DigitalLibraryPageText.getText();
		System.out.println(text);
		Wait(SubscribePlan);
		SubscribePlan.click();
		WaitTil(2000);
		String text1=WindowContent.getText();
		System.out.println(text1);
		WaitTil(2000);
		Cancel.click();
		}
		if (RoleType.equalsIgnoreCase("DataOperatorAndAdmin"))
		{
			Wait(OpenChat);
			String text=WindowContent.getText();
			System.out.println(text);
			OpenChat.click();
			String text1=DigitalLibraryPageText.getText();
			System.out.println(text1);
			WaitTil(2000);
			String chars = "abcdefghijklmnopqrstuvwxyz";
			//String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			Random rnd = new Random();
			StringBuilder ChatText = new StringBuilder(8);
			for (int n = 0; n < 8; n++)
			{
				ChatText.append(chars.charAt(rnd.nextInt(chars.length())));
				//name.append(captals.charAt(rnd.nextInt(captals.length())));
			}
			EnterChat.sendKeys(ChatText);
			Wait(SendChat);
			SendChat.click();
		
		}
		WaitTil(2000);
		BackButton.click();
		
	}

	public void SelectContentType(String ContentType) throws IOException {
		// select Document type
		Wait(DigitalLibrary);
		DigitalLibrary.click();
		WaitTil(6000);
		Wait(UploadBtn);
		UploadBtn.click();
		System.out.println("Upload Button Clicked");
		WaitTil(2000);
		String Content = UploadContent.getText();
		System.out.println("Upload Content Type Page is Opened  :- " + Content);
		WaitTil(1000);
		if (ContentType.equalsIgnoreCase("LectureNotes")) {
			WaitTil(2000);
			LectureNotes.click();
			WaitTil(2000);
			Nextbtn.click();

		}
		if (ContentType.equalsIgnoreCase("LocalDeviceVideos")) {
			WaitTil(2000);
			Videos.click();
			WaitTil(2000);
			Nextbtn.click();
			WaitTil(2000);
			String VideoContent = UploadContent.getText();
			System.out.println("Upload content of Videos Type Page is Opened  :-" + VideoContent);
			WaitTil(2000);
			VideosLocalDevice.click();
			WaitTil(2000);
			Nextbtn.click();

		}
		if (ContentType.equalsIgnoreCase("YouTubeLinksVideos")) {
			WaitTil(2000);
			Videos.click();
			WaitTil(2000);
			Nextbtn.click();
			WaitTil(2000);
			String VideoContent = UploadContent.getText();
			System.out.println("Upload content of Videos Type Page is Opened  :-" + VideoContent);
			WaitTil(2000);
			VideosYouTubeLinks.click();
			WaitTil(2000);
			Nextbtn.click();

		}
		if (ContentType.equalsIgnoreCase("QuestionBanks")) {
			WaitTil(2000);
			QuestionBank.click();
			WaitTil(2000);
			Nextbtn.click();

		}

	}

	public void ContentUploadDeatils() {
		WaitTil(2000);
		SubjectField.click();
		WaitTil(2000);
		SelSubject.click();
		WaitTil(2000);
		ClassField.click();
		WaitTil(2000);
		SelClass.click();
		WaitTil(2000);
		ChapterField.click();
		WaitTil(2000);
		SelChapter.click();
		WaitTil(2000);
		TopicField.click();
		WaitTil(2000);
		SelTopic.click();
		WaitTil(2000);
		String Title = UUID.randomUUID().toString();
		EnterTitle.sendKeys(Title);
	}

	public void ContentUploadDeatils1() {
		WaitTil(2000);
		SubjectField.click();
		WaitTil(2000);
		SelSubject1.click();
		WaitTil(2000);
		ClassField.click();
		WaitTil(2000);
		SelClass1.click();
		WaitTil(2000);
		ChapterField.click();
		WaitTil(2000);
		SelChapter1.click();
		WaitTil(2000);
		TopicField.click();
		WaitTil(2000);
		SelTopic1.click();
		WaitTil(2000);
		String Title = UUID.randomUUID().toString();
		EnterTitle.sendKeys(Title);
	}

	public void SelectFile(String UploadFile) throws IOException {
		// select Document type
		WaitTil(3000);
		ChooseFile.click();
		if (UploadFile.equalsIgnoreCase("LectureNote")) {
			WaitTil(4000);
			Runtime.getRuntime()
					.exec(System.getProperty("user.dir") + "\\DigitalLibrary\\java.exe");
			System.out.println(" Successfully Uploaded LectureNote ");
		}
		if (UploadFile.equalsIgnoreCase("RecorededVideo28mb")) {
			WaitTil(4000);
			Runtime.getRuntime().exec(
					"C:\\Users\\Brigosha_Guest\\eclipse-workspace\\Aulas\\DigitalLibrary\\RecordedVideo28mb.exe");
			System.out.println(" Successfully Uploaded Recorded Video ");
		}
		if (UploadFile.equalsIgnoreCase("DownloadedVideo996mb")) {
			WaitTil(4000);
			Runtime.getRuntime().exec(
					"C:\\Users\\Brigosha_Guest\\eclipse-workspace\\Aulas\\DigitalLibrary\\DownloadedVideo981mb.exe");
			System.out.println(" Successfully Uploaded Downloaded Video ");
		}
		if (UploadFile.equalsIgnoreCase("QuestionBank")) {
			WaitTil(4000);
			Runtime.getRuntime().exec(
					"C:\\Users\\Brigosha_Guest\\eclipse-workspace\\Aulas\\DigitalLibrary\\JavaQuestionBank.exe");
			System.out.println(" Successfully Uploaded Question Bank ");
		}
		System.out.println("---: The Uploaded File type :--- " + " " + UploadFile);
		WaitTil(2000);
		String UploadedContent = UploadContent.getText();
		System.out.println("Uploaded content  is  :-" + UploadedContent);
		WaitTil(2000);
		PublishBtn.click();
		WaitTil(2000);

	}

	public void AfterPublishContentClose() {
		WaitUnTil(Close);
		WebElement ele = driver.findElement(By.xpath("//div[@class='ant-modal-body']"));
		String SuccessText = ele.getText();
		System.out.println("---: Content Uploaded Successfully :---" + SuccessText);
		WaitTil(2000);
		Close.click();

	}

	public void AfterPublishContent() {
		WaitUnTil(SEEITNOW);
		WebElement ele = driver.findElement(By.xpath("//div[@class='ant-modal-body']"));
		String SuccessText = ele.getText();
		System.out.println("---: Content Uploaded Successfully :---" + SuccessText);
		WaitTil(2000);
		SEEITNOW.click();
		WaitTil(3000);
		BackButton.click();

	}
	/*
	 * public void WaitTilFiveMinites() { final long NANOSEC_PER_SEC =
	 * 1000l*1000*1000; long startTime = System.nanoTime(); while
	 * ((System.nanoTime()-startTime)< 5*60*NANOSEC_PER_SEC){ // do stuff }
	 * 
	 * }
	 */

	public void UploadLectureNotes() throws IOException {
		WaitTil(2000);
		SelectContentType("LectureNotes");
		WaitTil(2000);
		ContentUploadDeatils1();
		WaitTil(2000);
		SelectFile("LectureNote");
		WaitTil(1000);
		AfterPublishContent();
	}

	public void UploadLocalDeviceRecordedVideos() throws IOException {
		WaitTil(2000);
		SelectContentType("LocalDeviceVideos");
		WaitTil(2000);
		//ContentUploadDeatils();
		WaitTil(2000);
		SelectFile("RecorededVideo28mb");
		WaitTil(2000);
		AfterPublishContentClose();

	}

	public void UploadLocalDeviceDownloadedVideos() throws IOException {
		WaitTil(2000);
		SelectContentType("LocalDeviceVideos");
		WaitTil(2000);
		ContentUploadDeatils();
		WaitTil(2000);
		SelectFile("DownloadedVideo996mb");
		WaitTil(2000);
		AfterPublishContentClose();

	}

	public void UploadYouTubeLinkVideos(String YouTubeLink) throws IOException {
		WaitTil(2000);
		SelectContentType("YouTubeLinksVideos");
		WaitTil(2000);
		videoLink.sendKeys(YouTubeLink);
		WaitTil(2000);
		SubjectField.click();
		WaitTil(2000);
		SelSubject.click();
		WaitTil(2000);
		ChapterField.click(); // ClassField
		WaitTil(2000);
		SelClass.click(); // SelClass
		WaitTil(2000);
		ClassField.click(); // ChapterField
		WaitTil(2000);
		SelChapter.click(); // SelChapter
		WaitTil(2000);
		TopicField.click();
		WaitTil(2000);
		SelTopic.click();
		WaitTil(2000);
		String Title = UUID.randomUUID().toString();
		EnterTitle.sendKeys(Title);
		WaitTil(2000);
		PublishBtn.click();
		WaitTil(2000);
		AfterPublishContent();

	}

	public void UploadQuestionBanks() throws IOException {
		WaitTil(2000);
		SelectContentType("QuestionBanks");
		WaitTil(2000);
		ContentUploadDeatils();
		WaitTil(2000);
		SelectFile("QuestionBank");
		WaitTil(1000);
		AfterPublishContent();

	}

	/// ***************** Section Upload Content ******************/////

	public void SectionContentUploadDeatils() {
		WaitTil(2000);
		ClassField.click(); // SubjectField
		WaitTil(2000);
		SelSubject.click();
		WaitTil(2000);
		ChapterField.click(); // ClassField
		WaitTil(2000);
		SelClass.click();
		WaitTil(2000);
		TopicField.click(); // ChapterField
		WaitTil(2000);
		SelChapter.click();
		WaitTil(2000);
		TopicField1.click(); // TopicField
		WaitTil(2000);
		SelTopic.click();
		WaitTil(2000);
		String Title = UUID.randomUUID().toString();
		EnterTitle.sendKeys(Title);
	}

	public void SectionUploadLectureNotes() throws IOException {
		WaitTil(2000);
		SelectContentType("LectureNotes");
		WaitTil(2000);
		SectionContentUploadDeatils();
		WaitTil(2000);
		SelectFile("LectureNote");
		WaitTil(1000);
		AfterPublishContent();

	}

	public void SectionUploadLocalDeviceRecordedVideos() throws IOException {
		WaitTil(2000);
		SelectContentType("LocalDeviceVideos");
		WaitTil(2000);
		SectionContentUploadDeatils();
		WaitTil(2000);
		SelectFile("RecorededVideo28mb");
		WaitTil(2000);
		AfterPublishContentClose();

	}

	public void SectionUploadLocalDeviceDownloadedVideos() throws IOException {
		WaitTil(2000);
		SelectContentType("LocalDeviceVideos");
		WaitTil(2000);
		SectionContentUploadDeatils();
		WaitTil(2000);
		SelectFile("DownloadedVideo996mb");
		WaitTil(2000);
		AfterPublishContentClose();

	}

	public void SectionUploadYouTubeLinkVideos(String YouTubeLink) throws IOException {
		WaitTil(2000);
		SelectContentType("YouTubeLinksVideos");
		WaitTil(2000);
		videoLink.sendKeys(YouTubeLink);
		WaitTil(2000);
		ClassField.click(); // SubjectField
		WaitTil(2000);
		SelSubject.click();
		WaitTil(2000);
		TopicField.click(); // ClassField
		WaitTil(2000);
		SelClass.click(); // SelClass
		WaitTil(2000);
		ChapterField.click(); // ChapterField
		WaitTil(2000);
		SelChapter.click(); // SelChapter
		WaitTil(2000);
		TopicField1.click();
		WaitTil(2000);
		SelTopic.click();
		WaitTil(2000);
		String Title = UUID.randomUUID().toString();
		EnterTitle.sendKeys(Title);
		WaitTil(2000);
		PublishBtn.click();
		WaitTil(2000);
		AfterPublishContent();
	}

	public void SectionUploadQuestionBanks() throws IOException {
		WaitTil(2000);
		SelectContentType("QuestionBanks");
		WaitTil(2000);
		SectionContentUploadDeatils();
		WaitTil(2000);
		SelectFile("QuestionBank");
		WaitTil(1000);
		AfterPublishContent();
	}

	public void ValidateSectionDetailsPage() {
		WaitTil(2000);
		String OverallStats = OverallStatsData.getText();
		System.out.println(OverallStats);
		WaitTil(2000);
		String Traffic = TrafficData.getText();
		System.out.println(Traffic);
		WaitTil(2000);
		ac.moveToElement(MostactiveTime).click().build().perform();
		WaitTil(2000);
		String activeTimeContent = MostactiveTimeContent.getText();
		System.out.println(activeTimeContent);
		WaitTil(2000);
		String PerformanceData = PerformanceInfoData.getText();
		System.out.println(PerformanceData);
		WaitTil(3000);
		ac.moveToElement(PerformanceInfo).click().build().perform();
		WaitTil(3000);
		String PerformanceContent = PerformanceInfoContent.getText();
		System.out.println(PerformanceContent);
		WaitTil(2000);
		ImpressionTab.click();
		WaitTil(2000);
		EngagementsClick.click();
		WaitTil(2000);
		WeekTab.click();
		WaitTil(2000);
		Month.click();
		WaitTil(2000);
		String EngPerformanceData = PerformanceInfoData.getText();
		System.out.println(EngPerformanceData);
		String SubjectText = Subjects.getText();
		System.out.println(SubjectText);
		WaitTil(2000);
		String SubjectsData = SubjectDetails.getText();
		System.out.println(SubjectsData);

	}

	public void TopicEnterTitle() {
		WaitTil(1000);
		String Title = UUID.randomUUID().toString();
		EnterTitle.sendKeys(Title);
		WaitTil(2000);

	}

	public void TopicUpload(String YouTubeLink) throws IOException {

		WaitTil(2000);
		SelectContentType("LectureNotes");
		WaitTil(2000);
		TopicEnterTitle();
		WaitTil(2000);
		SelectFile("LectureNote");
		WaitTil(1000);
		AfterPublishContent();
		WaitTil(2000);
		SelectContentType("LocalDeviceVideos");
		WaitTil(2000);
		TopicEnterTitle();
		WaitTil(2000);
		SelectFile("RecorededVideo28mb");
		WaitTil(2000);
		AfterPublishContentClose();
		WaitTil(2000);
		SelectContentType("YouTubeLinksVideos");
		WaitTil(2000);
		TopicYoutubeLink.sendKeys(YouTubeLink);
		WaitTil(2000);
		TopicEnterTitle();
		String UploadedContent = UploadContent.getText();
		System.out.println("Uploaded content  is  :-" + UploadedContent);
		WaitTil(2000);
		PublishBtn.click();
		WaitTil(2000);
		AfterPublishContent();
		WaitTil(2000);
		SelectContentType("QuestionBanks");
		WaitTil(2000);
		TopicEnterTitle();
		WaitTil(2000);
		SelectFile("QuestionBank");
		WaitTil(1000);
		AfterPublishContent();
	}

	public void TopicContent(String ContentType) {
		WaitTil(2000);
		String TopicData = TopicContentData.getText();
		System.out.println(TopicData);
		WaitTil(2000);
		if (ContentType.equalsIgnoreCase("LectureNotes")) {
			WaitTil(2000);
			TopicVideos.click();
			WaitTil(2000);
			AlphabeticalOrder.click();
			WaitTil(2000);
			NewestToOldest.click();

		}
		if (ContentType.equalsIgnoreCase("Videos")) {
			WaitTil(2000);
			TopicVideos.click();
			WaitTil(2000);
			AlphabeticalOrder.click();
			WaitTil(2000);
			NewestToOldest.click();

		}
		if (ContentType.equalsIgnoreCase("QuestionBanks")) {
			WaitTil(2000);
			TopicQuestionBanks.click();
			WaitTil(2000);
			AlphabeticalOrder.click();
			WaitTil(2000);
			NewestToOldest.click();

		}

	}

	/*
	 * public void VideosMenuDots() { WaitTil(2000);
	 * ac.moveToElement(VideosOneMenuDots).click().build().perform(); WaitTil(2000);
	 * Edit.click(); WaitTil(2000); CANCEL.click(); WaitTil(2000);
	 * ac.moveToElement(VideosOneMenuDots).click().build().perform(); WaitTil(2000);
	 * Clone.click(); WaitTil(2000); CANCEL.click(); WaitTil(2000);
	 * ac.moveToElement(VideosOneMenuDots).click().build().perform(); WaitTil(2000);
	 * Delete.click(); WaitTil(2000); No.click(); WaitTil(2000); }
	 */
	public void LecrtureQBOpenValidate(String ContentType) {
		WaitTil(1000);
		ContentOneOpen.click();
		WaitTil(2000);
		if (ContentType.equalsIgnoreCase("ValidateButtons")) {
			Edit.click();
			WaitTil(2000);
			CANCEL.click();
			WaitTil(2000);
			Clone.click();
			WaitTil(2000);
			CANCEL.click();
			WaitTil(2000);
			Delete.click();
			WaitTil(2000);
			No.click();
			WaitTil(2000);
			BackButton.click();
			WaitTil(1000);
		}
		if (ContentType.equalsIgnoreCase("EditTopic")) {
			Edit.click();
			WaitTil(2000);
			TopicEditSubjectField.click();
			WaitTil(2000);
			SelSubject.click();
			WaitTil(2000);
			SubjectField.click();
			WaitTil(2000);
			SelClass.click();
			WaitTil(2000);
			ClassField.click();
			WaitTil(2000);
			SelChapter.click();
			WaitTil(2000);
			ChapterField.click();
			WaitTil(2000);
			SelTopic.click();
			WaitTil(2000);
			PublishBtn.click();
			WaitTil(2000);
			CR.PopUpContent();
			WaitTil(2000);
			BackButton.click();
			WaitTil(1000);
		}
		if (ContentType.equalsIgnoreCase("CloneTopic")) {
			WaitTil(2000);
			Clone.click();
			WaitTil(2000);
			SubjectField.click();
			WaitTil(2000);
			SelSubject.click();
			WaitTil(2000);
			ClassField.click();
			WaitTil(2000);
			SelClass.click();
			WaitTil(2000);
			ChapterField.click();
			WaitTil(2000);
			SelChapter.click();
			WaitTil(2000);
			PublishBtn.click();
			WaitTil(2000);
			CR.PopUpContent();
			WaitTil(2000);
			BackButton.click();
			WaitTil(1000);

		}
		if (ContentType.equalsIgnoreCase("DeleteTopic")) {
			WaitTil(2000);
			Delete.click();
			WaitTil(2000);
			Yes.click();
			WaitTil(2000);
			CR.PopUpContent();
			WaitTil(2000);
		}

	}

	public void CreateATopic() {
		WaitTil(2000);
		CreateATopic.click();
		WaitTil(2000);
		Cancel.click();
		for (int j = 0; j <= 2; j++) {
			CreateATopic.click();
			WaitTil(2000);
			String TopicName = UUID.randomUUID().toString();
			EnterATopic.sendKeys(TopicName);
			WaitTil(2000);
			String TopicContent = WindowContent.getText();
			System.out.println(TopicContent);
			WaitTil(2000);
			Create.click();
			WaitTil(2000);
			CR.PopUpContent();
			WaitTil(2000);
		}
	}

	public void TopicMenuDotsValidation() {
		WaitTil(2000);
		ac.moveToElement(MenuDots).click().build().perform();
		WaitTil(2000);
		Edit.click();
		WaitTil(2000);
		EnterATopic.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		WaitTil(1000);
		EnterATopic.sendKeys(Keys.DELETE);
		WaitTil(1000);
		String TopicNameEdit = UUID.randomUUID().toString();
		EnterATopic.sendKeys(TopicNameEdit);
		WaitTil(2000);
		String EditTopicContent = WindowContent.getText();
		System.out.println(EditTopicContent);
		WaitTil(1000);
		Save.click();
		WaitTil(2000);
		CR.PopUpContent();
		WaitTil(3000);
		ac.moveToElement(MenuDots).click().build().perform();
		WaitTil(1000);
		Edit.click();
		WaitTil(1000);
		Cancel.click();
		WaitTil(1000);
		ac.moveToElement(MenuDots).click().build().perform();
		WaitTil(1000);
		Delete.click();
		WaitTil(1000);
		No.click();
		WaitTil(1000);
		ac.moveToElement(MenuDots).click().build().perform();
		WaitTil(1000);
		Delete.click();
		WaitTil(1000);
		String DeleteTopicContent = WindowContent.getText();
		System.out.println(DeleteTopicContent);
		WaitTil(1000);
		Yes.click();
		WaitTil(2000);
		CR.PopUpContent();
		WaitTil(2000);
	}

	public void SearchContent(String Content) {
		WaitTil(2000);
		SearchBy.sendKeys(Content);
		WaitTil(2000);
		Search.click();
		WaitTil(3000);
		SearchClose.click();
		WaitTil(2000);

	}

	public void ValidateTopic() {
		LecrtureQBOpenValidate("ValidateButtons");
		WaitTil(2000);
		LecrtureQBOpenValidate("EditTopic");
		WaitTil(2000);
		LecrtureQBOpenValidate("CloneTopic");
		WaitTil(2000);
		LecrtureQBOpenValidate("DeleteTopic");
	}


	public void ValidateSubjectTopicDetailsPage(String YouTubeLink, String Content) throws IOException {
		WaitTil(2000);
		List<WebElement> Chapters = driver.findElements(By.xpath("//div[@class='s-nofiles']"));
		int size = Chapters.size();
		for (int i = 0; i < size; i++) {
			String Actual = Chapters.get(i).getText();
			String Exp = "0" + " Chapter(s)";
			if (Exp.equals(Actual)) {
				System.out.println("---:  Zero Chapters in the Subject :--- " + i);
			} else {
				Chapters.get(i).click();
				WaitTil(1000);
				SearchContent(Content);
				WaitTil(2000);
				ChapterOpen.click();
				WaitTil(2000);
				SearchContent(Content);
				WaitTil(2000);
				CreateATopic();
				WaitTil(2000);
				TopicMenuDotsValidation();
				WaitTil(2000);
				TopicOpen.click();
				for (int j = 0; j <= 2; j++) {
					WaitTil(2000);
					TopicUpload(YouTubeLink);
					WaitTil(2000);
				}
				SearchContent(Content);
				WaitTil(2000);
				TopicContent("LectureNotes");
				WaitTil(2000);
				ValidateTopic();
				WaitTil(2000);
				TopicContent("Videos");
				WaitTil(2000);
				TopicContent("QuestionBanks");
				WaitTil(2000);
				ValidateTopic();

				break;
			}
		}
	}

	public void BackButton() {
		WaitTil(2000);
		BackButton.click();
		WaitTil(2000);
	}

	
     public void AssignTeachers() {
    	 
		
		WaitTil(2000);
		List<WebElement> Chapters = driver.findElements(By.xpath("//div[@class='s-nofiles']"));
		int size = Chapters.size();
		for (int i = 0; i < size; i++) {
			String Actual = Chapters.get(i).getText();
			String Exp = "0" + " Chapter(s)";
			if (Exp.equals(Actual)) {
				System.out.println("---:  Zero Chapters in the Subject :--- " + i);
			} else {
				Chapters.get(i).click();
				WaitTil(1000);
				WebElement Teacher = driver.findElement(By.xpath("(//div[@class='r-c-sb'])[1]"));
				String act=Teacher.getText();
				System.out.println(act);
				WaitTil(1000);
				WebElement SubjectName = driver.findElement(By.xpath("(//span[@class='ant-page-header-heading-title'])[1]"));
				String Subject=SubjectName.getText();
				System.out.println(Subject);
				String Expected=Subject+"+Add A Teacher";
				if (Expected.equals(act)) {
					WaitTil(2000);
					AddATeacher.click();
					WaitTil(2000);
					Later.click();
					WaitTil(2000);
					AddATeacher.click();
					WaitTil(2000);
					AddATeacher1.click();
					WaitTil(2000);
					Cancel.click();
					WaitTil(2000);
					AddATeacher.click();
					WaitTil(2000);
					AddATeacher1.click();
					
				
				} else {
					WaitTil(2000);
					SettingsIcon.click();
					WaitTil(2000);
					Cancel.click();
					WaitTil(2000);
					SettingsIcon.click();
					
				
				}
				WaitTil(2000);
				TeacherSelector.click();
				WaitTil(2000);
				Teacher1.click();
				String TeacherName=Teacher1.getText();
				System.out.println(TeacherName);
				WaitTil(2000);
				TeacherSubmit.click();
				WaitTil(2000);
				CR.PopUpContent();
				WaitTil(2000);
				break;
				/*
				List<WebElement> Teachers = driver
						.findElements(By.xpath("//div[@class='ant-select-item ant-select-item-option']"));
				int size1 = Teachers.size();
				for (int j = 0; j < size1; j++) {
					WaitTil(2000);
					TeacherSelector.click();
					System.out.println("Selector clicked");
					WaitTil(2000);
					Teachers.get(i).click();
					System.out.println("Teacher Selected");
					WaitTil(2000);
				}
				*/
				
			}
		}
	}
     
     /****************** Teacher And Student*************/
     public void WaitOneMinute()
     {
     final long NANOSEC_PER_SEC =  1000l*1000*1000;
     long startTime = System.nanoTime();
	 while((System.nanoTime()-startTime)< 1*60*NANOSEC_PER_SEC)
	 { // do stuff
		 
	 }
     }
     
     public void DigitalLibraryPageValidation()
     {
         Wait(DigitalLibrary);
 		 DigitalLibrary.click();
 		 WaitTil(6000);
    	 String text=DigitalLibraryPageText.getText();
    	 System.out.println(text);
    	 WebElement Count1=driver.findElement(By.xpath("(//*[@class='nofiles'])[1]"));
    	 String ActLectureNotes=Count1.getText();
    	 String ExpLectureNotes="0";
    	 if (ExpLectureNotes.equals(ActLectureNotes)) {
    		 System.out.println("The Count Of The Content Is Zero");
    	 }
    	 else
    	 {
    		 System.out.println("The Count Of The Content Is :---" +ActLectureNotes);
    		 WaitTil(2000);
    		 LectureNoteOpen.click();
    		 WaitTil(3000);
    		 BackButton.click();
    	 }
    	 WebElement Count2=driver.findElement(By.xpath("(//*[@class='nofiles'])[2]"));
    	 String ActVideosCount=Count2.getText();
    	 System.out.println(ActVideosCount);
    	 String ExpVideosCount="0";
    	 if (ExpVideosCount.equals(ActVideosCount)) {
    		 System.out.println("The Count Of The Content Is Zero");
    	 }
    	 else
    	 {
    		 System.out.println("The Count Of The Content Is :---" +ActVideosCount);
    		 WaitTil(2000);
    		 VideoOpen.click();
    		 WaitTil(3000);
    		 VideoPlayer.click();
    		 WaitOneMinute();
    		 BackButton.click();
    	 }
    	 WebElement Count3=driver.findElement(By.xpath("(//*[@class='nofiles'])[3]"));
    	 String ActQuestionBanksCount=Count3.getText();
    	 System.out.println(ActQuestionBanksCount);
    	 String ExpQuestionBanksCount="0";
    	 if (ExpQuestionBanksCount.equals(ActQuestionBanksCount)) {
    		 System.out.println("The Count Of The Content Is Zero");
    	 }
    	 else
    	 {
    		 System.out.println("The Count Of The Content Is :---" +ActQuestionBanksCount);
    		 WaitTil(2000);
    		 QuestionBankOpen.click();
    		 WaitTil(3000);
    		 BackButton.click();
    	 }
     }
     
     public void ValidateSubjectTopicPage(String Content){
 		WaitTil(2000);
 		List<WebElement> Chapters = driver.findElements(By.xpath("//div[@class='s-nofiles']"));
 		int size = Chapters.size();
 		for (int i = 0; i < size; i++) {
 			String Actual = Chapters.get(i).getText();
 			String Exp = "0" + " Chapter(s)";
 			if (Exp.equals(Actual)) {
 				System.out.println("---:  Zero Chapters in the Subject :--- " + i);
 			} else {
 				Chapters.get(i).click();
 				WaitTil(1000);
 				SearchContent(Content);
 				WaitTil(2000);
 				ChapterOpen.click();
 				WaitTil(2000);
 				SearchContent(Content);
 				WaitTil(2000);
				TopicOpen.click();
				WaitTil(2000);
				String TopicData = TopicContentData.getText();
				System.out.println(TopicData);
				WaitTil(2000);
				SearchContent(Content);
				WaitTil(2000);
				AlphabeticalOrder.click();
				WaitTil(2000);
				NewestToOldest.click();
				WaitTil(2000);
				WebElement Count1=driver.findElement(By.xpath("(//*[@class='nofiles'])[1]"));
		    	 String LectureNotesCount=Count1.getText();
		    	 System.out.println(LectureNotesCount);
		    	 String ExpLectureNotesCount="0";
		    	 if (ExpLectureNotesCount.equals(LectureNotesCount)) {
		    		 System.out.println("The Count Of The Content Is Zero");
		    	 }
		    	 else
		    	 {
				ContentOneOpen.click();
	    		WaitTil(3000);
	    		BackButton.click();
		    	 }
				WaitTil(2000);
				TopicVideos.click();
				WaitTil(2000);
				AlphabeticalOrder.click();
				WaitTil(2000);
				NewestToOldest.click();
				WaitTil(2000);
				WebElement Count2=driver.findElement(By.xpath("(//*[@class='nofiles'])[2]"));
		    	 String VideosCount=Count2.getText();
		    	 System.out.println(VideosCount);
		    	 String ExpVideosCount="0";
		    	 if (ExpVideosCount.equals(VideosCount)) {
		    		 System.out.println("The Count Of The Content Is Zero");
		    	 }
		    	 else
		    	 {
				ContentOneOpen.click();
				WaitTil(2000);
	    		VideoPlayer.click();
	    		WaitOneMinute();
	    		BackButton.click();
		    	 }
				WaitTil(2000);
				TopicQuestionBanks.click();
				WaitTil(3000);
				AlphabeticalOrder.click();
				WaitTil(2000);
				NewestToOldest.click();
				WaitTil(2000);
				WebElement Count3=driver.findElement(By.xpath("(//*[@class='nofiles'])[2]"));
		    	 String QuestionBankCount=Count3.getText();
		    	 System.out.println(QuestionBankCount);
		    	 String ExpQuestionBankCount="0";
		    	 if (ExpQuestionBankCount.equals(QuestionBankCount)) {
		    		 System.out.println("The Count Of The Content Is Zero");
		    	 }
		    	 else
		    	 {
				ContentOneOpen.click();
	    		WaitTil(3000);
	    		BackButton.click();
				WaitTil(2000);
		    	 }
			
				break;
 			}
 		}
     }
     
     
   
     
}
