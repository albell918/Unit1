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
//
//        AAAAAAAAAARGH
//        ALBUS
//        ALL
//        ALLEY
//        ALLOWED
//        AM
//        AND
//        ANYTHING
//        AT
//        Aaah
//        Aargh
//        Abbott
//        Abou'
//        About
//        Absolutely
//        According
//        Adalbert
//        Add
//        Adrian
//        Africa
//        African
//        After
//        Against
//        Ages
//        Agrippa
//        Ah
//        Aha
//        Ahead
//        Ahem
//        Ahern
//        Alas
//        Alberic
//        Albus
//        Algie
//        Alicia
//        All
//        Alley
//        Alohomora
//        Although
//        Always
//        Am
//        An'
//        And
//        Angelina
//        Another
//        AntiCheating
//        AntiDark
//        Anyone
//        Anythin'
//        Anything
//        Anyway
//        Apothecary
//        Are
//        Aren't
//        Argus
//        Around
//        Arsenius
//        Arts
//        As
//        Asked
//        Astronomy
//        At
//        Ate
//        Atta
//        August
//        Aunt
//        Auntie
//        BC
//        BED
//        BEHIND
//        BELIEVE
//        BOOKS
//        BOOM
//        BOY
//        BREAKIN
//        BROOMSTICKS
//        Back
//        Bad
//        Bagshot
//        Bane
//        Bane'll
//        Barking
//        Barn
//        Baron'll
//        Baron's
//        Barrels
//        Bars
//        Baruffio
//        Bathilda
//        Bbbut
//        Bbut
//        Beans
//        Beasts
//        Beaters
//        Beats
//        Because
//        Bedroom
//        Beechwood
//        Before
//        Befuddle
//
//        Process finished with exit code 0
