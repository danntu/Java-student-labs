import java.util.Scanner;

public class Zadacha4 {
    int x,y;
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public double getArif(){
        return (x+y)/(double)2;
    }

    public double getGeom(){
        return (x*y)/(double)(x+y);
    }

    public static void main(String[] args) {
        Zadacha4 ob = new Zadacha4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite x->");
        int x = sc.nextInt();
        System.out.println("Vvedite y->");
        int y = sc.nextInt();
        ob.setXY(x,y);
        System.out.println("Среднее арифмитическое "+ob.getArif());
        System.out.println("Среднее геометрическое "+ob.getGeom());
    }
}
