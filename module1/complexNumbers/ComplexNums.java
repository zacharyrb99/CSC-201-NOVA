package module1.complexNumbers;

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

        addResult = String.format("The sum of the numbers you input is %s + %si", realAdd, imagAdd);
        System.out.println(addResult);
    }

    void subtract () {
        int realSubtract = a1 - a2;
        int imagSubtract = b1 - b2;
        

        subtractResult = String.format("The difference of the numbers you input is (%s) - (%si)", realSubtract, imagSubtract);
        System.out.println(subtractResult);
    }

    void multiply () {
        int realMultiply = (a1 * a2) - (b1 * b2);
        int imagMultiply = (a1 * b2) + (b1 * a2);

        multiplyResult = String.format("The product of the numbers you input is %s * %si", realMultiply, imagMultiply);
        System.out.println(multiplyResult);
    }

    void divide () {
        double realDivide = ((a1 * a2) + (b1 * b2)) / (Math.pow(a2, 2) + Math.pow(b2, 2));
        double imagDivide = ((b1 * a2) - (a1 * b2)) / (Math.pow(a2, 2) + Math.pow(b2, 2));

        divideResult = String.format("The quotient of the numbers you input is %s / %si", realDivide, imagDivide);
        System.out.println(divideResult);
    }

    void printResults() {
        add();
        subtract();
        multiply();
        divide();
    }
}
