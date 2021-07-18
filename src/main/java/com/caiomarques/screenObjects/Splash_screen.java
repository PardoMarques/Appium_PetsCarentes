package com.caiomarques.screenObjects;

import org.openqa.selenium.By;

import com.caiomarques.core.DriverFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

// Splash Screen s�o telas de aberturas de aplicativos m�veis
public class Splash_screen {
	private static AndroidDriver<MobileElement> driver = DriverFactory.getDriver();
	
	MobileElement labelLoading = 	driver.findElement(By.id("br.com.politize.politize:id/texViewSplash"));
}
