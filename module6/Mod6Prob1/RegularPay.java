package module6.Mod6Prob1;

public class RegularPay extends PayCalculator {
    public RegularPay(double payRate) {
        super(payRate);
    }

    @Override
    public double computePay(double hours) {
        return payRate * hours;
    }
}
