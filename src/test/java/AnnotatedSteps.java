import org.junit.jupiter.api.Test;

public class AnnotatedSteps {

    private WebStep steps = new WebStep();

    @Test
    public void testIssueSearch() {
        steps.openMainPage();
        steps.searchForRepository("eroshenkoam/allure-example");
        steps.goToRepository("eroshenkoam/allure-example");
        steps.shouldSeeIssue();
    }
}