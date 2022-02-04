package module4.solveAndDiscuss;

import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 5 strings... ");
        System.out.println();
        for (int i = 0; i < 5; i++) stack.push(input.nextLine());

        System.out.println();
        System.out.println("Displaying them in reverse order.");
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }

        input.close();
    }
}
