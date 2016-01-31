package behavioral.chainofresponsibility.improved.DerekB;

// This object will contain 2 numbers and a
// calculation to perform in the form of a String

import java.util.List;

public class Numbers {

    private int number1;
    private int number2;

    public int getResponse() {
        return response;
    }

    public void setResponse(final int response) {
        this.response = response;
    }

    private int response;

    private List<String> calculationWanted;

    public Numbers(int newNumber1, int newNumber2, List<String> calcWanted){

        number1 = newNumber1;
        number2 = newNumber2;
        calculationWanted = calcWanted;

    }

    public int getNumber1(){ return number1; }
    public int getNumber2(){ return number2; }
    public List<String> getCalcWanted(){ return calculationWanted; }

}