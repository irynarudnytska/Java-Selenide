import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HWSelenideCartPageElements {
    SelenideElement cartCounter = $(By.xpath("//input[@class='cart-counter__input ng-untouched ng-pristine ng-valid']"));

    SelenideElement titleOfProductInCart = $(By.xpath("//a[@class='cart-product__title']"));
}
