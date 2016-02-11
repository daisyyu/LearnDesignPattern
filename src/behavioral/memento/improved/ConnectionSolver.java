package behavioral.memento.improved;


import java.awt.geom.Point2D;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ConnectionSolver {
    Stack<IMemento> snapShotList = new Stack<>();

    private Point2D firstPoint;

    private Point2D secondPoint;


    public void calculateLine() {

        System.out.println("Calculate line between: " + firstPoint + " and " + secondPoint);

    }

    /**
     * Take snapshot as is
     *
     * @return snapshot
     */
    public IMemento createMemento() {
        return new ConnectionSolverMemento(firstPoint, secondPoint);
    }

    /**
     * Take snapshot and save to list
     */
    private void takeSnapShot() {
        snapShotList.push(new ConnectionSolverMemento(firstPoint, secondPoint));
    }

    private void restoreSnapShot() {
        if (snapShotList.empty()) {
            System.out.println("Failed to restore snapshot");
            return;
        }
        setMemento(snapShotList.pop());
    }

    public void move() {
        firstPoint = new Point2D.Double(firstPoint.getX() + 1.0, firstPoint.getY());
        secondPoint = new Point2D.Double(secondPoint.getX() + 1.0, secondPoint.getY());
        takeSnapShot();
    }
    public void undoMove(){
        restoreSnapShot();
    }

    public void setMemento(IMemento memento) {
        firstPoint = memento.getFirstPoint();
        secondPoint = memento.getSecondPoint();
    }


    public void setFirstPoint(Point2D firstPoint) {
        this.firstPoint = firstPoint;
    }

    public void setSecondPoint(Point2D secondPoint) {
        this.secondPoint = secondPoint;
    }

    private class ConnectionSolverMemento implements IMemento {

        private Point2D firstPoint;

        private Point2D secondPoint;


        public ConnectionSolverMemento(Point2D firstPoint, Point2D secondPoint) {
            this.firstPoint = firstPoint;
            this.secondPoint = secondPoint;
        }

        @Override
        public Point2D getFirstPoint() {
            return firstPoint;
        }

        @Override
        public Point2D getSecondPoint() {
            return secondPoint;
        }
    }

}
