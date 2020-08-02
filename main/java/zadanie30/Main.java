package zadanie30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) throws IOException {

        Path resourceDirectory = Paths.get("src", "main", "resources");
        System.out.println(resourceDirectory);
        System.out.println(resourceDirectory.toAbsolutePath());
        System.out.println(resourceDirectory.toFile().exists());
        System.out.println(resourceDirectory.toFile().isDirectory());

        Path ourFile = resourceDirectory.resolve("newText");
        System.out.println(ourFile);
        System.out.println(ourFile.toAbsolutePath());
        System.out.println(ourFile.toFile().exists());
        System.out.println(ourFile.toFile().isDirectory());

        String content = Files.readString(ourFile);
        System.out.println(content);

        StringBuilder reversedString = new StringBuilder();
        for (int i = content.length() - 1; i >= 0; i--) {
            reversedString.append(content.charAt(i));
        }

        Files.write(resourceDirectory.resolve("reversedText"), reversedString.toString().getBytes(), StandardOpenOption.CREATE);


    }
}
