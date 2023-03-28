package BT1_copyFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) throws IOException {

        File source = new File("CSV/src/BT2_fileReaderWriter/data.csv");
        File dest = new File("CSV/src/BT1_copyFile/copydata.csv");

        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Copy complete!");
    }
}
