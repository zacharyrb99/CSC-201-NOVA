package module4.Mod4Problem1;

public class Baseball extends Sport {
    private int homeruns;

    public Baseball(String name, int scoreHome, int scoreAway , int homeruns) {
        super(name, scoreHome, scoreAway);
        this.homeruns = homeruns;
    }

    public void setHomeruns (int homeruns) {
        this.homeruns = homeruns;
    }

    public int getHomeruns () {
        return homeruns;
    }

    @Override
    public String toString() {
        String parentStr = super.toString();
        String hrStr = "Homeruns hit this game: " + homeruns;
        String winner;

        if (scoreHome > scoreAway) {
            winner = "Home team wins!";
        } else {
            winner = "Away team wins!";
        }

        return parentStr + "\n" + hrStr + "\n" + winner;
    }
}
