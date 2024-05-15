////////////////////////////////////////////////////////////////////
// ANDREA SANTI 2084624
// FRANCESCO POZZOBON 2075513
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {
    @Before
    public void checkZero(){
        assertEquals("", IntegerToRoman.convert(0));
    }

   @After
   public void evaluateRange(){
       assertEquals("", IntegerToRoman.convert(-2));
       assertEquals("", IntegerToRoman.convert(-1));
       assertEquals("", IntegerToRoman.convert(1001));
       assertEquals("", IntegerToRoman.convert(1100));
       assertEquals("", IntegerToRoman.convert(10028122));
   }

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

    @Test
    public void evalutePrimiCinquanta(){
        String variabileTwentuOne = "XXI";
        String variabileTwentyNine = "XXIX";
        String variabileThirtyFour = "XXXIV";
        String variabileThirtySix = "XXXVI";
        String variabileFourty = "XL";
        String variabileFourtyFive = "XLV";
        String variabileFourtyNine = "XLIX";
        String variabileFifty = "L";
        assertEquals(variabileTwentuOne, IntegerToRoman.convert(21));
        assertEquals(variabileTwentyNine, IntegerToRoman.convert(29));
        assertEquals(variabileThirtyFour, IntegerToRoman.convert(34));
        assertEquals(variabileThirtySix, IntegerToRoman.convert(36));
        assertEquals(variabileFourty, IntegerToRoman.convert(40));
        assertEquals(variabileFourtyFive, IntegerToRoman.convert(45));
        assertEquals(variabileFourtyNine, IntegerToRoman.convert(49));
        assertEquals(variabileFifty, IntegerToRoman.convert(50));
    }

    @Test
    public void evalutePrimiCento(){
        assertEquals("LI", IntegerToRoman.convert(51));
        assertEquals("LV", IntegerToRoman.convert(55));
        assertEquals("LXII", IntegerToRoman.convert(62));
        assertEquals("LXVII", IntegerToRoman.convert(67));
        assertEquals("LXXIII", IntegerToRoman.convert(73));
        assertEquals("LXXVI", IntegerToRoman.convert(76));
        assertEquals("LXXXIV", IntegerToRoman.convert(84));
        assertEquals("LXXXVIII", IntegerToRoman.convert(88));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("XCIX", IntegerToRoman.convert(99));
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void evalutePrimiCinquecento(){
        assertEquals("CI", IntegerToRoman.convert(101));
        assertEquals("CIV", IntegerToRoman.convert(104));
        assertEquals("CXXXII", IntegerToRoman.convert(132));
        assertEquals("CCXCIX", IntegerToRoman.convert(299));
        assertEquals("CCCLXXVI", IntegerToRoman.convert(376));
        assertEquals("CDLXVIII", IntegerToRoman.convert(468));
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    public void evaluatePrimiMille(){
        assertEquals("DI", IntegerToRoman.convert(501));
        assertEquals("DXXV", IntegerToRoman.convert(525));
        assertEquals("DXCIX", IntegerToRoman.convert(599));
        assertEquals("DCXXXIV", IntegerToRoman.convert(634));
        assertEquals("DCLXXIII", IntegerToRoman.convert(673));
        assertEquals("DCXLVI", IntegerToRoman.convert(646));
        assertEquals("DCCLXXVII", IntegerToRoman.convert(777));
        assertEquals("DCCLXXXV", IntegerToRoman.convert(785));
        assertEquals("DCCCXVI", IntegerToRoman.convert(816));
        assertEquals("DCCCLXXXVIII", IntegerToRoman.convert(888));
        assertEquals("CML", IntegerToRoman.convert(950));
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
        assertEquals("M", IntegerToRoman.convert(1000));
    }
}