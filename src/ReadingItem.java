public class ReadingItem extends CISItem{
    private int wordCount;
    private String datePublished;
    private String author;

    public int getWordCount(){
        return wordCount;
    }

    public String getDatePublished(){
        return datePublished;
    }

    public String getAuthor(){
        return author;
    }

    public void setWordCount(int w){
        wordCount = w;
    }

    public void setDatePublished(String d){
        datePublished = d;
    }

    public void setAuthor(String a){
        author = a;
    }
}
