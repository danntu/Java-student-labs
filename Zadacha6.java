import java.util.Scanner;

public class Zadacha6 {
    int katet1,katet2;

    public void setKatets(int k1, int k2){
        this.katet1=k1;
        this.katet2=k2;
    }

    public double getGipo(){
        double c;
        c = Math.sqrt(Math.pow(katet1,2)+Math.pow(katet2,2));
        return  c;
    }

    public double getArea(){
        double S;
        S=0.5*katet1*katet2;
        return S;
    }

    public static void main(String[] args) {
        Zadacha6 ob = new Zadacha6();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первый катет->");
        int  k1 = sc.nextInt();
        System.out.print("Введите второй катет->");
        int k2 = sc.nextInt();

        ob.setKatets(k1,k2);

        System.out.println("Гипотенуза = "+ob.getGipo());
        System.out.println("Площадь треугольника = "+ob.getArea());
    }
}
