package module4.Mod4Problem1;

public class Basketball extends Sport {
    private int threes;

    public Basketball(String name, int scoreHome, int scoreAway, int threes) {
        super(name, scoreHome, scoreAway);
        this.threes = threes;
    }

    public void setThrees(int threes) {
        this.threes = threes;
    }

    public int getThrees() {
        return threes;
    }

    @Override
    public String toString() {
        String parentStr = super.toString();
        String threesStr = "3 pointers made: " + threes;
        String winner;

        if (scoreHome > scoreAway) {
            winner = "Home team wins!";
        } else {
            winner = "Away team wins!";
        }

        return parentStr + "\n" + threesStr + "\n" + winner;
    }
}
