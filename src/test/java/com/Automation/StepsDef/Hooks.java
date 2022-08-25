package com.Automation.StepsDef;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.GenericUtils.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void Precondition() throws FileNotFoundException, IOException
	{
		{
			DriverUtils.createDriver();
			PropertyReader.initProperty();
		}
	}
	@After
	public void quit()
	{
		DriverUtils.getDriver().close();
	}
}
