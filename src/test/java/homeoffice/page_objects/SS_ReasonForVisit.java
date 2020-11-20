package homeoffice.page_objects;

//import homeoffice.page_objects.Pg_CheckUKVisa;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SS_ReasonForVisit extends UIInteractionSteps {

    @Step("Reason for UK visit")
    public void selectReasonForUKVisit(String visitReason) {
        System.out.println("SS_ReasonForVisit [reasonForUKVisit]]: ");
        $(Pg_ReasonForVisit.REASON_RADIOBUTTON).click();
        $(Pg_ReasonForVisit.NEXT_STEP_BUTTON).click();
    }
}
