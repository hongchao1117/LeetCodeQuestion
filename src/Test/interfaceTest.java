package Test;

public interface interfaceTest {
    int x = 0;
    void funA();
}

class A implements interfaceTest{
    public A() {
        System.out.println("A constructor");
    }

    @Override
    public void funA() {
        System.out.println("A + funA()");
    }

    static {
        System.out.println("A static package");
    }

    static void staticA(){
        System.out.println("staticA()");
    }
}

class B extends A{
    static {
        System.out.println("B static package");
    }

    public B() {
        System.out.println("B constructor");
    }

    public void funB(){
        System.out.println("B + funA()");
    }

    static void staticB(){
        System.out.println("staticB()");
    }
}

class method{


    public static void main(String[] args) {
        interfaceTest a = new B();
        interfaceTest b = new B();
        System.out.println(a.equals(b));
        B.staticB();
    }
}