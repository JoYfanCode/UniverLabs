class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass mySecondClass = new MySecondClass(1010101, 101);
        System.out.println(mySecondClass.integerDivision());

        for(int i = 1; i <= 8; i++) {
            for(int j = 1; j <= 8; j++) {
                mySecondClass.setA(i);
                mySecondClass.setB(j);
                System.out.print(mySecondClass.integerDivision());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
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