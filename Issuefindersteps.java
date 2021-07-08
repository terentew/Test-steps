import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Issuefindersteps {

    @Test
    public void searchissuesteps() {
        step("открытие вебстраницы", () -> {
            open("https://github.com");
        });
        step("нажатие на поле поиск", () -> {
            $(".header-search-input").click();
        });
        step("вписываем eroshenkoam/allure-example в поле поиск", () -> {
            $(".header-search-input").sendKeys("eroshenkoam/allure-example");
        });
        step("нажимаем ввод", () -> {
            $(".header-search-input").submit();
        });
        step("кликаем на eroshenkoam/allure-example", () -> {
            $(By.linkText("eroshenkoam/allure-example")).click();
        });
        step("проверяем присутствие Issue", () -> {
            $(withText("Issue")).should(Condition.exist);
        });
    }
}