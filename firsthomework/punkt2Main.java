package edu.academy.firsthomework;

public class punkt2Main {
    public static void main(String[] args) {


        // 5 + 2 / 8; // = 5(delenie daet drob, tk mi rabotaem s int to rezultat = o; a 5 + 0 = 5)
        System.out.println(5 + 2 / 8);

        //(5 + 2) / 8; // = 0 (7 / 8 = 0.8; tak kak int, to zanosim celoe chislo - 0);
        System.out.println((5 + 2) / 8);

        //(5 + 2++) / 8;  //итого 7 / 8 = 0
        int a = 2;
        System.out.println((5 + a++) / 8);

        //(5 + 2++) / --8; // итого = 1 (7 / 7);
        int x = 2;
        int y = 8;
        System.out.println((5 + x++) / --y);

        //(5 * 2 >> 2++) / --8;// ответ = 0 ((7 >> 2) / 7);
        int c = 2;
        int d = 8;
        System.out.println((5 * 2 >> c++) / --d);

        //(5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8;
        int e = 2;
        int f = 8;

        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> e++) / --f);
                    // так как выражение false, мы переходим на выражение после двое точия и это будет true.
                    // итого ответ = ((22 * 2 >> e++) / --f) =1

        //(5 + 7 > 20 ? 68 = > 68 :22 * 2 >> 2++) /--8;
        int k = 2;
        int m = 8;
        boolean g = (5 + 7 > 20);
        boolean h = (68 >= 68);
        int j = (22 * 2 >> k++);

        System.out.println (g ? h : j /--m);//Ответ = 1
                //тут почему-то получилось))
       // int j = ((22 * 2 >> k++) ;
       // System.out.println((g ? h : j)/ --m);
                    // а здесь ошибка.

        //6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119);
                    // ответ = false, так как одно из значений false

        //true && false;
        System.out.println(true && false);
                    // ответ = false, так как одно из значений false
    }
}
