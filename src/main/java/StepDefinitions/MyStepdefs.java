package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class MyStepdefs {

    private Transactions transactions;

    private int initialBalance = 0;
    private int spend = 0;
    private int remainBal = 0;

    @Given("Prateek has <initBal>")
    public void prateekHasInitBal(int initBal) {
        System.out.println("Prateek has " + initBal);
        transactions = new Transactions();
        throw new io.cucumber.java.PendingException();
    }

    @When("Prateek spends {int}")
    public void prateekSpends(int spend) {
        System.out.println("Prateek spends " + spend);
        remainBal = transactions.balance(initialBalance, spend);
    }

    @Then("Prateek should have {int}")
    public void prateekShouldHave(int remainBalance) {
        System.out.println("Prateek should have " + remainBalance);
        Assert.assertThat(remainBal, Matchers.equalTo(remainBalance));
    }

}
