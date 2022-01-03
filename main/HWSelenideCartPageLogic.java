import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.page;


public class HWSelenideCartPageLogic extends HWSelenideCartPageElements{

    public HWSelenideCartPageLogic getCartInputValue (SelenideElement cartInput){
        cartInput.shouldBe(Condition.visible);
        cartInput.shouldHave(Condition.value("1"));
        return this;
    }

    public HWSelenideCartPageLogic getTitleOfProduct (SelenideElement titleOfProductInCart) {
        titleOfProductInCart.shouldBe(Condition.visible);
        titleOfProductInCart.shouldBe(Condition.text(titleOfProductInCart.getText()));
        return this;
    }
}
