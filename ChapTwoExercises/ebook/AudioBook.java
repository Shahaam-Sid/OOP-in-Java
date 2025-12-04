public class AudioBook extends Book {
    protected static int indexAB = 0;
    protected int duration = 1;
    protected String voice;

    public AudioBook(String nameOfBook, String nameOfAuthor) {
        
        this(nameOfBook, 2000, nameOfAuthor,
            1, "",false, 1,
            1, 1,"Generic Male");
    }
    public AudioBook(Book book, int durationSeconds, String narrator) {
        
        this(book.bookName, book.releaseYear, book.authorName, book.pages,
            book.gen, book.isOriginal, book.edition, book.parts, durationSeconds, narrator);
    }
    public AudioBook(String nameOfBook, int yearOfRelease,
        String nameOfAuthor, int noOfPages, String genre,
        boolean orginality, int noOfEditions, int noOfParts,
        int durationSeconds, String narrator) {
            
        super(nameOfBook, yearOfRelease, nameOfAuthor, noOfPages,
            genre, orginality, noOfEditions, noOfParts);

        checkNotNull(narrator, "Narrator");
        checkStringLength(narrator);
        checkStringIsAlpha(narrator);

        checkNegativeInt(durationSeconds, "Duration");

        duration = durationSeconds;
        voice = narrator;
        
        indexAB++;
    }


    public void setNarrator(String narrator) {
        checkNotNull(narrator, "Narrator");
        checkStringLength(narrator);
        checkStringIsAlpha(narrator);

        voice = narrator;
    }
    public void setDuration(int durationSeconds) {
        checkNegativeInt(durationSeconds, "Duration");

        duration = durationSeconds;
    }
    public static void setIndex(int count) {
        checkNegativeInt(count, "Index");
        indexAB = count;
    }


    public String getNarrator() {return voice;}
    public int getDuration() {return duration;}
    public static int getIndex() {return indexAB;}

    @Override
    public String toString() {
        return super.toString() + "\n" + 
        "Narrator: " + voice + "    Duration: " + duration + "s";
    }
}