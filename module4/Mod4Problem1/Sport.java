package module4.Mod4Problem1;

public class Sport {
    private String name;
    int scoreHome;
    int scoreAway;

    public Sport (String name, int scoreHome, int scoreAway) {
        this.name = name;
        this.scoreHome = scoreHome;
        this.scoreAway = scoreAway;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScoreHome(int scoreHome) {
        this.scoreHome = scoreHome;
    }

    public int getScoreHome() {
        return scoreHome;
    }

    public void setScoreAway(int scoreAway) {
        this.scoreAway = scoreAway;
    }

    public int getScoreAway() {
        return scoreAway;
    }

    @Override
    public String toString() {
        String nameStr = "Name of sport: " + name;
        String homeStr = "Home team score: " + scoreHome;
        String awayStr = "Away team score: " + scoreAway;

        return nameStr + "\n" + homeStr + "\n" + awayStr;
    }
}
