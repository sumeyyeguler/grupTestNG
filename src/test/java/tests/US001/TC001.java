package tests.US001;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC001 {

    AlloverPage a=new AlloverPage();
    Actions actions=new Actions(Driver.getDriver());
    //Faker faker=new Faker();
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        String wh=Driver.getDriver().getWindowHandle();
        a.register.click();
        a.becomeAVendor.click();
        a.email.sendKeys(ConfigReader.getProperty("alloverEmail"));
        Driver.getDriver().switchTo().newWindow(WindowType.WINDOW).get(ConfigReader.getProperty("outlookUrl"));
        a.outlookmail.sendKeys(ConfigReader.getProperty("alloverEmail"));
        a.ileri.click();
        ReusableMethods.waitFor(3);
        a.password.sendKeys(ConfigReader.getProperty("alloverSifre"));
        ReusableMethods.waitFor(3);
        WebElement carrers = a.oturumAc;
        JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();
        //jse.executeScript("arguments[0].scrollIntoView(true);",carrers);
        //Carrers butonuna js ile click yapalım
        jse.executeScript("arguments[0].click();",carrers);
        //a.oturumAc.click();
        ReusableMethods.waitFor(3);
        a.hayir.click();
        ReusableMethods.waitFor(10);
        a.gereksiz.click();
        System.out.println(a.gereksiz.getText());
        ReusableMethods.waitFor(5);
        a.ilkMesaj.click();
        System.out.println(a.sayi.getText());
        String code=a.sayi.getText();
        Driver.getDriver().switchTo().window(wh);
        a.verficationCode.sendKeys(code);
        ReusableMethods.waitFor(5);
        a.alloverpassword.sendKeys(ConfigReader.getProperty("alloverSifree"));
        ReusableMethods.waitFor(5);
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("alloverSifreee")).perform();
        jse.executeScript("arguments[0].click();",a.registerButton);
        //a.registerButton.click();
        ReusableMethods.waitFor(3);
        a.simdiDegil.click();
        //Driver.getDriver().navigate().back();
        a.signOut.click();
        ReusableMethods.waitFor(3);
        jse.executeScript("arguments[0].click();",a.acoutdetails);
        //a.acoutdetails.click();
        ReusableMethods.waitFor(3);
        a.ilkname.sendKeys("sari");
        a.lastname.sendKeys("kanarya");
        a.emaildegistir.clear();
        ReusableMethods.waitFor(3);
        a.emaildegistir.sendKeys(Faker.instance().internet().emailAddress());
        ReusableMethods.waitFor(5);
        jse.executeScript("arguments[0].click();",a.savechanges);






    }
}
