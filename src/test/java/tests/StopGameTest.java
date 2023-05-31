package tests;

import object_page.RandomData;
import object_page.TestBase;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;


public class StopGameTest extends TestBase {

    @Test
    @Tag("CheckPage")
    void checkingClickabilitySelection() {
        step("Открыть страницу", () -> {
            objectPageCheckForm.openPage();
        });
        String razdel = RandomData.getRandomItemFromArray();
        step("Нажать на раздел", () -> {
            objectPageCheckForm.clickSection(razdel);
        });
        step("Проверить переход на выбранную страницу", () -> {
            randomData.checkSelection(razdel);
        });

    }

    @Test
    @Tag("CheckPage")
    void checkingReturnToMain() {
        step("Открыть страницу", () -> {
            objectPageCheckForm.openPage();
        });
        String razdel = RandomData.getRandomItemFromArray();
        step("Нажать на раздел", () -> {
            objectPageCheckForm.clickSection(razdel);
        });
        step("Нажать на Мэйн лого", () -> {
            objectPageCheckForm.returnToMaine();
        });
        step("Проверить переход на главную страницу", () -> {
            objectPageCheckForm.checkReturnToMain();
        });
    }

    @Test
    @Tag("CheckPage")
    void checkingSelectionInToRedakcia() {
        step("Открыть страницу", () -> {
            objectPageCheckForm.openPage();
        });
        step("Нажать на раздел Читать", () -> {
            objectPageCheckForm.openRead();
        });
        step("Нажать на раздел Редакция", () -> {
            objectPageCheckForm.clickToCorrector();
        });
        String razdel = RandomData.getRandomInReadr();
        step("Нажать на раздел", () -> {
            objectPageCheckForm.clickSectionInReadr(razdel);
        });
        step("Проверить переход на выбранную страницу", () -> {
            randomData.checkInReader(razdel);
        });
    }

    @Test
    @Tag("CheckPage")
    void checkingNewCommentBlockClick() {
        step("Открыть страницу", () -> {
            objectPageCheckForm.openPage();
        });
        step("Нажать на Последние комменты", () -> {
            objectPageCheckForm.clickOnNewComments();
        });
        step("Проверит, что откырлся блок с последними коментариями", () -> {
            objectPageCheckForm.checkHaveFormNewComments();
        });
    }

    @Test
    @Tag("CheckPage")
    void checkingSearchOnWeb() {
        step("Открыть страницу", () -> {
            objectPageCheckForm.openPage();
        });
        step("Нажать на Поиск", () -> {
            objectPageCheckForm.clickOnSearch();
        });
        step("Ввести запрос", () -> {
            objectPageCheckForm.enterText();
        });
        step("Проверить соответсвие результата запросу", () -> {
            objectPageCheckForm.checkResult();
        });
    }
}

