package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Parent {

    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    public void slowDown(int sn) {
        try {
            Thread.sleep(sn*1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void myClick(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.click();
        slowDown(1);
    }

    public void mySendKeyes(WebElement element, String yazi) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(yazi);
        slowDown(1);

    }

    public void scrollToElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        slowDown(1);
    }

    public void verifyContainsText(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        //action la ESC ye basarak açık kutucuk veya mesaj var ise kapat
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
        slowDown(1);
    }


    public void attachFileUsingRobot(String filePath) {
        try {

            Robot robot = new Robot();


            StringSelection fileSelection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileSelection, null);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            slowDown(1);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            slowDown(1);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            slowDown(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
