package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import screen.LoginScreen;


public class MainScreenTest extends BaseTest {

    @Test
    public void loginScreenTest(){
        LoginScreen loginScreen = this.mainScreen.clickLoginButton();
        Assert.assertEquals(loginScreen.getTextTitle(),"Login / Sign up Form");
    }
}
