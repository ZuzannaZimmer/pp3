public class FolderTest {
    public static void main(String[] args) {

        // tworze folder
        Folder folder = new Folder("Folder1");

        // sposob aggregation (niezależne od siebie)
        // File f = new File("f2");
        // folder.addFile(f);

        // sposob composition (jeden nie może istnież bez drugiego)
        folder.addFile("f1");

        System.out.println(folder);
    }
}
