public class Ebook extends Book{
    private String fileName;


    public Ebook(String name, String city, String title,  String fileName,int year,Writer author) {
        super(name, city, title, year,author);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public void display(){
        System.out.printf("\n\nTytuł książki: %s\nAutor: %s %s %s\nNazwa ebooka: %s\nwydawca: %s %s\nrok wydania: %d",title,author.getNameW(), author.getSurnameW(), author.getGenre(),fileName,name,city,year);
    }

    
}
