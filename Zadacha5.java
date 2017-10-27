import java.util.Scanner;

public class Zadacha5 {
    int x,y;
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public double getArif(){
        return (Math.abs(x)+Math.abs(y))/(double)2;
    }

    public double getGeom(){
        return (Math.abs(x)*Math.abs(y))/(double)(Math.abs(x)+Math.abs(y));
    }

    public static void main(String[] args) {
        Zadacha5 ob = new Zadacha5();
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite x->");
        int x = sc.nextInt();
        System.out.print("Vvedite y->");
        int y = sc.nextInt();
        ob.setXY(x,y);
        System.out.println("Среднее арифмитическое "+ob.getArif());
        System.out.println("Среднее геометрическое "+ob.getGeom());
    }
}
