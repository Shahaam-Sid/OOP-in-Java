public class BookE extends Book {
    protected static int indexEB = 0;
    protected String format;
    protected double size;


    public BookE(String nameOfBook, String nameOfAuthor) {
        this(nameOfBook, 2000, nameOfAuthor,
            1, "",false, 1,
            1, "PDF", 0.1);
    }
    public BookE(Book book, String formatType, double sizeOccupies) {
        this(book.bookName, book.releaseYear, book.authorName, book.pages,
            book.gen, book.isOriginal, book.edition, book.parts,
            formatType, sizeOccupies
        );
    }
    public BookE(String nameOfBook, int yearOfRelease,
        String nameOfAuthor, int noOfPages, String genre,
        boolean orginality, int noOfEditions, int noOfParts,
        String formatType, double sizeOccupies) {
            
            super(nameOfBook, yearOfRelease, nameOfAuthor, noOfPages,
                genre, orginality, noOfEditions, noOfParts);
            
            checkNotNull(formatType, "Format Type");
            checkFormatType(formatType);

            checkSize(sizeOccupies);
            
            format = formatType;
            size = sizeOccupies;

            indexEB++;
    }


    public void setFormat(String formatType) {
        checkNotNull(formatType, "Format Type");
        checkFormatType(formatType);

        format = formatType;
    }
    public void setSize(double sizeOccupies) {
        checkSize(sizeOccupies);

        size = sizeOccupies;
    }
    public static void setIndex(int count) {
        checkNegativeInt(count, "Index");
        indexEB = count;
    }
    
    
    public String getFormat() {return format;}
    public double getSize() {return size;}
    public static int getIndex() {return indexEB;}


    @Override
    public String toString() {
        return super.toString() + "\n" + 
        "Format: " + format + "    Size: " + size + "mb";
    }
    public static String allowedFormats() {
        return "Allowed Formats: {PDF, EPUB, AZW, OTHER}";
    }


    private static void checkFormatType(String formatType) {
        formatType = formatType.toUpperCase();
        if (!(formatType.equals("PDF") || formatType.equals("EPUB") ||
        formatType.equals("AZW") || formatType.equals("OTHER"))){
            
            throw new IllegalArgumentException("Format must be from {PDF, EPUB, AZW, OTHER}");
        }
    }
    private static void checkSize(double s) {
        if (s <= 0) {
            throw new IllegalArgumentException("Size cannot be Negative");
        }
    }
}