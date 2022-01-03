import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class HWSelenideSearchPageElements {

    SelenideElement firstProductTitleOnSearchPage = $(By.xpath("//span[@class='goods-tile__title']"));
}
