public class Helicopter {

    public static void main(String[] args) {

        Helicopter2 ob = new Helicopter2();
        ob.addSpeed(50);
        ob.minusSpeed(40);
        ob.addSpeed(150);
        ob.showSpeed();

        if(ob.checkVolume()==true) System.out.println("Бак полон");
        else System.out.println("Бак не полон");

    }

}


class Helicopter2 {
    private double speed;
    double volume = 0;
    String color;
    int frequence;
    int seat;



    public Helicopter2() {
        speed=0; volume=60.0; color=""; frequence=0; seat=0;
    }
    public Helicopter2(double speed) {
        this.speed = speed;
    }
    public Helicopter2(double speed, String color) {
        this.speed = speed;
        this.color = color;
    }
    public Helicopter2(double speed, double volume, String color, int frequence, int seat) {
        this.speed = speed;
        this.volume = volume;
        this.color = color;
        this.frequence = frequence;
        this.seat = seat;
    }
    public void addSpeed(double speed) {
        this.speed = this.speed+ speed;
    }
    public void minusSpeed(double speed) {
        this.speed -= speed;
    }
    public double showSpeed() {
        return speed;
    }

    public double getVolume() {
        return volume;
    }

    boolean checkVolume(){
        if (volume==60) return true;
        else return false;

    }
}