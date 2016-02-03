package behavioral.chainofresponsibility.improved.DerekB;

public class SubtractNumbers implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

    @Override
    public void calculate(Numbers request) {

        if (request.getCalcWanted().contains("sub")) {
            request.getCalcWanted().remove("sub");
            int responsePayload = request.getNumber1() - request.getNumber2();
            request.setResponse(responsePayload);
            System.out.print(request.getNumber1() + " - " + request.getNumber2() + " = " +
                    (responsePayload));

        }
        if (nextInChain != null && request.getCalcWanted().size() != 0) {

            nextInChain.calculate(request);

        }

    }


}
