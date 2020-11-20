package homeoffice.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    DuckDuckGoHomePage duckDuckGoHomePage;

    @Step("Open the DuckDuckGo home page")
    public void theDuckDuckGoHomePage() {
        duckDuckGoHomePage.open();
    }

    HomeOfficeCheckUKVisaPage homeOfficeCheckUKVisaPage;

    @Step("Open the Home Office Check-UK-Visa page")
    public void theHomeOfficeCheckUKVisaPage() {
        System.out.println("SS_NavigateTo - [homeOfficeCheckUKVisaPage]  open chrome and url: ");
        homeOfficeCheckUKVisaPage.open();
    }
}
