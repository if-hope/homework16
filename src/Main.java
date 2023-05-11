import exceprions.WrongAccountException;
import exceprions.WrongCurrencyException;
import exceprions.WrongOperationException;

public class Main {
    public static void main(String[] args) {

        BankApplication bankApplication = new BankApplication();

//        4.1 id = accountId000, amount 50, currency USD
//        4.2 id = accountId003, amount 250, currency HRV
//        4.3 id = accountId001, amount 50, currency EUR
//        4.4 id = accountId001, amount 50, currency USD
//        4.5 id = accountId001, amount 100, currency USD

        bankApplication.processCheck("accountId000", 50, "USD");
        bankApplication.processCheck("accountId003", 250, "HRV");
        bankApplication.processCheck("accountId001", 50, "EUR");
        bankApplication.processCheck("accountId001", 50, "USD");
        bankApplication.processCheck("accountId001", 100, "USD");

    }
}
