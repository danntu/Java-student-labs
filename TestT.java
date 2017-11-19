class  Test {
    int a;
    public int b ;
    private  int c;

    public void setC(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }
}

public class TestT {
    public static void main(String[] args) {
        Test op = new Test();
        op.a=2;
        op.b=4;
       // op.c=5;

        op.setC(6);
        System.out.println("a+b+c = " + (op.a + op.b + op.getC()));
    }
}
