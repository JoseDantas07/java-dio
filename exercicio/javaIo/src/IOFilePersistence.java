import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOFilePersistence implements FilePersistence{

    private final String currentDir = System.getProperty("user.dir");
    private final String storeDir = "/exercicio/javaIo/src/";
    private final String fileName;

    public IOFilePersistence(String fileName) throws IOException {
        this.fileName = fileName;
        var file = new File(currentDir + storeDir);
        if (!file.exists() && !file.mkdirs()){
            throw new IOException("Erro ao criar arquivo");
        }

        clearFile();
    }

    @Override
    public String write(String data) {
        return "";
    }

    @Override
    public boolean remove(String sentence) {
        return false;
    }

    @Override
    public String replace(String oldContent, String newContent) {
        return "";
    }

    @Override
    public String findAll() {
        return "";
    }

    @Override
    public String findBy(String sentence) {
        return "";
    }

    private void clearFile(){
        try {
            OutputStream outputStream = new FileOutputStream(new File(currentDir + storeDir + fileName));
            outputStream.close();
            System.out.println("Criando arquivo" + currentDir + storeDir + fileName );
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
