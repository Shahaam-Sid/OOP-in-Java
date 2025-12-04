public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("The Anarchy", 2019,
        "William Dalrymple", 522,
        "History", true,
        1, 1);

        BookE eb1 = new BookE(b1, "PDF", 2.5);

        AudioBook ab1 = new AudioBook(eb1, 56580, "William Dalrymple");

        System.out.println(eb1.toString());
        System.out.println(ab1.toString());

        System.out.println(Book.getIndex());
        System.out.println(BookE.getIndex());
        System.out.println(AudioBook.getIndex());
    }
}