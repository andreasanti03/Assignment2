////////////////////////////////////////////////////////////////////
// ANDREA SANTI 2084624
// FRANCESCO POZZOBON 2075513
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {

        String[] decine = {"","X","XX","XXX","XL","L"};
        String[] unita = {"","I","II","III","IV","V","VI","VII","VIII","IX"};


        char[] input = String.valueOf(number).toCharArray();

        int posdecine = -1;
        int posunita = -1;

        if(input.length==2){
            posdecine = input[0] - '0';
            posunita = input[1] - '0';
        }else if(input.length==1){
            posunita = input[0] - '0';
        }

        if(posdecine!=-1){
            return decine[posdecine]+unita[posunita];
        }
        else{
            return unita[posunita];
        }

    }
}