public class Message {
    private String message;
    private User from;
    private User to;
    private String date;
    private String time;
    private String receiver;

    public Message(String message, User from, User to, String date, String time) {
        this.message = message;
        this.from = from;
        this.date = date;
        this.time = time;
        if (to != null) {
            this.receiver = to.getName();
        } else {
            this.receiver = "Участники";
        }
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
                ". Получатель: " + receiver +
                ". Дата: " + date + ". Текст: " + message +
                " Время: " + time;
    }
}