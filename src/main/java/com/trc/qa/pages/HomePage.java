package com.trc.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trc.qa.base.TestBase;

import junit.framework.Assert;

public class HomePage extends TestBase {
	
	@FindBy(xpath ="//*[@class='navbar-brand']")
	 WebElement Homeimg ;
	
	@FindBy(xpath ="//h1[text()='Welcome to Practice Admin']")
	 WebElement HomeWElcome;
	
	@FindBy(xpath ="//*[text()='12 Month Deposit Status Report']")
	private WebElement MonthDepositText;
	
	@FindBy(xpath ="html/body/div[3]/div/div[2]/div[1]/div/div/h3")
	 WebElement ScoreText;

    @FindBy(linkText= "Clinics")
    
     WebElement cliniclink;
    
    @FindBy(xpath =" //*[@id='settingIcon']/i")
	private WebElement Settingicon;
    
    
 
    @FindBy(linkText= "Physicians")
    
    WebElement Physicianslink;
    
 
 @FindBy(linkText= "Content Management")
    
    WebElement ContentManagement;
 
 @FindBy(linkText= "Static Page")
 
 WebElement StaticPage;
 
 
 @FindBy(linkText= "Free Guide")
 
 WebElement FreeGuide;
 @FindBy(linkText= "Chart")
 
 WebElement Chart;
 
    
    
 
    
@FindBy(xpath=".//*[@id='settingIconDetails']/div/ul/li[1]/a")

WebElement Template;
    
@FindBy(xpath=".//*[@id='settingIconDetails']/div/ul/li[2]/a")

WebElement SystemTemplate;

@FindBy(xpath=".//*[@id='settingIconDetails']/div/ul/li[3]/a")

WebElement AppointmentType;

@FindBy(xpath=".//*[@id='settingIconDetails']/div/ul/li[4]/a")

WebElement BlogCategories;

@FindBy(xpath=".//*[@id='settingIconDetails']/div/ul/li[6]/a")

WebElement SystemTemplates;

@FindBy(xpath="//*[@id='profileIconDetails']/div/ul/li[1]")

WebElement MyProfile;

@FindBy(xpath="//*[@id='profileIconDetails']/div/ul/li[2]")

WebElement ManageUsers;

@FindBy(xpath="//*[@id='profileIconDetails']/div/ul/li[3]")

WebElement SucessStories;


@FindBy(xpath="//*[@id='profileIconDetails']/div/ul/li[4]")

WebElement BabyGallery;







@FindBy(xpath="//*[@id='profileIconDetails']/div/ul/li[2]/a")

WebElement MyAvailability;











@FindBy(id="profileIcon")

WebElement NameLogo;

    
    @FindBy(linkText= "Patients")
    
    WebElement Patientslink;
    
    @FindBy(linkText= "Leads")
    
    WebElement Leadslink;
    
    @FindBy(linkText= "Drip Campaigns")
    
    WebElement DripCampaigns;
    
    @FindBy(linkText= "Campaign Stages")
    
    WebElement CampaignStagesLink; 

    @FindBy(linkText= "Campaign History")

   WebElement CampaignHistoryLink;



   @FindBy(linkText= "Marketing")

   WebElement Marketing;
    
    @FindBy(linkText= "Search Patients")
    
    WebElement SearchPatientslink;
    
    @FindBy(linkText ="Upcoming Patients")
    WebElement UpcomingPatients;
    
    @FindBy(linkText ="Referral Patients")
    WebElement ReferralPatients;
    
    @FindBy(linkText ="Waiting List Patients")
    WebElement WaitingListPatients;
    
    @FindBy(linkText ="Archived Patients")
    WebElement ArchivedPatients;
    
    @FindBy(linkText ="Overridden Patients")
    WebElement OverriddenPatients;
    
    
    @FindBy(xpath ="html/body/div[3]/div/div[1]/div/div[1]/h1")
	private WebElement CampaignHistoryLinkText;
    @FindBy(xpath ="html/body/div[3]/div/div[1]/div/div[1]/h1")
	private WebElement ReferralPatientsText;
    
    @FindBy(xpath ="html/body/div[3]/div/div[1]/div/div[1]/h1")
	private WebElement WaitingListPatientsETxt;
    
