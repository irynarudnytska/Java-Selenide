import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.page;


public class HWCategoryPageSelenideLogic extends HWCategoryPageSelenideElements {

    public HWSelenideSearchPageLogic clickOnCategory(SelenideElement category) {
        category.shouldBe(Condition.visible).click();
        return page(HWSelenideSearchPageLogic.class);
    }
}
