package structural.decorator.improved;


public class ScrollbarWindowDecorator extends WindowDecorator {

    public ScrollbarWindowDecorator(Window window) {
        super(window);
    }

    /**
     * Notice that the core funtion uses the same interface. It gets chained.
     */
    @Override
    public void draw() {
        System.out.println("Draw a scrollbar");

        window.draw();
    }
}
