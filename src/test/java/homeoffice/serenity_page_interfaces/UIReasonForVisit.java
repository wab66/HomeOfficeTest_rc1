package homeoffice.serenity_page_interfaces;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import static homeoffice.page_objects.POReasonForVisit.*;

public class UIReasonForVisit extends UIInteractionSteps {
    @Step("What is your reason for UK visit")
    public void selectReasonForUKVisit(String visitReason) {
        find(reasonForVisitAnswer(visitReason)).click();
        find(NEXT_STEP_BUTTON).click();
    }
}
