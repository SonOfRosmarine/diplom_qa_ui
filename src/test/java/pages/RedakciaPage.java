package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RedakciaPage {

    public static void checkInReader(String razdel) {
        if (razdel.equals("Все")) {
            $("._title-row--inner_1f00f_1").shouldHave(text("Игровые статьи"));
        } else if (razdel.equals("Обзоры")) {
            $("._title-row--inner_1f00f_1").shouldHave(text("Обзоры игр"));
        } else if (razdel.equals("Превью")) {
            $("._title-row--inner_1f00f_1").shouldHave(text("Превью игр"));
        } else if (razdel.equals("Первая полоса")) {
            $("._title-row--inner_1f00f_1").shouldHave(text("Первая полоса"));
        } else {
            $(".__title-row--inner_1f00f_1").shouldHave(text("Интервью с представителями видеоигровой индустрии"));
        }
    }

    public RedakciaPage openRead() {
        $("._header__navigation_1je6x_1").$(byText("Читать")).click();
        return this;
    }

    public RedakciaPage clickToCorrector() {
        $("._tabs_1f00f_140").$(byText("Редакция")).click();
        return this;
    }

    public RedakciaPage clickSectionInReadr(String razdel) {
        $("._title-row--inner_1f00f_1").$(byText(razdel)).click();
        return this;
    }
}
