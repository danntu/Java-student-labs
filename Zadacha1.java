public class Zadacha1 {

    int sum(int a,int b){
        return a+b;
    }

    int minus(int a, int b){
        return a-b;
    }
    void plural(int a,int b){
        System.out.println("Сумма "+a*b);
    }

    public static void main(String[] args) {
        Zadacha1 ob = new Zadacha1();
        System.out.println("Сумма "+ob.sum(2,3));
        System.out.println("Разность "+ob.minus(2,3));
        //System.out.println("Произведение "+ob.plural(2,3));
        ob.plural(2,3);
    }
}
