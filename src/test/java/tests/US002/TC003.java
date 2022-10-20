package tests.US002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ReusableMethods;

public class TC003 {

    AlloverPage alloverPage=new AlloverPage();
    @Test
    public void test1() {
       // Belirtilen URL` ye gidilir
       // Ana sayfaya gidildiği doğrulanır
       // "Singin" butonuna tıklanır
       // "Username or email adress" bölümüne vendor email girilir
       // "Password" bölümüne verdor password girilir
       // "Sing in" butonuna tıklanır
        ReusableMethods.signIn();
       // "Sing out" butonuna tıklanır
        alloverPage.signOut.click();
       // My Account sayfasına gidildiği doğrulanmalı
        Assert.assertTrue(alloverPage.myAccountText.isDisplayed());
       // Dashboard altında "Store Manager" butonunun görünürlüğü doğrulanmalı
        Assert.assertTrue(alloverPage.storeManagerButton.isDisplayed());
       // Dashboard altında "Orders" butonunun görünürlüğü doğrulanmalı
        Assert.assertTrue(alloverPage.storeManagerButton.isDisplayed());
       // Dashboard altında "Downloads" butonunun görünürlüğü doğrulanmalı
        Assert.assertTrue(alloverPage.storeManagerButton.isDisplayed());
       // Dashboard altında "Adresses" butonunun görünürlüğü doğrulanmalı
        Assert.assertTrue(alloverPage.storeManagerButton.isDisplayed());
       // Dashboard altında "Account details" butonunun görünürlüğü doğrulanmalı
        Assert.assertTrue(alloverPage.storeManagerButton.isDisplayed());
       // Dashboard altında "Wishlist" butonunun görünürlüğü doğrulanmalı
        Assert.assertTrue(alloverPage.storeManagerButton.isDisplayed());
       // Dashboard altında "Support Tickets" butonunun görünürlüğü doğrulanmalı
        Assert.assertTrue(alloverPage.storeManagerButton.isDisplayed());
       // Dashboard altında "Followings" butonunun görünürlüğü doğrulanmalı
        Assert.assertTrue(alloverPage.storeManagerButton.isDisplayed());
       // Dashboard altında "Logout" butonunun görünürlüğü doğrulanmalı
        Assert.assertTrue(alloverPage.storeManagerButton.isDisplayed());
    }
}
