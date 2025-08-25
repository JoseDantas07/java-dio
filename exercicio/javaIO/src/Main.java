import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       var filePersistence = new NIOFilePersistence("user.cvs");
        filePersistence.write("feio");
    }
}
