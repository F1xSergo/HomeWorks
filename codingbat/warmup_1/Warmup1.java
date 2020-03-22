package edu.academy.codingbat.warmup_1;

public class Warmup1 {
    //1
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    //2
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }

    //3
    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            return sum * 2;
        }
        return sum;
    }

    //4
    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        }
        return (n - 21) * 2;
    }

    //5
    public boolean parrotTrouble(boolean talking, int hour) {

        return (talking && (hour < 7 || hour > 20));
    }

    //6
    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        }
        return false;
    }

    //7
    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

    //8
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }

    }

    //9
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }

        return "not " + str;
    }

    //10
    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        return front + back;
    }

    //11
    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length() - 1);

        // last + mid + first
        return str.charAt(str.length() - 1) + mid + str.charAt(0);// последний индекс длины строки + середина + первый индекс в строке

    }

    //12
    public String front3(String str) {
        if (str.length() >= 3) {
        } else {
            return str + str + str;
        }
        return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
    }

    //13
    public String backAround(String str) {
        String mid = str;
        char nach = str.charAt(str.length() - 1);
        return nach + mid + nach;
    }

    //14
    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    //15
    public String front22(String str) {
        if (str.length() < 3) {
            return str + str + str;
        }
        String mid = str;
        String nach = str.substring(0, 2);
        return nach + mid + nach;
    }

    //16
    public boolean startHi(String str) {
        return (str.length() >= 2 && str.substring(0, 2).equals("hi"));
    }

    //17
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 <= 0 && temp2 > 100) || (temp1 >= 0 && temp2 <= 100)) {
            return true;
        }
        return false;
    }

    //18
    public boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            return true;
        }
        return false;
    }

    //19
    public boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        }
        return false;
    }

    //20
    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {

        } else if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return true;
        }
        return false;
    }
//21
//public String delDel(String str) {                                 этот правильный
//    if (str.length()>=4 && str.substring(1, 4).equals("del")) {
//        // First char + rest of string starting at 4
//        return str.substring(0, 1) + str.substring(4);
//    }
//    // Otherwise return the original string.
//    return str;

    public String delDel(String str) {                              // этот почти правильный
        String nach = str.substring(0, 1);
        String mid = str.substring(4);

        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return (nach + mid);
        }
        return str;
    }

    //22
    public boolean mixStart(String str) {
        return (str.length() >= 3 && str.substring(1, 3).equals("ix"));
    }

    //23
    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }

    //24
    public int intMax(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    //25
    public int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }

    //26
    public boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) ||
                ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
    }

    //27
    public int max1020(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (max >= 10 && max <= 20) {
            return max;
        }
        if (min >= 10 && min <= 20) {
            return min;
        }
        return 0;
    }

    //28
    public boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
            // alternately: str.substring(i, i+1).equals("e")
        }

        return (count >= 1 && count <= 3);
    }

    //29
    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

    //30
    public String endUp(String str) {
        if (str.length() <= 3)
            return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back = str.substring(cut);
            return (front + back.toUpperCase());
        }
//31
    public String everyNth(String str, int n) {
        String result = "";
        for (int i = 0; i <str.length() ; i= i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }

    }













































