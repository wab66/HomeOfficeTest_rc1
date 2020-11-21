package homeoffice.page_objects;

import org.openqa.selenium.By;

public class POWhatNationality {
    public static By COUNTRY_DROPDOWN = By.cssSelector("select#response.govuk-select");
    public static By NEXT_STEP_BUTTON = By.cssSelector("button.gem-c-button.govuk-button.gem-c-button--bottom-margin");
}
