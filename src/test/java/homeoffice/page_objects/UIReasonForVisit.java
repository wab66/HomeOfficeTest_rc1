package homeoffice.page_objects;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
//rc01 - import static homeoffice.page_objects.POReasonForVisit.REASON_RADIOBUTTON;
//import static homeoffice.page_objects.POReasonForVisit.NEXT_STEP_BUTTON;
//import static homeoffice.page_objects.POReasonForVisit.reasonForVisitAnswer;
import static homeoffice.page_objects.POReasonForVisit.*;

public class UIReasonForVisit extends UIInteractionSteps {
    @Step("Reason for UK visit")
    public void selectReasonForUKVisit(String visitReason) {
        System.out.println("SS_ReasonForVisit [reasonForUKVisit]]: ");
        find(reasonForVisitAnswer(visitReason)).click();
        find(NEXT_STEP_BUTTON).click();
    }
}
