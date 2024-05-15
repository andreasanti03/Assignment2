////////////////////////////////////////////////////////////////////
// ANDREA SANTI 2084624
// FRANCESCO POZZOBON 2075513
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String I = " ___ \n" +
                "|_ _|\n" +
                " | | \n" +
                " | | \n" +
                "|___|";
        String[] i = I.split("\n");
        String V = "__     __\n" +
                "\\ \\   / /\n" +
                " \\ \\ / / \n" +
                "  \\ V /  \n" +
                "   \\_/   ";
        String[] v = V.split("\n");
        String X = "__  __\n" +
                "\\ \\/ /\n" +
                " \\  / \n" +
                " /  \\ \n" +
                "/_/\\_\\";
        String[] x = X.split("\n");
        String L = " _     \n" +
                "| |    \n" +
                "| |    \n" +
                "| |___ \n" +
                "|_____|";
        String[] l = L.split("\n");
        String C = "  ____ \n" +
                " / ___|\n" +
                "| |    \n" +
                "| |___ \n" +
                " \\____|";
        String[] c = C.split("\n");
        String D = " ____  \n" +
                "|  _ \\ \n" +
                "| | | |\n" +
                "| |_| |\n" +
                "|____/ ";
        String[] d = D.split("\n");
        String M = " __  __ \n" +
                "|  \\/  |\n" +
                "| |\\/| |\n" +
                "| |  | |\n" +
                "|_|  |_|";
        String[] m = M.split("\n");
        String out = "";
        char[] romanChar = romanNumber.toCharArray();
        for(int j=0; j<5;j++){
            for(int z=0; z<romanChar.length;z++){
                if(romanChar[z]=='I'){
                    out += i[j] + " ";
                }else if(romanChar[z]=='V'){
                    out += v[j] + " ";
                }else if(romanChar[z]=='X'){
                    out += x[j] + " ";
                }else if(romanChar[z]=='L'){
                    out += l[j] + " ";
                }else if(romanChar[z]=='C'){
                    out += c[j] + " ";
                }else if(romanChar[z]=='D'){
                    out += d[j] + " ";
                }else{
                    out += m[j] + " ";
                }
            }
            out += "\n";
        }
        return out;
    }
}
