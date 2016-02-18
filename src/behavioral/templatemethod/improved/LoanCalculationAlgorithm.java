package behavioral.templatemethod.improved;


public abstract class LoanCalculationAlgorithm {


    public int calculateLoan() {
        if (shouldImplementFoo()) {
            foo();
        }
        return (int) (getBaseAmount() * getInterest() - caclulateDiscount());
    }


    abstract int getBaseAmount();

    abstract double getInterest();

    abstract int caclulateDiscount();

    abstract void foo();

    public boolean shouldImplementFoo() {
        return true;
    }

}
