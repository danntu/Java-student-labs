/**
 *
 @author  Daniyar Myrzakanov
 @version 1.0
 */
public class Zadacha1{
    int a;
    int b;
    int c;

    /**
     *
     * @param a
     * @param b
     */

    Zadacha1(int a, int b){
        this.a=a;
        this.b=b;
    }
    public int sum(){
        return a+b;
    }

    private void sum1(){
        System.out.println("Cумма "+(a+b));

    }

    public static void main(String[] args) {

        Zadacha1 ob = new Zadacha1(3,4);
        Zadacha1 ob1 = new Zadacha1(3,5);

        ob=ob1;

        ob.sum1();
        System.out.println("сумма = "+ob.sum());



    }

}