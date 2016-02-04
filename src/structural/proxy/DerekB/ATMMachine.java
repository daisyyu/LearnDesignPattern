package structural.proxy.DerekB;


public class ATMMachine implements GetATMData, ATMState {
    ATMState hasCard, noCard, hasCorrectPin, atmOutOfMoney, atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine() {
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if (cashInMachine < 0) {

            atmState = atmOutOfMoney;

        }
    }

    /**
     * Proxy accessible methods
     *
     * @return
     */
    // NEW STUFF
    @Override
    public ATMState getATMState() {
        return atmState;
    }

    @Override
    public int getCashInMachine() {
        return cashInMachine;
    }

    /**
     * Client actions for internal only, security guaranteed.
     */
    @Override
    public void insertCard() {
        atmState.insertCard();
    }

    @Override
    public void ejectCard() {
        atmState.ejectCard();
    }

    @Override
    public void insertPin(final int pinEntered) {
        atmState.insertPin(pinEntered);
    }

    @Override
    public void requestCash(final int cashToWithdraw) {
        atmState.requestCash(cashToWithdraw);
    }

    void setATMState(ATMState newATMState) {

        atmState = newATMState;

    }

    public void setCashInMachine(int newCashInMachine) {

        cashInMachine = newCashInMachine;

    }


    /**
     * Getters for state instances
     *
     * @return
     */
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
}
