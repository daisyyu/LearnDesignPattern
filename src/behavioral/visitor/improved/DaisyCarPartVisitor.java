package behavioral.visitor.improved;

/**
 * Created by fuxinyu on 2/10/16. Adding a new operation is also made easy without modifying existing concrete classes
 */
public class DaisyCarPartVisitor implements CarPartVisitor {
    @Override
    public void visit(final CarPart carPart) {
        System.out.println(getClass().getCanonicalName() + " visit " + carPart);
    }
}
