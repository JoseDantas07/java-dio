import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.stream.Stream;

public class IOFilePersistence extends Diretorio implements FilePersistence {

    public IOFilePersistence(String fileName) throws IOException {
        super(fileName);
        var file = new File(currentDir + storeDir);
        if (!file.exists() && !file.mkdirs()) throw new IOException("Erro ao criar arquivo");
        clearFile();
    }


    @Override
    public String write(String data) throws IOException {
        try(
                var fileWritter = new FileWriter(currentDir + storeDir + fileName, true);
                var buffereWritter = new BufferedWriter(fileWritter);
                var printWritter = new PrintWriter(buffereWritter)
        ){
            printWritter.println(data);
        }
        return data;
    }

    @Override
    public boolean remove(String sentence) throws IOException {
        var content = findAll();
        var contentList = new ArrayList<>(Stream.of(content.split(System.lineSeparator())).toList());

        if (contentList.stream().noneMatch(c -> c.contains(sentence))) return false;
        clearFile();

        try (var writer = new BufferedWriter(new FileWriter(currentDir + storeDir + fileName))) {
            contentList.stream().filter(c -> !c.contains(sentence)).forEach(line -> {
                        try { writer.write(line + System.lineSeparator()); }
                        catch (IOException e) { e.printStackTrace(); }
            });
        }
        return true;
    }

    @Override
    public String replace(String oldContent, String newContent) throws IOException {
        var contentList = new ArrayList<>(Stream.of(findAll().split(System.lineSeparator())).toList());
        boolean found = false;
        try (var writer = new BufferedWriter(new FileWriter(currentDir + storeDir + fileName))) {
            for (String line : contentList) {
                if (line.contains(oldContent)) {
                    line = line.replace(oldContent, newContent);
                    found = true;
                }
                writer.write(line);
                writer.newLine();
            }
        }
        return found ? newContent : "";
    }


    @Override
    public String findAll() {
        var content = new StringBuilder();
        try(var reader = new BufferedReader(new FileReader(currentDir + storeDir + fileName))){
            String line;
            do {
                line = reader.readLine();
                if (line != null) content.append(line).append(System.lineSeparator());
            }while (line != null);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        return content.toString();
    }

    @Override
    public String findBy(String sentence) {
        var found = "";
        try(var reader = new BufferedReader(new FileReader(currentDir + storeDir + fileName))){
            String line = reader.readLine();
            while (line != null){
                if ((line.contains(sentence))) {
                    found = line;
                    break;
                }
                line = reader.readLine();
            }


        }catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sentence;
    }
}
