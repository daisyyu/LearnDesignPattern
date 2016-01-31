package behavioral.chainofresponsibility.improved.DerekB;

import java.util.ArrayList;
import java.util.Arrays;

public class TestCalcChain {

    public static void main(String[] args) {

        // Here I define all of the objects in the chain

        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultNumbers();
        Chain chainCalc4 = new DivideNumbers();
        Chain chainCalc5 = new SquareNumbers();

        // Here I tell each object where to forward the
        // data if it can't process the request

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);
        chainCalc4.setNextChain(chainCalc5);

        // Define the data in the Numbers Object
        // and send it to the first Object in the chain

        ArrayList<String> operationList = new ArrayList<>();
//        operationList.add("add");
        operationList.add("square");
        operationList.add("div");
//        Numbers request = new Numbers(4,2, Arrays.asList("add"));
        Numbers request = new Numbers(3, 2, operationList);

        chainCalc1.calculate(request);

    }

}