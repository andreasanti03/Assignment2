////////////////////////////////////////////////////////////////////
// ANDREA SANTI 2084624
// FRANCESCO POZZOBON 2075513
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {
    @Test
    public void checkPrintPrimiTre(){
        String var1 = " ___  \n" +
                "|_ _| \n" +
                " | |  \n" +
                " | |  \n" +
                "|___| \n";
        String var2 = " ___   ___  \n" +
                "|_ _| |_ _| \n" +
                " | |   | |  \n" +
                " | |   | |  \n" +
                "|___| |___| \n";
        String var3 = " ___   ___   ___  \n" +
                "|_ _| |_ _| |_ _| \n" +
                " | |   | |   | |  \n" +
                " | |   | |   | |  \n" +
                "|___| |___| |___| \n";
        assertEquals(var1, RomanPrinter.print(1));
        assertEquals(var2, RomanPrinter.print(2));
        assertEquals(var3, RomanPrinter.print(3));
    }

    @Test
    public void checkPrintPrimiSei(){
        String var4 = " _____     __\n" +
                "|_ _\\ \\   / /\n" +
                " | | \\ \\ / / \n" +
                " | |  \\ V /  \n" +
                "|___|  \\_/   \n";
        String var5 = "__     __\n" +
                "\\ \\   / /\n" +
                " \\ \\ / / \n" +
                "  \\ V /  \n" +
                "   \\_/   \n";
        String var6 = "__     _____ \n" +
                "\\ \\   / /_ _|\n" +
                " \\ \\ / / | | \n" +
                "  \\ V /  | | \n" +
                "   \\_/  |___|\n";
        assertEquals(var4, RomanPrinter.print(4));
        assertEquals(var5, RomanPrinter.print(5));
        assertEquals(var6, RomanPrinter.print(6));
    }
}