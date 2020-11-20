package homeoffice.page_objects;

import org.openqa.selenium.By;

public class Pg_PeriodOfStay {
    static By PERIOD_GREATER6_RADIOBUTTON = By.cssSelector("input.govuk-radios__input[value='six_months_or_less']");
    static By PERIOD_LESS6_RADIOBUTTON = By.cssSelector("input.govuk-radios__input[value='longer_than_six_months']");
    static By NEXT_STEP_BUTTON = By.cssSelector("#current-question > button");
}
