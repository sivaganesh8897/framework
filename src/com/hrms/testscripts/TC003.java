package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003 {
@Test
public void tc003() throws Exception {
	
	//public static void main(String args[])throws Exception {
	DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openapplication();
		Thread.sleep(3000);
		obj.loginApplication();
		Thread.sleep(3000);
		obj.enter_into_frame();
		Thread.sleep(3000);
		obj.click_employeename();
		Thread.sleep(3000);
		obj.edit_button();
		Thread.sleep(3000);
		obj.clear_firstname();
		Thread.sleep(3000);
		obj.clear_lastname();
		Thread.sleep(3000);
		obj.add_firstname();
		Thread.sleep(3000);
		obj.add_lastname();
		 Thread.sleep(3000);
		 obj.save_details();
		 Thread.sleep(3000);
		obj.exit_frame();
		Thread.sleep(3000);
		obj.logoutApplication();
		Thread.sleep(3000);
		obj.closeapplication();
	}
}
