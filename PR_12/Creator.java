package PR_12;

import java.util.ArrayList;
import java.util.List;

public class Creator implements Observable {
    private String nickname;
    private int postCount;
    private List<Observer> subscribers;

    public Creator(String nickname) {
        this.nickname = nickname;
        this.postCount = 0;
        this.subscribers = new ArrayList<>();
    }

    public void createPost() {
        postCount++;
        System.out.println(nickname + " виклав(ла) новий пост! Загальна кількість постів: " + postCount);
        notifySubscribers();
    }

    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (Observer observer : subscribers) {
            observer.update(nickname, postCount);
        }
    }

    public int getSubscriberCount() {
        return subscribers.size();
    }

    public String getNickname() {
        return nickname;
    }

    public int getPostCount() {
        return postCount;
    }
}
