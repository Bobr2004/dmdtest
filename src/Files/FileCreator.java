package Files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class FileCreator {
    final static String FILENAME = "bob.txt";
    public static void main(String[] args) throws IOException {
        String desktopPath = System.getProperty("user.home") + File.separator +"Desktop";
        for (int i = 0; i <100  ; i++) {
            Path.of(desktopPath + File.separator + "bob%d.txt".formatted(i)).toFile().createNewFile();
        }
    }
}
