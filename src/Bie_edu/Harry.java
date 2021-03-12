package Bie_edu;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit1
 * @class Harry
 * @since 12.03.2021 - 16.04
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Harry {

    public static void main(String[] args) throws IOException {


        String text = new String(Files.readAllBytes(Paths.get("G:/harry.txt")));


        text = text.replaceAll("[^A-Za-z ']", "");

        String[] words = text.split(" ");

        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }
        String[] distincts = stringOfDistincts.split(" ");

        for (int i = 0; i < distincts.length; i++) {
            if (distincts[i].startsWith("'")) {
                distincts[i] = distincts[i].substring(1);
                // cleaning from extra apostrophes
            }
        }

        Arrays.sort(distincts);

        for (int i = 0; i < 100; i++) {
            System.out.println(distincts[i]);
        }


    }
}
