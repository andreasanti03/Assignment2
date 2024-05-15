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

    @Test
    public void checkPrintPrimiDieci(){
        String var7 = "__     _____ ___ \n" +
                "\\ \\   / /_ _|_ _|\n" +
                " \\ \\ / / | | | | \n" +
                "  \\ V /  | | | | \n" +
                "   \\_/  |___|___|\n";
        String var8 = "__     _____ ___ ___ \n" +
                "\\ \\   / /_ _|_ _|_ _|\n" +
                " \\ \\ / / | | | | | | \n" +
                "  \\ V /  | | | | | | \n" +
                "   \\_/  |___|___|___|\n";
        String var9 = "_____  __\n" +
                "|_ _\\ \\/ /\n" +
                " | | \\  / \n" +
                " | | /  \\ \n" +
                "|___/_/\\_\\\n";
        String var10 = "__  __\n" +
                "\\ \\/ /\n" +
                " \\  / \n" +
                " /  \\ \n" +
                "/_/\\_\\\n";
        assertEquals(var7, RomanPrinter.print(7));
        assertEquals(var8, RomanPrinter.print(8));
        assertEquals(var9, RomanPrinter.print(9));
        assertEquals(var10, RomanPrinter.print(10));
    }

    @Test
    public void checkPrintPrimiVenti(){
        String var13 = "__  _____ ___ ___ \n" +
                "\\ \\/ /_ _|_ _|_ _|\n" +
                " \\  / | | | | | | \n" +
                " /  \\ | | | | | | \n" +
                "/_/\\_\\___|___|___|\n";
        String var15 = "__  ____     __\n" +
                "\\ \\/ /\\ \\   / /\n" +
                " \\  /  \\ \\ / / \n" +
                " /  \\   \\ V /  \n" +
                "/_/\\_\\   \\_/   \n";
        String var17 = "__  ____     _____ ___ \n" +
                "\\ \\/ /\\ \\   / /_ _|_ _|\n" +
                " \\  /  \\ \\ / / | | | | \n" +
                " /  \\   \\ V /  | | | | \n" +
                "/_/\\_\\   \\_/  |___|___|\n";
        String var19 = "__  _______  __\n" +
                "\\ \\/ /_ _\\ \\/ /\n" +
                " \\  / | | \\  / \n" +
                " /  \\ | | /  \\ \n" +
                "/_/\\_\\___/_/\\_\\\n";
        String var20 = "__  ____  __\n" +
                "\\ \\/ /\\ \\/ /\n" +
                " \\  /  \\  / \n" +
                " /  \\  /  \\ \n" +
                "/_/\\_\\/_/\\_\\\n";
        assertEquals(var13, RomanPrinter.print(13));
        assertEquals(var15, RomanPrinter.print(15));
        assertEquals(var17, RomanPrinter.print(17));
        assertEquals(var19, RomanPrinter.print(19));
        assertEquals(var20, RomanPrinter.print(20));
    }
}