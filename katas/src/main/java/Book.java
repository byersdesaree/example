public class Book {
    private String title;
    private String author;
    private boolean isCheckedOut;

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public boolean getisCheckedOut(){
        return this.isCheckedOut;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setCheckedOut(boolean isCheckedOut){
        this.isCheckedOut = isCheckedOut;
    }

    public Book(String title, String author, boolean isCheckedOut){
        this.title = title;
        this.author = author;
        this.isCheckedOut = isCheckedOut;
    }
}
