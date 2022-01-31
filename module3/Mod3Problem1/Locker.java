package module3.Mod3Problem1;

import java.util.Scanner;

public class Locker {
    int lockerNumber;
    String studentName;
    int numOfBooks;
    private CombinationLock lock = new CombinationLock();

    public Locker() {
        lockerNumber = 0;
        studentName = "N/A";
        numOfBooks = 0;
        lock.resetDial();
    }

    public Locker(int lockerNumber, String studentName, int numOfBooks, CombinationLock lock) {
        this.lockerNumber = lockerNumber;
        this.studentName = studentName;
        this.numOfBooks = numOfBooks;
        this.lock = lock;
    }

    public int getLockerNum() {
        return lockerNumber;
    }

    public void setLockerNum(int num) {
        this.lockerNumber = num;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public int getNumBooks() {
        return numOfBooks;
    }

    public void setNumBooks(int num) {
        this.numOfBooks = num;
    }

    public void putBookInLocker() {
        this.numOfBooks += 1;
        System.out.println("Book added to " + studentName + "'s locker!");
    }

    public boolean removeBookFromLocker() {
        if (this.numOfBooks > 0) {
            this.numOfBooks -= 1;
            System.out.println("Book removed from " + studentName + "'s locker!");
            return true;
        } else {
            System.out.println("Book not removed from " + studentName + "'s locker!");
            return false;
        }
    }

    public void openLocker() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input first num: ");
        int num1 = scan.nextInt();

        System.out.println("Input second num: ");
        int num2 = scan.nextInt();

        System.out.println("Input third num: ");
        int num3 = scan.nextInt();

        if (num1 < 0 || num1 > 39 || num2 < 0 || num2 > 39 || num3 < 0 || num3 > 39) {
            System.out.println("Input must be between 0 and 39.");
            openLocker();
        } 
    
        boolean opened = this.lock.openLock(num1, num2, num3);
        
        if (opened) {
            System.out.println(studentName + "'s locker is open.");
            scan.close();
        } else {
            System.out.println(studentName + "'s locker didn't open.");
            scan.close();
        }
    }

    @Override
    public String toString() {
        return "Locker " + lockerNumber + " for " + studentName + " with " + numOfBooks + " books and combination: " + lock.toString();
    }
}