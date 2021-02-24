package FilesAndStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessor {

    public static boolean isValidPath(String filepath) throws FileNotFoundException{
        boolean result = true;
        String empty = " ";
        if(filepath == null || filepath.equalsIgnoreCase(empty)){
            throw new FileNotFoundException("please provide file path");
        }

        Path thePath = Paths.get(filepath);
        if(!Files.exists(thePath)){
            throw new FileNotFoundException("Cannot find the path");
        }
        return result;

    }

    public  static  String getFileName(String path) throws FileNotFoundException{
        String name = "";
        if(isValidPath(path)){
            Path filePath = Paths.get(path);
            name = filePath.getFileName().toString();
        }
        return name;
    }



}
