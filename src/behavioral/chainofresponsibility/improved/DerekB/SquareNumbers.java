package behavioral.chainofresponsibility.improved.DerekB;

public class SquareNumbers implements Chain {

    private Chain nextInChain;

    // Defines the next Object to receive the
    // data if this one can't use it

    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

    // Tries to calculate the data, or passes it
    // to the Object defined in method setNextChain()

    public void calculate(Numbers request) {
        if (request.getCalcWanted().contains("square")) {
            request.getCalcWanted().remove("square");
            int currentResponseVal = request.getResponse();
            if (currentResponseVal == 0) {
                System.out.println("No previous calculation been done, ignore square request");
            } else {
                int result = (int) Math.pow(currentResponseVal, 2);
                System.out.println(currentResponseVal + " * " + currentResponseVal + " = " + result);
                request.setResponse(result);
            }

        }
        if (nextInChain != null && request.getCalcWanted().size() != 0) {

            nextInChain.calculate(request);

        }

    }
}