package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

public class General extends Global {

	

	// to provide reusable methods 	related to the whole application
	public void openapplication() {
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
 driver = new ChromeDriver();
driver.get(url);
System.out.println("Application opened");
Log.info("application openeed");
	}
	public void closeapplication() {
		driver.close();
		System.out.println("Application closed");
		Log.info("applicaton closed");
		}
	public void loginApplication() {
		driver.findElement(By.name(txt_loginname)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(login_button)).click();
		System.out.println("login completed");
	}
	public void logoutApplication() {
		driver.findElement(By.linkText(logout_button)).click();
		System.out.println("logout completed");
	}
	public void add_newemployee() {
		driver.findElement(By.xpath(add_button)).click();
		 driver.findElement(By.name(txt_first_name)).sendKeys(emp_firstname);
		 driver.findElement(By.name(txt_last_name)).sendKeys(emp_lastname);
		 driver.findElement(By.id(save_button)).click();
		 System.out.println("new employee added");
	}
	public void enter_into_frame() {
		driver.switchTo().frame(frame_into);
		System.out.println("entered into frame");
	}
	public void exit_frame() {
		driver.switchTo().defaultContent();
		System.out.println("exit from frame");
	}
	public void click_employeename() {
		driver.findElement(By.xpath(employee_name)).click();
		System.out.println("clicked on employee");
	}
	public void edit_button() {
	driver.findElement(By.name(edit_name)).click();
	System.out.println("clicked on edit button");
	}
	public void clear_firstname() {
		driver.findElement(By.name(txt_first_name)).clear();
		System.out.println("first_name cleared");
	}
	public void clear_lastname() {
		driver.findElement(By.name(txt_last_name)).clear();
		System.out.println("lastname cleared");
	}
		public void add_firstname() {
			driver.findElement(By.name(first)).sendKeys(firstname);
			System.out.println("first name added");
			
	}
	public void add_lastname() {
		driver.findElement(By.name(last)).sendKeys(lastname);
		System.out.println("");
	}
	public void save_details() {
		driver.findElement(By.id(save)).click();
		System.out.println("");
	}
	public void select_empid_searchdropdown() {
		st = new Select(driver.findElement(By.id(Search_by)));
		     
		st.selectByVisibleText("Emp. ID");
		System.out.println("");
	}
	public void textbox_search() {
		driver.findElement(By.name(search_textbox)).sendKeys(emp_id);
		System.out.println("");
	}
	public void click_search_button() {
		driver.findElement(By.xpath(search_button)).click();
		System.out.println("");
	}
	public void click_check_box() {
		driver.findElement(By.name(check_box)).click();
		System.out.println("");
	}
	public void click_delete_button() {
		driver.findElement(By.xpath(delete_button)).click();
		System.out.println("");
	}
		
	}
	
	
