package structural.decorator.improved;

/**
 * A Decorator can decorate both a Decorator or a window to achieve Daisy chain of multiple decorators.
 */
public class WindowDecorator extends Window {

    protected Window window;

    public WindowDecorator(Window window) {
        this.window = window;
    }

    @Override
    public void draw() {
        window.draw();
    }
}
