package behavioral.command.derekB;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Daisy on 1/30/16.
 */
public class CentralExecutor {
    LinkedList<DeviceButton> deviceButtonClicks = new LinkedList<>();

    public List<DeviceButton> getDeviceButtonClicks() {
        return deviceButtonClicks;
    }

    public void pressButton(DeviceButton button) {
        deviceButtonClicks.addFirst(button);
        button.press();
    }

    public void undoAll() {
        DeviceButton button;
        while ((button = deviceButtonClicks.poll()) != null) {
            button.pressUndo();
        }
    }

    static class DeviceButton {

        Command theCommand;

        public DeviceButton(Command newCommand) {

            theCommand = newCommand;

        }

        private void press() {

            theCommand.execute();

        }

        // Now the remote can undo past commands

        private void pressUndo() {

            theCommand.undo();

        }

    }
}
