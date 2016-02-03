package behavioral.command.derekB;

public class TurnDeviceVolumeDown implements Command {

    ElectronicDevice theDevice;

    public TurnDeviceVolumeDown(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.volumenDown();

    }

    public void undo() {

        theDevice.volumeUp();

    }

}