public class Zadacha3 {
    int a;
    public void  setA(int a){
        this.a=a;
    }
    public int getVolume(){
        return a*a*a;
    }
    public int getArea(){
        return a*a*2;
    }

    public static void main(String[] args) {
        Zadacha3 ob = new Zadacha3();
        ob.setA(5);

        System.out.println("Объем куба равна "+ob.getVolume());
        System.out.println("Площадь боковой поверхности равна "+ob.getArea());
    }
}