    @FindBy(xpath ="html/body/div[3]/div/div[1]/div/div[1]/h1")
	private WebElement ArchivedPatientsTxt;
    
    @FindBy(xpath ="html/body/div[3]/div/div[1]/div/div[1]/h1")
   	private WebElement OverriddenPatientsTxt;
    
    @FindBy(xpath ="html/body/div[3]/div/div[1]/div/div[1]/h1")
   	private WebElement DripCampiganTxt;
    
    @FindBy(xpath ="html/body/div[3]/div/div[1]/div/div[1]/h1")
   	private WebElement StageCampiganTxt;
    
    
    
    
    
    
    
    @FindBy(id="home")
    
    private WebElement LandingPage ;
    
 @FindBy(id="procedure")
    
    private WebElement procedure ;
    
 
    
 @FindBy(id="drwilson")
 
 private WebElement drwilson ;
    
@FindBy(id="faq")
 
 private WebElement faq ;

@FindBy(id="successstories")

private WebElement successstories ;

@FindBy(id="scheduling")

private WebElement scheduling ;

@FindBy(id="blog")

private WebElement blog ;

@FindBy(id="contact")

private WebElement contact ;

    
public HomePage (){
	
	PageFactory.initElements(driver, this);
}

public String VerifyHomePageTitle(){
	
	return driver.getTitle();
	
}

public boolean HomeLogo(){
	
	return Homeimg.isDisplayed();
	

}

public String VerifyWelcomemessage(){
	
	return HomeWElcome.getText();
}

public String VerifyMonthDepositText(){
	
	
	return MonthDepositText.getText();
	
	
	
}

public String VerifyScoreText(){
	
	return ScoreText.getText();
}


public ClinincPgae Clickoncliniclink(){
	
	cliniclink.click();
	
	return new ClinincPgae();
}


public Physician ClickonPhysicianslink(){
	
	Physicianslink.click();
	
	return new Physician();
}


public PatientsPage ClickonPatientslink(){
	
	Patientslink.click();
	
	return new PatientsPage();
}

public void clickonnewPatient(){
	
	Actions action = new Actions(driver);
	
	action.moveToElement(Patientslink).build().perform();
	
	SearchPatientslink.click();
}

public void clickonUpcomingPatientslink(){
	
	Actions action = new Actions(driver);
	
	action.moveToElement(Patientslink).build().perform();
	
	UpcomingPatients.click();
}


public void clickonReferralPatientslink(){
	
	Actions action = new Actions(driver);
	
	action.moveToElement(Patientslink).build().perform();
	
	ReferralPatients.click();
	
	boolean flag = ReferralPatientsText.isDisplayed();
	
	Assert.assertTrue(flag);
	
	
}

public void clickonWaitingListPatientslink(){
	
	Actions action = new Actions(driver);
	
	action.moveToElement(Patientslink).build().perform();
	
	WaitingListPatients.click();
	
	boolean flag = WaitingListPatientsETxt.isDisplayed();
	
	Assert.assertTrue(flag);
	
	
}

public void clickonArchivedPatientsListlink(){
	
	Actions action = new Actions(driver);
	
	action.moveToElement(Patientslink).build().perform();
	
	ArchivedPatients.click();
	
	boolean flag = ArchivedPatientsTxt.isDisplayed();
	
	Assert.assertTrue(flag);
	
	
}

public void clickonOverriddenPatientslink(){
	
	Actions action = new Actions(driver);
	
	action.moveToElement(Patientslink).build().perform();
	
	OverriddenPatients.click();
	
	boolean flag = OverriddenPatientsTxt.isDisplayed();
	
	Assert.assertTrue(flag);
	
	
}
public LeadsPage ClickonLeadslink(){
	
	Leadslink.click();
	
	return new LeadsPage();
}

public DripCampaignsPage clickDripCampiganlink(){
	
	Actions action = new Actions(driver);
	
	action.moveToElement(Marketing).build().perform();
	
	DripCampaigns.click();
	
	boolean flag = DripCampiganTxt.isDisplayed();
	
	Assert.assertTrue(flag);
	return new DripCampaignsPage();
	
	//CampaignStagesLink; CampaignHistoryLink;
}
public CampaignStagesPage clickonCampaignStagesLink(){
	
	Actions action = new Actions(driver);
	
	action.moveToElement(Marketing).build().perform();
	
	CampaignStagesLink.click();
	
	boolean flag = StageCampiganTxt.isDisplayed();
	
	Assert.assertTrue(flag);
	return new CampaignStagesPage();
	
	
}

public CampaignHistoryPage clickonCampaigHistoryLink(){
	
	Actions action = new Actions(driver);
	
	action.moveToElement(Marketing).build().perform();
	
	CampaignHistoryLink.click();
	
	boolean flag = CampaignHistoryLinkText.isDisplayed();
	
	Assert.assertTrue(flag);
	return new CampaignHistoryPage();
	
	
}

//ContentManagement  StaticPage FreeGuide Chart

public StaticPage clickonStaticPageLink(){
	
	Actions action = new Actions(driver);
	
	action.moveToElement(ContentManagement).build().perform();
	
	StaticPage.click();
	
		return new StaticPage();
	
}

public PatientEmailTemplatePage SettingsPatientEmailTemplate() throws InterruptedException{
	
	
	
	Settingicon.click();
	
	
	 
	  Thread.sleep(3000);
	  
	  Template.click();
	
	 
	
	  

	
	  return new PatientEmailTemplatePage();		
	
}


public SystemEmailTemplatePage SystemEmailTemplate() throws InterruptedException{
	
	
	
	Settingicon.click();
	
	
	 
	  Thread.sleep(3000);
	  
	  SystemTemplate.click();
	
	 
	
	  

	
	  return new SystemEmailTemplatePage();		
	
}
//

public AppointmentTypesPage AppointmentTypesPage1() throws InterruptedException{
	
	
	
	Settingicon.click();
	
	
	 
	  Thread.sleep(3000);
	  
	  AppointmentType.click();
	
	 
	
	  

	
	  return new AppointmentTypesPage();		
	
}


public BlogCategoriesPage BlogCategories() throws InterruptedException{
	
	
	
	Settingicon.click();
	
	
	 
	  Thread.sleep(3000);
	  
	  BlogCategories.click();
	
	 
	
	  

	
	  return new BlogCategoriesPage();		
	
}
//



public SystemEmailTemplateTypesPage SystemEmailTemplateTypes() throws InterruptedException{
	
	
	
	Settingicon.click();
	
	
	 
	  Thread.sleep(3000);
	  
	  SystemTemplates.click();
	
	 
	
	  

	
	  return new SystemEmailTemplateTypesPage();		
	
}
//  SucessStories 
public MyProfilePage ClickOnMYProfile() throws InterruptedException{
	
	NameLogo.click();
	
	Thread.sleep(3000);
	
	MyProfile.click();
	
	return new MyProfilePage();
}


public ManageUsersPage ClickonManageUsers() throws InterruptedException{
	
	NameLogo.click();
	
	Thread.sleep(3000);
	
	ManageUsers.click();
	
	return new ManageUsersPage();
}

public BabyGalleryPage ClickonBabyGallery() throws InterruptedException{
	
	NameLogo.click();
	
	Thread.sleep(3000);
	
	BabyGallery.click();
	
	return new BabyGalleryPage();
}

public void Landinghomepage() throws InterruptedException{
	
	
	
	LandingPage.click();
	
	
}
//procedure drwilson faq successstories scheduling blog contact



public void procedurepage() {
	
	
	
	procedure.click();
	
	
}

public void drwilsonpage() {
	
	
	
	drwilson.click();
	
	
}

public void faqpage() {
	
	
	
	faq.click();
	
	
}

public void successstoriespage() {
	
	
	
	successstories.click();
	
	
}
public void schedulingpage() {
	
	
	
	scheduling.click();
	
	
}
public void blogpage(){
	
	
	
	blog.click();
	
	
}

public void contactpage() {
	
	
	
	contact.click();
	
	
}





public PPhysicianMyAvailability ClickMyavailability() throws InterruptedException{
	
	NameLogo.click();
	
	Thread.sleep(3000);
	
	MyAvailability.click();
	
	return new PPhysicianMyAvailability();
}
}