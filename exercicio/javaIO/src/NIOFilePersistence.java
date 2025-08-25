import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Arrays;


public class NIOFilePersistence extends Diretorio implements FilePersistence{

    protected NIOFilePersistence(String fileName) throws IOException {
        super(fileName);
        var file = new File(currentDir + storeDir);
        if (!file.exists() && !file.mkdirs()) throw new IOException("Erro ao criar arquivo");
        clearFile();
    }


    @Override
    public String write(String data) throws IOException {
        try(var file = new RandomAccessFile(new File(currentDir + storeDir + fileName), "rw")){
            file.seek(file.length());
            file.writeBytes(data);
            file.writeBytes(System.lineSeparator());
        }catch (IOException e){
            e.printStackTrace();
        }
       return null;
    }

    @Override
    public boolean remove(String sentence) throws IOException {
        var content = findAll();
        var contentList = Arrays.stream(content.split(System.lineSeparator())).toList();

        if (contentList.stream().noneMatch(c -> c.contains(sentence))) return false;

        try (var writer = new BufferedWriter(new FileWriter(currentDir + storeDir + fileName))) {
            for (String line : contentList) {
                if (!line.contains(sentence)) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        }

        return true;
    }

    @Override
    public String replace(final String oldContent, final String newContent) throws IOException {
        return null;
    }



    @Override
    public String findAll() {
        var content = new StringBuilder();
        try (
                var file = new RandomAccessFile(
                        new File(currentDir + storeDir + fileName), "r"
                );
                var channel = file.getChannel()
        ) {
            var buffer = ByteBuffer.allocate(256);
            var bytesReader = channel.read(buffer);
            while (bytesReader != -1) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    content.append((char) buffer.get());
                }
                buffer.clear();
                bytesReader = channel.read(buffer);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return content.toString();
    }

    @Override
    public String findBy(String sentence) throws IOException {
        var content =  new StringBuilder();
        try (var file = new RandomAccessFile(new File(currentDir + storeDir + fileName), "r"); var channel = file.getChannel()){
            var buffer = ByteBuffer.allocate(256);
            var byteReader = channel.read(buffer);
            while (byteReader != -1){
                buffer.flip();
                while (buffer.hasRemaining()){
                    content.append((char) buffer.get());
                }
                buffer.clear();
                byteReader = channel.read(buffer);
            }
        }
        return content.toString();
    }
}
