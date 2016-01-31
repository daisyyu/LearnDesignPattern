package behavioral.command.derekB;

public class TurnDeviceOff implements Command {

    ElectronicDevice theDevice;

    public TurnDeviceOff(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.off();

    }

    // Used if you want to allow for undo
    // Do the opposite of execute()

    public void undo() {

        theDevice.on();

    }

}