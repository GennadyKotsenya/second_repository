package itmanStudy;

public class MyToLowerCase {
    public static void main(String[] args) {

        System.out.println(toLowerCase("Hello my friend!"));

    }

    public static String toLowerCase(String s){

        char[] cr = s.toCharArray();

        for(int i = 0; i < cr.length; i++){

            if(cr[i] > 64 && cr[i] < 91){

                cr[i] = (char) (cr[i] + 32);
            }

        }

        String s1 = new String(cr);

        return  s1;
    }
}
