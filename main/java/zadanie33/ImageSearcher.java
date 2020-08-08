package zadanie33;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImageSearcher {


    public List<File> getImages(Path inputDirectory) {

        List<File> images = new ArrayList<>();
        File inputFile = inputDirectory.toFile();

        if (inputFile.isDirectory()) {
            for (File file : inputDirectory.toFile().listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.toLowerCase().endsWith(".png") || name.toLowerCase().endsWith(".jpg");
                }
            })) {

                images.add(file);
            }
        }
        return images;
    }

    public List<File> getImagesWithWalk(Path inputDirectory) throws IOException {
        Stream<Path> pathStream = Files.walk(inputDirectory);
        return Files
                .walk(inputDirectory)
                .map(Path::toFile)
                .filter(file -> file.getName().endsWith(".png") || file.getName().endsWith(".jpg"))
                .collect(Collectors.toList());
    }
}
