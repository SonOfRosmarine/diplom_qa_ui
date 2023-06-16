package tests;

import org.junit.jupiter.api.Test;
import helpers.RandomData;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;


public class CheckMainTest extends TestBase {
    @Test
    void checkingReturnToMain() {
        step("Открыть страницу", () -> {
            mainPage.openPage();
        });
        String razdel = RandomData.getRandomItemFromArray();
        step("Нажать на раздел", () -> {
            selectionPage.clickSection(razdel);
        });
        step("Нажать на Мэйн лого", () -> {
            mainPage.returnToMaine();
        });
        step("Проверить переход на главную страницу", () -> {
            mainPage.checkReturnToMain();
        });
    }
}

