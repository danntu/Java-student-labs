public class OverloadMethod {
int a;
int b;


    public OverloadMethod() {
        a=0;
        b=0;
    }


    public OverloadMethod(int a) {
        a = 2;
        b = 0;
    }

    int sum(int a, int b){
        return a+b;
    }

    double sum (double a, double b){
        return a+b;
    }


    int div(int a ,int b){
        return  a/b;
    }

    double div(double a ,double b){
        return  a/b;
    }

    double sub(double a,double b){
        return a-b;
    }

    int sub (int a, int b){
        return a-b;
    }


    int abs (int a){
        return Math.abs(a);
    }

    double abs (double a) {
        return  Math.abs(a);
    }
        int abs1(int a){
            if(a<0) return -a ;
            else return a;
    }



    public static void main(String[] args) {
        OverloadMethod ob = new OverloadMethod();
        int result1=ob.sum(2,5);
        System.out.println("ob.sum(2,5) = "+result1);

        double result2 = ob.sum(1.3,1.4);
        System.out.println("ob.sum(1.3,1.4) = "+result2);

        int result3=ob.div(6,5);
        System.out.println("div(4,5) "+result3);

        double result4 = ob.div( 6.5,7.5);
        System.out.println("div(6.5,7.5) "+result4);

        int result5=ob.sub(6,5);
        System.out.println("div(4,5) "+result5);

        double result6 = ob.sub( 6.5,7.5);
        System.out.println("div(6.5,7.5) "+result6);

        int result7=ob.abs(-9);
        System.out.println("abs(-9)" + result7);

        double result8=ob.abs(-10.6);
        System.out.println("abs(-10.6)"+result8);

        int result9=ob.abs1(4);
        System.out.println("abs1(4)"+result9);

        int result10=ob.a;
        System.out.println("a="+result10);

        int result11=ob.b;
        System.out.println("b="+result11);





    }


}
