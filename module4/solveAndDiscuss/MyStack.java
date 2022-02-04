package module4.solveAndDiscuss;

import java.util.ArrayList;

/*
    In Listing 11.10, MyStack is impletmented using composition. Define a new stack class that extends ArrayList.
    Draw the UML diagram for the classes then implement MyStack. Write a test program that prompts the user to enter five strings
    and displays them in reverse order.

    UML Diagram

    MyStack:
    isEmpty(): boolean --> returns true if stack is empty
    getSize(): int --> returns the number of elements in the stack
    peek(): Object --> returns the top element in this stack without removing it
    pop(): Object --> returns and removes the top element in the stack
    push(o: Object): void --> adds a new element to the top of the stack
*/

public class MyStack extends ArrayList<Object> {
    public boolean isEmpty() {
        return super.isEmpty();
    }
    
    public int getSize() {
        return super.size();
    }

    public Object peek() {
        return get(size() - 1);
    }

    public Object pop() {
        Object o = get(size() - 1);
        remove(size() - 1);
        return o;
    }

    public void push(Object o) {
        add(o);
    }

    @Override
    public String toString() {
        return "Stack: " + super.toString();
    }    
}
