package structural.proxy.DerekB;

/**
 * Created by fuxinyu on 1/26/16.
 */
public interface ATMState {

    void insertCard();

    void ejectCard();

    void insertPin(int pinEntered);

    void requestCash(int cashToWithdraw);

}