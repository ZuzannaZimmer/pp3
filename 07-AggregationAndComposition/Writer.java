public class Writer {
    private String name;
    private String surname;
    private int booksnum;

    public Writer(String name, String surname, int booksnum){
        this.name=name;
        this.surname=surname;
        this.booksnum=booksnum;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBooksnum(int booksnum) {
        this.booksnum = booksnum;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBooksnum() {
        return booksnum;
    }

    
}
