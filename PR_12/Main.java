package PR_12;

public class Main {
    public static void main(String[] args) {
        Creator creator1 = new Creator("DenysPro100");
        Creator creator2 = new Creator("Bunny228");
        Creator creator3 = new Creator("UnicornMaxProPlus");

        User user1 = new User("Аня");
        User user2 = new User("Каріна");
        User user3 = new User("Денус");
        User user4 = new User("Івася");
        User user5 = new User("Юрко");
        User user6 = new User("Бодя");
        User user7 = new User("Андрійко");

        creator1.addSubscriber(user1);
        creator1.addSubscriber(user2);
        creator1.addSubscriber(user3);

        creator2.addSubscriber(user3);
        creator2.addSubscriber(user4);
        creator2.addSubscriber(user5);

        creator3.addSubscriber(user5);
        creator3.addSubscriber(user6);
        creator3.addSubscriber(user7);
        creator3.addSubscriber(user1);

        creator1.createPost();
        System.out.println("----------");
        creator2.createPost();
        System.out.println("----------");
        creator3.createPost();
        creator3.createPost();
    }
}

