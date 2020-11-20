package homeoffice.step_definitions;

import homeoffice.navigation.NavigateTo;
import homeoffice.page_objects.SS_PeriodOfStay;
import homeoffice.page_objects.SS_ReasonForVisit;
import homeoffice.page_objects.SS_WhatNationality;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class NonUKResidentsVisitsSteps {

    @Steps
    NavigateTo navigateTo;
    SS_WhatNationality whatNationality;
    SS_ReasonForVisit reasonForVisit;
    SS_PeriodOfStay periodOfStay;

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
    public void iStateI_AmOrNot_IntendingToStayForPeriod(String visitMoreLess, int visitDuration) {
        System.out.println("[iStateI_AmOrNot_IntendingToStayForPeriod] visitStaying: visitMoreLess: " + visitMoreLess + "visitDuration: " + visitDuration);
        periodOfStay.selectPeriodOfStay(visitMoreLess);

    }

    @Given("I state I am not travelling or visiting a partner or family")
    public void iStateI_AmOrNot_TravellingOrVisitingAPartnerOrFamily(String x) {
        System.out.println("[iStateI_AmOrNot_TravellingOrVisitingAPartnerOrFamily] ");
    }


    @When("I submit the form")
    public void iSubmitTheForm() {
        System.out.println("[iSubmitTheForm]");
    }

    // Could use a table instead here to pass message in, if still getting problem about the non-ascii (')
    // which is used in the expected message
    @Then("^I will be informed (.*)?")
    public void iWillBeInformedAboutVisaForUK(String expectedReply) {
        System.out.println("[iWillBeInformedAboutVisaForUK] expectedReply: " + expectedReply);
    }
}
