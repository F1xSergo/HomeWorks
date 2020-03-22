package edu.academy.codingbat.warmup_1;

public class Warmup1Main {
    public static void main(String[] args) {
        Warmup1 a = new Warmup1();
//        sleepIn(false, false) → true
//        sleepIn(true, false) → false
//        sleepIn(false, true) → true
        System.out.println("1 - " + a.sleepIn(false, false));

//        monkeyTrouble(true, true) → true
//        monkeyTrouble(false, false) → true
//        monkeyTrouble(true, false) → false
        System.out.println("2 - " + a.monkeyTrouble(true,true));

//        sumDouble(1, 2) → 3
//        sumDouble(3, 2) → 5
//        sumDouble(2, 2) → 8
        System.out.println("3 - " + a.sumDouble(1,2));

//        diff21(19) → 2
//        diff21(10) → 11
//        diff21(21) → 0
        System.out.println("4 - " + a.diff21(19));

//        parrotTrouble(true, 6) → true
//        parrotTrouble(true, 7) → false
//        parrotTrouble(false, 6) → false
        System.out.println("5 - " + a.parrotTrouble(true, 6));

//        makes10(9, 10) → true
//        makes10(9, 9) → false
//        makes10(1, 9) → true
        System.out.println("6 - " + a.makes10(3,7));

//        nearHundred(93) → true
//        nearHundred(90) → true
//        nearHundred(89) → false
        System.out.println("7 - " + a.nearHundred(89));

//        posNeg(1, -1, false) → true
//        posNeg(-1, 1, false) → true
//        posNeg(-4, -5, true) → true
        System.out.println("8 - " + a.posNeg(-23, 1, false));

//        notString("candy") → "not candy"
//        notString("x") → "not x"
//        notString("not bad") → "not bad"
        System.out.println("9 - " + a.notString("candy"));

//        missingChar("kitten", 1) → "ktten"
//        missingChar("kitten", 0) → "itten"
//        missingChar("kitten", 4) → "kittn"
        System.out.println("10 - " + a.missingChar("kitten", 1));

//        frontBack("code") → "eodc"
//        frontBack("a") → "a"
//        frontBack("ab") → "ba"
        System.out.println("11 - " + a.frontBack("ау"));

//        front3("Java") → "JavJavJav"
//        front3("Chocolate") → "ChoChoCho"
//        front3("abc") → "abcabcabc"
        System.out.println("12 - " + a.front3("Ja"));

//        backAround("cat") → "tcatt"
//        backAround("Hello") → "oHelloo"
//        backAround("a") → "aaa"
        System.out.println("13 - " + a.backAround("cat"));

//        or35(3) → true
//        or35(10) → true
//        or35(8) → false
        System.out.println("14 - " + a.or35(15));

//        front22("kitten") → "kikittenki"
//        front22("Ha") → "HaHaHa"
//        front22("abc") → "ababcab"
        System.out.println("15 - " + a.front22("kitten"));

//        startHi("hi there") → true
//        startHi("hi") → true
//        startHi("hello hi") → false
        System.out.println("16 - " + a.startHi("hi ho"));

//        icyHot(120, -1) → true
//        icyHot(-1, 120) → true
//        icyHot(2, 120) → false
        System.out.println("17 - " + a.icyHot(12, 120));

//        in1020(12, 99) → true
//        in1020(21, 12) → true
//        in1020(8, 99) → false
        System.out.println("18 - " + a.in1020(9, 99));

//        hasTeen(13, 20, 10) → true
//        hasTeen(20, 19, 10) → true
//        hasTeen(20, 10, 13) → true
        System.out.println("19 - " + a.hasTeen(13, 13, 10));

//        loneTeen(13, 99) → true
//        loneTeen(21, 19) → true
//        loneTeen(13, 13) → false
        System.out.println("20 - " + a.loneTeen(13, 13));

//        delDel("adelbc") → "abc"
//        delDel("adelHello") → "aHello"
//        delDel("adedbc") → "adedbc"
        System.out.println("21 - " + a.delDel("adeli"));

//        mixStart("mix snacks") → true
//        mixStart("pix snacks") → true
//        mixStart("piz snacks") → false
        System.out.println("22 - " + a.mixStart("piz snacks"));

//        startOz("ozymandias") → "oz"
//        startOz("bzoo") → "z"
//        startOz("oxx") → "o"
        System.out.println("23 - " + a.startOz("ozymandias"));

//        intMax(1, 2, 3) → 3
//        intMax(1, 3, 2) → 3
//        intMax(3, 2, 1) → 3
        System.out.println("24 - " + a.intMax(1, 2, 3));

//        close10(8, 13) → 8
//        close10(13, 8) → 8
//        close10(13, 7) → 0
        System.out.println("25 - " + a.close10(7, 13));

//        in3050(30, 31) → true
//        in3050(30, 41) → false
//        in3050(40, 50) → true
        System.out.println("26 - " + a.in3050(30, 31));

//        max1020(11, 19) → 19
//        max1020(19, 11) → 19
//        max1020(11, 9) → 11
        System.out.println("27 - " + a.max1020(21, 0));

//        stringE("Hello") → true
//        stringE("Heelle") → true
//        stringE("Heelele") → false
        System.out.println("28 - " + a.stringE("Hello"));

//        lastDigit(7, 17) → true
//        lastDigit(6, 17) → false
//        lastDigit(3, 113) → true
        System.out.println("29 - " + a.lastDigit(6, 166));

//        endUp("Hello") → "HeLLO"
//        endUp("hi there") → "hi thERE"
//        endUp("hi") → "HI"
        System.out.println("30 - " + a.endUp("hi there"));

//        everyNth("Miracle", 2) → "Mrce"
//        everyNth("abcdefg", 2) → "aceg"
//        everyNth("abcdefg", 3) → "adg"
        System.out.println("31 - " + a.everyNth("Miraclesertdfgbr", 5));










    }
}
