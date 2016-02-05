package structural.facade.DerekB;

/**
 * When you have the question "Can I withdrawal $50 from the bank", many things have to be done behind the scene. 1.
 * Check if the cheking acct is valid 2. Check if the security code is valid 3. Check if funds are available 4. Make
 * changes accordingly
 *
 * However, the client should have a simplified interface that performs all those complicated actions so the client call
 * is simple
 */
public class TestBankAccount {

    public static void main(String[] args) {

        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

        accessingBank.withdrawCash(50.00);

        accessingBank.withdrawCash(990.00);

    }

}