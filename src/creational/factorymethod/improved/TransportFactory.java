package creational.factorymethod.improved;

/**
 * The different between abstract factory and factory is the number of different iteams a Factory can produce. And
 * finally, the number of final products variations. if TransportFactory can produce both Transport and Card. And each
 * will be paired with both Car and Bike, then it is abstract. we have 2*2 = 4 variations wher as we only have 2 right
 * now.
 */

public abstract class TransportFactory {

    abstract Transport create();
}

