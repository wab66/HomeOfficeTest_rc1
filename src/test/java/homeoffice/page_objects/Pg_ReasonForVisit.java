package homeoffice.page_objects;

import org.openqa.selenium.By;

public class Pg_ReasonForVisit{
    static By REASON_RADIOBUTTON = By.cssSelector("input.govuk-radios__input[value='study']");
    static By NEXT_STEP_BUTTON = By.cssSelector("button.gem-c-button.govuk-button.gem-c-button--bottom-margin");
}
