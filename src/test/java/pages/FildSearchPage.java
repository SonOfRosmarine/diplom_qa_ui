package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class FildSearchPage {

    public FildSearchPage clickOnSearch() {
        $("._header__search-btn__icon_1je6x_1").click();
        return this;
    }

    public FildSearchPage enterText(String text) {
        $("._search-input__input_eolml_1").setValue(text).pressEnter();
        return this;
    }

    public FildSearchPage checkResult(String text) {
        $("._title_sh7r2_151").shouldHave(text(text));
        return this;
    }
}
