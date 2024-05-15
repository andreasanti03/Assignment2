////////////////////////////////////////////////////////////////////
// ANDREA SANTI 2084624
// FRANCESCO POZZOBON 2075513
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {

        String[] centinaia = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] decine = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] unita = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        if(number<0 || number>1000){
            return  "";
        }

        if (number == 1000) {
            return "M";
        }


        char[] input = String.valueOf(number).toCharArray();

        int poscentinaia = -1;
        int posdecine = -1;
        int posunita = -1;

        if (input.length == 3) {
            poscentinaia = input[0] - '0';
            posdecine = input[1] - '0';
            posunita = input[2] - '0';
        } else if (input.length == 2) {
            posdecine = input[0] - '0';
            posunita = input[1] - '0';
        } else if (input.length == 1) {
            posunita = input[0] - '0';
        }

        if(poscentinaia!=-1){
            return centinaia[poscentinaia]+decine[posdecine]+unita[posunita];
        }else if(posdecine!=-1){
            return decine[posdecine]+unita[posunita];
        }
        else{
            return unita[posunita];
        }

    }
}