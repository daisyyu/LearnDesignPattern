package behavioral.command.derekB;

public class TurnDeviceVolumeUp implements Command {

    ElectronicDevice theDevice;

    public TurnDeviceVolumeUp(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.volumeUp();

    }

    public void undo() {

        theDevice.volumenDown();

    }

}