package behavioral.visitor;

/**
 * 1. each CarPart has its own implementation of all 3 method. If upgrade need to be changed, we need to go to all 3
 * concrete class to change it.
 *
 * 2. It can be easily forgotten, grouping is needed.
 *
 * 3. Also, it made possible to easily adding new operations.
 */
public abstract class CarPart {

    abstract void print();

    abstract void render();

    abstract void upgrade();

}
