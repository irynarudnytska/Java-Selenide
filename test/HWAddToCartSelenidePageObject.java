import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class HWAddToCartSelenidePageObject {

    @BeforeMethod
    public void before() {
        Configuration.startMaximized = true;
        open("https://rozetka.com.ua/");
    }

    @Test
    public void firstTest() {
        new HWMainPageSelenide().clickOnCompAndLaptopCategory(new HWMainPageSelenideElements().laptopAndCompCategory)
                .clickOnCategory(new HWCategoryPageSelenideElements().laptopCategory)
                .clickOnFirstProduct(new HWSelenideSearchPageElements().firstProductTitleOnSearchPage)
                .addToCart(new HWProductPageSelenideElements().addToCartBtn)
                .getCartInputValue(new HWSelenideCartPageElements().cartCounter)
                .getTitleOfProduct(new HWSelenideCartPageElements().titleOfProductInCart);
    }
}
