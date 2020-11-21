package homeoffice.page_objects;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;
import static homeoffice.page_objects.POVisaRequirements.VISA_ANSWER;

public class UIVisaRequirements extends UIInteractionSteps {

    @Step("UK visitor VISA requirement answer")
    public void getUKVisitorVISAAnswer(String expectedAnswer) {
        System.out.println("SS_ReasonForVisit [reasonForUKVisit]]: ");
        assertThat(expectedAnswer.equalsIgnoreCase(find(VISA_ANSWER).getText().toLowerCase()));
    }
}
