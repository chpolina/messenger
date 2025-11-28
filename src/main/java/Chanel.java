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
        for (int i = 0; i < subscribers.length; i++) {
            if (subscribers[i] == null) {
                subscribers[i] = user;
                return;
            }
        }
        expandArray();
        addUser(user);
    }

    private void expandArray() {
        User[] newArray = new User[subscribers.length * 2];
        for (int i = 0; i < subscribers.length; i++) {
            newArray[i] = subscribers[i];
        }
        subscribers = newArray;
    }

    public void removeUser(User user) {
        for (int i = 0; i < subscribers.length; i++) {
            if (subscribers[i] == user) {
                subscribers[i] = null;
                return;
            }
        }
    }

    public void addMessage(Message message) {
        if (messageCount < channelMessages.length) {
            channelMessages[messageCount] = message;
            messageCount++;
        }
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

