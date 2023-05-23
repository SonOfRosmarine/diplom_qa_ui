package object_page;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class ObjectPageCheckForm {

    public ObjectPageCheckForm openPage() {
        open("https://www.sberbank.ru/ru/s_m_business/new_sbbol");
        return this;
    }
    public ObjectPageCheckForm clickBuild() {
        $(".kitt-top-menu").$(byText("Расчётный счёт")).click();
        return this;
    }
    public ObjectPageCheckForm checkPage() {
        $(".kitt-top-menu__subaction").shouldHave(text("Открыть счёт"));
        return this;
    }
    public ObjectPageCheckForm checkLogo() {
        $(".kitt-header__logo").click();
        return this;
    }
    public ObjectPageCheckForm returnToMaine() {
        $("._1NAlf").shouldHave(text("СберБизнес — банк для малого бизнеса"));
        return this;
    }
    public ObjectPageCheckForm ecoSystemBlock() {
        $(".kitt-ecosystem__menu").click();
        return this;
    }
    public ObjectPageCheckForm checkEcoSystemBlock() {
        $(".simplebar-content").shouldHave(text("Сбер Здоровье")).click();
        return this;
    }
    public ObjectPageCheckForm ecoSystemPage() {
        $(".simplebar-content").$(byText("Деловая среда")).click();
        return this;
    }
    public ObjectPageCheckForm checkEcoSystemPage() {
        $(".sc-5c41a1e9-0").shouldHave(text("База знаний"));
        return this;
    }
    public ObjectPageCheckForm chengWindow() {
        switchTo().window(1);
        return this;
    }
    public ObjectPageCheckForm openMore() {
        $(".kitt-header-sections__more-text").click();
        return this;
    }
    public ObjectPageCheckForm selectionDropdown() {
        $(".kitt-header-sections__dropdown").$(byText("Частным клиентам")).click();
        return this;
    }
    public ObjectPageCheckForm checkPageDropdown() {
        $(".ts-container__header").shouldHave(text("Лучшие предложения"));
        return this;
    }
}


