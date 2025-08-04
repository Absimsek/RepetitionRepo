package JUL2025.JUL22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) throws IOException {

        //Example 1: write a code that prints the text inside specified file
        Files.lines(Paths.get("src/AUG2025/AUG22/LambdaTextFile.txt")).forEach(System.out::println);

        //Example 2: write a code that prints the text inside specified file with Upper Case letters
        Files.lines(Paths.get("src/AUG2025/AUG22/LambdaTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        //Example 3: check if there is any "get" word inside specified file
        boolean result1 = Files.lines(Paths.get("src/AUG2025/AUG22/LambdaTextFile.txt")).anyMatch(t -> t.contains("get"));
        System.out.println(result1);

        //Example 4: find the words that are distinct in a file and return them in a list
        List<String> words = Files.lines(Paths.get("src/AUG2025/AUG22/LambdaTextFile.txt")).
                map(t -> t.replaceAll("\\p{Punct}", "").split(" ")).
                flatMap(Arrays::stream).
                distinct().collect(Collectors.toList());

        System.out.println(words);
    }
}
