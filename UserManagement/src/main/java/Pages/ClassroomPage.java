package Pages;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.BaseTest;


public class ClassroomPage extends BaseTest {
	// Actions ac;
	@FindBy(xpath = "//div[text()='Automation Testing']")
	WebElement AutomationClass;
	@FindBy(xpath = "(//*[@class='box-sequare__batch r-c-c-c cursor-pointer'])[1]")
	WebElement CSESection;
	@FindBy(xpath = "//div[text()='ECE']")
	WebElement ECESection;
	@FindBy(xpath = "//a[@href='/classroom']")
	WebElement Classrooms;
	@FindBy(xpath = "//span[text()='Create New Class']")
	WebElement CreateClassButton;
	@FindBy(xpath = "(//div[contains(@class,'m')]/input)[1]")
	WebElement ClassNameField;
	@FindBy(xpath = "(//div[contains(@class,'m')]/input)[2]")
	WebElement SectionField;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement CourseSelector;
	@FindBy(xpath = "//div[@class='rc-virtual-list']/div/div/div/div[1]")
	WebElement Course1;
	@FindBy(xpath = "//span[text()='Create']")
	WebElement Createbutton;
	@FindBy(xpath = "//span[text()='Add Now']")
	WebElement AddNowbutton;
	@FindBy(xpath = "(//div[@class='cursor-pointer'])[2]")
	WebElement Close;
	@FindBy(xpath = "(//*[@class='dark-grey text-md'])[1]")
	WebElement BackButton;
	@FindBy(xpath = "(//*[text()='Maybe Later'])[1]")
	WebElement MaybeLaterbutton;
	/// *************Create Subjects*******************///
	@FindBy(xpath = "//span[text()='Create']")
	WebElement CreateSubjectbutton;
	@FindBy(xpath = "(//input[contains(@class,'ant')])[1]")
	WebElement AddSubjectName1;
	@FindBy(xpath = "//div[text()='+ Add Another Subject']")
	WebElement AddanotherSubject;
	@FindBy(xpath = "//input[contains(@class,'ant')][2]")
	WebElement AddSubjectName2;
	@FindBy(xpath = "(//span[text()='Create'])[2]")
	WebElement Create;
	/// *********Add Chapters**************************///
	@FindBy(xpath = "(//div[text()='+ Add Chapters'])[1]")
	WebElement AddChapters;
	@FindBy(xpath = "(//input[@class='ant-input input-text-grey m-t-10'])[1]")
	WebElement ChapterName1;
	@FindBy(xpath = "//div[text()='+ Add Another Chapter']")
	WebElement AddAnotherChapterBtn;
	@FindBy(xpath = "(//input[@class='ant-input input-text-grey m-t-10'])[2]")
	WebElement ChapterName2;
	@FindBy(xpath = "//span[text()='Add']")
	WebElement Add;
	@FindBy(xpath = "(//div[@class='box-sequare__batch r-c-c-c cursor-pointer'])[1]")
	WebElement ClickonClass;
	@FindBy(xpath = "//span[text()='Browse']")
	WebElement ClickBrowse;
	@FindBy(xpath = "(//div[text()='View All'])[1]")
	WebElement ChapterViewAll;
	// *******************Resources ***************************//
	@FindBy(xpath = "(//div[@class='r-c-c-c box-sequare__resources cursor-pointer'])[1]")
	WebElement ClickonSection;
	@FindBy(xpath = "//span[text()='Add to Section']")
	WebElement AddtoSection;
	@FindBy(xpath = "(//label[@class='ant-checkbox-wrapper'])[1]")
	WebElement Subject1;
	@FindBy(xpath = "(//label[@class='ant-checkbox-wrapper'])[2]")
	WebElement Subject2;
	@FindBy(xpath = "(//label[@class='ant-checkbox-wrapper'])[3]")
	WebElement Subject3;
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement YesButton;
	@FindBy(xpath = "//span[text()='No']")
	WebElement NoButton;
	@FindBy(xpath = "(//div[@class='ant-collapse-header'])[1]")
	WebElement ChaptersOpen;
	@FindBy(xpath = "//div[@class='cursor-pointer m-r-20']")
	WebElement ResourcesBack;
	// ***************Edit Curriculum*******************//
	@FindBy(xpath = "//span[text()='Edit Curriculum']")
	WebElement EditCurriculum;
	@FindBy(xpath = "(//div[@class='r-jsb m-b-20 cursor-pointer'])[1]")
	WebElement ClickSubject;
	@FindBy(xpath = "//div[@class='text-mdl']")
	WebElement EditIcon;
	@FindBy(xpath = "(//input[contains(@class,'ant-input')])[1]")
	WebElement Edittextfield;
	@FindBy(xpath = "//span[text()='Save']")
	WebElement Savebutton;
	@FindBy(xpath = "(//div[@class='text-mdl m-l-20'])[1]")
	WebElement DeleteICon;
	@FindBy(xpath = "//span[text()='Confirm']")
	WebElement ConfirmButton;
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement Cancelbutton;
	@FindBy(xpath = "//div[@class='ant-dropdown-trigger r-c-c icon-round-bg__grey cursor-pointer']")
	WebElement Dottedbutton;
	@FindBy(xpath = "//div[text()='Browse Subjects']")
	WebElement BrowseSubjects;
	// -----> Resources Page ---->
	@FindBy(xpath = "//div[text()='Create Subject']")
	WebElement CreateSubject;
	@FindBy(xpath = "//span[text()='Create']")
	WebElement Create1;
	// ----> Create Subjects ---->
	@FindBy(xpath = "//button[@class='ant-btn btn-radius-15__height-38 m-r-20 dark-grey']")
	WebElement EditChapters1;
	@FindBy(xpath = "(//span[@class='ant-checkbox'])[1]")
	WebElement SelectChapter1;
	@FindBy(xpath = "(//input[@class='ant-input input-text-grey m-l-20'])[1]")
	WebElement EditChapter1;
	@FindBy(xpath = "//span[text()='Done']")
	WebElement Done;
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement Delete;
	@FindBy(xpath = "(//div[contains(@class,'cursor')])[2]")
	WebElement LeftArrowbutton;

