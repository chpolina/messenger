public class Chanel {
    private String name;
    private User creator;
    private User[] subscribers;
    private Message[] channelMessages = new Message[200000];
    private int messageCount = 0;

    public Chanel(String name, User creator) {
        this.name = name;
        this.creator = creator;
        this.subscribers = new User[10];
        this.subscribers[0] = creator;
    }

    public String getName() {
        return name;
    }

    public User getCreator() {
        return creator;
    }

    public void addUser(User user) {

    }

    private void expandArray() {

    }

    public void removeUser(User user) {

    }

    public void addMessage(Message message) {

    }

    public Message[] getMessages() {
        return channelMessages;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public User[] getSubscribers() {
        return subscribers;
    }
}