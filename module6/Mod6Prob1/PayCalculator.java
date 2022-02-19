package module6.Mod6Prob1;

public abstract class PayCalculator {
    double payRate;

    public PayCalculator(double payRate) {
        this.payRate = payRate;
    }

    public abstract double computePay(double hours);
}
