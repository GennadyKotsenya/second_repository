package itmanStudy;

/*
Напишите функцию, которая принимает две строки haystack и needle.
Возвращает начальную позицию подстроки haystack, которая равна needle.
Или -1, если needle не найдена в haystack.
 */

public class MyIndexOf {
    public static void main(String[] args) {

        System.out.println(indexOf("abbabbabc", "abbabc"));

    }

    public static int indexOf(String haystack, String needle) {

        char[] arHaystack = haystack.toCharArray();
        char[] arNeedle = needle.toCharArray();

        int counter = 0;
        int r = 0;


        while (counter != needle.length()) {
            int t = 1;
            for (int i = 0; i < arNeedle.length; i++) {
                if (t == 0) break;
//                System.out.println("i = " + i);
                for (int j = r; j < arHaystack.length; j++) {

                    if(j == arHaystack.length - 1 && counter < arNeedle.length - 1) return -1;
//                    System.out.println("j = " + j);

                    if (arNeedle[i] == arHaystack[j]) {

//                        System.out.println("if " + arNeedle[i] + " == " + arHaystack[j]);
                        r = j + 1;
                        counter++;

                        if (counter == arNeedle.length) {
//                            System.out.println("return :");
                            return j + 1 - arNeedle.length;
                        }
                        break;
                    }

                    if (counter != 0 && arNeedle[i] != arHaystack[j]) {
//                        System.out.println("if " + counter + " != 0 && "+ arNeedle[i ] + " != " + arHaystack[j]);

                        t = 0;
                        r = j - counter + 1;
                        counter = 0;
                        break;
                    }

                }
            }
        }
        return -1;
    }
}
