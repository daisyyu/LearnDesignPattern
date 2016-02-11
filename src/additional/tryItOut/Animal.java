package additional.tryItOut;

/**
 * Created by fuxinyu on 2/11/16.
 */
public class Animal {
    private Animal() {
        System.out.println("This is an Animal");
    }

    public static class AnimalBuilder {
        public static Animal createAnimal() {
            return new Animal();
        }
    }
}
