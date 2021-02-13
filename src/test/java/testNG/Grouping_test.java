package testNG;

import org.testng.annotations.Test;

public class Grouping_test {
	@Test
	public void empName() {
		System.out.println("Vigneshwar");
	}
	@Test(groups = "Company Details")
	public void empId() {
		System.out.println("123");
	}
	@Test(groups = "Bank Details" )
	public void accountNum() {
		System.out.println("446788910");
	}
	@Test(groups = "Bank Details")
	public void bankName() {
		System.out.println("IOB");
	}
	@Test(groups = "Personal Details")
	public void address() {
		System.out.println("adyar");
	}
	@Test(groups = "Personal Details")
	public void mobileNum() {
		System.out.println(" ");
	}
}
