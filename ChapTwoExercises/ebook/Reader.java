public class Reader {
    BookInventory eContainer;

    public Reader() {
        eContainer = new BookInventory();
    }

    public void Buy(Book book) {
        eContainer.addBook(book);
    }
    public void Sell(Book book) {
        eContainer.removeBook(book);
    }
    public int totalItems() {
        return eContainer.getIndex();
    }
    public String summary() {
        return eContainer.summary();
    }
    @Override
    public String toString() {
        StringBuilder sb =  new StringBuilder();
        sb.append("No. of Books: ");
        int i = eContainer.getIndex();
        sb.append(i);
        sb.append("\n\n");
        sb.append(eContainer.toString());

        return sb.toString();

    }
}
