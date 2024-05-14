////////////////////////////////////////////////////////////////////
// ANDREA SANTI 2084624
// FRANCESCO POZZOBON 2075513
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {
    @Test
    public void evaluatePrimiTre(){
        String variabileOne = "I";
        String variabileTwo = "II";
        String variabileThree = "III";
        assertEquals(variabileOne, IntegerToRoman.convert(1));
        assertEquals(variabileTwo, IntegerToRoman.convert(2));
        assertEquals(variabileThree, IntegerToRoman.convert(3));
    }

    @Test
    public void evalutePrimiSei(){
        String variabileFour = "IV";
        String variabileFive = "V";
        String variabileSix = "VI";
        assertEquals(variabileFour, IntegerToRoman.convert(4));
        assertEquals(variabileFive, IntegerToRoman.convert(5));
        assertEquals(variabileSix, IntegerToRoman.convert(6));
    }

    @Test
    public void evalutePrimiDieci(){
        String variabileSeven = "VII";
        String variabileEight = "VIII";
        String variabileNine = "IX";
        String variabileTen = "X";
        assertEquals(variabileSeven, IntegerToRoman.convert(7));
        assertEquals(variabileEight, IntegerToRoman.convert(8));
        assertEquals(variabileNine, IntegerToRoman.convert(9));
        assertEquals(variabileTen, IntegerToRoman.convert(10));
    }

    @Test
    public void evalutePrimiVenti(){
        String variabileEleven = "XI";
        String variabileFourteen = "XIV";
        String variabileFifteen = "XV";
        String variabileSixteen = "XVI";
        String variabileNineteen = "XIX";
        String variabileTwenty = "XX";
        assertEquals(variabileEleven, IntegerToRoman.convert(11));
        assertEquals(variabileFourteen, IntegerToRoman.convert(14));
        assertEquals(variabileFifteen, IntegerToRoman.convert(15));
        assertEquals(variabileSixteen, IntegerToRoman.convert(16));
        assertEquals(variabileNineteen, IntegerToRoman.convert(19));
        assertEquals(variabileTwenty, IntegerToRoman.convert(20));
    }
}
