package homeoffice.page_objects;

import org.openqa.selenium.By;

public class POVisitingPartnerOrFamily {
    public static By NEXT_STEP_BUTTON = By.cssSelector("#current-question > button");

    private static String ARE_YOU_VISITING_PARTNER_OR_FAMILY_RADIOBUTTON = "input.govuk-radios__input[value='%s']";
    public static By areYouVisitingPartnerOrFamily(String yesOrNo) {
        return By.cssSelector(String.format(ARE_YOU_VISITING_PARTNER_OR_FAMILY_RADIOBUTTON, yesOrNo.toLowerCase()));
    }
}
