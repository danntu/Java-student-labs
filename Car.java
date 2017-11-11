import java.util.Scanner;
public class Car {
    int count;
    Double speed;
    String model;
    Double volume1,volume2;
    String color;
    int seat;
    double cons1,cons2;

    Car(Car o1, Car o2){
        this.cons1=o1.cons1;
        this.volume1=o1.volume1;
        this.cons2=o2.cons2;
        this.volume2=o2.volume2;

    }

    boolean chekTwoObject(Car o1, Car o2){
        if(o1.getCons()==o2.getCons2()) return true;
        else return false;
    }

    Car(double cons,double volume){
        this.cons1 = cons;
        this.volume1 = volume;
        this.cons2 = cons;
        this.volume2 = volume;



    }





   double m(Car q){
        return  cons1*volume1*q.cons1*q.volume1;

   }

    public Double getVolume() {
        return volume1;
    }

    public void setSpeed(Double speed) {
        this.speed += speed;
    }

    public Double showSpeed() {
        return speed;
    }

    public void addVolume(Double volume) {
        this.volume1 = volume;
    }

    public String checkSeat() {
        if (seat == 4) return "Седан";
        else if (seat == 2) return  "Купе";
        else return  "Ввели неправильные данные(2 or 4)";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getCons() {

        return cons1;
    }
    public double getCons2() {

        return cons2;
    }


    public boolean checkColor() {
        if (color == "Black" ) return true;
        else return  false;
    }





}


class Car2 {

    public static void main(String[] args) {

        Car op1 = new Car(3,2);
        Car op2 = new Car(3,2);

        Car op3 = new Car(op1,op2);
        op3.chekTwoObject(op1,op2);
        System.out.println("op1 cons = op2 cons " + op3.chekTwoObject(op1,op2));


        /*
        op.m(op1);
        op.addVolume(2.0);
        op.setColor("Black");

        Scanner in = new Scanner(System.in);
        System.out.print("кол-во мест: ");
        op.seat = in.nextInt();

        Scanner iu = new Scanner(System.in);
        System.out.print("Задайте скорость: ");
        op.speed = iu.nextDouble();
        op.setSpeed(40.0);

        System.out.println("Цвет машины черный - " + op.checkColor());
        System.out.println("расход = " + op.getCons());
        System.out.println("Кузов машины = " + op.checkSeat());
        System.out.println("Скорость машины = "+op.showSpeed());
        */



    }
}