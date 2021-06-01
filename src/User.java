public class User {
    private String name;
    private int userId;

    private UserRecord record;

    public User(String n, int id) {
        name = n;
        userId = id;

        record = new UserRecord(this);
    }

    public int getId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public UserRecord getUserRecord() {
        return record;
    }
}
