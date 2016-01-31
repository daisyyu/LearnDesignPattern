package behavioral.chainofresponsibility.improved.DerekB;

public class AddNumbers implements Chain {

    private Chain nextInChain;

    // Defines the next Object to receive the
    // data if this one can't use it

    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

    // Tries to calculate the data, or passes it
    // to the Object defined in method setNextChain()

    public void calculate(Numbers request) {

        if (request.getCalcWanted().contains("add")) {
            request.getCalcWanted().remove("add");
            int responsePayload = request.getNumber1() + request.getNumber2();
            request.setResponse(responsePayload);
            System.out.print(request.getNumber1() + " + " + request.getNumber2() + " = " +
                    (responsePayload));

        }
        if (nextInChain != null&& request.getCalcWanted().size() != 0){

            nextInChain.calculate(request);

        }

    }
}