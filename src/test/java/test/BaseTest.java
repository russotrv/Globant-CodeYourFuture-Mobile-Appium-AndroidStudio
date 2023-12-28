package test;

import org.testng.annotations.BeforeTest;
import screen.MainScreen;
import utils.Driver;

public class BaseTest {

    protected MainScreen mainScreen;

    @BeforeTest
    public void beforeTest(){
        this.mainScreen = new MainScreen(new Driver().getDriver());
    }
}
