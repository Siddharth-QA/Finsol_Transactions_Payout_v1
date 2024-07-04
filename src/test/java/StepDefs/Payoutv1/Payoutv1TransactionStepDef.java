package StepDefs.Payoutv1;

import StepDefs.BaseStepDef;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Payoutv1TransactionStepDef extends BaseStepDef {


    @When("Verify get balance")
    public void verifyGetBalance() {
        payoutv1.getToken();
        payoutv1.getBalance();
    }
    @When("Verify VPA is required")
    public void verifyVPAIsRequired() {
        payoutv1.getToken();
        payoutv1.verifyVPArequired();
    }

    @When("Verify bank acc number is required")
    public void verifyBankAccNumberIsRequired() {
        payoutv1.verifyBankAccIfscRequired();
    }

    @When("Verify IMPS payout required fields")
    public void verifyIMPSPayoutRequiredFields() {
        payoutv1.getToken();
        payoutv1.verifyImpsPayoutRequiredFields();
    }

    @When("Send IMPS payout request")
    public void sendIMPSPayoutRequest() {
        payoutv1.sendImpsPayoutRequest();
    }


    @When("Make Transaction Fail Success")
    public void makeTransactionFailSuccess() {
        payoutv1.makeTransactionSuccesFail();
    }

    @Then("Verify Transaction status")
    public void verifyTransactionStatus() {
        payoutv1.verifyTransactionStatus();
    }

    @When("Verify transaction not found")
    public void verifyTransactionNotFound() {
        payoutv1.txnNotFountGetStatus();
    }

    @When("Verify required fields get status")
    public void verifyRequiredFieldsGetStatus() {
        payoutv1.verifyInvalidMid();
    }

    @When("Send UPI payout request")
    public void sendUPIPayoutRequest() {
        payoutv1.sendUpiPayoutRequest();
    }
    @When("Verify Order Id already Exists")
    public void verifyOrderIdAlreadyExists() {
        payoutv1.verifyOrderIdAlreadyExists();
    }
}
