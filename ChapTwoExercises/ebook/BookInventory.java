import java.util.Collections;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class BookInventory {
    ArrayList<Book> inventory;

    public BookInventory(ArrayList<Book> arrList, String typeCopy) {
        typeCopy = typeCopy.toLowerCase();
        inventory = new ArrayList<>(arrList.size());

        if (typeCopy.equals("shallow")) {
            inventory.addAll(arrList);
        } else if (typeCopy.equals("deep")) {
            for (Book book : arrList) {
                inventory.add(new Book(book));
            }           
        } else {
            throw new IllegalArgumentException("TypeCopy must be 'shallow' or 'deep'");
        }
    }
    public BookInventory(Book[] bookArray) {
        this();
        Collections.addAll(inventory, bookArray);
    }
    public BookInventory(Book book) {
        this();
        inventory.add(book);
    }
    public BookInventory() {
        inventory = new ArrayList<>(5);
        inventory.add(new BookE("User Manual", 2025, "Shahaam Sid",
        15, "App Guide", true, 1, 1, "PDF", 1.5));
    }


    public boolean contains(Book book) {
        return inventory.contains(book);
    }
    public int getIndex() {
        return inventory.size();
    }
    public int getIndex(Book book) {
        int i = inventory.indexOf(book);

        if (i == -1) {
            throw new NoSuchElementException("Book not in Inventory");
        }
        return i;
    }
    public void addBook(Book book) {
        inventory.add(book);
    }
    public void addBook(Book book, int index) {
        if (index < 0 || index > inventory.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0-" + inventory.size());
        }
        inventory.add(index, book);
    }
    public String summary() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Book book : inventory) {
            sb.append(i);
            sb.append(". ");
            sb.append(book.getBookName());
            sb.append(" | ");
            sb.append(book.getAuthName());
            sb.append("\n");
            i++;
        }

        return sb.toString();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Book book : inventory) {
            sb.append(book);
            sb.append("\n\n");
        }

        return sb.toString();
    }
}