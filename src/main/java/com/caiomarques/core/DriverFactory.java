package com.caiomarques.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

// Design Patterns: Factory/Singleton
// Vou centralizar a cria��o dos motoristas para que todos contenham a mesma inst�ncia do Driver
// Ou seja, em cada ponto que eu precisar do Driver, vou pedir ao DriverFactory, e irei receber a mesma inst�ncia(objeto)
public class DriverFactory {
	
	private static AndroidDriver<MobileElement> driver;
	
	public static AndroidDriver<MobileElement> getDriver() {
		// Caso ainda n�o tenha sido criado nenhum motorista, poderei criar um novo
		if(driver == null) {
			createDriver();
		}
		return driver;
	}

	// Deixo a cria��o do driver como est�tico por que n�o estarei utilizando ele diretamente por este m�todo
	private static void createDriver(){
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emuAndroid10");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appPackage", "br.com.politize.politize");
	    desiredCapabilities.setCapability("appActivity", "br.com.politize.politize.SplashActivity");
	    desiredCapabilities.setCapability("no-reset"," false");
	
	    try {
	    	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	    } catch(MalformedURLException e) {
	    	e.printStackTrace();
	    }
	    driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
	}
	
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
