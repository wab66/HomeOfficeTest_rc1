package homeoffice.page_objects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class POReasonForVisit {
    public static By NEXT_STEP_BUTTON = By.cssSelector("#current-question > button");
    private static String REASON_RADIOBUTTON = "input.govuk-radios__input[value='%s']";
    public static By reasonForVisitAnswer(String reason) {
        return By.cssSelector(String.format(REASON_RADIOBUTTON, reason.toLowerCase()));
    }
}
