package behavioral.chainofresponsibility.improved.DerekB;

public class DivideNumbers implements Chain{

    private  Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalcWanted().contains("div")) {
            request.getCalcWanted().remove("div");
            int responsePayload = request.getNumber1() / request.getNumber2();
            request.setResponse(responsePayload);
            System.out.print(request.getNumber1() + " / " + request.getNumber2() + " = " +
                    (responsePayload));

        }
        if (nextInChain != null && request.getCalcWanted().size() != 0) {

            nextInChain.calculate(request);

        }
//        if(request.getCalcWanted() == "div"){
//
//            System.out.print(request.getNumber1() + " / " + request.getNumber2() + " = "+
//                    (request.getNumber1()/request.getNumber2()));
//
//        } else {
//
//            System.out.print("Only works for add, sub, mult, and div");
//
//        }
    }
}