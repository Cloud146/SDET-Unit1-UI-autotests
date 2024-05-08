package Tests;

import Helpers.InputData;
import Helpers.OutputData;
import Helpers.Waitings;
import Pages.HomePage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

@Epic("Отображение элементов страницы")
@Feature("Страница home")
public class HomePageTests extends BaseTest{
    private WebDriver driver;
    private HomePage homePage;

    OutputData outputData = new OutputData();
    InputData inputData = new InputData();
    Waitings waitings = new Waitings();

    @Story("Открытие страницы home")
    @BeforeMethod
    public void setup() throws IOException {
        driver = getDriver();
        driver.get(inputData.getHomePageURL());
        homePage = new HomePage(driver);
    }

    @Story("Отображение верхнего меню")
    @Test(description = "Тест наличия верхнего меню", priority = 1, enabled = false)
    public void headerCheckTest(){
        Assert.assertEquals(homePage.headerCheck(), true);
        Assert.assertEquals(homePage.header.getText(), outputData.headerText);
    }

    @Story("Отображение нижнего меню")
    @Test(description = "Тест наличия футера", priority = 2, enabled = true)
    public void footerCheckTest(){
        homePage.closePopUp()
                        .scrollToTheBottom();
        Assert.assertEquals(homePage.footerCheck(), true);
        Assert.assertEquals(homePage.footer.getText(), outputData.footerText);
    }


    @Story("Отображение верхнего меню после скролла")
    @Test(description = "Тест наличия верхнего меню после скролла", priority = 4, enabled = true)
    public void headerCheckAfterScrollingTest(){
        homePage.closePopUp()
                        .scrollToTheBottom();
        waitings.waitTimeForElement(2, driver, homePage.header);
        Assert.assertEquals(homePage.headerCheck(), true);
        Assert.assertEquals(homePage.header.getText(), outputData.headerText);
    }

    @Story("Отображение блока курсов при прокрутке слайдера")
    @Test(description = "Тест блока с курсами (слайдер)", priority = 3, enabled = true)
    public void courseSwapperTest(){
        homePage.closePopUp()
                        .scroll2(0, 1100);
        homePage.swipe(outputData.swiperTextAfterSwiping, homePage.courseSwiperNext);
        Assert.assertEquals(outputData.swiperTextAfterSwiping, homePage.courseSwiper.getText());
    }
}
