public class Main {
    public static void main(String[] args) {
        
        AudioBook audio1 = new AudioBook("Quicksilver", 2024,
        "Callie Hart", 624, "Romance", true,
        1, 1, 74460, "Stella Brown");
        
        BookE electronic1 = new BookE("The Anarchy", 2019,
        "William Dalrymple", 522, "History", true,
        1, 1, "pdf", 5.4);

        Book book = new Book("Saif ul Maslool", 1898,
        "Sanaullah Panipatti", 538, "Islamic",
        true, 1, 1);

        Book[] arrBook = {audio1, book, electronic1};

        BookInventory invOne = new BookInventory(arrBook);

        BookE electronic2 = new BookE("Tale of Two Cities", 1859,
        "Charles Dickens", 392, "Historical Fiction",
        true, 1, 1, "azw", 55740);

        invOne.removeBook(0);
        invOne.removeBook(electronic1);
        invOne.removeAll();
        System.out.println(invOne.summary());

    }
}