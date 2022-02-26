package com.jep;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jep.pageFactory.PageeFactory;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	WebDriver driver= null;
       PageeFactory pf= new PageeFactory(driver);
       pf.getLoginPage();
    }
}
