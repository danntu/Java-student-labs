class A{
    int a;
}
class B{
    int b;
}

public class C {
    int sum;

    C(int sum){
        this.sum=sum;
    }

    C sum(A ob1, B ob2){
        C ob3 = new C(ob1.a+ob2.b);
        return  ob3;
    }

    public static void main(String[] args) {

    }
}
