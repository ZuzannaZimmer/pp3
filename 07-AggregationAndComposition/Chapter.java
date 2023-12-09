public class Chapter {
    private String chTitle;
    private int numPages;
    private int numFirstPage;

    public Chapter(String chTitle, int numPages, int numFirstPage) {
        this.chTitle = chTitle;
        this.numPages = numPages;
        this.numFirstPage = numFirstPage;
    }

    public void setchTitle(String chTitle) {
        this.chTitle = chTitle;
    }

    public String getchTitle() {
        return chTitle;
    }

    public void setnumPages(int n) {
        this.numPages = n;
    }

    public int getnumPages() {
        return numPages;
    }

    public void setnumFirstPage(int m) {
        this.numFirstPage = m;
    }

    public int getnumFirstPage() {
        return numFirstPage;
    }

}
