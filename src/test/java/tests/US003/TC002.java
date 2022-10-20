package tests.US003;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class TC002 {

    AlloverPage alloverPage=new AlloverPage();
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void test01() throws InterruptedException {
        //Belirtilen URL` ye gidilir
        //Giris yap' a tiklanir
        //Gecerli kullanici bilgileri girilir
        //Giris yap' a tiklanir
        ReusableMethods.signIn();
        ReusableMethods.waitFor(3);
        //My account tıklanır
        alloverPage.jse.executeScript("arguments[0].click();",alloverPage.myAccount);
        //Hesabim sayfasina giris yapildigi test edilir
        Assert.assertTrue(alloverPage.myAccountText.isDisplayed());
        //Acilan sayfada siparisler bolumune tiklanir
        ReusableMethods.waitFor(3);
        alloverPage.jse.executeScript("arguments[0].click();",alloverPage.ordersButton);
        //Acilan sayfada Browse Products(Urunlere Goz At) butonuna tiklanir
        alloverPage.jse.executeScript("arguments[0].click();",alloverPage.goShop);
        //Magaza butonunun gorunur oldugu test edilir
        Assert.assertTrue(alloverPage.shopText.isDisplayed());
        //Rastgele 5 urun secilir ve sepete eklenir
        List<WebElement>liste=alloverPage.shopList;
        for (WebElement each:liste
             ) {
        actions.moveToElement(alloverPage.sepeteEkle).click(each).perform();

        }
        //Urunlerin sepette gorundugu test edilir
    }
}
