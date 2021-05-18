package com.ibm.actitimeibm.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TasksStepDefinitions {
	WebDriver driver;
	//Given an user opens browser and URL
	@Given("^an user opens browser and URL$")
	public void openbrowser() {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
	}
	
	@When("^the user enters username and password$")
	public void loginwithusernameandpassword() {
		System.out.println("login");
		  //String uname = exlib.getExcelData("Login", 1, 0);
		  //String pwd =  exlib.getExcelData("Login", 1, 1);
		  driver.findElement(By.id("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.id("loginButton")).click();
	}
}
