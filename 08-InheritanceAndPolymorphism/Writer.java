public class Writer {
    protected String nameW;
    protected String surnameW;
    protected String genre;
    
    public Writer(String nameW, String surnameW, String genre) {
        this.nameW = nameW;
        this.surnameW = surnameW;
        this.genre = genre;
    }

    public String getNameW() {
        return nameW;
    }

    public void setNameW(String nameW) {
        this.nameW = nameW;
    }

    public String getSurnameW() {
        return surnameW;
    }

    public void setSurnameW(String surnameW) {
        this.surnameW = surnameW;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}
