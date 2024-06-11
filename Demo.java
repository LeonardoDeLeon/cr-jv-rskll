
class A extends B {
    void show() {
        System.out.println("in show()");
    }
}

class B {
    void disp(){
        System.out.println("in disp()");
    }
}

public class Demo {

    public static void main(String[] args) {
        A a = new A();
        a.disp();
        a.show();
    }
}
