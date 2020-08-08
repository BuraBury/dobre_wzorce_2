package zadanie33;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        ImageSearcher imageSearcher = new ImageSearcher();

        System.out.println(
                imageSearcher.getImages(
                        Paths.get("src", "main", "resources", "zad33")));

        System.out.println(imageSearcher.getImagesWithWalk(Paths.get("src", "main", "resources", "zad33")));

    }
}
