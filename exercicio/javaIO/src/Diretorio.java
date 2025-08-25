import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public abstract class Diretorio {
    protected final String currentDir = System.getProperty("user.dir");
    protected final String storeDir = "/exercicio/javaIo/src/" ;
    protected final String fileName;

    protected Diretorio(String fileName) {
        this.fileName = fileName;
    }

    protected void clearFile(){
        try (OutputStream outputStream = new FileOutputStream(currentDir + storeDir + fileName)){
            System.out.println("Criando arquivo" + currentDir + storeDir + fileName );
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
