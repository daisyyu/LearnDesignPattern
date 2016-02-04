package structural.proxy.DerekB;

// In this situation the proxy both creates and destroys
// an ATMMachine Object

public class ATMProxy implements GetATMData {
    ATMMachine realATMMachine = new ATMMachine();
    // Allows the user to access getATMState in the
    // Object ATMMachine

    public ATMState getATMState() {

        return realATMMachine.getATMState();
    }

    // Allows the user to access getCashInMachine
    // in the Object ATMMachine

    public int getCashInMachine() {

        return realATMMachine.getCashInMachine();

    }

}