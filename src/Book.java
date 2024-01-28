public class Book extends ReadingItem{
    private String isbn;
    private String edition;
    private String title;

    public void setEdition(String e) {
        edition = e;
    }

    public void setIsbn(String i) {
        isbn = i;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getEdition() {
        return edition;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
}
