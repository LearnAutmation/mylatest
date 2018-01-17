package com.testpages;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.manageusers;
import com.utils.ReadExcelFile;
import com.utils.TestBase;

public class T0testcases extends TestBase {

	@Test(priority = 1)

	public void editt0test() throws Exception {

		Thread.sleep(4000);
		manageusers manage = new manageusers(driver);
        System.out.println("using data");
		manage.editt0details("Alok", "Rai", "656565", "1213123", "Adm");

	}

	@DataProvider

	public Object[][] getTestData() throws Exception {
		ReadExcelFile ref = new ReadExcelFile();

		Object data[][] = ref.ExcelDataProvider("T0", 1, 1);

		return data;

	}
	
	/*  @Test(priority = 2) public void searchT0users() throws Exception {
	  Thread.sleep(2000); manageusers manage = new manageusers(driver);
	  manage.searchT0Users("alok", "rai"); Thread.sleep(5000);
	  //manage.searchOnlyArchivedT0Users();
	  
	  }
	  
	  @Test(priority = 3) public void creatingt0user1() throws Exception {
	 
	  Thread.sleep(2000); manageusers manage1 = new manageusers(driver);
	  manage1.creatingt0user("alok.rai@itcinfotech.com", "Alok", "Rai",
	  "12345888888");
	  
	  }*/
	 

}
