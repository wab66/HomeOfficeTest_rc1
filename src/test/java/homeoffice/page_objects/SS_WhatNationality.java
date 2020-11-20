package homeoffice.page_objects;

import homeoffice.page_objects.Pg_WhatNationality;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SS_WhatNationality extends UIInteractionSteps {

    String currentNationality;
    public String getNationality() {
        return currentNationality;
    }

    @Step("Enter your Nationality {0}")
    public void selectNationality(String nationality) {
        $(Pg_WhatNationality.COUNTRY_DROPDOWN).selectByVisibleText(nationality);
        $(Pg_WhatNationality.NEXT_STEP_BUTTON).click();
        String currentNationality = nationality;
    }
}
