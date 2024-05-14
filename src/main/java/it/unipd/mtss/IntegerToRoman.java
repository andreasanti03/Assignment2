////////////////////////////////////////////////////////////////////
// ANDREA SANTI 2084624
// FRANCESCO POZZOBON 2075513
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if(number == 1){
            return "I";
        }else if(number == 2){
            return "II";
        }else if(number == 3) {
            return "III";
        }else if (number == 4) {
            return "IV";
        }else if (number == 5) {
            return "V";
        }else{
            return "VI";
        }
    }
}
