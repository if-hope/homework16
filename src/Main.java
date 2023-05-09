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

        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (WrongAccountException e) {
            System.out.println("Account with such ID doesn't exist");
        } catch (WrongCurrencyException e){
            System.out.println("Account has another currency");
        } catch (WrongOperationException e){
            System.out.println("Account hasn't enough money");
        } catch (Exception e){
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thanks' for using our service");
        }

        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongAccountException e) {
            System.out.println("Account with such ID doesn't exist");
        } catch (WrongCurrencyException e){
            System.out.println("Account has another currency");
        } catch (WrongOperationException e){
            System.out.println("Account hasn't enough money");
        } catch (Exception e){
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thanks' for using our service");
        }

        try {
            bankApplication.process("accountId001", 50, "EUR");
        } catch (WrongAccountException e) {
            System.out.println("Account with such ID doesn't exist");
        } catch (WrongCurrencyException e){
            System.out.println("Account has another currency");
        } catch (WrongOperationException e){
            System.out.println("Account hasn't enough money");
        } catch (Exception e){
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thanks' for using our service");
        }

        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException e) {
            System.out.println("Account with such ID doesn't exist");
        } catch (WrongCurrencyException e){
            System.out.println("Account has another currency");
        } catch (WrongOperationException e){
            System.out.println("Account hasn't enough money");
        } catch (Exception e){
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thanks' for using our service");
        }

        try {
            bankApplication.process("accountId001", 110, "USD");
        } catch (WrongAccountException e) {
            System.out.println("Account with such ID doesn't exist");
        } catch (WrongCurrencyException e){
            System.out.println("Account has another currency");
        } catch (WrongOperationException e){
            System.out.println("Account hasn't enough money");
        } catch (Exception e){
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thanks' for using our service");
        }

    }
}
