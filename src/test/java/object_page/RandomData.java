package object_page;

import java.util.concurrent.ThreadLocalRandom;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RandomData {
    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getRandomItemFromArray() {
        String[] randomArray = {"Новости", "Читать", "Смотреть", "Блоги", "Стримы", "Игры", "Читы", "Помощь"};
        int index = getRandomInt(0, randomArray.length - 1);
        return randomArray[index];
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

    public static String getRandomInReadr() {
        String[] randomArray = {"Все", "Обзоры", "Превью", "Первая полоса", "Интервью"};
        int index = getRandomInt(0, randomArray.length - 1);
        return randomArray[index];
    }

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
}




