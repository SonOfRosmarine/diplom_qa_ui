package tests;

import object_page.TestBase;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class SberWeb extends TestBase {

    @Test
    @Tag("CheckPage")
    void checkingClickabilityOfTabs() {
        step("Открыть страницу", () -> {
            objectPageCheckForm.openPage();
        });
        step("Нажать на Расчётный счёт", () -> {
            objectPageCheckForm.clickBuild();
        });
        step("Проверяем, что открылся раздел Расчётный счёт", () -> {
            objectPageCheckForm.checkPage();
        });
    }

    @Test
    @Tag("CheckPage")
    void checkingReturnToMain() {
        step("Открыть страницу", () -> {
            objectPageCheckForm.openPage();
        });
        step("Нажать на Расчётный счёт", () -> {
            objectPageCheckForm.clickBuild();
        });
        step("Нажать на Лого", () -> {
            objectPageCheckForm.checkLogo();
        });
        step("Проверить возвращение на мэйн", () -> {
            objectPageCheckForm.returnToMaine();
        });
    }

    @Test
    @Tag("CheckPage")
    void checkingEcoSystemBlock() {
        step("Открыть страницу", () -> {
            objectPageCheckForm.openPage();
        });
        step("Открыть блок с экосистемой", () -> {
            objectPageCheckForm.ecoSystemBlock();
        });
        step("Проверить, что блок открыт", () -> {
            objectPageCheckForm.checkEcoSystemBlock();
        });
    }

    @Test
    @Tag("CheckPage")
    void checkingClickabilityOfIconEcosystem() {
        step("Открыть страницу", () -> {
            objectPageCheckForm.openPage();
        });
        step("Открыть блок с экосистемой", () -> {
            objectPageCheckForm.ecoSystemBlock();
        });
        step("Нажать на значок экосистемы", () -> {
            objectPageCheckForm.ecoSystemPage();
        });
        step("Перейти в открывшееся окно", () -> {
        objectPageCheckForm.chengWindow();
        });
        step("Проверить, что осуществлен переход на страницу экосистемы", () -> {
            objectPageCheckForm.checkEcoSystemPage();
        });
    }

    @Test
    @Tag("CheckPage")
    void checkingSelectionOnDropdown() {
        step("Открыть страницу", () -> {
            objectPageCheckForm.openPage();
        });
        step("Нажать 'еще'", () -> {
            objectPageCheckForm.openMore();
        });
        step("Выбрать вкладку из выпадающего списка ", () -> {
            objectPageCheckForm.selectionDropdown();
        });
        step("Проверить, что открылась ожидаемая страница", () -> {
            objectPageCheckForm.checkPageDropdown();
        });
    }
}
