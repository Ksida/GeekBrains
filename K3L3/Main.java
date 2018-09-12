package K3L3;

public class Main {

    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();

        book.add("Ваня", "12345");
        book.add("Петя", "23451");
        book.add("Коля", "34512");
        book.add("Коля", "45123");
        book.add("Саша", "51234");

        System.out.println("Коля:" + book.get("Коля"));
    }
}
