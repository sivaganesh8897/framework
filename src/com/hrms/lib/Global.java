 package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Global {
// provide test data and objects for whole application
	///* TestData
	 public String url = "http://183.82.103.245/nareshit/login.php";
	 public  WebDriver driver;
	 public Select st;
	public String username = "nareshit";
 public  String password = "nareshit";
 public String emp_firstname = "venkatesh";
 public String emp_lastname = "pasala";
 public String firstname = "pv";
 public String lastname = "sindhu";
 public String emp_id  = "2037";
	 ///* Objects/elements
	public  String txt_loginname = "txtUserName";
public 	String txt_password = "txtPassword";
	public String login_button = "Submit";
	public String logout_button = "Logout";
	public String add_button = "//input[@value='Add']";
	public String txt_first_name = "txtEmpFirstName";
	public String txt_last_name = "txtEmpLastName";
	public String save_button = "btnEdit";
	public String frame_into = "rightMenu";
	public String employee_name = "//*[@id=\"standardView\"]/table/tbody/tr[19]/td[3]/a";
	public String edit_name = "EditMain";
	public String save  = "btnEditPers";
	 public String first  = "txtEmpFirstName";
	 public String last   = "txtEmpLastName";
	 public String Search_by = "loc_code";
	 public String search_textbox = "loc_name";
	 public String search_button = "//input[@value='Search']";
	 public String check_box = "chkLocID[]";
	 public String delete_button = "//input[@value='Delete']";
	 


}
