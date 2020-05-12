package eu.gebes.writingBot;

import java.util.Scanner;

public class Unicode {

    static class Converter {
        public String charToUnicodeString(char c) {
            final String unicode = Integer.toHexString(c).toUpperCase();
            return "U+" + ("0".repeat(4 - unicode.length())) + unicode;
        }
    }

    public void execute() {

        Converter converter = new Converter();

        printHeader();
        printLinebreak();

        boolean exit = false;
        while (!exit) {

            System.out.print(" Enter a String to convert in Unicode or press enter to exit\n  > ");
            String input = new Scanner(System.in).nextLine();


            if (input.isEmpty()) {
                input = "Bye";
                exit = true;
            }

            for (char c : input.toCharArray())
                System.out.println("\t" + c + ": " + converter.charToUnicodeString(c));

            printLinebreak();

        }
    }

    private void printHeader() {
        System.out.println();
        System.out.println("\tUnicodeConverter");
        System.out.println("\t\tv1.0");
        System.out.println();
    }

    private void printLinebreak() {
        System.out.println("-" + "=-".repeat(48));
    }

}
