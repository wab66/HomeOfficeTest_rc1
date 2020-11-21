package homeoffice.step_definitions;

import homeoffice.navigation.NavigateTo;
import homeoffice.page_objects.UIPeriodOfStay;
import homeoffice.page_objects.UIReasonForVisit;
import homeoffice.page_objects.UIWhatNationality;
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

    //Given I provide a nationality of Japan
    @Given("^I provide a nationality of (.*?)?")
    public void iProvideANationality(String nationality) {
        System.out.println("Nationality: " + nationality);
        navigateTo.theHomeOfficeCheckUKVisaPage();
        whatNationality.selectNationality(nationality);
    }

    @Given("^I select the reason (.*?)?")
    public void iSelectTheReason(String visitReason) {
        System.out.println("[iSelectTheReason] visitReason: " + visitReason);
        reasonForVisit.selectReasonForUKVisit(visitReason);
        System.out.println("[iSelectTheReason] getting nationality from previous step: " + whatNationality.getNationality());
    }

    @Given("^I state I am intending to stay for (more|less) than (\\d+) months?")
    public void iStateIAmIntendingToStayForPeriod(String visitMoreLess, int visitDuration) {
        System.out.println("[iStateI_Am_IntendingToStayForPeriod] visitStaying: visitMoreLess: " + visitMoreLess + "visitDuration: " + visitDuration);
        periodOfStay.selectPeriodOfStay(visitMoreLess);
    }

    @Given("I state I am not travelling or visiting a partner or family")
    public void iStateIAmOrNotTravellingOrVisitingAPartnerOrFamily(String x) {
        System.out.println("[iStateI_AmOrNot_TravellingOrVisitingAPartnerOrFamily] ");
    }


    @When("I submit the form")
    public void iSubmitTheForm() {
        System.out.println("[iSubmitTheForm] - already submitted");
        //$(Pg_ReasonForVisit.NEXT_STEP_BUTTON).click();
    }

    // Could use a table instead here to pass message in, if still getting problem about the non-ascii (')
    // which is used in the expected message
    @Then("^I will be informed (.*)?")
    public void iWillBeInformedAboutVisaForUK(String expectedReply) {
        System.out.println("[iWillBeInformedAboutVisaForUK] expectedReply: " + expectedReply);

    }
}
