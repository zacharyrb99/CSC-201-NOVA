package module4.Mod4Problem1;

public class Football extends Sport {
    private int tds;

    public Football(String name, int scoreHome, int scoreAway, int tds) {
        super(name, scoreHome, scoreAway);
        this.tds = tds;
    }

    public void setTds(int tds) {
        this.tds = tds;
    }

    public int getTds() {
        return tds;
    }

    @Override
    public String toString() {
        String parentStr = super.toString();
        String tdStr = "Touchdowns thrown: " + tds;
        String winner;

        if (scoreHome > scoreAway) {
            winner = "Home team wins!";
        } else {
            winner = "Away team wins!";
        }

        return parentStr + "\n" + tdStr + "\n" + winner;
    }
}
