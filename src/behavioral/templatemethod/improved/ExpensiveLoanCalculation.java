package behavioral.templatemethod.improved;


public class ExpensiveLoanCalculation extends LoanCalculationAlgorithm {


    @Override
    int getBaseAmount() {
        return 100000;
    }

    @Override
    double getInterest() {
        return 5.4;
    }

    @Override
    int caclulateDiscount() {
        return 100;
    }

    @Override
    void foo() {

    }


    @Override
    public boolean shouldImplementFoo() {
        return false;
    }
}
