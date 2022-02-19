package module6.Mod6Prob1;

public  class HazardPay extends PayCalculator {
    public HazardPay(double payRate) {
        super(payRate);
    }

    @Override
    public double computePay(double hours) {
        return payRate * hours * 1.5;
    }
}
