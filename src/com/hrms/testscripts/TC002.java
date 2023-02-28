package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
@Test
public void tc002() throws Exception {
	//public static void main(String args[]) throws Exception {
	DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openapplication();
		Thread.sleep(3000);
		obj.loginApplication();
		Thread.sleep(3000);
		obj.enter_into_frame();
		Thread.sleep(3000);
		obj.add_newemployee();
		Thread.sleep(3000);
		obj.exit_frame();
		Thread.sleep(3000);
		obj.logoutApplication();
		Thread.sleep(3000);
		obj.closeapplication();
		
	}
}
 