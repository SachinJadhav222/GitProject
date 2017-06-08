package amazonTest;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.BaseMain;

public class Hooks {
    BaseMain baseMain = new BaseMain();

    @Before
    public void opneBrow() throws Throwable {
        baseMain.openBrowser();
    }

    @After
    public void closeBrow() {
        baseMain.closeBrowser();
    }
}
