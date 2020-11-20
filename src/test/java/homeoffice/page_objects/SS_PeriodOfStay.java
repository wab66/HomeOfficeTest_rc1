package homeoffice.page_objects;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SS_PeriodOfStay extends UIInteractionSteps {

    @Step("Reason for UK visit")
    public void selectPeriodOfStay(String studyPeriodGreaterOrLess6Months) {
        System.out.println("SS_PeriodOfStudy [selectPeriodOfStudy]]: ");
        if(studyPeriodGreaterOrLess6Months.toLowerCase().contains("more")){
            $(Pg_PeriodOfStay.PERIOD_GREATER6_RADIOBUTTON).click();
        }else if(studyPeriodGreaterOrLess6Months.toLowerCase().contains("less")){
            $(Pg_PeriodOfStay.PERIOD_LESS6_RADIOBUTTON).click();
        }else{
            System.out.println("Error - no such period - must be > or <");
        }
        $(Pg_ReasonForVisit.NEXT_STEP_BUTTON).click();
    }
}