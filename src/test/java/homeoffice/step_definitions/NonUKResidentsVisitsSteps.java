package homeoffice.step_definitions;

import homeoffice.navigation.NavigateTo;
import homeoffice.serenity_page_interfaces.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class NonUKResidentsVisitsSteps {

    @Steps
    NavigateTo navigateTo;
    UIWhatNationality whatNationality;
    UIReasonForVisit reasonForVisit;
    UIPeriodOfStay periodOfStay;
    UIVisitingPartnerOrFamily visitingPartnerOrFamily;
    UIVisaRequirementsAnswer visaRequirementsAnswer;

    //Given I provide a nationality of Japan
    @Given("^I provide a nationality of (.*?)?")
    public void iProvideANationality(String nationality) {
        navigateTo.theHomeOfficeCheckUKVisaPage();
        whatNationality.selectNationality(nationality);
    }

    @Given("^I select the reason (.*?)?")
    public void iSelectTheReason(String visitReason) {
        reasonForVisit.selectReasonForUKVisit(visitReason);
    }

    @Given("^I state I am intending to stay for (more|less) than (\\d+) months?")
    public void iStateIAmIntendingToStayForPeriod(String visitMoreLess, int visitDuration) {
        periodOfStay.selectPeriodOfStay(visitMoreLess);
    }

    @Given("^I state I (am not |am )travelling or visiting a partner or family?")
    public void iStateIAmOrNotTravellingOrVisitingAPartnerOrFamily(String areYouVisitingPartnerOrFamily) {
        visitingPartnerOrFamily.selectReasonForUKVisit(areYouVisitingPartnerOrFamily);
    }

    @When("I submit the form")
    public void iSubmitTheForm() {
        System.out.println("[iSubmitTheForm] - already submitted");
    }

    // Could use a table instead here to pass message in, if still getting problem about the non-ascii (')
    // which is used in the expected message
    @Then("^I will be informed (.*)?")
    public void iWillBeInformedAboutVisaForUK(String expectedReply) {
        System.out.println("[iWillBeInformedAboutVisaForUK] expectedReply: " + expectedReply);
        visaRequirementsAnswer.getUKVisitorVISAAnswer(expectedReply);
    }
}
