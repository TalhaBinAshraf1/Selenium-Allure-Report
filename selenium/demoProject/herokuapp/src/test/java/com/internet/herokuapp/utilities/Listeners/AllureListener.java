package com.internet.herokuapp.utilities.Listeners;


import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;

public class AllureListener implements ITestListener {


//    private static String getTestMethodName(ITestListener iTestResult){
//        return iTestResult.getMethod().getConstructorOrMethod().getName();
//    }

 @Attachment
    public byte[] saveFailureScreenshoot(WebDriver driver){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
 }

 @Attachment(value = "{0}" , type= "text/plain")
    public static String saveTextLog(String message){
        return message;
 }
}
