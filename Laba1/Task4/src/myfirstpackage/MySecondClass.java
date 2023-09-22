package myfirstpackage;

public class MySecondClass {
    private int a;
    private int b;

    public MySecondClass() {
        this.a = 0;
        this.b = 0;
    }
    public MySecondClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public int integerDivision() {
        if(b == 0) System.exit(0);
        return a / b;
    }
}
