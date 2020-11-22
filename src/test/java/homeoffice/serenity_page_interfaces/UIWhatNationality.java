package homeoffice.serenity_page_interfaces;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static homeoffice.page_objects.POWhatNationality.COUNTRY_DROPDOWN;
import static homeoffice.page_objects.POWhatNationality.NEXT_STEP_BUTTON;

public class UIWhatNationality extends UIInteractionSteps {

    String currentNationality;
    public String getNationality() {
        return currentNationality;
    }

    @Step("Enter your Nationality")
    public void selectNationality(String nationality) {
        find(COUNTRY_DROPDOWN).selectByVisibleText(nationality);
        find(NEXT_STEP_BUTTON).click();
    }
}
