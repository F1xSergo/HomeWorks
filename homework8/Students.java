package edu.academy.homework8;

import java.io.Serializable;
import java.util.Random;

public class Students implements Serializable, Comparable<Students>{
    private static final long serialVersionUID = -360722457549595523L;
    public String name;

    public Students() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder randString = new StringBuilder();
        Random rand = new Random();
        int count = (1 + (int) (Math.random() * 10));

        for (int i = 0; i < count; i++) {
            char c = chars[rand.nextInt(chars.length)];
            randString.append(c);
        }
        this.name = randString.toString();
    }

    public String toString() {
        String str = "- " + this.name + " ";
        return str;
    }
    @Override
    public int compareTo(Students o) {
        return this.name.compareTo(o.name);
    }
}



// public String getRandomName(int length, String alphabet)  {
//        StringBuilder sb = new StringBuilder(Math.max(length, 16));
//            for (int x = 0; x < length; x++) {
//                int len = alphabet.length();
//                Random RND = new SecureRandom();
//                int random = RND.nextInt(len);
//                char c = alphabet.charAt(random);
//                sb.append(c);
//            }
//        return sb.toString();
//    }
// }
