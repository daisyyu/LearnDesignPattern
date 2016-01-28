package structural.proxy.DerekB;

public class ATMMachine implements GetATMData, ATMState {
    ATMState hasCard, noCard, hasCorrectPin, atmOutOfMoney, atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine() {

    }

    public ATMState getYesCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasPin() {
        return hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return atmOutOfMoney;
    }

    // NEW STUFF
    @Override
    public ATMState getATMState() {
        return atmState;
    }

    @Override
    public int getCashInMachine() {
        return cashInMachine;
    }

    @Override
    public void insertCard() {

    }

    @Override
    public void ejectCard() {

    }

    @Override
    public void insertPin(final int pinEntered) {

    }

    @Override
    public void requestCash(final int cashToWithdraw) {

    }
}
