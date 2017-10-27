public class Zadacha2 {
    int x;
    int y;
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public double result(){
        double result;
        result=(Math.abs(x)-Math.abs(y))/(double)(1+Math.abs(x*y));
        return result;
    }
    public static void main(String[] args) {
        Zadacha2 ob = new Zadacha2();
        ob.setXY(-1,-3);
        System.out.println("Result "+ob.result());
    }
}
