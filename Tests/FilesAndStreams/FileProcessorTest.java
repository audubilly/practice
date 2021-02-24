package FilesAndStreams;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {
    String filePath;

    @BeforeEach
    void setUp() {
        filePath = "c:/Files& Streams ClassWork/classwork files";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isValidPathWithNullPath(){
        assertThrows(FileNotFoundException.class, () -> FileProcessor.isValidPath(null));
    }

    @Test
    void printFileDetailsWithEmptyPath(){
        assertThrows(FileNotFoundException.class,
                () -> FileProcessor.isValidPath(" "));
    }

    @Test
    public  void isValidPath(){
        try {
            boolean result = FileProcessor.isValidPath(filePath);
            assertTrue(result);
        }catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Test
    void getFileName(){
        try{
            String fileName = " classwork files";
            String name = FileProcessor.getFileName(filePath);
            assertNotNull(name);
            assertEquals(fileName,name);
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }

    }


    @Test
    void playWithFileSystem(){
        FileSystem defaultFileSystem = FileSystems.getDefault();
        assertNotNull(defaultFileSystem);
        Iterable<Path> rootDirectories = defaultFileSystem.getRootDirectories();
        Iterator<Path> directories = rootDirectories.iterator();
        while(directories.hasNext()){
            System.out.println(directories.next());
        }

        directories = rootDirectories.iterator();
        Path cDrive = directories.next();
        assertNotNull(cDrive);
        try{
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(cDrive);
            for(Path aPath : directoryStream){
                if(Files.isDirectory(aPath) && !Files.isHidden(aPath)){
                    System.out.println(aPath);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    void createFile() throws FileNotFoundException {
        Formatter fileFormat = new Formatter("classwork files");
    }




    @Test
    void readFile(){
        String filename = "c:/Files& Streams ClassWork/classwork files";
        Path filePath = Paths.get(filename);
        assertNotNull(filePath);
        assertTrue(Files.exists(filePath));
        try(Scanner input = new Scanner(filePath)){

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
