package homeoffice.page_objects;

import org.openqa.selenium.By;

public class POReasonForVisit {
    public static By NEXT_STEP_BUTTON = By.cssSelector("#current-question > button");
    private static String REASON_RADIOBUTTON = "input.govuk-radios__input[value='%s']";
    public static By reasonForVisitAnswer(String reason) {
        return By.cssSelector(String.format(REASON_RADIOBUTTON, reason.toLowerCase()));
    }
}
