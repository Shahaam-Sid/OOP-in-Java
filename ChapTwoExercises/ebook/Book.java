public class Book {
    protected  static int index = 0;
    protected String bookName;
    protected int releaseYear;
    protected String authorName;
    protected int pages;
    protected boolean isOriginal;
    protected int edition;
    protected int parts;
    protected String gen;

    public Book(Book book) {
        this(book.bookName, book.releaseYear, book.authorName, book.pages, book.gen,
            book.isOriginal, book.edition, book.parts);
    }
    public Book(String nameOfBook, String nameOfAuthor) {
        this(nameOfBook, 2000, nameOfAuthor,
            1, "",false, 1,
            1);
    }
    public Book(String nameOfBook, int yearOfRelease,
        String nameOfAuthor, int noOfPages, String genre,
        boolean orginality, int noOfEditions, int noOfParts) {

            checkNotNull(nameOfBook, "Book Name");
            checkStringLength(nameOfBook);

            checkYearValidity(yearOfRelease);

            checkNotNull(nameOfAuthor, "Author Name");
            checkStringLength(nameOfAuthor);
            checkStringIsAlpha(nameOfAuthor);

            checkNegativeInt(noOfPages, "Pages");

            checkNotNull(genre, "Genre");
            checkStringLength(genre);
            checkStringIsAlpha(genre);

            checkNegativeInt(noOfEditions, "Edition");

            checkNegativeInt(noOfParts, "Parts");
            

            bookName = nameOfBook;
            releaseYear = yearOfRelease;
            authorName = nameOfAuthor;
            pages = noOfPages;
            gen = genre;
            isOriginal = orginality;
            edition = noOfEditions;
            parts = noOfParts;

            if (this.getClass() == Book.class) {
                index++;
            }
        }


    public void setBookName(String nameOfBook) {
        checkNotNull(nameOfBook, "Book Name");
        checkStringLength(nameOfBook);        
        bookName = nameOfBook;
    }
    public void setReleaseYear(int yearOfRelease) {
        checkYearValidity(yearOfRelease);
        releaseYear = yearOfRelease;
    }
    public void setAuthName(String nameOfAuthor) {
        checkNotNull(nameOfAuthor, "Author Name");
        checkStringLength(nameOfAuthor);
        checkStringIsAlpha(nameOfAuthor);
        authorName = nameOfAuthor;
    }
    public void setPages(int noOfPages) {
        checkNegativeInt(noOfPages, "Pages");
        pages = noOfPages;
    }
    public void setGenre(String genre) {
        checkNotNull(genre, "Genre");
        checkStringLength(genre);
        checkStringIsAlpha(genre);

        gen = genre;
    }
    public void setEdition(int noOfEditions) {
        checkNegativeInt(noOfEditions, "Edition");
        edition = noOfEditions;
    }
    public void setPart(int noOfParts) {
        checkNegativeInt(noOfParts, "Parts");
        parts = noOfParts;
    }
    public static void setIndex(int count) {
        checkNegativeInt(count, "Index");
        index = count;
    }


    public String getBookName() {return bookName;}
    public int getReleaseYear() {return releaseYear;}
    public String getAuthName() {return authorName;}
    public int getPages() {return pages;}
    public String getGenre() {return gen;}
    public int getEdition() {return edition;}
    public int getParts() {return parts;}
    public static int getIndex() {return index;}



    @Override
    public String toString() {
        return "Book: " + bookName + "    Author: " + authorName + "\n" + 
        "Genre: " + gen + "    Year Released: " + releaseYear + "\n" +  
        "Pages: " + pages + "    Edition: " + edition + "    Parts: " + parts;
    }

    
    protected static void checkNegativeInt(int n, String fieldName) {
        if (n < 1) {
            throw new IllegalArgumentException(fieldName + " must be atleast 1");
        }
    }
    protected static void checkStringLength(String n) {
        if (n.length() < 3 || n.length() > 25) {
            throw new IllegalArgumentException(n + " is not between 3-25 characters");
        }
    }
    protected static void checkStringIsAlpha(String n) {
        if (!(n.matches("[a-zA-Z ]+"))) {
            throw new IllegalArgumentException("Author Name must only contain Alphabets and Spaces");
        }
    }
    private static void checkYearValidity(int n) {
        if (n < 1450 || n > 2100) {
            throw new IllegalArgumentException("Invalid Date");
        }
    }
    protected static void checkNotNull(String value, String fieldName) {
    if (value == null) {
        throw new IllegalArgumentException(fieldName + " cannot be null");
        }
    }   
}