package pages;

import java.util.concurrent.ThreadLocalRandom;

public class RandomData {
    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getRandomItemFromArray() {
        String[] randomArray = {"Новости", "Читать", "Смотреть", "Блоги", "Стримы", "Игры", "Читы", "Помощь"};
        int index = getRandomInt(0, randomArray.length - 1);
        return randomArray[index];
    }

    public static String getRandomInReadr() {
        String[] randomArray = {"Все", "Обзоры", "Превью", "Первая полоса", "Интервью"};
        int index = getRandomInt(0, randomArray.length - 1);
        return randomArray[index];
    }
}




