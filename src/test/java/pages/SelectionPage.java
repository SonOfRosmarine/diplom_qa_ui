package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class SelectionPage {

    public SelectionPage clickSection(String razdel) {
        $("._header__navigation_1je6x_1").$(byText(razdel)).click();
        return this;
    }

    public static void checkSelection(String razdel) {
        if (razdel.equals("Новости")) {
            $("._main_3cu9p_24").shouldHave(text("Игровые новости"));
        } else if (razdel.equals("Читать")) {
            $("._title_1f00f_29").shouldHave(text("Читать"));
        } else if (razdel.equals("Смотреть")) {
            $("._title_1f00f_29").shouldHave(text("Смотреть"));
        } else if (razdel.equals("Блоги")) {
            $("._tabs_1f00f_140").shouldHave(text("Блоги"));
        } else if (razdel.equals("Стримы")) {
            $("._title_1f00f_29").shouldHave(text("Стримы"));
        } else if (razdel.equals("Игры")) {
            $("._your-choice__header__top_dmef8_1").shouldHave(text(" Лучшие игры "));
        } else if (razdel.equals("Читы")) {
            $(".section-heading").shouldHave(text("Читы"));
        } else {
            $(".section-heading").shouldHave(text("Помощь"));
        }
    }
}


