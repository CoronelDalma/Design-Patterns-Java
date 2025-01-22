public class PhonebookIterator implements IIterator{
    private PhoneBook book;
    private int pos;

    public PhonebookIterator(PhoneBook book) {
        this.book = book;
    }

    @Override
    public String next() {
        return this.book.getPhones().get(pos++);
    }

    @Override
    public boolean hasNext() {
        return this.pos < this.book.getPhones().size()
                && this.book.getPhones().get(this.pos) != null;
    }
}
