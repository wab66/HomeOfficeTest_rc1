package homeoffice.page_objects;

import org.openqa.selenium.By;

public class POVisitingPartnerOrFamily {
    // INPUT.govuk-radios__input[value='no']
    public static By ARE_YOU_VISITING_PARTNER_OR_FAMILY_RADIOBUTTON = By.cssSelector("input.govuk-radios__input[value~='study']");

    // rc01
//    private static String WHO_VISITING_ANSWER = "/input.govuk-radios__input[value~='%s']";
//    public static By reasonForVisitSuggestion(String reason) {
//        return By.cssSelector(String.format(REASON_SUGGESTION, reason));
//    }
}
