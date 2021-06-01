import java.util.Collection;
import java.util.HashSet;

public class Game {
    private HashSet<User> users;

    // This class represents a game, probably needs a lot more
    // information to create a game than just a record collection.
    public Game() {
        users = new HashSet<User>();
    }

    public boolean addUser(User u) {
        if (u == null) {
            return false;
        }

        users.add(u);

        return true;
    } 

    public int addUsers(Collection<User> group) {
        int added = 0;
        
        for (User u : group) {
            if (addUser(u)) {
                ++added;
            }
        }

        return added;
    }

    public void removeUser(User u) {
        if (u == null) {
            return;
        }

        users.remove(u);
    }

    public void removeUsers(Collection<User> group) {
        for (User u : group) {
            removeUser(u);
        }
    }

    public void incUserKill(User u, int num) {
        if (!users.contains(u)) {
            return;
        }

        u.getUserRecord().incNumKills(num);
    }

    public void incUserAssist(User u, int num) {
        if (!users.contains(u)) {
            return;
        }

        u.getUserRecord().incNumAssists(num);

    }

    public void incUserDeath(User u, int num) {
        if (!users.contains(u)) {
            return;
        }

        u.getUserRecord().incNumDeaths(num);
    }
}
