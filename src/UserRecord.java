public class UserRecord {
    private User user;

    private int numKills;
    private int numDeaths;
    private int numAssists;

    public UserRecord(User u) {
        user = u;

        numKills = 0;
        numDeaths = 0;
        numAssists = 0;
    }

    public int intNumKills() {
        return incNumKills(1);
    }

    public int incNumKills(int num) {
        numKills += num;
        return numKills;
    }

    public int incNumDeaths() {
        return incNumDeaths(1);
    }

    public int incNumDeaths(int num) {
        numDeaths += num;
        return numDeaths;
    }

    public int incNumAssists() {
        return incNumAssists(1);
    }

    public int incNumAssists(int num) {
        numAssists += num;
        return numAssists;
    }

    public int getNumKills() {
        return numKills;
    }

    public int getNumDeaths() {
        return numDeaths;
    }

    public int getNumAssists() {
        return numAssists;
    }

    public void reset() {
        numKills = 0;
        numDeaths = 0;
        numAssists = 0;
    }

    public String toString() {
        return String.format("userId=%d, k=%d, d=%d, a=%d", user.getId(), numKills, numDeaths, numAssists);
    }
}
