public class FolderTest {
    public static void main(String[] args) {
        File f = new File("f2");
        Folder folder = new Folder("Folder1");
        // folder.addFile("f1");
        folder.addFile(f);
        System.out.println(folder);
    }
}
