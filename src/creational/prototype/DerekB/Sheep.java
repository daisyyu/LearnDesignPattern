package creational.prototype.DerekB;

import java.util.Random;

public class Sheep implements Animal {
    /**
     * String is copied over with a actual copy
     */
    String name;
    Random random = new Random();
    /**
     * Struct will be a shallow copy
     */
    Struct struct;

    public Sheep() {

        System.out.println("Sheep is Made");
        name = "sheep " + random.nextInt();
        struct = new Struct("StructA", 1);

    }

    /**
     * Clone method won't invoke the constructor
     *
     * @return cloned sheep
     */
    public Animal makeCopy() {

        System.out.println("Sheep is Being Made");

        Sheep sheepObject = null;

        try {

            // Calls the Animal super classes clone()
            // Then casts the results to Sheep

            sheepObject = (Sheep) super.clone();
            sheepObject.struct = new Struct(struct.a,struct.b);

        }

        // If Animal didn't extend Cloneable this error
        // is thrown

        catch (CloneNotSupportedException e) {

            System.out.println("The Sheep was Turned to Mush");

            e.printStackTrace();

        }

        return sheepObject;
    }

    public String toString() {

        return "Dolly is my Hero, Baaaaa, name is " + name + " struct: " + struct;

    }


    class Struct {
        String a;
        int b;

        Struct(String a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return "Struct with a:" + a + " b:" + b + "hashcode: " + System.identityHashCode(this);
        }
    }

}