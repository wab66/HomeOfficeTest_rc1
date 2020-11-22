package homeoffice.page_objects;

import org.openqa.selenium.By;

public class POPeriodOfStay {
    public static By PERIOD_GREATER6_RADIOBUTTON = By.cssSelector("input.govuk-radios__input[value='six_months_or_less']");
    public static By PERIOD_LESS6_RADIOBUTTON = By.cssSelector("input.govuk-radios__input[value='longer_than_six_months']");
    public static By NEXT_STEP_BUTTON = By.cssSelector("#current-question > button");
}
