package homeoffice.serenity_page_interfaces;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import static homeoffice.page_objects.POPeriodOfStay.*;

public class UIPeriodOfStay extends UIInteractionSteps {
    @Step("Are you staying longer than 6 months")
    public void selectPeriodOfStay(String studyPeriodGreaterOrLess6Months) {
        if(studyPeriodGreaterOrLess6Months.toLowerCase().contains("more")){
            find(PERIOD_GREATER6_RADIOBUTTON).click();
        }else if(studyPeriodGreaterOrLess6Months.toLowerCase().contains("less")){
            find(PERIOD_LESS6_RADIOBUTTON).click();
        }else{
            System.out.println("Error - no such period - must be > or <");
        }
        find(NEXT_STEP_BUTTON).click();
    }
}