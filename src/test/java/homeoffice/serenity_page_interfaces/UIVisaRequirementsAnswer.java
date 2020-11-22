package homeoffice.serenity_page_interfaces;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;
import static homeoffice.page_objects.POVisaRequirementsAnswer.VISA_ANSWER;

public class UIVisaRequirementsAnswer extends UIInteractionSteps {

    @Step("UK visitor VISA requirement answer")
    public void getUKVisitorVISAAnswer(String expectedAnswer) {
        assertThat(expectedAnswer.equalsIgnoreCase(find(VISA_ANSWER).getText().toLowerCase()));
    }
}
