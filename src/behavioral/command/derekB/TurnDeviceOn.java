package behavioral.command.derekB;

public class TurnDeviceOn implements Command {

    ElectronicDevice theDevice;

    public TurnDeviceOn(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.on();

    }

    public void undo() {

        theDevice.off();

    }

}