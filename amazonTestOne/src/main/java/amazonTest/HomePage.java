package amazonTest;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.BaseMain;

public class HomePage extends BaseMain {


    @FindBy(css = "input#twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy(css = "input[class=\"nav-input\"][value=\"Go\"]")
    private WebElement submitSearch;

    @FindBy(xpath = "//span[@id=\"nav-search-submit-text\"]")
    private WebElement submitSearch1;

    @FindBy(css = "span[id=\"quartsPagelet\"]")
    private WebElement searchPageInfo;

    public void enter_Product_to_SearchBox(String product)  {
        System.out.println("===Entering " + product + " to search Box===");
        searchTextBox.click();
        searchTextBox.sendKeys(product);
        submitSearch.click();
        System.out.println("===Searching and waiting for reply===");
    }

    public boolean getPageTitle(String homePage) {
        boolean isTextPresent = false;
        if (driver.getTitle().contains("")) {
            isTextPresent = true;
        }
        return isTextPresent;
    }


    public boolean searchPageTextInfo(String product) {
        boolean isTextPresent = false;
        System.out.println(searchPageInfo.getText());
        if (searchPageInfo.getText().contains(product)) {
            isTextPresent = true;
        }
        return isTextPresent;
    }

}




