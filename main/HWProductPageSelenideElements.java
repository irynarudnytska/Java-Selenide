import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class HWProductPageSelenideElements {

    SelenideElement addToCartBtn = $(By.xpath("//span[contains(text(), 'Купить')]"));
}
