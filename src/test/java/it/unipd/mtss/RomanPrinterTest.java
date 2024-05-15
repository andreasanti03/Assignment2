////////////////////////////////////////////////////////////////////
// ANDREA SANTI 2084624
// FRANCESCO POZZOBON 2075513
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {
    @Before
    public void checkPrintZero(){
        String var0 = "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n";
        assertEquals(var0, RomanPrinter.print(0));
    }

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
        String var4 = " ___  __     __ \n" +
                "|_ _| \\ \\   / / \n" +
                " | |   \\ \\ / /  \n" +
                " | |    \\ V /   \n" +
                "|___|    \\_/    \n";
        String var5 = "__     __ \n" +
                "\\ \\   / / \n" +
                " \\ \\ / /  \n" +
                "  \\ V /   \n" +
                "   \\_/    \n";
        String var6 = "__     __  ___  \n" +
                "\\ \\   / / |_ _| \n" +
                " \\ \\ / /   | |  \n" +
                "  \\ V /    | |  \n" +
                "   \\_/    |___| \n";
        assertEquals(var4, RomanPrinter.print(4));
        assertEquals(var5, RomanPrinter.print(5));
        assertEquals(var6, RomanPrinter.print(6));
    }

    @Test
    public void checkPrintPrimiDieci(){
        String var7 = "__     __  ___   ___  \n" +
                "\\ \\   / / |_ _| |_ _| \n" +
                " \\ \\ / /   | |   | |  \n" +
                "  \\ V /    | |   | |  \n" +
                "   \\_/    |___| |___| \n";
        String var8 = "__     __  ___   ___   ___  \n" +
                "\\ \\   / / |_ _| |_ _| |_ _| \n" +
                " \\ \\ / /   | |   | |   | |  \n" +
                "  \\ V /    | |   | |   | |  \n" +
                "   \\_/    |___| |___| |___| \n";
        String var9 = " ___  __  __ \n" +
                "|_ _| \\ \\/ / \n" +
                " | |   \\  /  \n" +
                " | |   /  \\  \n" +
                "|___| /_/\\_\\ \n";
        String var10 = "__  __ \n" +
                "\\ \\/ / \n" +
                " \\  /  \n" +
                " /  \\  \n" +
                "/_/\\_\\ \n";
        assertEquals(var7, RomanPrinter.print(7));
        assertEquals(var8, RomanPrinter.print(8));
        assertEquals(var9, RomanPrinter.print(9));
        assertEquals(var10, RomanPrinter.print(10));
    }

    @Test
    public void checkPrintPrimiVenti(){
        String var13 = "__  __  ___   ___   ___  \n" +
                "\\ \\/ / |_ _| |_ _| |_ _| \n" +
                " \\  /   | |   | |   | |  \n" +
                " /  \\   | |   | |   | |  \n" +
                "/_/\\_\\ |___| |___| |___| \n";
        String var15 = "__  __ __     __ \n" +
                "\\ \\/ / \\ \\   / / \n" +
                " \\  /   \\ \\ / /  \n" +
                " /  \\    \\ V /   \n" +
                "/_/\\_\\    \\_/    \n";
        String var17 = "__  __ __     __  ___   ___  \n" +
                "\\ \\/ / \\ \\   / / |_ _| |_ _| \n" +
                " \\  /   \\ \\ / /   | |   | |  \n" +
                " /  \\    \\ V /    | |   | |  \n" +
                "/_/\\_\\    \\_/    |___| |___| \n";
        String var19 = "__  __  ___  __  __ \n" +
                "\\ \\/ / |_ _| \\ \\/ / \n" +
                " \\  /   | |   \\  /  \n" +
                " /  \\   | |   /  \\  \n" +
                "/_/\\_\\ |___| /_/\\_\\ \n";
        String var20 = "__  __ __  __ \n" +
                "\\ \\/ / \\ \\/ / \n" +
                " \\  /   \\  /  \n" +
                " /  \\   /  \\  \n" +
                "/_/\\_\\ /_/\\_\\ \n";
        assertEquals(var13, RomanPrinter.print(13));
        assertEquals(var15, RomanPrinter.print(15));
        assertEquals(var17, RomanPrinter.print(17));
        assertEquals(var19, RomanPrinter.print(19));
        assertEquals(var20, RomanPrinter.print(20));
    }
    @Test
    public void checkPrintPrimiCinquanta(){
        String var21 = "__  __ __  __  ___  \n" +
                "\\ \\/ / \\ \\/ / |_ _| \n" +
                " \\  /   \\  /   | |  \n" +
                " /  \\   /  \\   | |  \n" +
                "/_/\\_\\ /_/\\_\\ |___| \n";
        String var25 = "__  __ __  __ __     __ \n" +
                "\\ \\/ / \\ \\/ / \\ \\   / / \n" +
                " \\  /   \\  /   \\ \\ / /  \n" +
                " /  \\   /  \\    \\ V /   \n" +
                "/_/\\_\\ /_/\\_\\    \\_/    \n";
        String var32 = "__  __ __  __ __  __  ___   ___  \n" +
                "\\ \\/ / \\ \\/ / \\ \\/ / |_ _| |_ _| \n" +
                " \\  /   \\  /   \\  /   | |   | |  \n" +
                " /  \\   /  \\   /  \\   | |   | |  \n" +
                "/_/\\_\\ /_/\\_\\ /_/\\_\\ |___| |___| \n";
        String var37 = "__  __ __  __ __  __ __     __  ___   ___  \n" +
                "\\ \\/ / \\ \\/ / \\ \\/ / \\ \\   / / |_ _| |_ _| \n" +
                " \\  /   \\  /   \\  /   \\ \\ / /   | |   | |  \n" +
                " /  \\   /  \\   /  \\    \\ V /    | |   | |  \n" +
                "/_/\\_\\ /_/\\_\\ /_/\\_\\    \\_/    |___| |___| \n";
        String var46 = "__  __  _      __     __  ___  \n" +
                "\\ \\/ / | |     \\ \\   / / |_ _| \n" +
                " \\  /  | |      \\ \\ / /   | |  \n" +
                " /  \\  | |___    \\ V /    | |  \n" +
                "/_/\\_\\ |_____|    \\_/    |___| \n";
        String var49 = "__  __  _       ___  __  __ \n" +
                "\\ \\/ / | |     |_ _| \\ \\/ / \n" +
                " \\  /  | |      | |   \\  /  \n" +
                " /  \\  | |___   | |   /  \\  \n" +
                "/_/\\_\\ |_____| |___| /_/\\_\\ \n";
        String var50 = " _      \n" +
                "| |     \n" +
                "| |     \n" +
                "| |___  \n" +
                "|_____| \n";

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
        String var51 =" _       ___  \n" +
                "| |     |_ _| \n" +
                "| |      | |  \n" +
                "| |___   | |  \n" +
                "|_____| |___| \n";
        String var57 =" _      __     __  ___   ___  \n" +
                "| |     \\ \\   / / |_ _| |_ _| \n" +
                "| |      \\ \\ / /   | |   | |  \n" +
                "| |___    \\ V /    | |   | |  \n" +
                "|_____|    \\_/    |___| |___| \n";
        String var62 =" _      __  __  ___   ___  \n" +
                "| |     \\ \\/ / |_ _| |_ _| \n" +
                "| |      \\  /   | |   | |  \n" +
                "| |___   /  \\   | |   | |  \n" +
                "|_____| /_/\\_\\ |___| |___| \n";
        String var68 =" _      __  __ __     __  ___   ___   ___  \n" +
                "| |     \\ \\/ / \\ \\   / / |_ _| |_ _| |_ _| \n" +
                "| |      \\  /   \\ \\ / /   | |   | |   | |  \n" +
                "| |___   /  \\    \\ V /    | |   | |   | |  \n" +
                "|_____| /_/\\_\\    \\_/    |___| |___| |___| \n";
        String var70 =" _      __  __ __  __ \n" +
                "| |     \\ \\/ / \\ \\/ / \n" +
                "| |      \\  /   \\  /  \n" +
                "| |___   /  \\   /  \\  \n" +
                "|_____| /_/\\_\\ /_/\\_\\ \n";
        String var73 =" _      __  __ __  __  ___   ___   ___  \n" +
                "| |     \\ \\/ / \\ \\/ / |_ _| |_ _| |_ _| \n" +
                "| |      \\  /   \\  /   | |   | |   | |  \n" +
                "| |___   /  \\   /  \\   | |   | |   | |  \n" +
                "|_____| /_/\\_\\ /_/\\_\\ |___| |___| |___| \n";
        String var84 =" _      __  __ __  __ __  __  ___  __     __ \n" +
                "| |     \\ \\/ / \\ \\/ / \\ \\/ / |_ _| \\ \\   / / \n" +
                "| |      \\  /   \\  /   \\  /   | |   \\ \\ / /  \n" +
                "| |___   /  \\   /  \\   /  \\   | |    \\ V /   \n" +
                "|_____| /_/\\_\\ /_/\\_\\ /_/\\_\\ |___|    \\_/    \n";
        String var86 =" _      __  __ __  __ __  __ __     __  ___  \n" +
                "| |     \\ \\/ / \\ \\/ / \\ \\/ / \\ \\   / / |_ _| \n" +
                "| |      \\  /   \\  /   \\  /   \\ \\ / /   | |  \n" +
                "| |___   /  \\   /  \\   /  \\    \\ V /    | |  \n" +
                "|_____| /_/\\_\\ /_/\\_\\ /_/\\_\\    \\_/    |___| \n";
        String var95 ="__  __   ____  __     __ \n" +
                "\\ \\/ /  / ___| \\ \\   / / \n" +
                " \\  /  | |      \\ \\ / /  \n" +
                " /  \\  | |___    \\ V /   \n" +
                "/_/\\_\\  \\____|    \\_/    \n";
        String var99 ="__  __   ____   ___  __  __ \n" +
                "\\ \\/ /  / ___| |_ _| \\ \\/ / \n" +
                " \\  /  | |      | |   \\  /  \n" +
                " /  \\  | |___   | |   /  \\  \n" +
                "/_/\\_\\  \\____| |___| /_/\\_\\ \n";

        assertEquals(var51, RomanPrinter.print(51));
        assertEquals(var57, RomanPrinter.print(57));
        assertEquals(var62, RomanPrinter.print(62));
        assertEquals(var68, RomanPrinter.print(68));
        assertEquals(var70, RomanPrinter.print(70));
        assertEquals(var73, RomanPrinter.print(73));
        assertEquals(var84, RomanPrinter.print(84));
        assertEquals(var86, RomanPrinter.print(86));
        assertEquals(var95, RomanPrinter.print(95));
        assertEquals(var99, RomanPrinter.print(99));

    }

    @Test
    public void checkPrintPrimiCinquecento() {
        String var101 = "  ____   ___  \n" +
                " / ___| |_ _| \n" +
                "| |      | |  \n" +
                "| |___   | |  \n" +
                " \\____| |___| \n";
        String var167 = "  ____   _      __  __ __     __  ___   ___  \n" +
                " / ___| | |     \\ \\/ / \\ \\   / / |_ _| |_ _| \n" +
                "| |     | |      \\  /   \\ \\ / /   | |   | |  \n" +
                "| |___  | |___   /  \\    \\ V /    | |   | |  \n" +
                " \\____| |_____| /_/\\_\\    \\_/    |___| |___| \n";
        String var180 = "  ____   _      __  __ __  __ __  __ \n" +
                " / ___| | |     \\ \\/ / \\ \\/ / \\ \\/ / \n" +
                "| |     | |      \\  /   \\  /   \\  /  \n" +
                "| |___  | |___   /  \\   /  \\   /  \\  \n" +
                " \\____| |_____| /_/\\_\\ /_/\\_\\ /_/\\_\\ \n";
        String var190 = "  ____  __  __   ____  \n" +
                " / ___| \\ \\/ /  / ___| \n" +
                "| |      \\  /  | |     \n" +
                "| |___   /  \\  | |___  \n" +
                " \\____| /_/\\_\\  \\____| \n";
        String var211 = "  ____    ____  __  __  ___  \n" +
                " / ___|  / ___| \\ \\/ / |_ _| \n" +
                "| |     | |      \\  /   | |  \n" +
                "| |___  | |___   /  \\   | |  \n" +
                " \\____|  \\____| /_/\\_\\ |___| \n";
        String var245 = "  ____    ____  __  __  _      __     __ \n" +
                " / ___|  / ___| \\ \\/ / | |     \\ \\   / / \n" +
                "| |     | |      \\  /  | |      \\ \\ / /  \n" +
                "| |___  | |___   /  \\  | |___    \\ V /   \n" +
                " \\____|  \\____| /_/\\_\\ |_____|    \\_/    \n";
        String var328 = "  ____    ____    ____  __  __ __  __ __     __  ___   ___   ___  \n" +
                " / ___|  / ___|  / ___| \\ \\/ / \\ \\/ / \\ \\   / / |_ _| |_ _| |_ _| \n" +
                "| |     | |     | |      \\  /   \\  /   \\ \\ / /   | |   | |   | |  \n" +
                "| |___  | |___  | |___   /  \\   /  \\    \\ V /    | |   | |   | |  \n" +
                " \\____|  \\____|  \\____| /_/\\_\\ /_/\\_\\    \\_/    |___| |___| |___| \n";
        String var342 = "  ____    ____    ____  __  __  _       ___   ___  \n" +
                " / ___|  / ___|  / ___| \\ \\/ / | |     |_ _| |_ _| \n" +
                "| |     | |     | |      \\  /  | |      | |   | |  \n" +
                "| |___  | |___  | |___   /  \\  | |___   | |   | |  \n" +
                " \\____|  \\____|  \\____| /_/\\_\\ |_____| |___| |___| \n";
        String var399 = "  ____    ____    ____  __  __   ____   ___  __  __ \n" +
                " / ___|  / ___|  / ___| \\ \\/ /  / ___| |_ _| \\ \\/ / \n" +
                "| |     | |     | |      \\  /  | |      | |   \\  /  \n" +
                "| |___  | |___  | |___   /  \\  | |___   | |   /  \\  \n" +
                " \\____|  \\____|  \\____| /_/\\_\\  \\____| |___| /_/\\_\\ \n";
        String var400 = "  ____   ____   \n" +
                " / ___| |  _ \\  \n" +
                "| |     | | | | \n" +
                "| |___  | |_| | \n" +
                " \\____| |____/  \n";
        String var433 = "  ____   ____   __  __ __  __ __  __  ___   ___   ___  \n" +
                " / ___| |  _ \\  \\ \\/ / \\ \\/ / \\ \\/ / |_ _| |_ _| |_ _| \n" +
                "| |     | | | |  \\  /   \\  /   \\  /   | |   | |   | |  \n" +
                "| |___  | |_| |  /  \\   /  \\   /  \\   | |   | |   | |  \n" +
                " \\____| |____/  /_/\\_\\ /_/\\_\\ /_/\\_\\ |___| |___| |___| \n";
        String var451 = "  ____   ____    _       ___  \n" +
                " / ___| |  _ \\  | |     |_ _| \n" +
                "| |     | | | | | |      | |  \n" +
                "| |___  | |_| | | |___   | |  \n" +
                " \\____| |____/  |_____| |___| \n";
        String var477 = "  ____   ____    _      __  __ __  __ __     __  ___   ___  \n" +
                " / ___| |  _ \\  | |     \\ \\/ / \\ \\/ / \\ \\   / / |_ _| |_ _| \n" +
                "| |     | | | | | |      \\  /   \\  /   \\ \\ / /   | |   | |  \n" +
                "| |___  | |_| | | |___   /  \\   /  \\    \\ V /    | |   | |  \n" +
                " \\____| |____/  |_____| /_/\\_\\ /_/\\_\\    \\_/    |___| |___| \n";

        assertEquals(var101, RomanPrinter.print(101));
        assertEquals(var167, RomanPrinter.print(167));
        assertEquals(var180, RomanPrinter.print(180));
        assertEquals(var190, RomanPrinter.print(190));
        assertEquals(var211, RomanPrinter.print(211));
        assertEquals(var245, RomanPrinter.print(245));
        assertEquals(var328, RomanPrinter.print(328));
        assertEquals(var342, RomanPrinter.print(342));
        assertEquals(var399, RomanPrinter.print(399));
        assertEquals(var400, RomanPrinter.print(400));
        assertEquals(var433, RomanPrinter.print(433));
        assertEquals(var451, RomanPrinter.print(451));
        assertEquals(var477, RomanPrinter.print(477));
    }

    @Test
    public void checkPrintPrimiMille() {
        String var501 = " ____    ___  \n" +
                "|  _ \\  |_ _| \n" +
                "| | | |  | |  \n" +
                "| |_| |  | |  \n" +
                "|____/  |___| \n";
        String var529 = " ____   __  __ __  __  ___  __  __ \n" +
                "|  _ \\  \\ \\/ / \\ \\/ / |_ _| \\ \\/ / \n" +
                "| | | |  \\  /   \\  /   | |   \\  /  \n" +
                "| |_| |  /  \\   /  \\   | |   /  \\  \n" +
                "|____/  /_/\\_\\ /_/\\_\\ |___| /_/\\_\\ \n";
        String var612 = " ____     ____  __  __  ___   ___  \n" +
                "|  _ \\   / ___| \\ \\/ / |_ _| |_ _| \n" +
                "| | | | | |      \\  /   | |   | |  \n" +
                "| |_| | | |___   /  \\   | |   | |  \n" +
                "|____/   \\____| /_/\\_\\ |___| |___| \n";
        String var625 = " ____     ____  __  __ __  __ __     __ \n" +
                "|  _ \\   / ___| \\ \\/ / \\ \\/ / \\ \\   / / \n" +
                "| | | | | |      \\  /   \\  /   \\ \\ / /  \n" +
                "| |_| | | |___   /  \\   /  \\    \\ V /   \n" +
                "|____/   \\____| /_/\\_\\ /_/\\_\\    \\_/    \n";
        String var736 = " ____     ____    ____  __  __ __  __ __  __ __     __  ___  \n" +
                "|  _ \\   / ___|  / ___| \\ \\/ / \\ \\/ / \\ \\/ / \\ \\   / / |_ _| \n" +
                "| | | | | |     | |      \\  /   \\  /   \\  /   \\ \\ / /   | |  \n" +
                "| |_| | | |___  | |___   /  \\   /  \\   /  \\    \\ V /    | |  \n" +
                "|____/   \\____|  \\____| /_/\\_\\ /_/\\_\\ /_/\\_\\    \\_/    |___| \n";
        String var754 = " ____     ____    ____   _       ___  __     __ \n" +
                "|  _ \\   / ___|  / ___| | |     |_ _| \\ \\   / / \n" +
                "| | | | | |     | |     | |      | |   \\ \\ / /  \n" +
                "| |_| | | |___  | |___  | |___   | |    \\ V /   \n" +
                "|____/   \\____|  \\____| |_____| |___|    \\_/    \n";
        String var846 = " ____     ____    ____    ____  __  __  _      __     __  ___  \n" +
                "|  _ \\   / ___|  / ___|  / ___| \\ \\/ / | |     \\ \\   / / |_ _| \n" +
                "| | | | | |     | |     | |      \\  /  | |      \\ \\ / /   | |  \n" +
                "| |_| | | |___  | |___  | |___   /  \\  | |___    \\ V /    | |  \n" +
                "|____/   \\____|  \\____|  \\____| /_/\\_\\ |_____|    \\_/    |___| \n";
        String var868 = " ____     ____    ____    ____   _      __  __ __     __  ___   ___   ___  \n" +
                "|  _ \\   / ___|  / ___|  / ___| | |     \\ \\/ / \\ \\   / / |_ _| |_ _| |_ _| \n" +
                "| | | | | |     | |     | |     | |      \\  /   \\ \\ / /   | |   | |   | |  \n" +
                "| |_| | | |___  | |___  | |___  | |___   /  \\    \\ V /    | |   | |   | |  \n" +
                "|____/   \\____|  \\____|  \\____| |_____| /_/\\_\\    \\_/    |___| |___| |___| \n";
        String var983 = "  ____   __  __   _      __  __ __  __ __  __  ___   ___   ___  \n" +
                " / ___| |  \\/  | | |     \\ \\/ / \\ \\/ / \\ \\/ / |_ _| |_ _| |_ _| \n" +
                "| |     | |\\/| | | |      \\  /   \\  /   \\  /   | |   | |   | |  \n" +
                "| |___  | |  | | | |___   /  \\   /  \\   /  \\   | |   | |   | |  \n" +
                " \\____| |_|  |_| |_____| /_/\\_\\ /_/\\_\\ /_/\\_\\ |___| |___| |___| \n";
        String var999 = "  ____   __  __  __  __   ____   ___  __  __ \n" +
                " / ___| |  \\/  | \\ \\/ /  / ___| |_ _| \\ \\/ / \n" +
                "| |     | |\\/| |  \\  /  | |      | |   \\  /  \n" +
                "| |___  | |  | |  /  \\  | |___   | |   /  \\  \n" +
                " \\____| |_|  |_| /_/\\_\\  \\____| |___| /_/\\_\\ \n";

        assertEquals(var501, RomanPrinter.print(501));
        assertEquals(var529, RomanPrinter.print(529));
        assertEquals(var612, RomanPrinter.print(612));
        assertEquals(var625, RomanPrinter.print(625));
        assertEquals(var736, RomanPrinter.print(736));
        assertEquals(var754, RomanPrinter.print(754));
        assertEquals(var846, RomanPrinter.print(846));
        assertEquals(var868, RomanPrinter.print(868));
        assertEquals(var983, RomanPrinter.print(983));
        assertEquals(var999, RomanPrinter.print(999));
    }
}
