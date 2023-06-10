package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    public MainPage openPage() {
        open("https://stopgame.ru/");
        return this;
    }

    public MainPage returnToMaine() {
        $("._header__logo_1je6x_1").click();
        return this;
    }

    public MainPage checkReturnToMain() {
        $("._main-header_p8g9a_1").shouldHave(text("Всё про видеоигры"));
        return this;
    }
}
