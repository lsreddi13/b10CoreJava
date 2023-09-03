package com.seleniumt.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demogroups {
//	String name = "TestNG";
//	String name2 = "selenium";
	@Parameters({"name"})
	@Test(groups = "smoke")
	public void login(String y1) {
		System.out.println("login case  --   paramter "+ y1);
	}
	
	@Test(groups = "smoke")
	public void createuser() {
		
		
		System.out.println("crate user flow");
	}

	@Test
	public void edituser() {
		System.out.println("edit user flow");
	}
	
	@Test
	public void deleteUser() {
		System.out.println("delete suer flow");
	}
	
	@Test(groups = "smoke")
	public void c_job() {
		System.out.println("create job flow");
	}
	
	@Test
	public void e_job() {
		System.out.println("edit job flow");
	}
	@Test
	public void d_job() {
		System.out.println("delete job flow");
	}
	@Test
	public void c_leave() {
		System.out.println("create leave flow");
	}
	
	@Test
	public void a_leave() {
		System.out.println("accept leave flow");
	}
	
	@Test
	public void r_leave() {
		System.out.println("reject leave flow");
	}
	@Test(groups = "smoke")
	public void d_leave() {
		System.out.println("cancel leave flow");
	}
	
	
}
