package tests;

import org.junit.jupiter.api.Test;
import pages.TestBase;

import static io.qameta.allure.Allure.step;

public class CheckComment extends TestBase {

    @Test
    void checkingNewCommentBlockClick() {
        step("Открыть страницу", () -> {
            mainPage.openPage();
        });
        step("Нажать на Последние комменты", () -> {
            commentPage.clickOnNewComments();
        });
        step("Проверит, что откырлся блок с последними коментариями", () -> {
            commentPage.checkHaveFormNewComments();
        });
    }
}
