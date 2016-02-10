package behavioral.visitor.improved;

/**
 * Changing upgrade method for all concreate carpart is made easy, with change being made for only one class
 */
public class UpgradeCarPartVisitor implements CarPartVisitor {

    @Override
    public void visit(CarPart carPart) {
        System.out.println("Upgrade11: " + carPart);
    }


}
