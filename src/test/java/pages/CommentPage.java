package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CommentPage {

    public CommentPage clickOnNewComments() {
        $("_header__live_1je6x_1").click();
        return this;
    }
    public CommentPage checkHaveFormNewComments() {
        $("_live-comments__header__title_hfk3j_1").shouldHave(text("Новые комментарии"));
        return this;
    }
}
