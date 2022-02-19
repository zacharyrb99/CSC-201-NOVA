package module6.Mod6Prob1;

public class App {
    public static void main(String[] args) {
        double payRate = 26.50;
        RegularPay rp = new RegularPay(payRate);
        System.out.println(rp.computePay(40));

        PayCalculator pc = new HazardPay(payRate);
        System.out.println(pc.computePay(40));
    }
}
