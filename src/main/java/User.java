public class User {
    private String name;
    private Message[] messages;
    private int messageCount;

    public User(String name) {
        this.name = name;
        this.messages = new Message[200000];
    }

    public String getName() {
        return name;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public void sendMessage(User to, String text, String date, String time) {
        Message newMessage = new Message(text, this, to, date, time);
        if (messageCount < messages.length) {
            messages[messageCount] = newMessage;
            messageCount++;
        } else {
            System.out.println("Массив сообщений для " + name + " переполнен.");
        }

        to.receiveMessage(newMessage);

    }


    public void sendGroupMessage(Group group, String text, String date, String time) {
        Message message = new Message(text, this, null, date, time);
        group.addMessage(message);
    }

    public void sendChannelMessage(Chanel chanel, String text, String date, String time) {
        if (chanel.getCreator() != this) {
            System.out.println("Только создатель канала может писать!");
            return;
        }
        Message message = new Message(text, this, null, date, time);
        chanel.addMessage(message);
    }

    public void receiveMessage(Message message) {
        if (messageCount < messages.length) {
            messages[messageCount] = message;
            messageCount++;
        }
    }

    public Message[] getMessages() {
        return messages;
    }


}
