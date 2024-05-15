////////////////////////////////////////////////////////////////////
// ANDREA SANTI 2084624
// FRANCESCO POZZOBON 2075513
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {
    @Test
    public void checkPrintPrimiCinquanta(){
        String var21 = "__  ____  _____ \n" +
                "\\ \\/ /\\ \\/ /_ _|\n" +
                " \\  /  \\  / | | \n" +
                " /  \\  /  \\ | | \n" +
                "/_/\\_\\/_/\\_\\___|";
        String var25 = "__  ____  ____     __\n" +
                "\\ \\/ /\\ \\/ /\\ \\   / /\n" +
                " \\  /  \\  /  \\ \\ / / \n" +
                " /  \\  /  \\   \\ V /  \n" +
                "/_/\\_\\/_/\\_\\   \\_/   ";
        String var32 = "__  ____  ____  _____ ___ \n" +
                "\\ \\/ /\\ \\/ /\\ \\/ /_ _|_ _|\n" +
                " \\  /  \\  /  \\  / | | | | \n" +
                " /  \\  /  \\  /  \\ | | | | \n" +
                "/_/\\_\\/_/\\_\\/_/\\_\\___|___|";
        String var37 = "__  ____  ____  ____     _____ ___ \n" +
                "\\ \\/ /\\ \\/ /\\ \\/ /\\ \\   / /_ _|_ _|\n" +
                " \\  /  \\  /  \\  /  \\ \\ / / | | | | \n" +
                " /  \\  /  \\  /  \\   \\ V /  | | | | \n" +
                "/_/\\_\\/_/\\_\\/_/\\_\\   \\_/  |___|___|";
        String var46 = "__  ___ __     _____ \n" +
                "\\ \\/ / |\\ \\   / /_ _|\n" +
                " \\  /| | \\ \\ / / | | \n" +
                " /  \\| |__\\ V /  | | \n" +
                "/_/\\_\\_____\\_/  |___|";
        String var49 = "__  ___     _____  __\n" +
                "\\ \\/ / |   |_ _\\ \\/ /\n" +
                " \\  /| |    | | \\  / \n" +
                " /  \\| |___ | | /  \\ \n" +
                "/_/\\_\\_____|___/_/\\_\\";
        String var50 = " _     \n" +
                "| |    \n" +
                "| |    \n" +
                "| |___ \n" +
                "|_____|";

        assertEquals(var21, RomanPrinter.print(21));
        assertEquals(var25, RomanPrinter.print(25));
        assertEquals(var32, RomanPrinter.print(32));
        assertEquals(var37, RomanPrinter.print(37));
        assertEquals(var46, RomanPrinter.print(46));
        assertEquals(var49, RomanPrinter.print(49));
        assertEquals(var50, RomanPrinter.print(50));
    }
}
