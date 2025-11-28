public class Group {
    private String name;
    private User[] users;
    private User admin;
    private Message[] groupMessages = new Message[200000];
    private int messageCount = 0;

    public Group(String name, User admin) {
        this.name = name;
        this.admin = admin;
        this.users = new User[10];
        this.users[0] = admin;
    }

    public String getName() {
        return name;
    }

    public User getAdmin() {
        return admin;
    }

    public void addUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                return;
            }
        }
        expandArray();
        addUser(user);
    }

    private void expandArray() {
        User[] newArray = new User[users.length * 2];
        for (int i = 0; i < users.length; i++) {
            newArray[i] = users[i];
        }
        users = newArray;
    }

    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == user) {
                users[i] = null;
                return;
            }
        }
    }

    public void addMessage(Message message) {
        if (messageCount < groupMessages.length) {
            groupMessages[messageCount] = message;
            messageCount++;
        }
    }

    public Message[] getMessages() {
        return groupMessages;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public User[] getUsers() {
        return users;
    }
}