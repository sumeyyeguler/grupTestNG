package tests.US002;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC002 {
    AlloverPage alloverPage = new AlloverPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test1() {
        //Belirtilen URL` ye gidilir
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        //"Singin" butonuna tıklanır
        alloverPage.signIn.click();
        //"Username or email adress" bölümüne vendor email girilir
        //"Password" bölümüne verdor password girilir
        //"Sing in" butonuna tıklanır
        actions.click(alloverPage.signInEmail)
                .sendKeys(ConfigReader.getProperty("alloverValidEmail"), Keys.TAB)
                .sendKeys(ConfigReader.getProperty("alloverValidPassword"))
                .sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER).perform();
        //"My Account" yazısının açılan sayfa sonunda görüldüğü doğrulanır
        ReusableMethods.waitFor(2);
        Assert.assertTrue(alloverPage.myAccount.isDisplayed());
        ReusableMethods.waitFor(3);
        alloverPage.myAccount.click();
        //"Orders" bölümünün görünürlüğü doğrulanmalı
        Assert.assertTrue(alloverPage.orders.isDisplayed());
        //"Downloads" bölümünün görünürlüğü doğrulanmalı
        Assert.assertTrue(alloverPage.downloads.isDisplayed());
        //"Addresses" bölümünün görünürlüğü doğrulanmalı
        Assert.assertTrue(alloverPage.adresses.isDisplayed());
        //"Account details" bölümünün görünürlüğü doğrulanmalı
        Assert.assertTrue(alloverPage.accountDetails.isDisplayed());
        //"Wishlist" bölümünün görünürlüğü doğrulanmalı
        Assert.assertTrue(alloverPage.wishList.isDisplayed());
        //"Logout" bölümünün görünürlüğü doğrulanmalı
        Assert.assertTrue(alloverPage.logout.isDisplayed());

    }
}
