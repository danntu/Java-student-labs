import java.text.DecimalFormat;
import java.util.Random;

class X {
    int a=5;
    int b=15;

    void Show() {
        Y op = new Y();
        op.minus();
    }

    static class Y {
        void  minus() {
            X ox = new X();
            System.out.println("a - b = " + (ox.a - ox.b ));
        }
    }
}

public class InnerClass {
    public static void main(String ... args) {
        X ob = new X();
        ob.Show();

        int  mass[]={97,65,101};
        String b1 = new String(mass,0,3);
        //StringBuffer b2 = new StringBuffer("aA");

        System.out.println("b1 = " + b1.compareTo("aA"));


        Random r =  new Random();
        System.out.println(Math.abs(r.nextInt()%100));

        float f = 102.55f;
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        float twoDigitsF = Float.valueOf(decimalFormat.format(f));
        System.out.println(twoDigitsF);


    }
}
