package behavioral.visitor.improved;


import java.util.ArrayList;
import java.util.List;

public class Car {

    List<CarPart> carParts = new ArrayList<CarPart>();

    public List<CarPart> getCarParts() {
        return carParts;
    }

    public void setCarParts(List<CarPart> carParts) {
        this.carParts = carParts;
    }

    CarPartVisitor renderer = new RenderCarPartVisitor();
    CarPartVisitor printer = new PrintCarPartVisitor();
    CarPartVisitor upgrader = new UpgradeCarPartVisitor();
    CarPartVisitor daisy = new DaisyCarPartVisitor();


    public void render() {
        for (CarPart carPart : carParts) {
            carPart.acceptCarPartVisitor(renderer);
        }
    }

    public void print() {

        for (CarPart carPart : carParts) {
            carPart.acceptCarPartVisitor(printer);
        }
    }

    public void upgrade() {
        for (CarPart carPart : carParts) {
            carPart.acceptCarPartVisitor(upgrader);
        }
    }

    public void daisy() {
        for (CarPart carPart : carParts) {
            carPart.acceptCarPartVisitor(daisy);
        }
    }

}
