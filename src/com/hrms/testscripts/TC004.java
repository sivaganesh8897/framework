package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC004 {
@Test 
public void tc004() throws Exception {
	
	//public static void main(String args[]) throws Exception {
	DOMConfigurator.configure("log4j.xml");
		General obj = new General();
	obj.openapplication();
	Thread.sleep(3000);
	obj.loginApplication();
	Thread.sleep(3000);
	obj.enter_into_frame();
	Thread.sleep(3000);
	obj.select_empid_searchdropdown();
	Thread.sleep(3000);
	obj.textbox_search();
	Thread.sleep(3000);
	obj.click_search_button();
	Thread.sleep(3000);
	obj.click_check_box();
	Thread.sleep(3000);
	obj.click_delete_button();
	Thread.sleep(3000);
	obj.exit_frame();
	Thread.sleep(3000);
	obj.closeapplication();
	Thread.sleep(3000);
	obj.closeapplication();
	
		
	}

}
