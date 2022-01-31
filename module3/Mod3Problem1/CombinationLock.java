package module3.Mod3Problem1;

public class CombinationLock {
    int combinationNum1;
    int combinationNum2;
    int combinationNum3;
    
    int currPosition = 0;
    int pos1 = 0;
    int pos2 = 0;
    int pos3 = 0;
    
    public CombinationLock() {
        this.combinationNum1 = 0;
        this.combinationNum2 = 0;
        this.combinationNum3 = 0;
    }

    public CombinationLock(int num1, int num2, int num3) {
        this.combinationNum1 = num1;
        this.combinationNum2 = num2;
        this.combinationNum3 = num3;
    }

    public int getPos1() {
        return pos1;
    }

    public void setPos1(int num1) {
        this.pos1 = num1;
    }

    public int getPos2() {
        return pos2;
    }

    public void setPos2(int num2) {
        this.pos2 = num2;
    }

    public int getPos3() {
        return pos3;
    }

    public void setPos3(int num3) {
        this.pos3 = num3;
    }

    public void resetDial() {
        setPos1(0);
        setPos2(0);
        setPos3(0);
    }

    public void turnRight(int ticks) {
        currPosition += ticks;
    }

    public void turnLeft(int ticks) {
        currPosition = (currPosition + ticks) % 40;
    }

    public boolean openLock(int num1, int num2, int num3) {
        turnRight(num1);
        setPos1(currPosition);

        turnLeft(num2 - num1);
        setPos2(currPosition);

        turnRight(num3 - num2);
        setPos3(currPosition);

        
        if (combinationNum1 == pos1 && combinationNum2 == pos2 && combinationNum3 == pos3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", combinationNum1, combinationNum2, combinationNum3);
    }
}