	/// **************Add Students **************************//
	@FindBy(xpath = "(//span[text()='Add Students'])[1]")
	WebElement AddStudentsbutton;
	@FindBy(xpath = "//input[@class='ant-input']")
	WebElement SearchByName;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	WebElement SelStudentName;
	@FindBy(xpath = "//span[text()='Add']")
	WebElement Addbutton;
	@FindBy(xpath = "(//span[@class='anticon anticon-close ant-tag-close-icon'])[1]")
	WebElement SelStudentClose;

	/// *************View Deatils **************///
	@FindBy(xpath = "//div[text()='View Details']")
	WebElement ViewDetails;
	@FindBy(xpath = "//span[@class='ant-input-group-addon']")
	WebElement Search;
	@FindBy(xpath = "//span[contains(@class,'ant-input-affix-wrapper-lg')]")
	WebElement SearchStuName;
	@FindBy(xpath = "(//span[@class='ant-checkbox'])[2]")
	WebElement SelectStudent1;
	@FindBy(xpath = "//span[text()='Transfer']")
	WebElement Transfer;
	@FindBy(xpath = "(//div[@class='r-c-c icon-square-bg__yellow cursor-pointer m-r-20'])[1]")
	WebElement TransferIcon;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement StandardSelector;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	WebElement SelectClass1;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	WebElement SectionSelector;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[11]")
	WebElement Section1;
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement Cancel;
	@FindBy(xpath = "(//span[text()='Transfer'])[2]")
	WebElement Transferbutton1;
	@FindBy(xpath = "//span[text()='Unassign']")
	WebElement Unassign;
	@FindBy(xpath = "(//div[@class='r-c-c icon-square-bg__red cursor-pointer'])[1]")
	WebElement UnassignIcon;
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement Yes;
	@FindBy(xpath = "//span[text()='No']")
	WebElement No;

	/// *********** Add Section Puls Icon ******************************///

	@FindBy(xpath = "(//div[@class='r-c-c icon-round-bg__grey cursor-pointer'])[2]")
	WebElement PlusIcon;
	@FindBy(xpath = "(//span[@class='ant-checkbox'])[1]")
	WebElement CloneSubject1;
	@FindBy(xpath = "//input[@class='ant-input input-text-grey']")
	WebElement NewSectionName;
	@FindBy(xpath = "//div[@class='ant-select-selector']")
	WebElement CourseNameSelector;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement CourseNameSelector1;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	WebElement Course;
	@FindBy(xpath = "//span[text()='Create']")
	WebElement CreateButton;
	@FindBy(xpath = "//span[text()='Clone']")
	WebElement CloneButton;
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement CancelButton;
	///// **********Class Edit Icon****************///

	@FindBy(xpath = "(//div[@class='r-c-c icon-round-bg__grey cursor-pointer'])[1]")
	WebElement ClassEditIcon;
	@FindBy(xpath = "//input[@class='ant-input input-text-grey']")
	WebElement ClassName;
	@FindBy(xpath = "(//input[@class='ant-input input-text-grey flex-1 m-r-10'])[1]")
	WebElement SectionName;
	@FindBy(xpath = "(//div[@class='r-c-c icon-square-bg__yellow cursor-pointer m-l-20 m-r-20'])[1]")
	WebElement TransferIcon1;
	@FindBy(xpath = "//label[@class='ant-checkbox-wrapper m-b-20']")
	WebElement KeeptheSubjects;
	@FindBy(xpath = "//span[text()='Confirm']")
	WebElement Confirm;
	@FindBy(xpath = "(//span[text()='Cancel'])[2]")
	WebElement Cancel1;
	@FindBy(xpath = "(//span[text()='Cancel'])[1]")
	WebElement ClassCancel;
	@FindBy(xpath = "//span[text()='Save']")
	WebElement Save;
	@FindBy(xpath = "(//div[@class='r-c-c icon-square-bg__red cursor-pointer'])[1]")
	WebElement EditDeleteICon;

