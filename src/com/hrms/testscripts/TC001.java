package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 {
@Test
public void tC001() throws Exception {
	//public static void main(String args[]) throws Exception {
		//login_logout
	DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		Thread.sleep(3000);
		obj.openapplication();
		Thread.sleep(3000);
		obj.loginApplication();
		Thread.sleep(3000);
		obj.logoutApplication();
		Thread.sleep(3000);
		obj.closeapplication();
		
	}

}
