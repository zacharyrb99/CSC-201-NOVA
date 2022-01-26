package module1.Mod1Problem4;

public class ComplexNums {
    // Class Variables
    int a1;
    int a2;
    int b1;
    int b2;

    String addResult;
    String subtractResult;
    String multiplyResult;
    String divideResult;
    
    // Class Constructor
    ComplexNums (int real1, int real2, int imag1, int imag2) {
        a1 = real1;
        a2 = real2;
        b1 = imag1;
        b2 = imag2;
    }

    void add () {
        int realAdd = a1 + a2;
        int imagAdd = b1 + b2;

        addResult = String.format("Addition: (%s + %s) + (%s + %s)i = %s + %si", a1, a2, b1, b2, realAdd, imagAdd);
        System.out.println(addResult);
    }

    void subtract () {
        int realSubtract = a1 - a2;
        int imagSubtract = b1 - b2;
        

        subtractResult = String.format("Subtraction: (%s - %s) + (%s - %s)i = (%s) - (%si)", a1, a2, b1, b2, realSubtract, imagSubtract);
        System.out.println(subtractResult);
    }

    void multiply () {
        int realMultiply = (a1 * a2) - (b1 * b2);
        int imagMultiply = (a1 * b2) + (b1 * a2);

        multiplyResult = String.format("Multiplication: ((%s * %s) - (%s * %s)) + ((%s * %s) + (%s * %s))i = %s * %si", a1, a2, b1, b2, a1, b2, a2, b1, realMultiply, imagMultiply);
        System.out.println(multiplyResult);
    }

    void divide () {
        double realDivide = ((a1 * a2) + (b1 * b2)) / (Math.pow(a2, 2) + Math.pow(b2, 2));
        double imagDivide = ((b1 * a2) - (a1 * b2)) / (Math.pow(a2, 2) + Math.pow(b2, 2));

        divideResult = String.format("Division: (((%s * %s) + (%s * %s))/(%s^2 + %s^2)) + (((%s * %s) - (%s * %s))/((%s^2 + %s^2)))i = %s / %si", a1, a2, b1, b2, a2, b2, b1, a2, a1, b2, a2, b2, realDivide, imagDivide);
        System.out.println(divideResult);
    }

    void printResults() {
        add();
        subtract();
        multiply();
        divide();
    }
}
