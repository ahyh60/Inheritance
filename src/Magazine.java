public class Magazine extends ReadingItem{
    private String coverStoryTitle;
    private String printDate;


    public String getCoverStoryTitle(){
        return coverStoryTitle;
    }

    public void setCoverStoryTitle(String s){
        coverStoryTitle = s;
    }

    public String getPrintDate(){
        return printDate;
    }

    public void setPrintDate(String p){
        printDate = p;
    }


}
