package object_page;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class ObjectPageCheckForm {

    public ObjectPageCheckForm openPage() {
        open("https://stopgame.ru/");
        return this;
    }

    public ObjectPageCheckForm clickSection(String razdel) {
        $("._header__navigation_r8vm0_1").$(byText(razdel)).click();
        return this;
    }

    public ObjectPageCheckForm checkReturnToMain() {
        $("._full-row_1bpga_283").shouldHave(text("Всё про видеоигры"));
        return this;
    }

    public ObjectPageCheckForm openRead() {
        $("._header__navigation_r8vm0_1").$(byText("Читать")).click();
        return this;
    }

    public ObjectPageCheckForm returnToMaine() {
        $("._header__logo__desktop_r8vm0_1").click();
        return this;
    }

    public ObjectPageCheckForm clickSectionInReadr(String razdel) {
        $("._title-row--inner_1f00f_1").$(byText(razdel)).click();
        return this;
    }

    public ObjectPageCheckForm clickToCorrector() {
        $("._tabs_1f00f_140").$(byText("Редакция")).click();
        return this;
    }

    public ObjectPageCheckForm clickOnNewComments() {
        $("._header__live_r8vm0_1").click();
        return this;
    }

    public ObjectPageCheckForm checkHaveFormNewComments() {
        $("._live-comments__header__title_ye4jv_1").shouldHave(text("Новые комментарии"));
        return this;
    }

    public ObjectPageCheckForm clickOnSearch() {
        $("._header__search-btn__icon_r8vm0_1").click();
        return this;
    }

    public ObjectPageCheckForm enterText() {
        $("._search-input__input_eolml_1").setValue("Red Dead Redemption 2").pressEnter();
        return this;
    }

    public ObjectPageCheckForm checkResult() {
        $("._title_sh7r2_151").shouldHave(text(" Red Dead Redemption 2 "));
        return this;
    }


}


