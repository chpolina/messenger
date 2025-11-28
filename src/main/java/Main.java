public class Main {
    public static void main(String[] args) {

        User polina = new User("Полина");
        User asilya = new User("Асиля");
        User kate = new User("Катя");

        polina.sendMessage(asilya, "Привет! Как дела?","21.10.2025", "11:02");
        asilya.sendMessage(polina, "Привет, все отлично, спасибо.", "21.10.2025","11:10");
        polina.sendMessage(kate, "Встречаемся же в 5?", "21.10.2025", "11:11");


        User[] allUsers = {polina, asilya, kate};
        for (User user : allUsers) {
            System.out.println(user.getName());
        }
        System.out.println();

        System.out.println("Сообщения Полины:");
        Message[] polinaMessages = polina.getMessages();
        for (int i = 0; i < polina.getMessageCount(); i++) {
            System.out.println(polinaMessages[i]);
        }
        System.out.println();

        System.out.println("Сообщения Асили:");
        Message[] asilyaMessages = asilya.getMessages();
        for (int i = 0; i < asilya.getMessageCount(); i++) {
            System.out.println(asilyaMessages[i]);
        }
        System.out.println();

        System.out.println("Сообщения Кати:");
        Message[] kateMessages = kate.getMessages();
        for (int i = 0; i < kate.getMessageCount(); i++) {
            System.out.println(kateMessages[i]);
        }
        System.out.println();
    }
}
