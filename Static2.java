class Static1 {
    static  int a;
    static  int b;

    static int milti() {
        sum();
        return  a * b ;
    }
   static int sum() {
        return a + b;
    }
    public static void setA(int a) {
        Static1.a = a;
    }

    public static void setB(int b) {
        Static1.b = b;
    }

}


public class Static2 {
    public static void main(String[] args) {
        Static1.setA(5);
        Static1.setB(6);
        System.out.println("a =" + (Static1.a) +"  b ="+ (Static1.b));
        System.out.println("a * b = "+ (Static1.milti()) );
    }
}
