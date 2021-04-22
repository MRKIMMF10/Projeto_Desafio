package com.example.tests;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class Desafio {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testDesafio() throws Exception {
		selenium.open("http://sampleapp.tricentis.com/101/app.php");
		selenium.click("id=make");
		selenium.select("id=make", "label=Audi");
		selenium.click("id=engineperformance");
		selenium.type("id=engineperformance", "1.0");
		selenium.click("id=dateofmanufacture");
		selenium.type("id=dateofmanufacture", "20042021");
		selenium.click("id=numberofseats");
		selenium.select("id=numberofseats", "label=1");
		selenium.click("id=fuel");
		selenium.select("id=fuel", "label=Gasolina");
		selenium.click("id=listprice");
		selenium.type("id=listprice", "5000000,00");
		selenium.click("id=licenseplatenumber");
		selenium.type("id=licenseplatenumber", "jjj5577");
		selenium.click("id=annualmileage");
		selenium.type("id=annualmileage", "150000000,00");
		selenium.click("//button[@id='nextenterinsurantdata']/font/font");
		selenium.click("id=firstname");
		selenium.type("id=firstname", "Marcos");
		selenium.click("id=lastname");
		selenium.type("id=lastname", "oliveira");
		selenium.type("id=birthdate", "02071980");
		selenium.click("//form[@id='insurance-form']/div/section[2]/div[4]/p/label/span");
		selenium.click("id=streetaddress");
		selenium.type("id=streetaddress", "Quadra 2 Conjunto C, 03");
		selenium.select("id=country", "label=Brasil");
		selenium.type("id=zipcode", "73350-203");
		selenium.type("id=city", "Brasília");
		selenium.click("//form[@id='insurance-form']/div/section[2]/div[10]/p/label/span");
		selenium.click("id=website");
		selenium.type("id=website", "tricentis");
		selenium.click("id=picture");
		selenium.click("//button[@id='open']/font/font");
		selenium.type("id=picturecontainer", "C:\\fakepath\\eu e samy.jpg");
		selenium.click("//button[@id='nextenterproductdata']/font/font");
		selenium.click("id=startdate");
		selenium.type("id=startdate", "04202021");
		selenium.click("id=insurancesum");
		selenium.select("id=insurancesum", "label=3.000.000,00");
		selenium.click("id=meritrating");
		selenium.select("id=meritrating", "label=Bônus 1");
		selenium.click("id=damageinsurance");
		selenium.select("id=damageinsurance", "label=Cobertura Parcial");
		selenium.click("//form[@id='insurance-form']/div/section[3]/div[5]/p/label/font/font");
		selenium.click("id=courtesycar");
		selenium.select("id=courtesycar", "label=Não");
		selenium.click("id=nextselectpriceoption");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}