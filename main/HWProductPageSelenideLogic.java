import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.page;


public class HWProductPageSelenideLogic extends HWProductPageSelenideElements{

    public HWSelenideCartPageLogic addToCart(SelenideElement btn) {
        btn.shouldBe(Condition.visible).click();
        return page(HWSelenideCartPageLogic.class);
    }
}
