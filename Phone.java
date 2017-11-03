public class Phone {
    String color;
    int size;
    String model;
    String os;
    boolean isSense;

    public Phone() {
        System.out.println("Конструктор по умолчанию");
    }

    public Phone(String color, int size, String model, String os, boolean isSense) {
        color = color;
        this.size = size;
        this.model = model;
        this.os = os;
        this.isSense = isSense;
    }

    public Phone(String color) {
        this.color = color;

    }

    public void setSense(boolean sense) {
        isSense = sense;
    }

    public void setSense(boolean sense, String color) {
        isSense = sense;
    }



    public boolean isSense() {
        return isSense;
    }

    public String getColor() {
        return color;
    }



    public Phone(int size, String model) {
        this.size = size;
        this.model = model;
    }



    public static void main(String[] args) {
        Phone ph1 = new Phone();



    }
}
