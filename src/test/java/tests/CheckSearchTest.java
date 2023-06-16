package tests;

import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class CheckSearchTest extends TestBase {

    @Test
    void checkingSearchOnWeb() {
        step("Открыть страницу", () -> {
            mainPage.openPage();
        });
        step("Нажать на Поиск", () -> {
            fildSearch.clickOnSearch();
        });
        step("Ввести запрос", () -> {
            fildSearch.enterText("Red Dead Redemption 2");
        });
        step("Проверить соответсвие результата запросу", () -> {
            fildSearch.checkResult("Red Dead Redemption 2");
        });
    }
}
