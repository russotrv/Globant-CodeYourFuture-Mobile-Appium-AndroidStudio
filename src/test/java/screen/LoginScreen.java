package screen;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import screen.base.BaseScreen;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login / Sign up Form\")")
    private WebElement loginTitle;
    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }

    public String getTextTitle(){
        this.waitToBeVisible(this.loginTitle);
        return this.loginTitle.getText();
    }
}
