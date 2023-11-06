public class Book {
    private String title;
    private int pages;

    public Book(String title){
        this.title = title;
    }

    public void setPages(int x){
        if (x>=0){
            this.pages = x;
        }
    }
    public int getPages(){
        return this.pages;
    }
}
