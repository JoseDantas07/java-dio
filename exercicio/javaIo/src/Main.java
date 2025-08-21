import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FilePersistence filePersistence = new IOFilePersistence("user.cvs");
    }
}
