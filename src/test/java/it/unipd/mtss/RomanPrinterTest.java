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

    @Test
    public void checkPrintPrimiCento() {
        String var51 =" _     ___ \n" +
                "| |   |_ _|\n" +
                "| |    | | \n" +
                "| |___ | | \n" +
                "|_____|___|";
        String var57 =" _ __     _____ ___ \n" +
                "| |\\ \\   / /_ _|_ _|\n" +
                "| | \\ \\ / / | | | | \n" +
                "| |__\\ V /  | | | | \n" +
                "|_____\\_/  |___|___|";
        String var62 =" _    __  _____ ___ \n" +
                "| |   \\ \\/ /_ _|_ _|\n" +
                "| |    \\  / | | | | \n" +
                "| |___ /  \\ | | | | \n" +
                "|_____/_/\\_\\___|___|";
        String var68 =" _    __  ____     _____ ___ ___ \n" +
                "| |   \\ \\/ /\\ \\   / /_ _|_ _|_ _|\n" +
                "| |    \\  /  \\ \\ / / | | | | | | \n" +
                "| |___ /  \\   \\ V /  | | | | | | \n" +
                "|_____/_/\\_\\   \\_/  |___|___|___|";
        String var70 =" _    __  ____     _____ ___ ___ \n" +
                "| |   \\ \\/ /\\ \\   / /_ _|_ _|_ _|\n" +
                "| |    \\  /  \\ \\ / / | | | | | | \n" +
                "| |___ /  \\   \\ V /  | | | | | | \n" +
                "|_____/_/\\_\\   \\_/  |___|___|___|";
        String var73 =" _    __  ____  _____ ___ ___ \n" +
                "| |   \\ \\/ /\\ \\/ /_ _|_ _|_ _|\n" +
                "| |    \\  /  \\  / | | | | | | \n" +
                "| |___ /  \\  /  \\ | | | | | | \n" +
                "|_____/_/\\_\\/_/\\_\\___|___|___|";
        String var84 =" _    __  ____  ____  _______     __\n" +
                "| |   \\ \\/ /\\ \\/ /\\ \\/ /_ _\\ \\   / /\n" +
                "| |    \\  /  \\  /  \\  / | | \\ \\ / / \n" +
                "| |___ /  \\  /  \\  /  \\ | |  \\ V /  \n" +
                "|_____/_/\\_\\/_/\\_\\/_/\\_\\___|  \\_/   ";
        String var86 =" _    __  ____  ____  ____     _____ \n" +
                "| |   \\ \\/ /\\ \\/ /\\ \\/ /\\ \\   / /_ _|\n" +
                "| |    \\  /  \\  /  \\  /  \\ \\ / / | | \n" +
                "| |___ /  \\  /  \\  /  \\   \\ V /  | | \n" +
                "|_____/_/\\_\\/_/\\_\\/_/\\_\\   \\_/  |___|";
        String var95 ="__  ________     __\n" +
                "\\ \\/ / ___\\ \\   / /\n" +
                " \\  / |    \\ \\ / / \n" +
                " /  \\ |___  \\ V /  \n" +
                "/_/\\_\\____|  \\_/   ";
        String var99 ="__  ______ _____  __\n" +
                "\\ \\/ / ___|_ _\\ \\/ /\n" +
                " \\  / |    | | \\  / \n" +
                " /  \\ |___ | | /  \\ \n" +
                "/_/\\_\\____|___/_/\\_\\";

        assertEquals(var51, RomanPrinter.print(51));
        assertEquals(var57, RomanPrinter.print(57));
        assertEquals(var62, RomanPrinter.print(62));
        assertEquals(var68, RomanPrinter.print(68));
        assertEquals(var70, RomanPrinter.print(70));
        assertEquals(var73, RomanPrinter.print(73));
        assertEquals(var84, RomanPrinter.print(84));
        assertEquals(var86, RomanPrinter.print(86));
        assertEquals(var95, RomanPrinter.print(99));

    }
}
