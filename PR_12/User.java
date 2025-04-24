package PR_12;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String creatorNick, int totalPosts) {
        System.out.println("🔔 " + name + ", у " + creatorNick + " новий пост! Всього постів: " + totalPosts);
    }
}

