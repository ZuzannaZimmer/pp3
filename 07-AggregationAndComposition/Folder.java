public class Folder {
    private int size;
    private String nameFolder;
    private String address;
    private String created;
    private File file;

    public Folder(String name) {
        this.nameFolder = name;
    }

    // zależne od siebie composition
    // public void addFile(String name) {
    // file = new File(name);

    // }

    // niezależne od siebie aggregation
    public void addFile(File file) {
        this.file = file;

    }

    public void deleteFile() {
        file = null;
    }

    public void setName(String name) {
        this.nameFolder = name;

    }

    public void changeAddress(String address) {
        this.address = address;

    }

    public void deleteFolder(String name) {
        this.nameFolder = null;
    }

    public void addFolder(String name) {

    }

    @Override
    public String toString() {
        String s = "Nazwa folderu: " + nameFolder;
        s += " Nazwa pliku: " + file.getName();
        return s;
    }

}