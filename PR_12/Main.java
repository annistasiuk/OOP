package PR_12;

public class Main {
    public static void main(String[] args) {
        Creator creator1 = new Creator("DenysPro100");
        Creator creator2 = new Creator("Bunny");
        Creator creator3 = new Creator("Unicorn");

        User user1 = new User("Anya");
        User user2 = new User("Karina");
        User user3 = new User("Denys");
        User user4 = new User("Ivanna");
        User user5 = new User("Yura");
        User user6 = new User("Bodya");
        User user7 = new User("Andriy");

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

