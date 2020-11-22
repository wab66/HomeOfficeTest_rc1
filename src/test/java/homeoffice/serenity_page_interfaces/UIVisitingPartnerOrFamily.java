package homeoffice.serenity_page_interfaces;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import static homeoffice.page_objects.POReasonForVisit.NEXT_STEP_BUTTON;
import static homeoffice.page_objects.POVisitingPartnerOrFamily.areYouVisitingPartnerOrFamily;

public class UIVisitingPartnerOrFamily extends UIInteractionSteps {
    @Step("Are you visiting a partner or family")
    public void selectReasonForUKVisit(String visitingPartnerOrFamily) {
        String answer = "";
        if(visitingPartnerOrFamily.toLowerCase().trim().contains("not")){
            answer = "no";
        }else{
            answer = "yes";
        }
        find(areYouVisitingPartnerOrFamily(answer)).click();
        find(NEXT_STEP_BUTTON).click();
    }
}