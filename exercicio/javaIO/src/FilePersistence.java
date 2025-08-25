import java.io.IOException;

public interface FilePersistence {
    String write(final String data) throws IOException;
    boolean remove(final String sentence) throws IOException;
    String replace(final String oldContent,final String newContent) throws IOException;
    String findAll();
    String findBy(final String sentence) throws IOException;
}