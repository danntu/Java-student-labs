public class RunShut extends Weapon {

    @Override
    public void shut() {
        System.out.println("This method shut()");
    }

    public static void main(String[] args) {
            RunShut r = new RunShut();
            r.shutwithout();
            r.shut();


    }
}
