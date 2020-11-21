package homeoffice.page_objects;

import org.openqa.selenium.By;

public class POReasonForVisit {
    public static By REASON_RADIOBUTTON = By.cssSelector("input.govuk-radios__input[value~='study']");
    public static By NEXT_STEP_BUTTON = By.cssSelector("#current-question > button");

    private static String REASON_SUGGESTION = "/input.govuk-radios__input[value~='%s']";
    public static By reasonForVisitSuggestion(String reason) {
        return By.cssSelector(String.format(REASON_SUGGESTION, reason));
    }
}
