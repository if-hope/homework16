import exceprions.WrongAccountException;
import exceprions.WrongCurrencyException;
import exceprions.WrongOperationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankApplication {

    private final List<Account> accounts = new ArrayList<>() {{
        add(new Account("accountId001", 100, "USD"));
        add(new Account("accountId002", 500, "EUR"));
        add(new Account("accountId003", 250, "HRV"));
        add(new Account("accountId004", 1000, "USD"));
        add(new Account("accountId005", 750, "USD"));
        add(new Account("accountId006", 50, "USD"));
    }};


    public void process(String accountId, int amount, String currency) throws Exception {

        accounts.stream().filter(account -> account.getId().equals(accountId))
                .findAny().orElseThrow(WrongAccountException::new);

        accounts.stream().filter(account -> account.getId().equals(accountId))
                .filter(account -> account.getCurrency().equals(currency))
                .findAny().orElseThrow(WrongCurrencyException::new);

        accounts.stream().filter(account -> account.getId().equals(accountId))
                .filter(account -> account.getCurrency().equals(currency))
                .filter(account -> account.getBalance() >= amount)
                .findAny().orElseThrow(WrongOperationException::new);


        Account desiredAccount = accounts.stream()
                .filter(account -> account.getId().equals(accountId))
                .filter(account -> account.getCurrency().equals(currency))
                .filter(account -> account.getBalance() >= amount).findAny()
                .orElseThrow();

        int randomInt = new Random().nextInt(2);

       if(randomInt == 1){
           throw new Exception();
       }

        desiredAccount.setBalance(desiredAccount.getBalance() - amount);
    }

    public void processCheck (String accountId, int amount, String currency){

        try {
            process(accountId, amount, currency);
        } catch (WrongAccountException wrongAccountException){
            System.out.println("Account with such ID doesn't exist");
        } catch (WrongCurrencyException wrongCurrencyException){
            System.out.println("Account has another currency");
        } catch (WrongOperationException wrongOperationException){
            System.out.println("Account hasn't enough money");
        } catch (Exception exception){
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thanks' for using our service");
        }

    }
}
