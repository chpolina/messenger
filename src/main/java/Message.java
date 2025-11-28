public class Message {
    private String message;
    private User from;
    private User to;
    private String date;
    private String time;

    public Message(String message, User from, User to, String date, String time) {
        this.message = message;
        this.from = from;
        this.to = to;
        this.date = date;
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public User getFrom() {
        return from;
    }

    public User getTo() {
        return to;
    }

    public String getDate() {
        return date;
    }

    public String toString() {
        return "Отправитель: " + from.getName() +
                ". Получатель: " + to.getName() +
                ". Дата: " + date + ". Текст: " + message +
                " Время: " + time;
    }
}
