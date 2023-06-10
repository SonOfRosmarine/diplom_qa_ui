package tests;

import org.junit.jupiter.api.Test;
import pages.RandomData;
import pages.RedakciaPage;
import pages.SelectionPage;
import pages.TestBase;

import static io.qameta.allure.Allure.step;

public class CheckSelection extends TestBase {

    @Test
    void checkingClickabilitySelection() {
        step("Открыть страницу", () -> {
            mainPage.openPage();
        });
        String razdel = RandomData.getRandomItemFromArray();
        step("Нажать на раздел", () -> {
            selectionPage.clickSection(razdel);
        });
        step("Проверить переход на выбранную страницу", () -> {
            SelectionPage.checkSelection(razdel);
        });

    }

    @Test
    void checkingSelectionInToRedakcia() {
        step("Открыть страницу", () -> {
            mainPage.openPage();
        });
        step("Нажать на раздел Читать", () -> {
            redakciaPage.openRead();
        });
        step("Нажать на раздел Редакция", () -> {
            redakciaPage.clickToCorrector();
        });
        String razdel = RandomData.getRandomInReadr();
        step("Нажать на раздел", () -> {
            redakciaPage.clickSectionInReadr(razdel);
        });
        step("Проверить переход на выбранную страницу", () -> {
            RedakciaPage.checkInReader(razdel);
        });
    }
}
