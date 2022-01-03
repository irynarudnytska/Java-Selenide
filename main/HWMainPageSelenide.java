import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.page;

public class HWMainPageSelenide extends HWMainPageSelenideElements{

    public HWCategoryPageSelenideLogic clickOnCompAndLaptopCategory (SelenideElement category) {
        category.shouldBe(Condition.visible).click();
        return page(HWCategoryPageSelenideLogic.class);
    }
}
