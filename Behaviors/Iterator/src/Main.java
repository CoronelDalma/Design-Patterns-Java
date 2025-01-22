//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();

        book.add("123");
        book.add("124");
        book.add("125");
        book.add("126");
        book.add("127");
        book.add("128");

        IIterator iterator = new PhonebookIterator(book);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}