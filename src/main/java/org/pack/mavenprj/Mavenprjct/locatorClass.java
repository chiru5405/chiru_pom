package org.pack.mavenprj.Mavenprjct;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class locatorClass extends BaseClass {
	public locatorClass() {
		// page factory this
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(name = "firstname")
	private WebElement txtfirstname;
	@FindBy(name = "lastname")
	private WebElement txtlastname;
	@FindBy(name = "reg_email__")
	private WebElement txtregemail;
	@FindBy(name = "u_0_10")
	private WebElement reentermail;
	@FindBy(xpath = "//*[@id='u_0_v']")
	private WebElement txtpassword;

	@FindBy(xpath = "//label[text()='Female']")
	private WebElement txtsex;
	@FindBy(id = "day")
	private WebElement txtday;
	@FindBy(id = "month")
	private WebElement txtmonth;
	@FindBy(id = "year")
	private WebElement txtyear;
	@FindBy(name = "websubmit")
	private WebElement submitbtn;

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public void setSubmitbtn(WebElement submitbtn) {
		this.submitbtn = submitbtn;
	}

	public WebElement getTxtfirstname() {
		return txtfirstname;
	}

	public void setTxtfirstname(WebElement txtfirstname) {
		this.txtfirstname = txtfirstname;
	}

	public WebElement getTxtlastname() {
		return txtlastname;
	}

	public void setTxtlastname(WebElement txtlastname) {
		this.txtlastname = txtlastname;
	}

	public WebElement getTxtregemail() {
		return txtregemail;
	}

	public void setTxtregemail(WebElement txtregemail) {
		this.txtregemail = txtregemail;
	}

	public WebElement getReentermail() {
		return reentermail;
	}

	public void setReentermail(WebElement reentermail) {
		this.reentermail = reentermail;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public void setTxtpassword(WebElement txtpassword) {
		this.txtpassword = txtpassword;
	}

	public WebElement getTxtsex() {
		return txtsex;
	}

	public void setTxtsex(WebElement txtsex) {
		this.txtsex = txtsex;
	}

	public WebElement getTxtday() {
		return txtday;
	}

	public void setTxtday(WebElement txtday) {
		this.txtday = txtday;
	}

	public WebElement getTxtmonth() {
		return txtmonth;
	}

	public void setTxtmonth(WebElement txtmonth) {
		this.txtmonth = txtmonth;
	}

	public WebElement getTxtyear() {
		return txtyear;
	}

	public void setTxtyear(WebElement txtyear) {
		this.txtyear = txtyear;
	}
}
