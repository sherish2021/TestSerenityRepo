package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://bing.com")

public class GoogleHomePage extends PageObject {
    @FindBy(name="q")
    WebElementFacade searchBox;

    public void performSearch(String value) {

        searchBox.typeAndEnter(value);
    }

    public boolean checkCorrectResultsReturned(String searchTerm)
    {
        if (getTitle().contains(searchTerm))
        {
            return true;
        }
        else
            return false;

    }

}
