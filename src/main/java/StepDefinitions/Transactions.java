package StepDefinitions;

public class Transactions {

    public int balance(int initialBalance, int spend) {
        int remainBalance = initialBalance - spend;
        return remainBalance;
    }

}