	///// **********Section Edit Icon****************///
	@FindBy(xpath = "(//div[@class='box-sequare__batch r-c-c-c cursor-pointer'])[1]")
	WebElement Class;
	@FindBy(xpath = "(//div[@class='r-c-c icon-round-bg__grey cursor-pointer'])[1]")
	WebElement SectionEditIcon;
	@FindBy(xpath = "(//input[@class='ant-input input-text-grey'])[1]")
	WebElement ClassName1;
	@FindBy(xpath = "(//input[@class='ant-input input-text-grey'])[2]")
	WebElement SectionName1;
	@FindBy(xpath = "//span[text()='Update']")
	WebElement Update;

	@FindBy(xpath = "//span[@class='anticon anticon-close ant-notification-close-icon']")
	WebElement PopUpClose;

	JavascriptExecutor js = (JavascriptExecutor) driver;
    UserManagementPage UM=new UserManagementPage();
	public ClassroomPage() {
		PageFactory.initElements(driver, this);
	}

	public void ClickonClassrooms() throws InterruptedException {
		WaitTil(2000);
		Classrooms.click();
		WaitTil(2000);
	}

	public void Overview() throws InterruptedException {
		WebElement messagElement = driver.findElement(By.xpath("(//div[@class='text-xs dark-grey'])[1]"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		String exp = "Total number of classes";
		WebElement text = driver.findElement(By.xpath("(//div[@class='text-md color-black bold-600 '])[1]"));
		String message = text.getText();
		int TotalClasses = Integer.parseInt(message);
		if (exp.equals(act)) {
			System.out.println(" : - " +TotalClasses);
		}
		Thread.sleep(2000);
		WebElement messagElement1 = driver.findElement(By.xpath("(//div[@class='text-xs dark-grey'])[2]"));
		String act1 = messagElement1.getText();
		System.out.println("The actual text is:" + act1);
		String exp1 = "Total number of sections";
		WebElement text1 = driver.findElement(By.xpath("(//div[@class='text-md color-black bold-600 '])[2]"));
		String message1 = text1.getText();
		int TotalSections = Integer.parseInt(message1);
		if (exp1.equals(act1)) {
			System.out.println(" : -  " + TotalSections);
		}
		Thread.sleep(2000);
		WebElement messagElement2 = driver.findElement(By.xpath("(//div[@class='text-xs dark-grey'])[3]"));
		String act2 = messagElement2.getText();
		System.out.println("The actual text is:" + act2);
		String exp2 = "Total number of students";
		WebElement text2 = driver.findElement(By.xpath("(//div[@class='text-md color-black bold-600 '])[3]"));
		String message2 = text2.getText();
		int TotalStudents = Integer.parseInt(message2);
		if (exp2.equals(act2)) {
			System.out.println(" : - " +TotalStudents );
		}
		Thread.sleep(2000);
		WebElement messagElement3 = driver.findElement(By.xpath("(//div[@class='text-xs dark-grey'])[4]"));
		String act3 = messagElement3.getText();
		System.out.println("The actual text is:" + act3);
		String exp3 = "Avg. sections in a class";
		WebElement text3 = driver.findElement(By.xpath("(//div[@class='text-md color-black bold-600 '])[4]"));
		String message3 = text3.getText();
		int AvgSections = Integer.parseInt(message3);
		if (exp3.equals(act3)) {
			System.out.println(" : - " + AvgSections);
		}
		Thread.sleep(2000);
		WebElement messagElement4 = driver.findElement(By.xpath("(//div[@class='text-xs dark-grey'])[5]"));
		String act4 = messagElement4.getText();
		System.out.println("The actual text is:" + act4);
		String exp4 = "Avg. students in a class";
		WebElement text4 = driver.findElement(By.xpath("(//div[@class='text-md color-black bold-600 '])[5]"));
		String message4 = text4.getText();
		int AvgStudents = Integer.parseInt(message4);
		if (exp4.equals(act4)) {
			System.out.println(" : - " +AvgStudents);
		}
		
		
		int ActualAvgStudents=0;
		ActualAvgStudents=TotalStudents/TotalClasses;
		System.out.println("Actual Avg. students in a class  "+ActualAvgStudents);
		
		int ActualAvgSections=0;
		ActualAvgSections=TotalStudents/TotalSections;
		System.out.println("Actual Avg. sections in a class  "+ActualAvgSections);
		
		System.out.println("Overview Method is Test Passed Successfully ");

	}

	public void CreateaNewClass() throws InterruptedException {
		WaitTil(2000);
		CreateClassButton.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				Random rnd = new Random();
				StringBuilder name = new StringBuilder(8);
				for (int n = 0; n < 8; n++)
				{
					name.append(captals.charAt(rnd.nextInt(captals.length())));
				}
		ClassNameField.sendKeys(name);
		System.out.println(" Class Name is :-"+name);
		WaitTil(2000);
		String captals1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd1 = new Random();
		StringBuilder name1 = new StringBuilder(2);
		for (int n = 0; n < 2; n++)
		{
			name1.append(captals1.charAt(rnd1.nextInt(captals1.length())));
		}
		SectionField.sendKeys(name1);
		WaitTil(2000);
		CourseSelector.click();
		WaitTil(2000);
		Course1.click();
		WaitTil(2000);
		Createbutton.click();
		WaitTil(2000);
		WebElement ele=driver.findElement(By.xpath("(//*[@class='ant-modal-body']/div/div/div)[1]"));
		String ClassName=ele.getText();
		System.out.println(ClassName);
		MaybeLaterbutton.click();
		WaitTil(1000);
		WebElement Class=driver.findElement(By.xpath("(//*[text()='"+ClassName+"'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)", Class);
		WaitTil(2000);
		Class.click();
		WaitTil(2000);
		
	}

	
	
	public void PopUpContent()
	{
		WaitTil(2000);
		WebElement messagElement = driver.findElement(By.xpath("//div[@class='ant-notification-notice-content']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
	}


	public void Curriculum() throws InterruptedException {
		WaitTil(2000);
		CreateaNewClass();
		WaitTil(2000);
		CreateSubjectbutton.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder Subject1 = new StringBuilder(9);
		for (int n = 0; n < 9; n++)
		{
			Subject1.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		AddSubjectName1.sendKeys(Subject1);
		WaitTil(2000);
		AddanotherSubject.click();
		WaitTil(2000);
		StringBuilder Subject2 = new StringBuilder(10);
		for (int n = 0; n < 10; n++)
		{
			Subject2.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		AddSubjectName2.sendKeys(Subject2);
		WaitTil(2000);
		Create.click();
		System.out.println("****** Subjects Created ************");
		WaitTil(2000);
		PopUpContent();
		WaitTil(2000);
		chapterCreation();
		WaitTil(2000);
		chapterCreation();
		WaitTil(3000);
		ChapterViewAll.click();
		WaitTil(2000);
		BackButton.click();
		WaitTil(2000);
		ClickBrowse.click();
		WaitTil(2000);
		BackButton.click();
		System.out.println("Curriculum Method is Test Passed Successfully ");

	}
	public void chapterCreation()
	{
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		WaitTil(2000);
		driver.findElement(By.xpath("(//*[text()='+ Add Chapters'])[1]")).click();
		WaitTil(2000);
		StringBuilder Chapter1 = new StringBuilder(10);
		for (int n = 0; n < 10; n++)
		{
			Chapter1.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		ChapterName1.sendKeys(Chapter1);
		WaitTil(2000);
		AddAnotherChapterBtn.click();
		StringBuilder Chapter2 = new StringBuilder(9);
		for (int n = 0; n < 9; n++)
		{
			Chapter2.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		ChapterName2.sendKeys(Chapter2);
		WaitTil(2000);
		Add.click();
		PopUpContent();
		WaitTil(1000);
		System.out.println("****** Chapters Created is Test Passed Successfully   ************");
		WaitTil(3000);
	}

	public void Resource() throws InterruptedException {
		WaitTil(2000);
		ClickonSection.click();
		WaitTil(2000);
		ChaptersOpen.click();
		WaitTil(2000);
		AddtoSection.click();
		WaitTil(2000);
		NoButton.click();
		WaitTil(2000);
		ClickonSection.click();
		WaitTil(2000);
		AddtoSection.click();
		WaitTil(2000);
		driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[1]")).click();
		WaitTil(2000);
		driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[2]")).click();
		WaitTil(2000);
		YesButton.click();
		WaitTil(2000);
		PopUpContent();
		WaitTil(2000);
		System.out.println("Resource Method is Test Passed Successfully ");
	}

	public void EditCurriculum() throws InterruptedException {
		WaitTil(2000);
		Curriculum();
		WaitTil(2000);
		EditCurriculum.click();
		WaitTil(2000);
		ClickSubject.click();
		WaitTil(2000);
		EditIcon.click();
		WaitTil(1000);
		WebElement textedit = Edittextfield;
		textedit.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		textedit.sendKeys(Keys.DELETE);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder NewChaptername = new StringBuilder(12);
		for (int n = 0; n < 12; n++)
		{
			NewChaptername.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		WaitTil(1000);
		textedit.sendKeys(NewChaptername);
		WaitTil(1000);
		Savebutton.click();
		WaitTil(1000);
		PopUpContent();
		WaitTil(2000);
		ClickSubject.click();
		WaitTil(2000);
		DeleteICon.click();
		WaitTil(2000);
		Cancelbutton.click();
		System.out.println("****** Delete Cancelled ************");
		WaitTil(2000);
		DeleteICon.click();
		WaitTil(2000);
		ConfirmButton.click();
		WaitTil(1000);
		PopUpContent();
		System.out.println("****** Deleted Chapter ************");
		WaitTil(2000);
		ClickSubject.click();
		WebElement ele = driver.findElement(By.xpath("//span[@class='m-l-5 dark-grey']"));
		String actual = ele.getText();
		System.out.println("The Total Chapters are :-" + actual);
		String exp = "(" + "0" + ")";
		if (exp.equals(actual)) {
			driver.findElement(By.xpath("(//span[text()='Add Chapters'])[1]")).click();
			WaitTil(2000);
			StringBuilder NewChaptername1 = new StringBuilder(12);
			for (int n = 0; n < 12; n++)
			{
				NewChaptername.append(captals.charAt(rnd.nextInt(captals.length())));
			}
			ChapterName1.sendKeys(NewChaptername1);
			WaitTil(2000);
			AddAnotherChapterBtn.click();
			WaitTil(2000);
			StringBuilder NewChaptername2 = new StringBuilder(12);
			for (int n = 0; n < 12; n++)
			{
				NewChaptername.append(captals.charAt(rnd.nextInt(captals.length())));
			}
			ChapterName2.sendKeys(NewChaptername2);
			WaitTil(2000);
			Add.click();
			WaitTil(1000);
			PopUpContent();
			WaitTil(2000);

		} else {
			System.out.println("Chapters are there in Subject ");

		}
		WaitTil(2000);
		EditChapters1.click();
		WaitTil(2000);
		WebElement Edit = EditChapter1;
		Edit.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Edit.sendKeys(Keys.DELETE);
		StringBuilder EditChaptername = new StringBuilder(13);
		for (int n = 0; n < 13; n++)
		{
			EditChaptername .append(captals.charAt(rnd.nextInt(captals.length())));
		}
		WaitTil(2000);
		Edit.sendKeys(EditChaptername );
		WaitTil(2000);
		Done.click();
		WaitTil(2000);
		ClickSubject.click();
		WaitTil(2000);
		EditChapters1.click();
		WaitTil(2000);
		SelectChapter1.click();
		WaitTil(2000);
		Delete.click();
		WaitTil(2000);
		Cancelbutton.click();
		WaitTil(2000);
		Delete.click();
		WaitTil(2000);
		ConfirmButton.click();
		WaitTil(2000);
		DottedButton();
		WaitTil(2000);

	}

	public void DottedButton() throws InterruptedException {
		WaitTil(2000);
		Dottedbutton.click();
		WaitTil(2000);
		CreateSubject.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder Subjectname1 = new StringBuilder(12);
		for (int n = 0; n < 12; n++)
		{
			Subjectname1.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		WaitTil(2000);
		AddSubjectName1.sendKeys(Subjectname1);
		WaitTil(2000);
		AddanotherSubject.click();
		WaitTil(2000);
		StringBuilder Subjectname2 = new StringBuilder(12);
		for (int n = 0; n < 12; n++)
		{
			Subjectname2.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		WaitTil(2000);
		AddSubjectName2.sendKeys(Subjectname2);
		WaitTil(2000);
		Create1.click();
		WaitTil(2000);
		PopUpContent();
		System.out.println("****** Subjects Created ************");
		WaitTil(2000);
		Dottedbutton.click();
		WaitTil(2000);
		BrowseSubjects.click();
		WaitTil(2000);
		Resource();
		WaitTil(2000);
	    for(int i=0;i<4;i++)
		{
			WaitTil(2000);
			BackButton.click();
			WaitTil(2000);
		}

	}
	public void ValidateStudentViewDetails() throws InterruptedException {
		WaitTil(2000);
		CreateClassButton.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				Random rnd = new Random();
				StringBuilder name = new StringBuilder(8);
				for (int n = 0; n < 8; n++)
				{
					name.append(captals.charAt(rnd.nextInt(captals.length())));
				}
		ClassNameField.sendKeys(name);
		System.out.println(" Class Name is :-"+name);
		WaitTil(2000);
		String captals1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0987654321";
		Random rnd1 = new Random();
		StringBuilder name1 = new StringBuilder(3);
		for (int n = 0; n < 3; n++)
		{
			name1.append(captals1.charAt(rnd1.nextInt(captals1.length())));
		}
		SectionField.sendKeys(name1);
		WaitTil(2000);
		CourseSelector.click();
		WaitTil(2000);
		Course1.click();
		WaitTil(2000);
		Createbutton.click();
		WaitTil(2000);
		WebElement ele=driver.findElement(By.xpath("(//*[@class='ant-modal-body']/div/div/div)[1]"));
		String ClassName=ele.getText();
		System.out.println(ClassName);
		MaybeLaterbutton.click();
		WaitTil(1000);
		WebElement Class=driver.findElement(By.xpath("(//*[text()='"+ClassName+"'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)", Class);
		WaitTil(2000);
		Class.click();
		WaitTil(2000);
		for(int i=0;i<4;i++)
		{
			WaitTil(2000);
			driver.findElement(By.xpath("//a[@href='/user-management']")).click();
			WaitTil(2000);
			driver.findElement(By.xpath("(//h4[text()='VIEW MORE'])[1]")).click();
			WaitTil(2000);
			UM.vieworeAddaUser("UserCreation");
			WaitTil(2000);
			WebElement ele1=driver.findElement(By.xpath("(//*[@class='userCardStyle']/div[2]/h3)[1]"));
			String StudentName=ele1.getText();
			System.out.println(StudentName);
			WaitTil(2000);
			Classrooms.click();
			WaitTil(2000);
			WebElement Class1=driver.findElement(By.xpath("(//*[text()='"+ClassName+"'])[1]"));
			js.executeScript("arguments[0].scrollIntoView(true)", Class1);
			WaitTil(2000);
			Class1.click();
			WaitTil(2000);
			AddStudentsbutton.click();
			WaitTil(2000);
			SearchByName.sendKeys(StudentName);
			WaitTil(2000);
			SelStudentName.click();
			WaitTil(2000);
			Addbutton.click();
			WaitTil(2000);
			WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
			String act = messagElement.getText();
			System.out.println("The actual text is:" + act);
			String exp = "success";
			WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
			String message = text.getText();
			if (exp.equals(act)) {
				System.out.println("The success message is:  " + message);
				WaitTil(2000);
			

			} else {
				System.out.println("The The failure messgae is: " + message);
				WaitTil(2000);
				Close.click();
			}	
		}
		StudentViewDetails();
		WaitTil(2000);
		driver.navigate().refresh();
		WaitTil(3000);
		TransferStudent();
		WaitTil(2000);
		IconTransferStudent();
		WaitTil(2000);
		UnassignStudent();
		WaitTil(2000);
		IconUnassignStudent();
		WaitTil(2000);
		
	}


	public void StudentViewDetails() throws InterruptedException {
		WaitTil(2000);
		WebElement ele = driver.findElement(By.xpath("//span[@class='dark-grey']"));
		String actual = ele.getText();
		System.out.println("The Total Students are :-" + actual);
		String exp = "(" + "0" + ")";
		if (exp.equals(actual)) {
			System.out.println("Zero Students are in The Class Please add Students");
			WaitTil(2000);
			BackButton.click();

		} else {
			WaitTil(2000);
			ViewDetails.click();
			WaitTil(2000);
			SelectStudent1.click();
			WaitTil(2000);
			Transfer.click();
			WaitTil(2000);
			Cancel.click();
			WaitTil(2000);
			Unassign.click();
			WaitTil(2000);
			No.click();
			WaitTil(2000);
			TransferIcon.click();
			WaitTil(2000);
			Cancel.click();
			WaitTil(2000);
			UnassignIcon.click();
			WaitTil(2000);
			No.click();
			WaitTil(2000);
			WebElement ViewDetailsStudentName = driver.findElement(By.xpath("(//div[@class='m-l-10 color-black bold-600 text-xs'])[1]"));
			String StudentName = ViewDetailsStudentName.getText();
			WebElement s = driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
			s.sendKeys(StudentName);
			WaitTil(2000);
			s.sendKeys(Keys.ENTER);
			
		}

	}
   
  

	public void TransferStudent() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//span[@class='dark-grey']"));
		String actual1 = ele1.getText();
		System.out.println("The Total Students are :-" + actual1);
		String exp1 = "(" + "0" + ")";
		if (exp1.equals(actual1)) {
			System.out.println("Zero Students are in The Class Please add Students");

		} else {
			Thread.sleep(2000);
			SelectStudent1.click();
			Thread.sleep(2000);
			Transfer.click();
			Thread.sleep(2000);
			StandardSelector.click();
			Thread.sleep(2000);
			SelectClass1.click();
			Thread.sleep(2000);
			SectionSelector.click();
			Thread.sleep(2000);
			Section1.click();
			Thread.sleep(2000);
			Transferbutton1.click();
			Thread.sleep(2000);
			PopUpContent();
		}

	}

	public void IconTransferStudent() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//span[@class='dark-grey']"));
		String actual1 = ele1.getText();
		System.out.println("The Total Students are :-" + actual1);
		String exp1 = "(" + "0" + ")";
		if (exp1.equals(actual1)) {
			System.out.println("Zero Students are in The Class Please add Students");

		} else {
			Thread.sleep(2000);
			SelectStudent1.click();
			Thread.sleep(2000);
			TransferIcon.click();
			Thread.sleep(2000);
			StandardSelector.click();
			Thread.sleep(2000);
			SelectClass1.click();
			Thread.sleep(2000);
			SectionSelector.click();
			Thread.sleep(2000);
			Section1.click();
			Thread.sleep(2000);
			Transferbutton1.click();
			Thread.sleep(2000);
			PopUpContent();
		}
	}
	public void UnassignStudent() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//span[@class='dark-grey']"));
		String actual1 = ele1.getText();
		System.out.println("The Total Students are :-" + actual1);
		String exp1 = "(" + "0" + ")";
		if (exp1.equals(actual1)) {
			System.out.println("Zero Students are in The Class Please add Students");

		} else {
			WebElement ViewDetailsStudentName = driver.findElement(By.xpath("(//div[@class='m-l-10 color-black bold-600 text-xs'])[1]"));
			String StudentName = ViewDetailsStudentName.getText();
			Thread.sleep(2000);
			SelectStudent1.click();
			Thread.sleep(2000);
			Unassign.click();
			Thread.sleep(2000);
			Yes.click();
			Thread.sleep(2000);
			PopUpContent();
			Thread.sleep(2000);
			AddStudentsbutton.click();
			Thread.sleep(2000);
			SearchByName.sendKeys(StudentName);
			Thread.sleep(2000);
			SelStudentName.click();
			Thread.sleep(2000);
			Addbutton.click();
			Thread.sleep(2000);
			WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
			String act = messagElement.getText();
			System.out.println("The actual text is:" + act);
			String exp = "success";
			WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
			String message = text.getText();
			if (exp.equals(act)) {
				System.out.println("The success message is:  " + message);
				PopUpClose.click();

			} else {
				System.out.println("The The failure messgae is: " + message);
				Thread.sleep(2000);
				Close.click();
				Thread.sleep(2000);
			}

		}

	}


	public void IconUnassignStudent() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//span[@class='dark-grey']"));
		String actual1 = ele1.getText();
		System.out.println("The Total Students are :-" + actual1);
		String exp1 = "(" + "0" + ")";
		if (exp1.equals(actual1)) {
			System.out.println("Zero Students are in The Class Please add Students");

		} else {
			WebElement ViewDetailsStudentName = driver.findElement(By.xpath("(//div[@class='m-l-10 color-black bold-600 text-xs'])[1]"));
			String StudentName = ViewDetailsStudentName.getText();
			System.out.println(StudentName);
			Thread.sleep(2000);
			SelectStudent1.click();
			Thread.sleep(2000);
			UnassignIcon.click();
			Thread.sleep(2000);
			Yes.click();
			Thread.sleep(2000);
			PopUpContent();
			Thread.sleep(2000);
			AddStudentsbutton.click();
			Thread.sleep(2000);
			SearchByName.sendKeys(StudentName);
			Thread.sleep(2000);
			SelStudentName.click();
			Thread.sleep(2000);
			Addbutton.click();
			Thread.sleep(2000);
			WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
			String act = messagElement.getText();
			System.out.println("The actual text is:" + act);
			String exp = "success";
			WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
			String message = text.getText();
			if (exp.equals(act)) {
				System.out.println("The success message is:  " + message);
				Thread.sleep(2000);

			} else {
				System.out.println("The The failure messgae is: " + message);
				Thread.sleep(2000);
				Close.click();
				Thread.sleep(2000);
			}

		}
	}

	public void AddASection() throws InterruptedException {
		WaitTil(2000);
		PlusIcon.click();
		WaitTil(2000);
		CancelButton.click();
		WaitTil(2000);
		PlusIcon.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		Random rnd = new Random();
		StringBuilder SectionName1 = new StringBuilder(3);
		for (int n = 0; n < 3; n++)
		{
			SectionName1.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		WaitTil(2000);
		NewSectionName.sendKeys(SectionName1);
		WaitTil(2000);
		CourseNameSelector.click();
		WaitTil(2000);
		Course.click();
		WaitTil(2000);
		CreateButton.click();
		WaitTil(2000);
		MaybeLaterbutton.click();
		WaitTil(2000);
		/*
		PlusIcon.click();
		WaitTil(2000);
		CloneSubject1.click();
		StringBuilder SectionName2 = new StringBuilder(3);
		for (int n = 0; n < 3; n++)
		{
			SectionName2.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		WaitTil(2000);
		NewSectionName.sendKeys(SectionName2);
		WaitTil(2000);
		CloneButton.click();
		WaitTil(2000);
		WebElement messagElement1 = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
		String act1 = messagElement1.getText();
		System.out.println("The actual text is:" + act1);
		String exp1 = "success";
		WebElement text1 = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
		String message1 = text1.getText();
		if (exp1.equals(act1)) {
			System.out.println("The success message is:  " + message1);

		} else {
			System.out.println("The The failure messgae is: " + message1);
			WaitTil(2000);
			CancelButton.click();
			
		}
		*/
	}

	public void UpdateSectionDetails() throws InterruptedException {
		WaitTil(2000);
		SectionEditIcon.click();
		WaitTil(2000);
		WebElement e = ClassName1;
		e.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		e.sendKeys(Keys.DELETE);
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		Random rnd = new Random();
		StringBuilder UpadteName = new StringBuilder(13);
		for (int n = 0; n < 13; n++)
		{
			 UpadteName.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		WaitTil(2000);
		e.sendKeys(UpadteName);
		WaitTil(2000);
		WebElement ele = SectionName1;
		ele.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		ele.sendKeys(Keys.DELETE);
		StringBuilder UpadteSection = new StringBuilder(3);
		for (int n = 0; n < 3; n++)
		{
			UpadteSection.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		ele.sendKeys(UpadteSection);
		WaitTil(2000);
		CourseNameSelector.click();
		WaitTil(2000);
		Course.click();
		WaitTil(2000);
		Update.click();
		PopUpContent();
		WaitTil(2000);
		BackButton.click();
		
	}

	public void EditClassDetails() throws InterruptedException {
		WaitTil(2000);
		ClassEditIcon.click();
		WaitTil(2000);
		ClassCancel.click();
		WaitTil(2000);
		ClassEditIcon.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		Random rnd = new Random();
	/*	WebElement e = ClassName;
		e.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		e.sendKeys(Keys.DELETE);
		WaitTil(2000);
		StringBuilder UpadteName = new StringBuilder(13);
		for (int n = 0; n < 13; n++)
		{
			 UpadteName.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		e.sendKeys(UpadteName);
		*/
		WaitTil(2000);
		WebElement ele = SectionName;
		ele.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		ele.sendKeys(Keys.DELETE);
		StringBuilder UpadteName1 = new StringBuilder(3);
		for (int n = 0; n < 3; n++)
		{
			 UpadteName1.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		ele.sendKeys(UpadteName1);
		WaitTil(2000);
	//	CourseNameSelector1.click();
	//	WaitTil(2000);
	//	Course.click();
		WaitTil(2000);
		Save.click();
		WaitTil(2000);
		UM.popupContent();
	}

	public void ClassEditTransferIcon() throws InterruptedException {
		WaitTil(2000);
		ClassEditIcon.click();
		WaitTil(2000);
		TransferIcon1.click();
		WaitTil(2000);
		ClassCancel.click();
		WaitTil(2000);
		ClassEditIcon.click();
		WaitTil(2000);
		TransferIcon1.click();
		WaitTil(2000);
		CourseNameSelector1.click();
		WaitTil(2000);
		Course.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		Random rnd = new Random();
		StringBuilder UpadteName = new StringBuilder(13);
		for (int n = 0; n < 13; n++)
		{
			 UpadteName.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		ClassName1.sendKeys(UpadteName);
		WaitTil(2000);
		KeeptheSubjects.click();
		WaitTil(2000);
		Transfer.click();
		WaitTil(2000);
		WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		String exp = "success";
		WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
		String message = text.getText();
		if (exp.equals(act)) {
			System.out.println("The success message is:  " + message);

		} else {
			System.out.println("The The failure messgae is: " + message);
			WaitTil(2000);
			ClassCancel.click();
			WaitTil(2000);
		}
	}

	public void ClassDelete() throws InterruptedException {
		WaitTil(2000);
		ClassEditIcon.click();
		WaitTil(2000);
		EditDeleteICon.click();
		WaitTil(2000);
		WebElement messagElement = driver.findElement(By.xpath("//span[@class='ant-modal-confirm-title']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		String exp = "Not Allowed";
		if (exp.equals(act)) {
			WaitTil(2000);
			driver.findElement(By.xpath("//span[text()='OK']")).click();
			WaitTil(2000);
			ClassCancel.click();
			WaitTil(2000);
		} else {
			WaitTil(2000);
			Cancel1.click();
			WaitTil(2000);
			EditDeleteICon.click();
			WaitTil(2000);
			Confirm.click();
			WaitTil(2000);
			Savebutton.click();
			WaitTil(2000);
			WebElement messagElement1 = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
			String act1 = messagElement1.getText();
			System.out.println("The actual text is:" + act1);
			String exp1 = "success";
			WebElement text1 = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
			String message1 = text1.getText();
			if (exp1.equals(act1)) {
				System.out.println("The success message is:  " + message1);
				WaitTil(2000);

			} else {
				System.out.println("The The failure messgae is: " + message1);
				WaitTil(2000);
				ClassCancel.click();
				WaitTil(2000);
			}

		}

	}

}
