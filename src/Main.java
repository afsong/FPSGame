
/**
 * Test Main class. Creates two users and two games.
 * Tests whether changes in different games show up.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        User user1 = new User("user1", 1);
        User user2 = new User("user2", 2);

        Game gameOne = new Game();

        gameOne.addUser(user1);
        gameOne.addUser(user2);

        gameOne.incUserKill(user1, 2);
        gameOne.incUserAssist(user2, 3);

        System.out.println(user1.getUserRecord());
        System.out.println(user2.getUserRecord());
    
        Game gameTwo = new Game();

        gameTwo.addUser(user1);

        gameTwo.incUserDeath(user1, 2);

        // This shouldn't increment since user2 is not in gameTwo!
        gameTwo.incUserDeath(user2, 3);

        System.out.println(user1.getUserRecord());
        System.out.println(user2.getUserRecord());
    }
}
