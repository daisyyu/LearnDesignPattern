package behavioral.observer.improved;


public interface Subject {

    void attachObserver(Observer observer);

    void detachObserver(Observer observer);

    /**
     * notify
     */
    void change();

}
