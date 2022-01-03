import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.page;

public class HWSelenideSearchPageLogic extends HWSelenideSearchPageElements{

    public HWProductPageSelenideLogic clickOnFirstProduct(SelenideElement product){
        product.shouldBe(Condition.visible).click();
        return page(HWProductPageSelenideLogic.class);
    }
}
