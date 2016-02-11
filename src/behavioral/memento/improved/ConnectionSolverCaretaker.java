package behavioral.memento.improved;

public class ConnectionSolverCaretaker {

    private IMemento connectionSolverMemento;

    public void saveState(ConnectionSolver connectionSolver) {
        connectionSolverMemento = connectionSolver.createMemento();
    }

    public void restoreState(ConnectionSolver connectionSolver) {

        connectionSolver.setMemento(connectionSolverMemento);

    }


}
