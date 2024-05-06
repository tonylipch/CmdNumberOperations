import com.anton.Main;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMain {


    @Test
    void testReadItemsFromFile() throws IOException {
        String fileName = "testFile.txt";
        String fileContent = "1\n2\n3\n4\n5\n";

        createTestFile(fileName, fileContent);

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> actual = Main.readItemsFromFile(fileName);

        assertEquals(expected, actual);
    }


    @Test
    void testReadItemsFromConsole() {
        String input = "1\n2\n3\n4\n5\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> actual = Main.readItemsFromConsole(5);

        assertEquals(expected, actual);
    }

    @Test
    void testProcessNumbersOddNumbers() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 3, 5);

        List<Integer> actual = Main.processNumbers(input);

        assertEquals(expected, actual);
    }

    @Test
    void testProcessNumbersEvenNumbers() {
        List<Integer> input = Arrays.asList(1, 7, 3, 5);
        List<Integer> expected = Arrays.asList();

        List<Integer> actual = Main.processNumbers(input);

        assertEquals(expected, actual);
    }

    @Test
    void testProcessNumbersEvenNumbers1() {
        List<Integer> input = Arrays.asList(1, 8, 3, 5);
        List<Integer> expected = Arrays.asList(8);

        List<Integer> actual = Main.processNumbers(input);

        assertEquals(expected, actual);
    }







    private void createTestFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            // If an error occurs while creating the file, throw the exception further
            throw new IOException("Failed to create test file: " + e.getMessage());
        }
    }

}
