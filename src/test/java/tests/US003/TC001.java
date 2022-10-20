package tests.US003;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ReusableMethods;

public class TC001 {

    AlloverPage alloverPage=new AlloverPage();
    @Test
    public void test01() {
        //Belirtilen URL` ye gidilir
        //"Singin" butonuna tıklanır
        //Gecerli kullanici bilgileri girilir
        //"Sing in" butonuna tıklanır
        ReusableMethods.signIn();
        //"Sing out" butonuna tıklanır
        alloverPage.signOut.click();
        //My Account sayfasına gidildiği doğrulanmalı
        Assert.assertTrue(alloverPage.myAccountText.isDisplayed());
        //Acilan sayfada siparisler bolumune tiklanir
        alloverPage.ordersButton.click();
        //Acilan sayfada GO SHOP(Urunlere Goz At) butonuna tiklanir
        alloverPage.jse.executeScript("arguments[0].click();",alloverPage.goShop);
    }
}
